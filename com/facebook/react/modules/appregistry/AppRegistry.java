package com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;

public interface abstract AppRegistry implements JavaScriptModule	// class@001272
{

    void runApplication(String p0,WritableMap p1);
    void startHeadlessTask(int p0,String p1,WritableMap p2);
    void unmountApplicationComponentAtRootTag(int p0);
}
