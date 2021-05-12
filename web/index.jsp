<%--
  Created by IntelliJ IDEA.
  User: 12072
  Date: 2021-01-21
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
    $(function(){
       $.post("show",function (data) {
            var result="";
            for (var i=0;i<data.length;i++){
                result+="<dl>";
                result+="<dt>"+data[i].name+"</dt>";
                for (var j=0;j<data[i].children.length;j++){
                    result+="<dd>"+data[i].children[j].name+"</dd>";
                }
                result+="</dl>";
            }
            $("body").html(result);
       })
      /*对一级菜单添加点击事件*/
      $("dt").live("click",function () {
          $(this).siblings().slideToggle();
       });
    })
</script>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a type=""></a>
  </body>
</html>
