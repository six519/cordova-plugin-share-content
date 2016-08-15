Supported Platform
==================

iOS/Android

Installation
============

``cordova plugin add https://github.com/six519/cordova-plugin-share-content.git``

Usage
=====
::

    //send sms
    window.shareContentPlugin.sendMessage('<TEXT_TO_SHARE>', function(e){
        //success callback
    }, function(e){
        //error callback
        alert('The error is: ' + e);
    });