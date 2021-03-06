<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

      <!-- Основное содержимое -->
      <div class="page-header">
        <h1>Гостиница</h1>
        <p class="lead">Заявки пользователя </p>
      </div>

     <div class="row">
         <b>
           <%-- <div class=col-md-1>ID</div>--%>
             <div class=col-md-1>fio</div>
             <div class=col-md-2>passport</div>
             <div class=col-md-2>phone</div>
             <div class=col-md-1>category</div>

             <div class=col-md-2>arrive</div>
             <div class=col-md-2>leavee</div>

             <div class=col-md-1>payment</div>

         </b>
        </div>
        <br>



        <!-- Коллекцию listUser мы получаем по get из команды сервлета UserForm -->
        <c:forEach items="${orders}" var="order">
             <div class="row">
                 <div class=col-md-1>
                     <input id="textinput1" name="fio" type="text"
                     value="${order.fio}" class="form-control input-md">
                 </div>
                 <div class=col-md-2>
                     <input id="textinput2" name="passport" type="text"
                     value="${order.passport}" class="form-control input-md">
                 </div>
                 <div class=col-md-2>
                     <input id="textinput3" name="phone" type="text"
                     value="${order.phone}" class="form-control input-md">
                 </div>
                 <div class=col-md-1>
                     <input id="textinput4" name="category" type="text"
                     value="${order.category}" class="form-control input-md">
                 </div>

                <div class=col-md-2>
                     <input id="textinput5" name="arrive" type="text"
                     value="${order.arriveString}" class="form-control input-md">
                 </div>
                 <div class=col-md-2>
                     <input id="textinput6" name="leave" type="text"
                     value="${order.leaveString}" class="form-control input-md">
                 </div>

                 <div class=col-md-1>
                     <input id="textinput" name="payment" type="text"
                     value="${order.payment}" class="form-control input-md">
                 </div>


                 <!--
                 <div class=col-md-1>
                         <select id="status" name="fk_status" class="form-control">
                             <c:forEach items="${statuses}" var="status">
                                 <option value="${status.ID}" status=${status.ID} ${status.ID==user.FK_status?"selected":""}>
                                      ${status.status}
                                 </option>
                             </c:forEach>
                         </select>
                 </div>
                 -->
             </form>
             </div>
        <br>
        </c:forEach>




<%@ include file="include/end-html.jsp" %>
