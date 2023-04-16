package com.kuaishou.webkit.WebSettings$PluginState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WebSettings$PluginState extends Enum	// class@001276
{
    public static final WebSettings$PluginState[] $VALUES;
    public static final WebSettings$PluginState OFF;
    public static final WebSettings$PluginState ON;
    public static final WebSettings$PluginState ON_DEMAND;

    static {
       WebSettings$PluginState pluginState = new WebSettings$PluginState("ON", 0);
       WebSettings$PluginState.ON = pluginState;
       WebSettings$PluginState pluginState1 = new WebSettings$PluginState("ON_DEMAND", 1);
       WebSettings$PluginState.ON_DEMAND = pluginState1;
       WebSettings$PluginState pluginState2 = new WebSettings$PluginState("OFF", 2);
       WebSettings$PluginState.OFF = pluginState2;
       WebSettings$PluginState[] pluginStateA = new WebSettings$PluginState[]{pluginState,pluginState1,pluginState2};
       WebSettings$PluginState.$VALUES = pluginStateA;
    }
    public void WebSettings$PluginState(String p0,int p1){
       super(p0, p1);
    }
    public static WebSettings$PluginState valueOf(String p0){
       return Enum.valueOf(WebSettings$PluginState.class, p0);
    }
    public static WebSettings$PluginState[] values(){
       return WebSettings$PluginState.$VALUES.clone();
    }
}
