package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import uwc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.lifecycle.LiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Objects;
import java.lang.Number;
import swc.f;
import swc.c;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import di0.b;
import java.lang.Math;

public final class PicturesViewBinder$f implements Observer	// class@0015f2
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$f(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int b;
       Workspace$Type uNKNOWN;
       int i1;
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$f.class, "1")) {
       }else {
          int i = 1;
          if (p0 != null && !p0.intValue()) {
             if (!this.b.G()) {
                p0 = this.b.J;
                uNKNOWN = p0.t0().getValue();
                if (uNKNOWN == null) {
                   uNKNOWN = Workspace$Type.UNKNOWN;
                }
                p0.A0(uNKNOWN);
                p0 = this.b.J;
                PicturesViewBinder picturesView2 = p0;
                i1 = p0.q0();
                Objects.requireNonNull(picturesView2);
                if (PatchProxy.isSupport(uob)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), picturesView2, uob, "26");
                   if (obj != patchProxyRe) {
                      b = obj.intValue();
                   label_006c :
                      p0.o0(b);
                      p0 = this.b;
                      p0.L(i, p0.J.q0());
                      p0 = this.b;
                      p0.j.z(p0.J.q0());
                   }
                }
                b = picturesView2.x0().A(i1);
                goto label_006c ;
             }
             this.b.E(i);
             p0 = this.b;
             p0.w.F0(p0.C);
          }else if(p0 != null && p0.intValue() == i){
             p0 = this.b.J;
             uNKNOWN = Workspace$Type.UNKNOWN;
             if (p0.c != uNKNOWN) {
                PicturesViewBinder picturesView1 = p0;
                i1 = p0.q0();
                if (PatchProxy.isSupport(uob)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), picturesView1, uob, "27");
                   if (obj != patchProxyRe) {
                      b = obj.intValue();
                   label_00d4 :
                      p0.o0(b);
                      this.b.J.A0(uNKNOWN);
                   }
                }
                b = picturesView1.x0().B(i1);
                goto label_00d4 ;
             }
             p0 = this.b;
             p0.j.z(p0.J.q0());
          }else {
             PicturesViewBinder picturesView = 2;
             if (p0 != null && p0.intValue() == picturesView) {
                p0 = this.b;
                p0.w.I0(p0.C);
                b = false;
                this.b.E(b);
                if (this.b.J.q0() >= this.b.J.v0().v()) {
                   p0 = this.b.J;
                   p0.n(Math.max(b, (p0.v0().v() - i)));
                }
             }
          }
       }
       return;
    }
}
