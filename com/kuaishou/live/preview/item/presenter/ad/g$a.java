package com.kuaishou.live.preview.item.presenter.ad.g$a;
import wk3.b;
import com.kuaishou.live.preview.item.presenter.ad.g;
import java.lang.Object;
import wk3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import mxb.h;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sx.d;
import el3.d;
import com.yxcorp.gifshow.entity.QPhoto;
import el3.o;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.Pair;
import erd.g;
import rx.d;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class g$a implements b	// class@000e10
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void W4(){
       a.e(this);
    }
    public void X4(boolean p0){
       a.a(this, p0);
    }
    public void Y4(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$a.class, "1")) {
          return;
       }
       int i = this.b.u.c();
       if (i == 1 || i == 2) {
          g$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, g.class, "8")) {
             tb.w = 0;
             tb.x = 0;
             tb.v.c();
          }
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "4")) {
          return;
       }
       this.b.R8();
       if (this.b.r.Vg().c()) {
          d.P8().z0(67, this.b.p.mEntity, "", null, new o(this));
       }
       return;
    }
    public void onPause(){
       a.b(this);
    }
    public void onResume(){
       a.c(this);
    }
    public void t4(LiveWillShowType p0){
       a.h(this, p0);
    }
    public void t7(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "2")) {
          return;
       }
       this.a();
       return;
    }
    public void x4(){
       a.g(this);
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "3")) {
          return;
       }
       this.a();
       return;
    }
}
