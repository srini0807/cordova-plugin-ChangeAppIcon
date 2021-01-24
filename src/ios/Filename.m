#import "filename.h"
#import <Foundation/Foundation.h>

@interface filename () 

@property (nonatomic) CDVInvokedUrlCommand* command;

@end

@implementation filename
- (void)<funcname>:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
 
	
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"Plugin Success"];
        //pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
  

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
	
}
@end
