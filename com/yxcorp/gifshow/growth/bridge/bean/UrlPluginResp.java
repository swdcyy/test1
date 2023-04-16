package com.yxcorp.gifshow.growth.bridge.bean.UrlPluginResp;
import java.io.Serializable;
import java.lang.Object;

public class UrlPluginResp implements Serializable	// class@0012f4
{
    public int code;
    public final int result;
    public static final long serialVersionUID = 0x43e7073fe8790dcb;

    public void UrlPluginResp(int p0){
       super();
       this.result = 1;
       this.code = p0;
    }
}
