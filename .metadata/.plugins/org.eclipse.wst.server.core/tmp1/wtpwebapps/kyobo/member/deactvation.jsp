<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
<style>
  body {
    font-family: sans-serif;
  }

  .error {
    color: red;
    font-weight: bold;
    margin-bottom: 10px;
  }

  
  .modal-overlay {
    display: none;
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0,0,0,0.5);
    z-index: 999;
  }

 
  .modal {
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background: white;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 2px 10px rgba(0,0,0,0.3);
    z-index: 1000;
    width: 300px;
    display: none;
  }

  .modal h3 {
    margin-bottom: 15px;
    color: #5055b1;
  }

  .modal input[type="password"] {
    width: 100%;
    padding: 8px;
    margin-bottom: 15px;
  }

  .modal-buttons {
    display: flex;
    justify-content: space-between;
  }
</style>
</head>
<body>

	<h2>회원탈퇴</h2>
	<c:if test="${not empty message}">
		<p class="error">${message}</p>
	</c:if>
	<button onclick="openModal()">탈퇴하기</button>
  <button onclick="location.href='/kyobo/index.jsp'">홈화면가기</button>

  <!-- 모달 구조 -->
  <div class="modal-overlay" onclick="closeModal()"></div>

  <div class="modal" id="deactivateModal">
    <h3>비밀번호 확인</h3>
    <form method="post" action="delete.do" onsubmit="return checkPwdFilled()">
      <input type="password" name="pwd" id="deactPwd" placeholder="비밀번호 입력" required>
      <div class="modal-buttons">
        <input type="submit" value="확인 후 탈퇴">
        <input type="button" value="취소" onclick="closeModal()">
      </div>
    </form>
  </div>

  <script>
    function openModal() {
      document.querySelector('.modal-overlay').style.display = 'block';
      document.getElementById('deactivateModal').style.display = 'block';
    }

    function closeModal() {
      document.querySelector('.modal-overlay').style.display = 'none';
      document.getElementById('deactivateModal').style.display = 'none';
    }

    function checkPwdFilled() {
      const pw = document.getElementById("deactPwd").value;
      if (!pw.trim()) {
        alert("비밀번호를 입력해주세요.");
        return false;
      }
      return true;
    }
  </script>


</body>
</html>