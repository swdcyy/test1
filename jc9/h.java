package jc9.h;
import erd.g;
import jc9.j;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import jc9.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.base.b;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import hc9.e;
import com.kuaishou.android.model.music.Music;
import j8c.a;
import q87.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import ad9.i;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;

public final class h implements g	// class@002940
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j q = this.b.q;
       Objects.requireNonNull(q);
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p0, q, uob0, "9")) {
       }else if(!PanelShowEvent.a(q.f.a(), p0)){
          int i = 0;
          if (p0.a != null && (p0.c == PanelShowEvent$PanelType.MUSIC && q.e.f() instanceof Music)) {
             Object[] objArray = new Object[i];
             a.D().w("AutoDownloadBarHandler", "show music panel ,close music download bar", objArray);
             q.d(2);
          }else if(p0.c == PanelShowEvent$PanelType.MORE_OPTION){
             p0 = p0.a;
             if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), q, uob0, "10")) {
                if (p0 == null && (!CameraLogger.d(q.f) && q.c <= null)) {
                   q.d.f(i);
                   p0 = q.d;
                   if (p0.l != null) {
                      p0.h(null, null);
                   }
                }else {
                   p0 = q.d;
                   if (p0.l != null) {
                      p0.d(true, null, null);
                   }
                   q.d.f(true);
                }
             }
          }
       }
       return;
    }
}
