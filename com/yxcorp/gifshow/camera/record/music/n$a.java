package com.yxcorp.gifshow.camera.record.music.n$a;
import com.kwai.library.widget.specific.lyrics.LyricsView$a;
import com.yxcorp.gifshow.camera.record.music.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.MotionEvent;
import java.util.Objects;
import xi9.n;

public class n$a implements LyricsView$a	// class@000e86
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, n$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.d.b().B();
       return true;
    }
    public void c(int p0){
    }
    public boolean d(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, n$a.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       n$a ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.apply(null, ta, n.class, "41");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          d g = ta.g;
          b = (g != null && (!g.t() && (ta.g.C() || ta.g.t0())))? true: false;
       }
       return b;
    }
}
