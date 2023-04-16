package com.yxcorp.gifshow.growth.widget.virtual.e$a;
import fw8.b;
import com.yxcorp.gifshow.growth.widget.virtual.e;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mra.k;
import hka.b;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.os.Message;

public class e$a extends b	// class@001612
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          p0.i3(new k(this));
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       e$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, e.class, "20")) {
          Iterator iterator = tb.a.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc != null && weakReferenc.get() == p0) {
                iterator.remove();
                break ;
             }
          }
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.b.a.add(new WeakReference(p0));
       e$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, e.class, "12")) {
          Handler j = e.j;
          j.removeMessages(0, tb);
          j.sendMessageDelayed(j.obtainMessage(0, tb), 150);
       }
       return;
    }
}
