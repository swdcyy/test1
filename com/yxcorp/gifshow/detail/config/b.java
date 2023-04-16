package com.yxcorp.gifshow.detail.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.config.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.config.QPhotoPlayerStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p7c.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@0014ff
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("MultiRateConfig", b.e(p0.mMultiRateConfig));
          g.a(uEditor);
       }
       return;
    }
}
