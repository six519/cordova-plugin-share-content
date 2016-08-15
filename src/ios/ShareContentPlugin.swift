import UIKit

@available(iOS 8.0, *)
@objc(ShareContentPlugin) class ShareContentPlugin : CDVPlugin {
    
    func share(command: CDVInvokedUrlCommand) {
        var pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK
        )
        let text_to_share = command.arguments[0] as? String ?? ""
        let uIActivityVC = UIActivityViewController(activityItems: [text_to_share], applicationActivities: nil)
        
        viewController.presentViewController(uIActivityVC, animated: true, completion: nil)

        pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK,
            messageAsString: text_to_share
        )
        self.commandDelegate!.sendPluginResult(
            pluginResult, 
            callbackId: command.callbackId
        )

    }
}