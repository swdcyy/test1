package com.tachikoma.core.component.a;
import erd.g;
import wo8.a;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a implements g	// class@000d58
{
    public final a b;

    public void a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 != null){
          a tb = this.b;
          if (tb.g == null) {
             tb.e = p0;
             tb.a(p0);
          }
       }
       return;
    }
}
