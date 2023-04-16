package com.yxcorp.gifshow.startup.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.startup.c;
import ok.x;
import java.lang.Object;
import yjc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import o56.d;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class d extends ConfigAutoParseJsonConsumer	// class@001d85
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else {
          p0 = p0.mBindPhoneTips;
          if (!TextUtils.isEmpty(p0) && d.b) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString(b.d("user")+"bind_phone_tips", p0);
             g.a(uEditor);
          }
       }
       return;
    }
}
