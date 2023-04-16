package com.yxcorp.gifshow.moment_downloader.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.moment_downloader.startup.a;
import ok.x;
import java.lang.Object;
import iob.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eob.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001fcb
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"momentConfig", b.e(p0.mMomentConfig));
          g.a(uEditor);
       }
       return;
    }
}
