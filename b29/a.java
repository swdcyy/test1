package b29.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import xq7.d;
import rp7.a;
import jh5.a;
import b29.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import sr7.t;
import java.lang.Boolean;
import tw.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qp7.b;
import qp7.b1;
import qp7.x0;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.Integer;
import com.kwai.slide.play.detail.information.username.UserIconType;
import n49.s;
import qp7.c;
import sr7.r;
import b29.a$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import b29.a$c;
import java.util.Objects;
import brd.t;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.c;
import qp7.d;
import sr7.q;

public final class a extends DispatchBaseElement	// class@00035d
{
    public final a$a A;
    public GifshowActivity t;
    public QPhoto u;
    public PhotoDetailParam v;
    public a w;
    public BaseFragment x;
    public o y;
    public d z;

    public void a(){
       super(d.j, null);
       this.A = new a$a(this);
    }
    public static final QPhoto n0(a p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void P(a p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.t = a;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.u = mPhoto;
          a = p0.c;
          a.o(a, "callerContext.mPhotoDetailParam");
          this.v = a;
          a = p0.h;
          a.o(a, "callerContext.mLogListener");
          this.w = a;
          a = p0.b;
          a.o(a, "callerContext.mFragment");
          this.x = a;
          a = p0.m;
          a.o(a, "callerContext.mPhotoAdActionBarClickProcessor");
          this.y = a;
          this.z = p0;
       }
       return;
    }
    public a f0(a p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = new t(p0);
       }
       return ot;
    }
    public void j0(boolean p0){
       Integer integer;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a tu = this.u;
       String str = "mPhoto";
       if (tu == null) {
          a.S(str);
       }
       String str1 = j.j(tu);
       if (TextUtils.x(str1)) {
          this.b0();
          return;
       }else {
          this.c0();
          this.i(this.A);
          t ot = this.E();
          a.m(str1);
          a tt = this.t;
          if (tt == null) {
             a.S("mActivity");
          }
          ot.i(str1, tt.getResources().getColor(R.color.arg_RES_7f061c32));
          t ot1 = this.E();
          a tu1 = this.u;
          if (tu1 == null) {
             a.S(str);
          }
          User user = tu1.getUser();
          UserIconType userIconType = null;
          if (user != null) {
             user = user.mVerifiedDetail;
             if (user != null) {
                integer = Integer.valueOf(user.mIconType);
             label_0074 :
                String str2 = 1;
                if (integer != null && integer.intValue() == str2) {
                   userIconType = UserIconType.ICON_TYPE_YELLOW;
                }else {
                   str2 = 2;
                   if (integer != null && (integer.intValue() == str2 && s.a())) {
                      userIconType = UserIconType.ICON_TYPE_BLUE;
                   }
                }
                ot1.j(userIconType);
                g og = Functions.d();
                a.o(og, "Functions.emptyConsumer\(\)");
                this.j(this.A().a(new a$b(this), og));
                r or = this.A();
                a$c uoc = new a$c(this);
                og = Functions.d();
                a.o(og, "Functions.emptyConsumer\(\)");
                Objects.requireNonNull(or);
                b uob = PatchProxy.applyTwoRefs(uoc, og, or, r.class, "4");
                if (uob != PatchProxyResult.class) {
                }else {
                   a.p(uoc, "onNext");
                   a.p(og, "onError");
                   uob = or.b.subscribe(uoc, og);
                   a.o(uob, "vipBadgeClickSubject.subscribe\(onNext, onError\)");
                }
                this.j(uob);
                return;
             }
          }
          integer = userIconType;
          goto label_0074 ;
       }
    }
    public final void o0(HashMap p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       a tt = this.t;
       if (tt == null) {
          a.S("mActivity");
       }
       a tv = this.v;
       String str = "mPhotoDetailParam";
       if (tv == null) {
          a.S(str);
       }
       PhotoDetailParam mPhoto = tv.mPhoto;
       a tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       DetailCommonParam detailCommon = tv1.getDetailCommonParam();
       a.o(detailCommon, "mPhotoDetailParam.detailCommonParam");
       QPreInfo preInfo = detailCommon.getPreInfo();
       a tv2 = this.v;
       if (tv2 == null) {
          a.S(str);
       }
       tv2 = tv2.mPhotoIndex;
       a tz = this.z;
       if (tz == null) {
          a.S("mCallerContext");
       }
       c.c(tt, mPhoto, preInfo, tv2, false, tz.n, p1, p0);
       return;
    }
    public d q(){
       q oq = PatchProxy.apply(null, this, a.class, "8");
       if (oq != PatchProxyResult.class) {
       }else {
          oq = new q();
       }
       return oq;
    }
    public c r(){
       r or = PatchProxy.apply(null, this, a.class, "7");
       if (or != PatchProxyResult.class) {
       }else {
          or = new r();
       }
       return or;
    }
}
