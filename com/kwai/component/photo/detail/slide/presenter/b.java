package com.kwai.component.photo.detail.slide.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.kwai.component.photo.detail.slide.presenter.b$a;
import com.kwai.component.photo.detail.slide.presenter.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import androidx.viewpager.widget.ViewPager$i;
import qw6.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import of5.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.util.Map;
import k2b.k0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import q87.c;
import de5.a;
import java.lang.Integer;

public class b extends PresenterV2	// class@000a93
{
    public QPhoto p;
    public a q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public GrootViewPager t;
    public int u;
    public String v;
    public ViewPager$i w;
    public a x;
    public static final Map y;

    static {
       b.y = new HashMap();
    }
    public void b(){
       super();
       this.w = new b$a(this);
       this.x = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.s = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.v = this.p.getPhotoId()+"&"+this.u;
       this.P8("onBind currentPosition: "+this.u);
       GrootViewPager grootViewPag = this.s.d1(GrootViewPager.class);
       this.t = grootViewPag;
       grootViewPag.k0(this.w);
       this.s.o0(this.r, this.x);
       this.X7(this.r.m().subscribe(new d(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.P8("onUnbind currentPosition: "+this.u);
       b.y.remove(this.v);
       this.t.o0(this.w);
       this.s.y(this.r, this.x);
       return;
    }
    public void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       k0 ok0 = k0.C();
       StringBuilder str = "userName: "+this.p.getUserName()+" photoId: "+this.p.getPhotoId()+" fragment: "+this.r.toString()+" presenter: "+this+" playModule: ";
       b tq = this.q;
       String str1 = (tq == null)? "null": tq.toString();
       Object[] objArray = new Object[0];
       ok0.w("FirstFrameOpt", str+str1+"  "+p0, objArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.s8(a.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.u = this.r8("DETAIL_PHOTO_INDEX").intValue();
       return;
    }
}
