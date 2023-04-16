package com.yxcorp.gifshow.webview.jsmodel.component.JsExpTagTransListResult;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;

public class JsExpTagTransListResult implements Serializable	// class@00176a
{
    public String mErrorMsg;
    public ClientEvent$ExpTagTrans[] mExpTagTransList;
    public int mResult;
    public static final long serialVersionUID = 0xe7ef9e36d47cb879;

    public void JsExpTagTransListResult(int p0,String p1,ClientEvent$ExpTagTrans[] p2){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mExpTagTransList = p2;
    }
}
