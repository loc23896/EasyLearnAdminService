// window.addEventListener("load", function () {
//     const loginForm = document.querySelector(".login-form");
//     const showPasswordIcon =
//         loginForm && loginForm.querySelector(".show-password");
//     const inputPassword =
//         loginForm && loginForm.querySelector('input[type="password"]');
//     showPasswordIcon.addEventListener("click", function () {
//         const inputPasswordType = inputPassword.getAttribute("type");
//         inputPasswordType === "password"
//             ? inputPassword.setAttribute("type", "text")
//             : inputPassword.setAttribute("type", "password");
//             if (username === '' || password === '' || phone === '' || address === '') {
//                 alert("Vui lòng điền đầy đủ thông tin");
//                 return false;
//               }
//
//               // Validate độ dài số điện thoại
//               if (phone.length !== 9) {
//                 alert("Số điện thoại phải có 9 chữ số");
//                 return false;
//               }
//     });
// });
// function checkNull(){
//     let firstName = document.getElementById("firstName");
//     let lastname = document.getElementById("lastName");
//     let email = document.getElementById("email");
//     let address = document.getElementById("address");
//     let phone = document.getElementById("phone");
//     let userName = document.getElementById("userName");
//     let password = document.getElementById("password");
//     if (firstName === '' || lastname === '' || email === '' || address === ''|| phone === '' || userName === ''|| password === '') {
//                 alert("Vui lòng điền đầy đủ thông tin");
//                 return false;
//     }
//     if(phone.length !== 10){
//         alert("Số điện thoại chưa đúng định dạng 10 số");
//         return false;
//     }
// }
function checkNull(){

// const loginForm = document.getElementById("loginForm");
    let firstName = document.getElementById("firstName").value;
    let lastname = document.getElementById("lastName").value;
    let email = document.getElementById("email").value;
    let address = document.getElementById("address").value;
    let phone = document.getElementById("phone").value;
    let userName = document.getElementById("userName").value;
    let password = document.getElementById("password").value;
    let managementType = document.getElementById("managementType").value;
    if (firstName === '' || lastname === '' || email === '' || address === ''|| phone === '' || userName === ''|| password === '') {
        alert("Vui lòng điền đầy đủ thông tin");
        return false;
    }
    if(phone.length !== 10){
        alert("Số điện thoại chưa đúng định dạng 10 số");
        return false;
    }
    if(managementType === "-1"){
        alert("Vui lòng chọn Management Type")
        return false;
    }

// });
}