package com.kwai.feature.api.social.bridge.beans.JsUserAliasResult;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.String;
import java.util.Map;

public class JsUserAliasResult extends FunctionResultParams	// class@0010b7
{
    public Map mAliasList;
    public static final long serialVersionUID = 0x3a182bb1dacf82f1;

    public void JsUserAliasResult(int p0,String p1,Map p2){
       super();
       this.mResult = p0;
       this.mMsg = p1;
       this.mAliasList = p2;
    }
}
