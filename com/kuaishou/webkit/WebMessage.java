package com.kuaishou.webkit.WebMessage;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.webkit.WebMessagePort;

public class WebMessage	// class@00126c
{
    public String mData;
    public WebMessagePort[] mPorts;

    public void WebMessage(String p0){
       super();
       this.mData = p0;
    }
    public void WebMessage(String p0,WebMessagePort[] p1){
       super();
       this.mData = p0;
       this.mPorts = p1;
    }
    public String getData(){
       return this.mData;
    }
    public WebMessagePort[] getPorts(){
       return this.mPorts;
    }
}
