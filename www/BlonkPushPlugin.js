var blonkPushPlugin {
	getData: function(successCallback,errorCallback) {
		cordova.exec(
			successCallback, 		// success callback function
			errorCallback,			// error callback function
			'BlonkPushPlugin',	// native java class - extends CordovaPlugin
			'getPushData',			// action string to pass to java class
			[]									// array of arguments to pass to class, currently null
		);
	}
}