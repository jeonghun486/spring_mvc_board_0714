<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 쓰기</title>
</head>
<body>
<h2>자유게시판 글쓰기</h2>
   <hr>
   <table width="600" cellpadding="0" cellspacing="0" border="1">
      <form action="write">
         <tr>
            <td>글쓴이</td>
            <td><input type="text" name="bname" size="55"></td>
         </tr>
         <tr>
            <td>글제목</td>
            <td><input type="text" name="btitle" size="55"></td>
         </tr>
         <tr>
            <td>글내용</td>
            <td>
            <textarea name="bcontent" rows="10" cols="50"></textarea>
            </td>
         </tr>
         <tr>
            <td colspan="2" align="right">
            <input type="submit" value="등록">
            <input type="button" value="취소" onclick="location.href='list'">
            </td>
         </tr>
      </form>
   </table>
   </body>
   </html>