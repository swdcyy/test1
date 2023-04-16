package dl9.u1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dl9.r1;
import dl9.s1;
import dl9.u1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nx9.c;
import hl9.t;
import ekd.m1;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.content.res.ColorStateList;
import lnc.a1;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import dl9.i1;
import crd.b;
import ok.h;
import lnc.b9;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import yk9.d;
import com.yxcorp.gifshow.entity.QPhoto;
import il9.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import android.view.Window;
import il9.b$b;
import il9.e;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import dl9.k1;
import erd.g;
import gk9.c;
import com.kwai.framework.logger.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import brd.x;
import cjd.e;
import erd.o;
import dl9.m1;
import dl9.u1$b;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import zf6.k;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.comment.CommentConfig;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import lnc.i3;
import com.yxcorp.gifshow.comment.CommentParams;
import java.lang.Number;
import java.lang.CharSequence;
import java.util.Map;
import wnc.a;
import e17.i;
import android.os.SystemClock;
import dl9.n1;
import dl9.v1;
import java.lang.Runnable;
import com.middleware.security.MXSec;
import t38.a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import dl9.j1;
import com.yxcorp.gifshow.util.cdnresource.f;
import dl9.o1;
import java.math.BigDecimal;
import java.lang.StringBuilder;
import java.lang.Math;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mrd.c;

public class u1 extends PresenterV2	// class@001fb9
{
    public BaseFragment A;
    public BaseFragment B;
    public CommentConfig C;
    public CommentParams D;
    public c E;
    public c F;
    public b G;
    public long H;
    public boolean I;
    public final Runnable J;
    public final Runnable K;
    public final b$b L;
    public AnimatorSet M;
    public View p;
    public View q;
    public View r;
    public ImageView s;
    public LottieAnimationView t;
    public View u;
    public QComment v;
    public d w;
    public Map x;
    public Map y;
    public QPhoto z;

    public void u1(){
       super();
       this.I = false;
       this.J = new r1(this);
       this.K = new s1(this);
       this.L = new u1$a(this);
    }
    public void E8(){
       int i1;
       u1 obj;
       View view = this;
       u1 ou1 = u1.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, view, ou1, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, view, ou1, "21")) {
          View view1 = this.m8();
          if (!this.V8()) {
             i1 = 0x7f0a087d;
             if (c.f()) {
                if (view.q == null) {
                   t.l9(this.m8(), i1);
                }
             }
             view.q = m1.f(this.m8(), i1);
             view.r = m1.f(view1, i1);
             view.s = m1.f(view1, 0x7f0a087b);
             view.u = m1.f(view1, 0x7f0a087c);
             view.t = m1.f(view1, 0x7f0a0847);
             if (c.c()) {
                t.e9(view.u, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f0606ee, 0x7f0606ef)));
                view.s.setImageResource(R.drawable.arg_RES_7f0804d9);
             }else if(c.d()){
                t.e9(view.u, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f0606f0, 0x7f0606f1)));
                view.s.setImageResource(R.drawable.arg_RES_7f0804da);
             }
          }else {
             i1 = 0x7f0a0933;
             if (c.f()) {
                if (view.p == null) {
                   t.l9(view1, i1);
                }
             }
             view.p = m1.f(view1, i1);
             view.r = m1.f(view1, 0x7f0a0703);
             view.s = m1.f(view1, 0x7f0a1510);
             view.u = m1.f(view1, 0x7f0a41bb);
             view.t = m1.f(view1, 0x7f0a29b9);
             if (c.c()) {
                t.e9(view.u, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f0606fb, 0x7f0606fc)));
                view.s.setImageResource(R.drawable.arg_RES_7f0804f5);
             }else if(c.d()){
                t.e9(view.u, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f0606fd, 0x7f0606fe)));
                view.s.setImageResource(R.drawable.arg_RES_7f0804f6);
             }
          }
       }
    label_0140 :
       ou1 = view.A;
       if (ou1 != null) {
          view.v.startSyncWithFragment(ou1.m());
       }else {
          ou1 = view.B;
          if (ou1 != null) {
             view.v.startSyncWithFragment(ou1.m());
          }
       }
       view.G = b9.c(view.G, new i1(view));
       int i = 8;
       i1 = 0;
       if (this.V8()) {
          view.p.setVisibility(i1);
       }else {
          ou1 = view.p;
          if (ou1 != null) {
             ou1.setVisibility(i);
          }
       }
       ou1 = view.q;
       if (ou1 != null) {
          ou1.setVisibility(i1);
       }
       view.s.setVisibility(i1);
       view.u.setVisibility(i1);
       view.s.setSelected(view.v.mLiked);
       view.u.setSelected(view.v.mLiked);
       this.e9();
       ou1 = view.t;
       if (ou1 != null) {
          ou1.setVisibility(i);
       }
       u1 r = view.r;
       u1 s = view.s;
       ou1 = view.A;
       int i2 = 1;
       boolean b = (!view.v.getStatus() && !this.S8())? true: false;
       boolean b1 = (!view.v.getStatus() && !this.S8())? true: false;
       u1 l = view.L;
       u1 v = view.v;
       ClientContent$ContentPackage uContentPack = view.w.b(v, v.mReplyToCommentId);
       String likeActivity = view.z.getLikeActivityResourceId();
       u1 z = view.z;
       b uob = b.class;
       int i3 = 9;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray1 = new Object[i3];
          objArray1[i1] = r;
          objArray1[i2] = s;
          objArray1[2] = ou1;
          objArray1[3] = Boolean.valueOf(b);
          objArray1[4] = Boolean.valueOf(b1);
          objArray1[5] = l;
          objArray1[6] = uContentPack;
          objArray1[7] = likeActivity;
          objArray1[8] = z;
          obj = null;
          if (PatchProxy.applyVoid(objArray1, obj, uob, "1")) {
             obj = 1;
          }else {
          label_022b :
             u1 obj1 = PatchProxy.applyOneRefs(ou1, obj, uob, "13");
             if (obj1 != PatchProxyResult.class) {
                obj = obj1;
             }else {
                obj1 = ou1;
                while (true) {
                   if (obj1 != null) {
                      if (obj1 instanceof DialogFragment) {
                         obj = obj1;
                      }else {
                         Fragment parentFragme = obj1.getParentFragment();
                      }
                   }else {
                      obj = null;
                   }
                }
             }
             if (obj != null && (obj.getDialog() != null && obj.getDialog().getWindow() != null)) {
                obj = 1;
                b.a(r, s, obj.getDialog().getWindow(), b, b1, l, uContentPack, false, likeActivity, z);
             }else {
                obj1 = z;
                i1 = 1;
                if (ou1.getActivity() != null) {
                   FragmentActivity activity = ou1.getActivity();
                   if (PatchProxy.isSupport(uob)) {
                      objArray = new Object[i3];
                      objArray[0] = r;
                      objArray[i1] = s;
                      objArray[2] = activity;
                      objArray[3] = Boolean.valueOf(b);
                      objArray[4] = Boolean.valueOf(b1);
                      objArray[5] = l;
                      objArray[6] = uContentPack;
                      objArray[7] = likeActivity;
                      objArray[8] = obj1;
                      if (!PatchProxy.applyVoid(objArray, null, uob, str)) {
                      }
                   }else {
                   }
                }
             }
          }
       }else {
          obj = null;
          goto label_022b ;
       }
       if (this.V8()) {
          ou1 = view.F;
          if (ou1 != null) {
             view.X7(ou1.subscribe(new k1(view)));
          }
       }
       if (this.V8()) {
          if (view.v.getStatus() != obj) {
             i3 = 2;
             if (view.v.getStatus() != i3) {
             label_0307 :
                return;
             }
          }else {
             i3 = 2;
          }
          if (view.v.getStatus() != i3) {
             ou1 = view.q;
             if (ou1 != null) {
                ou1.setVisibility(4);
             label_02f2 :
                view.p.setVisibility(4);
                goto label_0307 ;
             }
          }
          i3 = 4;
          goto label_02f2 ;
       }else if(view.v.getStatus() == 2){
          view.s.setVisibility(4);
          goto label_0307 ;
       }else {
          goto label_0307 ;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u1.class, "17")) {
          return;
       }
       b9.a(this.G);
       u1 tt = this.t;
       if (tt != null && tt.p()) {
          this.t.f();
          this.t.setVisibility(8);
       }
       return;
    }
    public final void P8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1.class, "6")) {
          return;
       }
       boolean b = false;
       if (this.V8()) {
          this.d9(b);
       }else {
          this.c9(b);
       }
       this.k9();
       a uoa = new a("COMMENT_DISLIKE_RESULT", this.X8(true), this.W8(), null, p0.getFeedLogCtx());
       c.a(p0.getUserId(), this.v.getId(), p0.getPhotoId(), p0.getExpTag(), p0.getServerExpTag()).compose(v7).map(new e()).subscribe(new m1(this, p0), new u1$b(this));
       u1 tw = this.w;
       if (tw != null) {
          u1 tv = this.v;
          u1 tA = this.A;
          Objects.requireNonNull(tw);
          if (PatchProxy.applyVoidTwoRefs(tv, tA, tw, d.class, "39") || (tw.a != null && tv != null)) {
             ClientContent$ContentPackage uContentPack = tw.c(tv, tv.mReplyToCommentId, true);
             uContentPack.photoPackage = tw.i();
             int i = 3;
             String str = (tv.isSub())? "2": "1";
             ClientEvent$ElementPackage uElementPack = tw.f(tv, i, str, 321);
             tw.a(uElementPack);
             u1.B(new ClickMetaData().setLogPage(tA).setType(true).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(tw.a.getFeedLogCtx()));
          }
       }
       return;
    }
    public final boolean R8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       u1 ou1 = u1.class;
       Object obj = PatchProxy.apply(null, this, ou1, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (k.d()) {
          if (k.e()) {
             Object obj1 = PatchProxy.apply(null, this, ou1, "24");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                u1 tA = this.A;
                b1 = (tA instanceof CommentsFragment)? tA.Nh(): false;
             }
             if (b1) {
             label_0040 :
                b = true;
             }
          }
       }else {
          goto label_0040 ;
       }
       return b;
    }
    public final boolean S8(){
       Object obj = PatchProxy.apply(null, this, u1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z.getPhotoMeta() != null && (this.z.getPhotoMeta().mFeedSwitches == null || (this.z.getPhotoMeta().mFeedSwitches.mDisableCommentLikeAnimation != null || r1.s2(this.z.mEntity))))? true: false;
       return b;
    }
    public boolean V8(){
       u1 tC = this.C;
       if (tC != null && tC.mEnableNewLikeDislikeUi != null) {
          return true;
       }
       return false;
    }
    public final ClientContent$ContentPackage W8(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, u1.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = w1.f(this.z.getEntity());
       ClientContent$CommentPackage uCommentPack = new ClientContent$CommentPackage();
       uCommentPack.identity = TextUtils.k(this.v.mId);
       uCommentPack.childComment = this.v.isSub();
       u1 tv = this.v;
       uCommentPack.index = tv.mRootCommentPosition + 1;
       uCommentPack.hot = tv.mIsHot;
       uCommentPack.authorId = TextUtils.k(tv.mUser.mId);
       String str = (this.v.isTopComment())? "÷√∂•": "≤ª÷√∂•";
       uCommentPack.commentUserLabel = str;
       obj.commentPackage = uCommentPack;
       return obj;
    }
    public final ClientEvent$ElementPackage X8(boolean p0){
       ClientEvent$ElementPackage obj;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ou1, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       String str = (p0)? "COMMENT_DISLIKE_RESULT": "COMMENT_LIKE_RESULT";
       obj.action2 = str;
       i3 oi3 = i3.f();
       oi3.d("watch_id", this.D.mLogWatchId);
       obj.params = oi3.e();
       return obj;
    }
    public final int Y8(boolean p0){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ou1, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0) {
          if (this.R8()) {
             return 0x7f0f0059;
          }else {
             return 0x7f0f005a;
          }
       }else if(this.R8()){
          return 0x7f0f005b;
       }else {
          return 0x7f0f005c;
       }
    }
    public boolean Z8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u1.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.x != null && (!TextUtils.x(p0) && (this.x.get(p0) != null && this.x.get(p0).booleanValue()))) {
          return true;
       }
       return false;
    }
    public void a9(boolean p0){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou1, "18")) {
          return;
       }
       b.c(this.getActivity().getWindow(), p0);
       return;
    }
    public void b9(boolean p0,boolean p1){
       boolean b2;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ou1, "3")) {
          return;
       }
       if (!a.a()) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          return;
       }else if((SystemClock.elapsedRealtime() - this.H) - 800 < 0){
          return;
       }else {
          this.H = SystemClock.elapsedRealtime();
          Boolean uBoolean = this.x.get(this.v.getId());
          if (uBoolean != null && uBoolean.booleanValue()) {
             return;
          }
          String id = this.v.getId();
          Object obj = PatchProxy.applyOneRefs(id, this, ou1, "27");
          boolean b = true;
          boolean b1 = false;
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else if(this.y != null && (!TextUtils.x(id) && (this.y.get(id) != null && this.y.get(id).booleanValue()))){
             b2 = true;
          }else {
             b2 = false;
          }
          if (b2) {
             return;
          }else {
             this.x.put(this.v.getId(), Boolean.TRUE);
             if (this.v.mLiked != null) {
                this.P8(this.z);
             }else {
                u1 tz = this.z;
                if (!PatchProxy.isSupport(ou1) || !PatchProxy.applyVoidThreeRefs(tz, Boolean.valueOf(p0), Boolean.valueOf(p1), this, u1.class, "5")) {
                   if (this.V8()) {
                      this.d9(b);
                   }else {
                      this.c9(b);
                   }
                   this.j9();
                   a uoa = new a("COMMENT_LIKE_RESULT", this.X8(b1), this.W8(), this.A, tz.getFeedLogCtx());
                   t ot = c.d(tz.getUserId(), this.v.getId(), tz.getPhotoId(), tz.getExpTag(), tz.getServerExpTag()).compose(ou1);
                   ot.map(new e()).subscribe(new n1(this, tz), new v1(this));
                   if (p0) {
                      this.s.postDelayed(this.K, 300);
                   }else {
                      this.s.post(this.K);
                   }
                   MXSec.get().getMXWrapper().h("20", "0", tz.getUserId(), tz.getPhotoId(), null);
                }
             }
             return;
          }
       }
    }
    public final void c9(boolean p0){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou1, "13")) {
          return;
       }
       ou1 = this.t;
       if (ou1 == null) {
          return;
       }
       ou1.t();
       u1 tt = this.t;
       CdnResource$ResourceKey bt_comment_l = (p0)? CdnResource$ResourceKey.bt_comment_like: CdnResource$ResourceKey.bt_comment_dislike;
       CdnResource$ResourceKey resourceKey = bt_comment_l;
       int i = (p0)? 0x7f0f0055: 0x7f0f0056;
       ou1 = this.v;
       f.c(tt, resourceKey, i, new j1(this, p0), this.w.b(ou1, ou1.mReplyToCommentId), true);
       return;
    }
    public final void d9(boolean p0){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou1, "11")) {
          return;
       }
       ou1 = this.t;
       if (ou1 != null && this.s != null) {
          ou1.t();
          f.b(this.t, null, this.Y8(p0), new o1(this));
       }
       return;
    }
    public final void e9(){
       u1 ou1 = u1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou1, "25")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, ou1, "26") && this.C.mEnableNewLikeDislikeUi != null) {
          int i2 = 1;
          if (this.v.mLikedCount - 0x2710 >= 0) {
             double d = new BigDecimal(((float)this.v.mLikedCount / 10000.00f)+"").setScale(i2, 4).doubleValue();
             if (d - 0x4059000000000000 > 0) {
                t.j9(this.u, a1.e(45.00f));
             }else if(d - 0x408f400000000000 > 0){
                t.j9(this.u, a1.e(53.00f));
             }else {
             label_0077 :
                i2 = 0;
             }
          }else {
             goto label_0077 ;
          }
          if (!i2) {
             t.j9(this.u, a1.e(37.00f));
          }
       }
    label_0085 :
       t.k9(this.u, TextUtils.N(this.v.mLikedCount));
       int i1 = 0;
       if (this.V8()) {
          if (!this.v.mLikedCount - i1) {
             t.k9(this.u, a1.p(R.string.arg_RES_7f10079b));
          }
          this.u.setVisibility(i);
       }else {
          ou1 = this.u;
          if (!this.v.mLikedCount - i1) {
             i = 8;
          }
          ou1.setVisibility(i);
       }
       return;
    }
    public final void h9(boolean p0){
       u1 tv;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou1, "9")) {
          return;
       }
       long l = 1;
       if (p0) {
          tv = this.v;
          tv.mLikedCount = tv.mLikedCount + l;
       }else {
          tv = this.v;
          tv.mLikedCount = Math.max(0, (tv.mLikedCount - l));
       }
       this.e9();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u1.class, "1")) {
          return;
       }
       this.v = this.q8(QComment.class);
       this.w = this.q8(d.class);
       this.x = this.r8("COMMENT_REQUESTING_LIKE_MAP");
       this.y = this.r8("COMMENT_REQUESTING_DISLIKE_MAP");
       this.z = this.q8(QPhoto.class);
       this.A = this.t8("FRAGMENT");
       this.B = this.t8("DETAIL_FRAGMENT");
       this.C = this.q8(CommentConfig.class);
       this.E = this.r8("COMMENT_CANCEL_DISLIKED_SUBJECT");
       this.F = this.r8("COMMENT_CANCEL_LIKED_SUBJECT");
       this.D = this.q8(CommentParams.class);
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, u1.class, "7")) {
          return;
       }
       this.h9(true);
       this.v.updateLiked(true);
       this.s.setSelected(true);
       this.u.setSelected(true);
       return;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, u1.class, "8")) {
          return;
       }
       this.h9(false);
       this.v.updateLiked(false);
       this.s.setSelected(false);
       this.u.setSelected(false);
       return;
    }
}
