package com.facebook.react.bridge.DynamicRegisterHandler;
import java.util.List;
import java.lang.String;

public interface abstract DynamicRegisterHandler	// class@0011c0
{

    List getKrnReactPackages();
    void syncLoadPluginIfPluginIsUnLoad(String p0);
}
