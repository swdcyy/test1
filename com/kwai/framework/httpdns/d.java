package com.kwai.framework.httpdns.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.httpdns.c;
import ok.x;
import java.lang.Object;
import v66.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import v66.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import wkd.b;
import c0d.a;
import com.google.gson.JsonObject;

public class d extends ConfigAutoParseJsonConsumer	// class@001560
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else if(SystemUtil.P()){
          p0.mHttpDnsLogRatio = 0;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putFloat("httpDnsLogRatio", p0.mHttpDnsLogRatio);
       g.a(uEditor);
       if (p0.mResolveConfig != null) {
          b.a(0x1a7467ca).d(p0.mResolveConfig);
       }
       return;
    }
}
