var $username;
var $userpassword;
function sublogin() {

    $username=$(".textusername").val();
    $userpassword=$(".textuserpassword").val();
    if ($username.length<=0){
        $(".usernamespan").html("<p style='color: red'>账号不能为空</p>");
        alert("1111");
        return false;
    }
    if ($userpassword.length<=0){
        alert("222");
        $(".textuserpassword").text("密码不能为空").attr({"color":"red"});
        return false;
    }
}