package cub.e;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import cub.d;
import ok.x;
import java.lang.Object;
import cub.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aub.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import cub.b;

public class e extends ConfigAutoParseJsonConsumer	// class@0023cc
{

    public void e(){
       super(d.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("redDot", b.e(p0.mRedDotConfig));
          g.a(uEditor);
          RxBus.f.b(new b(p0));
       }
       return;
    }
}
