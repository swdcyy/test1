package com.kwai.feature.bridges.common.beans.WifiInfoBridgeResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class WifiInfoBridgeResult implements Serializable	// class@0011d7
{
    public String bssid;
    public int result;
    public String ssid;
    public static final long serialVersionUID = 0xc32591ac15760cbc;

    public void WifiInfoBridgeResult(){
       super();
       this.result = 1;
       this.ssid = "";
       this.bssid = "";
    }
    public void setBssid(String p0){
       this.bssid = p0;
    }
    public void setResult(int p0){
       this.result = p0;
    }
    public void setSsid(String p0){
       this.ssid = p0;
    }
}
