package f19.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f19.b$a;
import nsd.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import f19.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import z1.e;
import java.lang.Number;
import android.view.View;
import usd.q;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.d2;
import java.util.ArrayList;
import bf5.q;
import f19.b$c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import xe5.r$a;
import f19.c;
import xe5.r$b;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import o56.a;
import android.content.Context;
import java.lang.Boolean;
import xe5.s;
import xe5.r;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import rf5.u;
import xe5.p;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import ekd.m1;

public class b extends PresenterV2	// class@002281
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public s F;
    public final e G;
    public View p;
    public View q;
    public KwaiImageView r;
    public KwaiImageView s;
    public PhotoDetailParam t;
    public QPhoto u;
    public q v;
    public u w;
    public NasaBizParam x;
    public ArrayList y;
    public f z;
    public static final b$a H;

    static {
       b.H = new b$a(null);
    }
    public void b(){
       super(null, 1, null);
    }
    public void b(PhotoDetailParam p0){
       super();
       this.G = new b$b(this);
       this.t = p0;
    }
    public void b(PhotoDetailParam p0,int p1,u p2){
       super(null);
    }
    public void E8(){
       boolean b;
       e a;
       int i;
       boolean b1;
       float f;
       Activity activity;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "8")) {
          return;
       }
       b tu = this.u;
       String str = "mPhoto";
       if (tu == null) {
          a.S(str);
       }
       this.B = tu.getWidth();
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       int height = tu.getHeight();
       this.C = height;
       b = true;
       tu = (this.B == null || !height)? 1: null;
       if (tu) {
          return;
       }else {
          tu = this.z;
          e uoe = (tu != null)? tu.get(): objArray;
          if (uoe != null) {
             a = uoe.a;
             a.o(a, "ref.first");
             this.D = a.intValue();
             uoe = uoe.b;
             a.o(uoe, "ref.second");
             this.E = uoe.intValue();
          }else {
             View view = this.m8();
             a.o(view, "rootView");
             View view1 = this.m8();
             a.o(view1, "rootView");
             this.D = q.u(view.getWidth(), view1.getHeight());
             view = this.m8();
             a.o(view, "rootView");
             view1 = this.m8();
             a.o(view1, "rootView");
             this.E = q.n(view.getWidth(), view1.getHeight());
             if (this.D <= null) {
                activity = this.getActivity();
                a.m(activity);
                this.D = n.k(activity);
             }
             if (this.E <= null) {
                activity = this.getActivity();
                a.m(activity);
                this.E = n.j(activity);
             }
             if (this.D <= null) {
                this.D = d2.f();
             }
             if (this.E <= null) {
                this.E = d2.e();
             }
          }
          tu = this.y;
          if (tu == null) {
             a.S("mOnSizeChangedListenerList");
          }
          tu.add(this.G);
          tu = this.v;
          String str1 = "mProfileSideEventBus";
          if (tu == null) {
             a.S(str1);
          }
          this.A = tu.i;
          tu = this.v;
          if (tu == null) {
             a.S(str1);
          }
          this.X7(tu.D.subscribe(new b$c(this), Functions.e));
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
             r$a uoa = new r$a();
             uoa.j(b);
             uoa.h(c.a);
             b tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             uoa.o(tu1);
             tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             PhotoMeta photoMeta = tu1.getPhotoMeta();
             photoMeta = (photoMeta != null)? photoMeta.mPhotoTextLocationInfo: objArray;
             uoa.p(photoMeta);
             uoa.w(this.p);
             uoa.x(this.q);
             uoa.r(this.r);
             uoa.u = this.s;
             uoa.q(this.B, this.C);
             uoa.t(this.D, this.E);
             uoa.i(d2.f(), d2.e());
             uoa.y(a1.e(45.00f));
             Object[] obj = PatchProxy.apply(objArray, this, uob, "11");
             if (obj != patchProxyRe) {
                i = obj.intValue();
             }else if(f.r()){
                tu1 = this.x;
                if (tu1 == null) {
                   a.S("mNasaBizParam");
                }
                i = tu1.getNasaSlideParam().BOTTOM_BAR_HEIGHT;
             }else {
                i = 0;
             }
             uoa.g(i);
             obj = PatchProxy.apply(objArray, this, uob, "12");
             i = (obj != patchProxyRe)? obj.intValue(): n.A(a.B);
             uoa.k = i;
             NasaSlideParam obj1 = PatchProxy.apply(objArray, this, uob, "14");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                uob = this.x;
                if (uob == null) {
                   a.S("mNasaBizParam");
                }
                obj1 = uob.getNasaSlideParam();
                String str2 = "mNasaBizParam.nasaSlideParam";
                a.o(obj1, str2);
                if (!obj1.isHomePage()) {
                   uob = this.x;
                   if (uob == null) {
                      a.S("mNasaBizParam");
                   }
                   obj1 = uob.getNasaSlideParam();
                   a.o(obj1, str2);
                   if (!obj1.isTrendingPage()) {
                   label_01f2 :
                      b = null;
                   label_01f3 :
                      b1 = b;
                   }
                }
                if (f.b()) {
                   goto label_01f3 ;
                }else {
                   goto label_01f2 ;
                }
             }
             uoa.v(b1);
             uoa.d(f.o());
             uob = this.v;
             if (uob == null) {
                a.S(str1);
             }
             uoa.s(uob.h);
             this.F = new s(uoa.a());
             uob = this.u;
             if (uob == null) {
                a.S(str);
             }
             if (!l.j(uob.mEntity)) {
                uob = this.F;
                if (uob == null) {
                   a.S("mTextureViewSizeHelper");
                }
                b tD = this.D;
                tu = this.E;
                b tw = this.w;
                if (tw == null) {
                   a.S("mSwipeToProfileFeedMovement");
                }
                f = tw.q();
                b tv = this.v;
                if (tv == null) {
                   a.S(str1);
                }
                uob.c(tD, tu, f, tv.h);
             }
          }
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          a hierarchy = tr.getHierarchy();
          a.o(hierarchy, "hierarchy");
          hierarchy.u(t$b.i);
          tr.setScaleType(ImageView$ScaleType.CENTER_CROP);
       }
       return;
    }
    public final QPhoto P8(){
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final View R8(){
       return this.q;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3120);
       this.p = m1.f(p0, 0x7f0a3e7f);
       this.r = m1.f(p0, 0x7f0a319f);
       this.s = m1.f(p0, 0x7f0a0456);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.u = obj;
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.x = obj;
       obj = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_SIZE_CHANGED_LIST\)");
       this.y = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.w = obj;
       obj = this.q8(q.class);
       a.o(obj, "inject\(MilanoProfileSideEventBus::class.java\)");
       this.v = obj;
       this.z = this.x8("SLIDE_PLAY_SIZE_SUPPLIER");
       return;
    }
}
