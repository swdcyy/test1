package com.yxcorp.gifshow.detail.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.startup.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.startup.CommentDenyStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import com.yxcorp.gifshow.detail.model.CommentDenyConfig;
import java.lang.Exception;

public class b extends ConfigAutoParseJsonConsumer	// class@001a0c
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else if(p0 != null && p0.mCommentDenyConfig != null){
          try{
             n.b().edit().putBoolean("commentDenyOfflineKey", p0.mCommentDenyConfig.mEnableCommentPermissionOffline);
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
}
