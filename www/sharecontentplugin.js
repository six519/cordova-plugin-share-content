"use strict";

var exec = require("cordova/exec");

var shareContentPlugin = {
	share: function(text_to_share, sc, ec) {
		exec(sc, ec, "ShareContentPlugin", "share", [text_to_share]);
	}
};

module.exports = shareContentPlugin;