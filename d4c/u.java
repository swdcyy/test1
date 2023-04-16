package d4c.u;
import erd.g;
import d4c.v;
import java.lang.Object;
import kob.v;
import java.util.Objects;
import npb.c;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import kob.p;
import brd.t;
import d4c.t;
import com.kuaishou.android.model.music.MusicType;
import android.view.View;
import g9c.a;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class u implements g	// class@0020de
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       v ov = v.class;
       c uoc = p0.a();
       if (uoc == null) {
          tb.W8(8);
       }else {
          Music music = uoc.c();
          tb.F = music;
          tb.Y8(music);
          if (!PatchProxy.applyVoid(null, tb, ov, "12")) {
             b9.a(tb.I);
             tb.I = RxBus.f.f(p.class).subscribe(new t(tb));
          }
          v f = tb.F;
          if (!PatchProxy.applyVoidOneRefs(f, tb, ov, "11") && f != null) {
             if (f.mType == MusicType.LIP) {
                tb.v.setAlpha(0.30f);
                tb.v.setEnabled(false);
             }else {
                tb.v.setEnabled(true);
                tb.v.setAlpha(0x3f800000);
             }
          }
          int i = tb.E.P0(tb.F);
          if (tb.s.getCurrentItem() != i) {
             tb.s.setCurrent(i);
          }
          if (p0.b()) {
             p0 = p0.c();
             if (p0 != null) {
                p0 = p0.c();
                if (p0 != null) {
                   int i1 = tb.E.P0(p0);
                   if (i1 >= 0) {
                      tb.E.l0(i1);
                   }
                }
             }
          }
       }
    label_00a9 :
       return;
    }
}
