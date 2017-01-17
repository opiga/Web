package by.academy.it.services;

import by.academy.it.dao.*;
import by.academy.it.pojos.User;
import by.academy.it.services.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CmdSignup extends Action {
    // Инициализация логера
    private static final Logger log = Logger.getLogger(CmdSignup.class.getName());

    @Override
    public Action execute(HttpServletRequest req,HttpServletResponse resp) {
        User user = new User();
        try {
            user.setID(0);
            user.setLogin(Form.getString(req, "Login", Patterns.LOGIN));
            user.setPass(Form.getString(req, "Password", Patterns.PASSWORD));
            user.setEmail(Form.getString(req, "Email", Patterns.EMAIL));
            user.setFK_role(1);

        } catch (Exception e) {
            log.log(Level.SEVERE, "Exception : ", e);
            //req.setAttribute(Messages.msgError, "NO VALID FIELDS");
            return null;
        }
        DAO dao = DAO.getDAO();
        if (dao.user.create(user)) {
            log.log(Level.INFO, "USER ADDED");
           // req.setAttribute(Messages.msgMessage, "USER ADDED");
            return Actions.SHOWUSERS.action;
        } else
            log.log(Level.ALL, "FILL ERROR");
          //  req.setAttribute(Messages.msgError, "FILL ERROR");
        return null;
    }
}
