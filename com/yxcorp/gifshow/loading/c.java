package com.yxcorp.gifshow.loading.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.loading.b;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.loading.PullDownResourceStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m0b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class c extends ConfigAutoParseJsonConsumer	// class@001a9b
{

    public void c(){
       super(b.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("pullDownActivityResourceConfig", b.e(p0.mPullDownActivityResourceConfig));
          g.a(uEditor);
       }
       return;
    }
}
