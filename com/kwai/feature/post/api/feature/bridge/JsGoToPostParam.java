package com.kwai.feature.post.api.feature.bridge.JsGoToPostParam;
import java.io.Serializable;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.resource.kds.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import java.lang.Integer;
import java.lang.StringBuilder;

public class JsGoToPostParam implements Serializable	// class@001344
{
    public List mExtraParamList;
    public boolean shouldAnimated;
    public String subBiz;
    public String taskId;
    public static final long serialVersionUID = 0x2467b9857ae179a8;

    public void JsGoToPostParam(){
       super();
    }
    public static int getResourceIdByKey(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JsGoToPostParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          String str = a.d().c(p0, p1);
          if (!TextUtils.x(str)) {
             str = new JSONObject(str).getString("file");
             if (!TextUtils.x(str)) {
                i = Integer.parseInt(str);
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGoToPostParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGoToPostParam{subBiz=\'"+this.subBiz+'''+", shouldAnimated="+this.shouldAnimated+", taskId=\'"+this.taskId+'''+", mExtraParamList="+this.mExtraParamList+'}';
    }
}
