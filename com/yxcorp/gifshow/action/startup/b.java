package com.yxcorp.gifshow.action.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.action.startup.a;
import ok.x;
import java.lang.Object;
import dw8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f8c.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@00132f
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("feedRealActionBizConfig", b.e(p0.feedRealActionsConfig));
          g.a(uEditor);
       }
       return;
    }
}
