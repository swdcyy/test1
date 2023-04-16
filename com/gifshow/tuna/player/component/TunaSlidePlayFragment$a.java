package com.gifshow.tuna.player.component.TunaSlidePlayFragment$a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import nj.h;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class TunaSlidePlayFragment$a extends ViewPager2$h	// class@0015e5
{
    public boolean a;
    public final TunaSlidePlayFragment b;

    public void TunaSlidePlayFragment$a(TunaSlidePlayFragment p0){
       this.b = p0;
       super();
    }
    public void a(int p0){
       TunaSlidePlayFragment$a uoa = TunaSlidePlayFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 == 1) {
          p0.r = true;
          this.a = false;
       }else {
          p0.r = false;
       }
       return;
    }
    public void b(int p0,float p1,int p2){
       if (PatchProxy.isSupport(TunaSlidePlayFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, TunaSlidePlayFragment$a.class, "2")) {
          return;
       }
       if ((this.b.n.getItemCount() - 1) == p0 && (!p1 && (!p2 && (this.b.r != null && this.a == null)))) {
          i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103d0f), 0);
          this.a = true;
       }
    label_004d :
       return;
    }
    public void c(int p0){
       TunaSlidePlayFragment$a uoa = TunaSlidePlayFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.b.eh(p0);
       return;
    }
}
