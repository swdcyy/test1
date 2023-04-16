package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.d;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import ei5.f;
import brd.t;
import t45.d;
import brd.z;
import vda.d;
import erd.g;
import crd.b;
import wkd.b;
import com.yxcorp.gifshow.featured.offline.b;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.Fragment;
import d6a.f;
import l0a.a;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import lnc.a1;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import tkd.b;
import tkd.d;
import wm5.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import vm5.o;
import uw9.l0;
import jf5.a;

public class e extends PresenterV2	// class@000f36
{
    public BaseFragment p;
    public MilanoContainerEventBus q;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       c.a(d.b);
       this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new d(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, e.class, "5");
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       List list = b.a(0x260f527b).f();
       int i = 0;
       while (true) {
          if (i < list.size()) {
             if ((list.get(i).getPhotoId()).equals(p0)) {
             label_0035 :
                if (q.f(list)) {
                   break ;
                }else {
                   String str = f.b(this.p);
                   b.g(j.e(new a(list), str, SlideMediaType.ALL));
                   PhotoDetailParam photoDetailP = new PhotoDetailParam(list.get(i)).setSource(this.p.f()).setBizType(4);
                   photoDetailP.getSlidePlayConfig().setEnablePullRefresh(false);
                   photoDetailP.setSlidePlayId(str);
                   NasaSlideParam$a uoa = new NasaSlideParam$a();
                   uoa.T("DETAIL");
                   uoa.Z("OFFLINE_CACHE");
                   uoa.i(true);
                   uoa.H(a1.p(R.string.arg_RES_7f103a7a));
                   NasaSlideParam nasaSlidePar = uoa.a();
                   d.a(0x66aa3a58).z20(this.p.requireActivity(), 1025, photoDetailP, null, 0, 0, nasaSlidePar, true, null);
                   return;
                }
             }else {
                i = i + 1;
             }
          }else {
             i = 0;
             goto label_0035 ;
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(l0.class).X;
       return;
    }
}
