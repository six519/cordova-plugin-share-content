Supported Platform
==================

iOS/Android

Installation
============

``cordova plugin add https://github.com/six519/cordova-plugin-share-content.git``

or via npm

``cordova plugin add cordova-plugin-share-content``

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