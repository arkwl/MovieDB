var user_rights = 0;

function set_rights() {
    console.log("yay");
    var select = document.getElementById("rights");
    user_rights = select.selectedIndex;
}

function get_rights(){
	return user_rights;
}