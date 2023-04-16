package com.yxcorp.gifshow.v3.editor.prettify.beauty.h$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import xvc.l;
import l0c.a;
import java.util.Objects;

public class h$a implements Runnable	// class@001159
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       this.b.t.removeCallbacks(this);
       l.a.a();
       Objects.requireNonNull(a.b);
       return;
    }
}
