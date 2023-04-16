package com.kwai.component.photo.detail.core.log.vse.opt.b$c;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zd5.d;
import java.util.Objects;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class b$c implements Runnable	// class@000a2f
{
    public String b;

    public void b$c(String p0){
       super();
       this.b = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       d uod = d.c();
       b$c tb = this.b;
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidOneRefs(tb, uod, d.class, "10")) {
          Object[] objArray = new Object[0];
          v.C().w("VideoStatEventOptManage", "remove data "+tb, objArray);
          g.b(uod.e().edit().remove(tb));
       }
       return;
    }
}
