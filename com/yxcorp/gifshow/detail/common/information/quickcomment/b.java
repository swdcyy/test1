package com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import xq7.d;
import rp7.a;
import uy9.g;
import com.yxcorp.gifshow.comment.utils.b;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.components.nearbymodel.model.NearbyPhotoMapFastCommentGuide;
import m9a.t;
import java.util.Iterator;
import java.util.List;
import com.kwai.components.nearbymodel.model.NearbyPhotoMapFastCommentGuide$EmotionResource;
import m9a.p;
import com.kwai.robust.PatchProxyResult;
import ak5.j;
import java.util.Collection;
import ekd.q;
import bk5.c;
import m9a.t$c;
import android.graphics.Bitmap;
import qp7.x0;
import qp7.b;
import or7.w;
import java.util.Objects;
import pp7.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import android.graphics.drawable.Drawable;
import wb5.i;
import kotlin.jvm.internal.a;
import or7.w$a;
import qrd.l1;
import qp7.t0;
import or7.w$c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.c2;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthCommentPlugin$GrowthQuickCommentType;
import or7.w$b;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthCommentPlugin;
import qp7.a;
import v6a.m0;
import le5.a;
import rq7.a;
import eda.l;
import eda.n;
import or7.q;
import x2a.b;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$d;
import org.greenrobot.eventbus.a;
import kb.c;
import java.lang.Float;
import fi5.s;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta;
import fi5.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import uy9.i;
import erd.g;
import crd.b;
import uy9.j;
import com.kwai.framework.model.user.User;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import uy9.k;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.detail.common.information.quickcomment.a;
import uy9.o;
import uy9.l;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$a;
import qp7.b1;
import kp.r1;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import de5.c;
import uy9.d;
import uy9.c;
import qp7.g;
import xq7.e;
import uy9.m;
import uy9.n;
import fda.b;
import uy9.b;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Integer;
import uy9.f;
import msd.l;
import ek9.a;
import com.yxcorp.gifshow.comment.e;
import e17.i$b;
import e17.i;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$b;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import nk9.a;
import lnc.ba;
import qp7.d;
import or7.n;
import or7.p;
import qp7.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import ayb.i;
import com.yxcorp.gifshow.detail.model.QuickCommentEmotionConfig;
import java.lang.reflect.Type;
import uw9.c;
import com.yxcorp.gifshow.comment.CommentConfig;
import m9a.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import zf6.l;
import qd5.a;
import java.util.HashSet;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.comment.utils.d;
import android.os.Bundle;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import nx9.c;
import mzc.a;
import k2b.e0;
import java.util.Collections;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import yca.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import uy9.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import xx9.a;
import uy9.e;
import java.lang.StringBuilder;
import qa6.b;
import fda.c;

public class b extends DispatchBaseElement	// class@00144b
{
    public c A;
    public c B;
    public t C;
    public b D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final String H;
    public boolean I;
    public NearbyPhotoMapFastCommentGuide J;
    public boolean K;
    public boolean L;
    public QComment M;
    public EmotionInfo N;
    public QMedia O;
    public String P;
    public List Q;
    public int R;
    public HashSet S;
    public b$d T;
    public String U;
    public final IMediaPlayer$OnInfoListener V;
    public final GifshowActivity t;
    public QPhoto u;
    public PhotoDetailParam v;
    public BaseFragment w;
    public a x;
    public PublishSubject y;
    public e z;

    public void b(GifshowActivity p0,a p1){
       super(d.G, p1);
       this.E = false;
       this.F = false;
       this.G = false;
       this.H = "flow_commont";
       this.K = false;
       this.L = false;
       this.U = "";
       this.V = new g(this);
       this.t = p0;
       this.D = new b(p0);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       this.B0(this.t0());
       return;
    }
    public final void B0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "14")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       if (this.v.getSource() == 9) {
          b tJ = this.J;
          if (tJ != null && (tJ.mEmotionList != null && t.c())) {
             Iterator iterator = this.J.mEmotionList.iterator();
             while (iterator.hasNext()) {
                uArrayList1.add(iterator.next().mEmotionId);
             }
             String obj = null;
             b obj1 = PatchProxy.applyOneRefs(uArrayList1, obj, p.class, "1");
             if (obj1 != PatchProxyResult.class) {
                obj = obj1;
             }else {
                ArrayList uArrayList2 = new ArrayList(j.o().j());
                if (!uArrayList2.isEmpty() && !q.f(uArrayList1)) {
                   Iterator iterator1 = uArrayList1.iterator();
                   while (iterator1.hasNext()) {
                      obj = iterator1.next();
                      Iterator iterator2 = uArrayList2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            c uoc = iterator2.next();
                            if (uoc != null && obj.equals(uoc.b)) {
                               p.a.add(new t$c(uoc));
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                   obj = p.a;
                }
             }
             this.Q = obj;
          label_00c6 :
             obj1 = this.Q;
             if (obj1 != null) {
                iterator = obj1.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(j.o().k(iterator.next().a.a));
                }
             }
             w ow = this.E();
             Objects.requireNonNull(ow);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, ow, w.class, "17")) {
                ow.e.f(uArrayList);
             }
             return;
          }
       }
       List list = (p0)? t.b(): t.a();
       this.Q = list;
       goto label_00c6 ;
    }
    public final void C0(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       w ow = this.E();
       ImageRequest[] imageRequest = d.h(QCurrentUser.me(), HeadImageSize.SMALL);
       Drawable uDrawable = i.b(QCurrentUser.me().getSex());
       Objects.requireNonNull(ow);
       if (!PatchProxy.applyVoidTwoRefs(imageRequest, uDrawable, ow, w.class, "19")) {
          a.p(imageRequest, "imageRequests");
          a.p(uDrawable, "placeHolder");
          w$a uoa = new w$a();
          uoa.c(imageRequest);
          uoa.d(uDrawable);
          ow.d.f(uoa);
       }
       return;
    }
    public final void D0(boolean p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.B0(this.t0());
       b = false;
       this.x0(b, p0);
       if (this.E() != null && this.H() != null) {
          this.E().j(new w$c(true, b, b));
       }
       c2.h(this.u, this.w, this.U);
       c2.d(this.u, this.w, this.U);
       return;
    }
    public void E0(GrowthCommentPlugin$GrowthQuickCommentType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       this.E().h(new w$b(false, d.a(-1895938724).Hx(p0)));
       return;
    }
    public void P(a p0){
       a c = p0.c;
       this.u = c.mPhoto;
       this.v = c;
       this.w = p0.b;
       this.y = p0.G;
       this.x = p0.r;
       this.z = p0.l;
       this.B = p0.k;
       this.C = p0.e;
    }
    public a f0(a p0){
       w ow = PatchProxy.applyOneRefs(p0, this, b.class, "25");
       if (ow != PatchProxyResult.class) {
       }else {
          ow = new w(p0);
       }
       return ow;
    }
    public void j0(boolean p0){
       b tA;
       s a;
       l ol = l.class;
       n on = n.class;
       w ow = w.class;
       b uob = b.class;
       q oq = q.class;
       String str = "2";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, str)) {
          return;
       }
       c uoc = null;
       if (b.c()) {
          this.T = new b$d(this);
       }else {
          tA = this.T;
          if (tA != null) {
             tA.c();
          }
          this.T = uoc;
       }
       a.d().p(this);
       tA = this.A;
       if (tA != null) {
          tA.close();
          this.A = uoc;
       }
       w ow1 = this.E();
       float f = 0x3f800000;
       Objects.requireNonNull(ow1);
       if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), ow1, ow, "3")) {
          ow1.g.f(Float.valueOf(f));
       }
       String str1 = "4";
       if (this.v.getSource() == 9) {
          tA = this.u;
          if (tA != null) {
             a = s.a;
             CommonMeta commonMeta = tA.getCommonMeta();
             Objects.requireNonNull(a);
             c uoc1 = PatchProxy.applyOneRefs(commonMeta, a, s.class, "9");
             if (uoc1 != PatchProxyResult.class) {
             }else if(commonMeta != null){
                NearbyCommonMeta nearbyCommon = t.a(commonMeta);
                if (nearbyCommon != null) {
                   uoc = nearbyCommon.mPhotoMapFastCommentGuide;
                }
             }
             uoc1 = uoc;
             this.J = uoc1;
             if (uoc1 != null && !TextUtils.x(uoc1.mCommentHintText)) {
                ow1 = this.E();
                NearbyPhotoMapFastCommentGuide mCommentHint = this.J.mCommentHintText;
                Objects.requireNonNull(ow1);
                if (!PatchProxy.applyVoidOneRefs(mCommentHint, ow1, ow, str1)) {
                   a.p(mCommentHint, "str");
                   ow1.n.f(mCommentHint);
                }
             }
          }
       }
    label_00c9 :
       this.E().g(b.a());
       if (this.v0() || this.H().f0()) {
          this.B0(this.t0());
       }
       this.C0();
       RxBus f1 = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.j(f1.g(on, mAIN).subscribe(new i(this)));
       this.j(f1.g(ol, mAIN).subscribe(new j(this)));
       this.K = false;
       User user = this.u.getUser();
       if (user != null) {
          this.j(user.observable().subscribe(new k(this), Functions.e));
       }
       b ti = this.i;
       a uoa = new a(this);
       g e = Functions.e;
       Objects.requireNonNull(ti);
       b uob1 = PatchProxy.applyTwoRefs(uoa, e, ti, oq, str);
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(uoa, "onNext");
          a.p(e, "onError");
          uob1 = ti.c.subscribe(uoa, e);
          a.o(uob1, "quickCommentClickSubject¡­ubscribe\(onNext, onError\)");
       }
       this.j(uob1);
       ti = this.i;
       o oo = new o(this);
       Objects.requireNonNull(ti);
       b uob2 = PatchProxy.applyTwoRefs(oo, e, ti, oq, str1);
       if (uob2 != PatchProxyResult.class) {
       }else {
          a.p(oo, "onNext");
          a.p(e, "onError");
          uob2 = ti.b.subscribe(oo, e);
          a.o(uob2, "quickCommentDisappearAni¡­ubscribe\(onNext, onError\)");
       }
       this.j(uob2);
       ti = this.i;
       l ol1 = new l(this);
       Objects.requireNonNull(ti);
       b uob3 = PatchProxy.applyTwoRefs(ol1, e, ti, oq, "6");
       if (uob3 != PatchProxyResult.class) {
       }else {
          a.p(ol1, "onNext");
          a.p(e, "onError");
          uob3 = ti.a.subscribe(ol1, e);
          a.o(uob3, "quickCommentDisappearAni¡­ubscribe\(onNext, onError\)");
       }
       this.j(uob3);
       this.i(new b$a(this));
       this.r0(false);
       if (!this.H().f0() && (r1.p3(this.u) || b.c())) {
          this.B.b(this.V);
       }
       this.j(f1.g(on, mAIN).subscribe(new d(this)));
       this.j(f1.g(ol, mAIN).subscribe(new c(this)));
       e uoe = this.D();
       m om = new m(this);
       Objects.requireNonNull(uoe);
       b uob4 = PatchProxy.applyTwoRefs(om, e, uoe, e.class, "19");
       if (uob4 != PatchProxyResult.class) {
       }else {
          a.p(om, "onNext");
          a.p(e, "onError");
          uob4 = uoe.h.subscribe(om, e);
          a.o(uob4, "poiCollectShowSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob4);
       this.E = false;
       this.j(this.D().f(new n(this), e));
       if (this.s0()) {
          this.j(f1.f(b.class).subscribe(new b(this)));
       }
       return;
    }
    public void m0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "6")) {
          return;
       }
       int i = 0;
       this.R = i;
       this.K = i;
       uob = this.A;
       if (uob != null) {
          uob.close();
          this.A = null;
       }
       a.d().t(this);
       this.B.f(this.V);
       this.E().h(new w$b(i, null));
       b tT = this.T;
       if (tT != null) {
          tT.c();
       }
       return;
    }
    public void n0(QComment p0,t$c p1,BaseEditorFragment$g p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, b.class, "20")) {
          return;
       }
       f uof = new f(this, p2, p0, p3, p1);
       this.j(this.z.i(this.t, a.a(v0)));
       return;
    }
    public void o0(QComment p0,BaseEditorFragment$g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "15")) {
          return;
       }
       BaseEditorFragment$g c = p1.c;
       if (c != null && (TextUtils.x(c.trim()) && (p1.e == null && p1.f == null))) {
          i$b uob = i.m();
          uob.x(R.string.arg_RES_7f104252);
          uob.l(true);
          i.c(R.style.arg_RES_7f11066a, uob);
          return;
       }else {
          this.K = false;
          if (!this.D.i("commentKeywordActionConfiguration", p1.c, null, new b$b(this, p0, p1), "HUMANISTIC_CARE")) {
             this.n0(p0, null, p1, -1);
          }
          return;
       }
    }
    public void onEventMainThread(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       b tu = this.u;
       if (tu == null || (tu.equals(p0.b) && p0.c == CommentsEvent$Operation.SEND)) {
          this.M = null;
          this.N = null;
          this.O = null;
          this.P = null;
          this.S = null;
       }
    label_0029 :
       return;
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "18")) {
          return;
       }
       b tu = this.u;
       if (tu != null && tu.equals(p0.a)) {
          tu = this.z;
          if (tu != null) {
             tu.e = p0;
          }
          this.M = p0.f;
          this.N = p0.c;
          this.O = p0.d;
          this.P = p0.b;
          this.S = p0.h;
       }
       return;
    }
    public final boolean p0(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = true;
       if (t.c() && (!ba.a(this.u.getPhotoId()) && (this.u.isAllowComment() && !r1.A2(this.u)))) {
          Object obj1 = PatchProxy.apply(null, this, uob, "24");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.u.isImageType() && (this.v.getSource() != 204 && (QCurrentUser.ME.isLogined() && (!this.u0() || this.u.getRealRelationType() != b)))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1 && (!this.u.isShowFollowingIntensify() || (!r1.E2(this.u) && (r1.m3(this.u) && (!r1.F2(this.u) || (!r1.E2(this.u) && (this.E == null && (!this.s0() && !r1.o3(this.u))))))))) {
          label_00b0 :
             return b;
          }
       }
    label_00af :
       b = false;
       goto label_00b0 ;
    }
    public d q(){
       p op = PatchProxy.apply(null, this, b.class, "27");
       if (op != PatchProxyResult.class) {
       }else if(this.H().F0 != null){
          op = new p();
       }else {
          op = new n();
       }
       return op;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.r0(false);
       return;
    }
    public c r(){
       q oq = PatchProxy.apply(null, this, b.class, "26");
       if (oq != PatchProxyResult.class) {
       }else {
          oq = new q();
       }
       return oq;
    }
    public final void r0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "11")) {
          return;
       }
       if (!this.u.isMine() && (this.s0() || this.F != null)) {
          this.b0();
          return;
       }else {
          PhotoMeta photoMeta = r1.u1(this.u.getEntity());
          if (photoMeta != null && photoMeta.mShowFriendInviteButton != null) {
             this.b0();
             return;
          }else if(this.v0()){
             this.x0(p0, false);
          }else {
             this.b0();
          }
          return;
       }
    }
    public final boolean s0(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       if (obj != null) {
          return obj;
       }
       b = d.a(0x4f878389).fS();
       this.G = b;
       return b;
    }
    public final boolean t0(){
       boolean b;
       QuickCommentEmotionConfig obj = PatchProxy.apply(null, this, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.m(QuickCommentEmotionConfig.class);
       b = (obj == null || (obj.mQuickCommentUseLatestEmotion != null || b.b(this.u)))? true: false;
       return b;
    }
    public boolean u0(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       b = (obj != null && (obj.getUser() != null && this.u.getUser().isFollowingOrFollowRequesting()))? true: false;
       return b;
    }
    public boolean v0(){
       boolean b;
       boolean b2;
       b$d uod;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = false;
       if (!this.p0()) {
          return b;
       }
       obj = this.T;
       boolean b1 = true;
       if (obj != null && obj.a()) {
          if ("".equals(this.U)) {
             this.U = "REMAIN_SHOW";
          }
          return b1;
       }else if(this.H().J != null && r1.n3(this.u)){
          return b1;
       }else if(this.H().f0() && (QCurrentUser.ME.isLogined() && this.u0())){
          return b1;
       }else if(this.H().L != null && QCurrentUser.ME.isLogined()){
          return b1;
       }else if(QCurrentUser.ME.isLogined() && (this.u0() && this.u.getRealRelationType() == b1)){
          obj = 1;
       }else {
          obj = 0;
       }
       if (obj) {
          if ("".equals(this.U)) {
             this.U = "FOLLOW_EACH_OTHER";
          }
       }else {
          b tT = this.T;
          if (tT != null) {
             Objects.requireNonNull(tT);
             Object obj1 = PatchProxy.apply(objArray, tT, b$d.class, "4");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else if(tT.a()){
                b2 = true;
             }else if(tT.a == null && (tT.b == null && (tT.c != null || tT.d != null))){
                uod = 1;
             }else {
                uod = null;
             }
             if (uod || tT.g.u0()) {
                b = 1;
             }
             if (!uod && (b && "".equals(tT.g.U))) {
                tT.g.U = "FOLLOWED";
             }
             b2 = b;
             if (b2) {
             label_00f6 :
                return b1;
             }
          }
       }
       b1 = obj;
       goto label_00f6 ;
    }
    public void w0(){
       boolean b;
       boolean b2;
       EmotionFloatEditorFragment uEmotionFloa;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "17")) {
          return;
       }
       if (this.K != null) {
          return;
       }
       c2.e(this.u, this.w, this.U);
       CommentConfig uCommentConf = d.a(this.v.mPhoto);
       b = true;
       boolean b1 = false;
       BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(b).setCommentOpenType("QUICK_COMMENT").setEnableInputAt(b).setMonitorTextChange(b).setCancelWhileKeyboardHidden(b).setShowLeftBtn(b1).setEnableEmoji(b);
       if (uCommentConf.mEditorConfig.mEnablePicture != null) {
          b tu = this.u;
          if (tu != null && tu.enablePictureCommentForPhoto()) {
             b2 = true;
          label_005a :
             uArguments = uArguments.setEnableSendPicture(b2).setOnlyShowKwaiEmoji(b).setSendBtnPermanent(b).setShowEmojiFirst(b1).setShowUserAlias(b).setEnableEditorOpt(b).setInterceptEvent(b).setTextLimit(255).setForceDayNightMode(l.i(b1, 16)).setHintText(a.a(this.u)).setFinishButtonTextColorResId(R.color.arg_RES_7f061fd5).setSelectUserBizId(1006).setAtFromAtPanelUidSet(this.S).setEnableFinishShowWithSpace(b);
             if (uCommentConf.mPageListConfig.mEnableCommentEmotion != null) {
                uArguments.setEnableNewGifEmotions(b).setEmotionInfo(this.N);
             }
             if (uCommentConf.mEditorConfig.mEnablePicture != null) {
                uArguments.setQMediaInfo(this.O);
             }
             uArguments.setAtFriendMaxLimit(d.a, R.string.arg_RES_7f100240);
             uArguments.setTheme(R.style.arg_RES_7f110144);
             uArguments.setSlidePlay(b);
             Bundle uBundle = uArguments.build();
             uBundle.putCharSequence("text", TextUtils.k(this.P));
             uArguments.setForceNewEditorStyle(b);
             if (j.o().t()) {
                uEmotionFloa = (uCommentConf.mPageListConfig.mEnableCommentEmotion != null)? EmotionFloatEditorFragment.vi(uBundle): EmotionFloatEditorFragment.ui(uBundle);
                if (c.a()) {
                   uEmotionFloa.ji(Collections.singletonList(new a(this.u, this.w, "QUICK_RESPONSE")));
                }
             }else {
                uEmotionFloa = new FloatEditorFragment();
                a.a("comment_keyboard_emoji", "emoji_not_ready", "");
                j.o().d();
             }
             uEmotionFloa.setArguments(uBundle);
             uEmotionFloa.ai(new b$c(this));
             uEmotionFloa.k0(new a(this));
             uEmotionFloa.show(this.t.getSupportFragmentManager(), uob.getName());
             uob = this.u;
             b tw = this.w;
             b tU = this.U;
             if (!PatchProxy.applyVoidThreeRefs(uob, tw, tU, null, c2.class, "6")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COMMENT_PANEL";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("panel_source", "QUICK_COMMENT_INPUT_CARD");
                jsonObject.c0("trigger_source", tU);
                uElementPack.params = jsonObject.toString();
                u1.D0("", tw, 3, uElementPack, c2.a(uob), null);
             }
             this.y.onNext(Boolean.TRUE);
             this.x.d(new ChangeScreenVisibleEvent(this.u, ChangeScreenVisibleEvent$Operation.CLEAR, ChangeScreenVisibilityCause.SHOW_COMMENT));
             return;
          }
       }
       b2 = false;
       goto label_005a ;
    }
    public void x0(boolean p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "12")) {
          return;
       }
       if (this.D().c() > 0) {
          if (p1) {
             this.z0("f");
          }
          return;
       }else {
          this.c0();
          if (!p0) {
             this.E().i(true);
             this.z0("t");
          }else {
             this.E().i(false);
             this.j(this.C.subscribe(new e(this, p1), Functions.e));
          }
          return;
       }
    }
    public final void y0(int p0,t$c p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "16")) {
          return;
       }
       c2.c(this.u, this.w, p0, this.U);
       if (this.K != null) {
          return;
       }
       if (TextUtils.x(p1.a.a)) {
          return;
       }
       this.K = true;
       this.n0(this.u.newComment(p1.a.a+p1.a.a+p1.a.a, null, null, b.a(QCurrentUser.me())), p1, null, p0);
       return;
    }
    public final void z0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "29")) {
          return;
       }
       if (this.G != null && !TextUtils.x(p0)) {
          c uoc = new c();
          uoc.a("flow_commont");
          uoc.b(p0);
          RxBus.f.b(uoc);
       }
       return;
    }
}
