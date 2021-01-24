
cordova.addConstructor(function() {
    function changeappicon () {

    }

    changeappicon .prototype.ChanageToIcon = function(iconname, successCallback, errorCallback ){
        cordova.exec(successCallback, errorCallback, "ChangeAppIcon", "ChanageToIcon", [iconname]);
    }

   
    window.changeappicon = new changeappicon ()
    return window.changeappicon 
});
