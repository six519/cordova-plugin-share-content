.. image:: https://developer.android.com/images/training/sharing/share-text-screenshot.png .. image::http://ferdinandsilva.com/static/interface/ios.jpg

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

    //share text
    window.shareContentPlugin.share('<TEXT_TO_SHARE>', function(e){
        //success callback
    }, function(e){
        //error callback
        alert('The error is: ' + e);
    });