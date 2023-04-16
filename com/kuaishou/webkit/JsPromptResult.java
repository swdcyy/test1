package com.kuaishou.webkit.JsPromptResult;
import com.kuaishou.webkit.JsResult;
import com.kuaishou.webkit.JsResult$ResultReceiver;
import java.lang.String;

public class JsPromptResult extends JsResult	// class@00124e
{
    public String mStringResult;

    public void JsPromptResult(JsResult$ResultReceiver p0){
       super(p0);
    }
    public void confirm(String p0){
       this.mStringResult = p0;
       this.confirm();
    }
    public String getStringResult(){
       return this.mStringResult;
    }
}
