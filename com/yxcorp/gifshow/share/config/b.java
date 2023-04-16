package com.yxcorp.gifshow.share.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.share.config.a;
import ok.x;
import java.lang.Object;
import phc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n80.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001b7a
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt(b.d("user")+"maxShowShareListCount", p0.mMaxShowShareListCount);
          g.a(uEditor);
       }
       return;
    }
}
