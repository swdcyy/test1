package com.yxcorp.gifshow.apm.d;
import java.lang.Runnable;
import java.lang.Object;
import k89.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import k89.d;
import java.lang.reflect.Type;
import t06.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class d implements Runnable	// class@001b9d
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       SharedPreferences a;
       try{
          Object[] objArray = null;
          if (PatchProxy.applyVoid(objArray, objArray, c.class, "1")) {
          }else {
             d value = a.t().getValue("ColdLaunchOnlineSystrace", d.class, objArray);
             a = a.a;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean("isTrace", value.mIsTrace);
             g.a(uEditor);
             uEditor = a.edit();
             uEditor.putInt("uploadThreshold", value.mUploadThreshold);
             g.a(uEditor);
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putBoolean("isUploadWhenTimeout", value.mIsUploadWhenTimeout);
             g.a(uEditor1);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
