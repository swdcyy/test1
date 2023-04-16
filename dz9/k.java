package dz9.k;
import lf5.a;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import mf5.w0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import f6a.c;
import e0a.j;
import id5.o;
import kf5.g;
import lnc.ja;
import tkd.b;
import tkd.d;
import ayb.g;
import ez9.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;

public final class k extends a	// class@002016
{
    public final PhotoDetailParam C;
    public final QPhoto D;
    public final BaseFragment E;
    public final d F;
    public final SlidePlayViewModel G;
    public final m0 H;
    public final SlidePageConfig I;

    public void k(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("dislike");
       this.H = p0;
       this.I = p1;
       a c = p0.c;
       this.C = c;
       PhotoDetailParam mPhoto = c.mPhoto;
       this.D = mPhoto;
       a b = p0.b;
       this.E = b;
       this.F = new d(mPhoto, p0.a);
       a.o(b, "fragment");
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(b.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(fragment.parentFragment\)");
       this.G = slidePlayVie;
       this.J(false);
    }
    public int C(){
       return 2;
    }
    public boolean E(){
       k obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.I.H() && b.a(-1578665399).F()) {
          return b;
       }
       obj = (!c.a() || (this.I.a0() || (c.b() && j.e())))? null: 1;
       k tD = this.D;
       a.o(tD, "photo");
       if (!tD.isMine() && (this.I.w0 != null && (obj && !o.d(this.D)))) {
          b = true;
       }
    label_0069 :
       return b;
    }
    public void d(w0 p0,g p1){
       k d;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, k.class, "2")) {
          return;
       }
       a.p(obj1, "item");
       a.p(obj2, "panel");
       ja.a();
       String str = "detailParam";
       String str1 = "photo";
       if (d.a(-908290672).z50()) {
          d = obj.D;
          a.o(d, str1);
          k e = obj.E;
          a.o(e, "fragment");
          a uoa = a.a;
          a.d(uoa, obj.H, d, e, null, null, 24, null);
          k d1 = obj.D;
          a.o(d1, str1);
          d = obj.C;
          a.o(d, str);
          a.b(uoa, d1, d, obj.G, obj.F, null, 16, null);
       }else {
          k d2 = obj.D;
          a.o(d2, str1);
          k c = obj.C;
          a.o(c, str);
          a uoa1 = a.a;
          a.b(uoa1, d2, c, obj.G, obj.F, null, 16, null);
          k d3 = obj.D;
          a.o(d3, str1);
          k e1 = obj.E;
          a.o(e1, "fragment");
          a.d(uoa1, obj.H, d3, e1, null, null, 24, null);
       }
       p1.a();
       return;
    }
    public void onShow(){
    }
}
