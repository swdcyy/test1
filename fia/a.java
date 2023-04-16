package fia.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.a$a;
import nsd.u;
import android.os.Handler;
import android.os.Looper;
import fia.a$c;
import fia.a$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import fia.a$f;
import erd.g;
import crd.b;
import java.util.Set;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.j;
import t45.d;
import brd.z;
import fia.a$g;
import fia.a$e;
import kga.c;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse$SnackBarInfo;
import java.lang.CharSequence;
import fia.a$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gha.q;
import android.app.Activity;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse$SnackBarUserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;
import com.yxcorp.image.callercontext.a;
import jd.c;
import wb5.h;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import com.yxcorp.gifshow.follow.config.model.FollowFeatureSnackBarGuideConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.entity.QPhoto;
import qrd.p;
import java.lang.Number;
import uga.b;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import gha.t;
import java.lang.Long;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.follow.slide.detail.model.FeatureToFollowGuideRequestModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fg6.a;
import com.google.gson.Gson;
import android.content.Intent;
import android.net.Uri;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import wkd.b;
import nga.c;
import cjd.e;
import erd.o;
import fia.a$h;
import fia.a$i;

public abstract class a extends PresenterV2	// class@0028ee
{
    public View A;
    public final Handler B;
    public final a C;
    public final k3 D;
    public b p;
    public int q;
    public boolean r;
    public boolean s;
    public PublishSubject t;
    public boolean u;
    public BaseFragment v;
    public QPhoto w;
    public Set x;
    public SlidePlayViewModel y;
    public boolean z;
    public static int E;
    public static final a$a F;

    static {
       a.F = new a$a(null);
    }
    public void a(){
       super();
       this.B = new Handler(Looper.getMainLooper());
       this.C = new a$c(this);
       this.D = new a$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.q = 0;
       a tv = this.v;
       String str = "mFragment";
       if (tv == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tv.getParentFragment());
       this.y = slidePlayVie;
       if (slidePlayVie != null) {
          a tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tv1, this.C);
       }
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       Fragment parentFragme = tv.getParentFragment();
       Objects.requireNonNull(parentFragme, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
       this.X7(parentFragme.Vg().j().subscribe(new a$f(this)));
       tv = this.x;
       if (tv == null) {
          a.S("mDispatchListeners");
       }
       tv.add(this.D);
       this.X7(RxBus.f.f(j.class).observeOn(d.a).subscribe(new a$g(this)));
       tv = this.t;
       if (tv != null) {
          this.X7(tv.subscribe(new a$e(this), c.a));
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "10")) {
          return;
       }
       a ty = this.y;
       if (ty != null) {
          a tv = this.v;
          if (tv == null) {
             a.S("mFragment");
          }
          ty.D(tv, this.C);
       }
       this.B.removeCallbacksAndMessages(objArray);
       ty = this.x;
       if (ty == null) {
          a.S("mDispatchListeners");
       }
       ty.remove(this.D);
       return;
    }
    public final void P8(FollowFeatureGuideSnackBarResponse p0,View p1){
       FollowFeatureGuideSnackBarResponse$SnackBarInfo mDesc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "18")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "guideView");
       TextView textView = p1.findViewById(R.id.guide_text);
       a.o(textView, "tv");
       p0 = p0.mSnackBarInfo;
       if (p0 != null) {
          mDesc = p0.mDesc;
          if (mDesc != null) {
          label_002e :
             textView.setText(mDesc);
             return;
          }
       }
       mDesc = "";
       goto label_002e ;
    }
    public final void R8(FollowFeatureGuideSnackBarResponse p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "19")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "guideView");
       p1.findViewById(R.id.guide_text_go_follow).setOnClickListener(new a$b(this, p0));
       return;
    }
    public final void S8(FollowFeatureGuideSnackBarResponse p0,View p1){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "15")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "guideView");
       KwaiImageView kwaiImageVie = p1.findViewById(R.id.guide_avatar_default);
       KwaiImageView kwaiImageVie1 = p1.findViewById(R.id.guide_avatar1);
       KwaiImageView kwaiImageVie2 = p1.findViewById(R.id.guide_avatar2);
       KwaiImageView kwaiImageVie3 = p1.findViewById(R.id.guide_avatar3);
       FollowFeatureGuideSnackBarResponse$SnackBarInfo mSnackBarUse = p0.mSnackBarInfo.mSnackBarUserInfos;
       String str = "GUIDE_TOAST";
       if (mSnackBarUse == null || !mSnackBarUse.size()) {
          if (TextUtils.n(this.Y8(), str)) {
             a.o(kwaiImageVie, "avatarDefault");
             kwaiImageVie.setVisibility(0);
          }
          a.o(kwaiImageVie1, "avatar1");
          kwaiImageVie1.setVisibility(8);
          a.o(kwaiImageVie2, "avatar2");
          kwaiImageVie2.setVisibility(8);
          a.o(kwaiImageVie3, "avatar3");
          kwaiImageVie3.setVisibility(8);
       }else if(p0.mSnackBarInfo.mSnackBarUserInfos.size() != 1){
          int i = p0.mSnackBarInfo.mSnackBarUserInfos.size();
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoa, "16");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(q.b.a(this.getActivity()) - (float)390 <= 0 && (i >= 1 && TextUtils.n(this.Y8(), str))){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_0080 ;
          }
          if (!b) {
             if (p0.mSnackBarInfo.mSnackBarUserInfos.size() == 2) {
                a.o(kwaiImageVie1, "avatar1");
                kwaiImageVie1.setVisibility(0);
                a.o(kwaiImageVie2, "avatar2");
                kwaiImageVie2.setVisibility(0);
                a.o(kwaiImageVie3, "avatar3");
                kwaiImageVie3.setVisibility(8);
                this.V8(kwaiImageVie1, p0.mSnackBarInfo.mSnackBarUserInfos.get(0).mHeadUrls);
                this.V8(kwaiImageVie2, p0.mSnackBarInfo.mSnackBarUserInfos.get(1).mHeadUrls);
             }else if(p0.mSnackBarInfo.mSnackBarUserInfos.size() >= 3){
                a.o(kwaiImageVie1, "avatar1");
                kwaiImageVie1.setVisibility(0);
                a.o(kwaiImageVie2, "avatar2");
                kwaiImageVie2.setVisibility(0);
                a.o(kwaiImageVie3, "avatar3");
                kwaiImageVie3.setVisibility(0);
                this.V8(kwaiImageVie1, p0.mSnackBarInfo.mSnackBarUserInfos.get(0).mHeadUrls);
                this.V8(kwaiImageVie2, p0.mSnackBarInfo.mSnackBarUserInfos.get(1).mHeadUrls);
                this.V8(kwaiImageVie3, p0.mSnackBarInfo.mSnackBarUserInfos.get(2).mHeadUrls);
             }
          }
       }
       a.o(kwaiImageVie1, "avatar1");
       kwaiImageVie1.setVisibility(0);
       a.o(kwaiImageVie2, "avatar2");
       kwaiImageVie2.setVisibility(8);
       a.o(kwaiImageVie3, "avatar3");
       kwaiImageVie3.setVisibility(8);
       this.V8(kwaiImageVie1, p0.mSnackBarInfo.mSnackBarUserInfos.get(0).mHeadUrls);
       return;
    }
    public final void V8(KwaiImageView p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "17")) {
          return;
       }
       if (p1 != null && !j.h(p1)) {
          h.g(p0, p1, 0, 0, null, null, null);
       }
       return;
    }
    public final boolean W8(){
       int b;
       boolean i;
       boolean i1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, uoa, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mFragment");
       }
       if (!obj.isResumed()) {
          this.k9("精选页面非Resume");
          return true;
       }else if(!SlideGuideManager.m.a().b(this.getActivity())){
          obj = this.y;
          if (obj != null && (obj.r() == true || (this.s == null && this.u == null))) {
             obj = this.q;
             if (obj == 2 || obj == true) {
                this.k9("单次内容消费1");
                return true;
             }else if(FollowConfigUtil.n() == null){
                this.k9("没下发频控配置");
                return true;
             }else {
                obj = this.w;
                if (obj == null) {
                   a.S("mPhoto");
                }
                if (obj.isFeatureToFollowGuideShow()) {
                   this.k9("单次内容消费2");
                   return true;
                }else {
                   FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
                   FollowConfigUtil obj1 = PatchProxy.apply(objArray, objArray, uFollowConfi, "63");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                      obj1 = FollowConfigUtil.z;
                      Objects.requireNonNull(obj1);
                      Boolean uBoolean = PatchProxy.apply(objArray, obj1, uFollowConfi, "25");
                      if (uBoolean == patchProxyRe) {
                         uBoolean = FollowConfigUtil.y.getValue();
                      }
                      b = uBoolean.booleanValue();
                   }
                   if (b) {
                      this.k9("忽略频控");
                      return false;
                   }else {
                      b = a.E;
                      FollowFeatureSnackBarGuideConfig obj2 = PatchProxy.apply(objArray, this, uoa, "26");
                      if (obj2 != patchProxyRe) {
                         i = obj2.intValue();
                      }else {
                         obj2 = FollowConfigUtil.n();
                         i = (obj2 != null)? obj2.mSessionMaxShowCount: null;
                      }
                      if (b >= i) {
                         this.k9("单Session到上限");
                         return true;
                      }else {
                         long l = 0;
                         if (this.p == null) {
                            QCurrentUser mE = QCurrentUser.ME;
                            a.o(mE, "QCurrentUser.ME");
                            String str = mE.getId()+"GUIDE_DAILY_COUNT_KEY";
                            FollowFeatureSnackBarGuideConfig obj3 = PatchProxy.apply(objArray, this, uoa, "27");
                            if (obj3 != patchProxyRe) {
                               i1 = obj3.intValue();
                            }else {
                               obj3 = FollowConfigUtil.n();
                               i1 = (obj3 != null)? obj3.mDailyMaxShowCount: 0;
                            }
                            this.p = new b(str, l, i1);
                         }
                         uoa = this.p;
                         if (uoa != null) {
                            Object obj4 = PatchProxy.apply(objArray, uoa, b.class, "1");
                            if (obj4 != patchProxyRe) {
                               i1 = obj4.booleanValue();
                            }else {
                               long l1 = t.c(uoa.c).a(Long.valueOf(l)).longValue();
                               if (l1 - l > 0 && uoa.c(l1)) {
                                  if (PatchProxy.isSupport(b.class)) {
                                     Object obj5 = PatchProxy.applyOneRefs(Long.valueOf(l1), uoa, b.class, "3");
                                     if (obj5 != patchProxyRe) {
                                        i = obj5.booleanValue();
                                     }else if(uoa.a - l <= 0 || (System.currentTimeMillis() - l1) - uoa.a > 0){
                                        i = true;
                                     }else {
                                        i = false;
                                     }
                                  }else {
                                     goto label_0160 ;
                                  }
                                  if (i) {
                                     Object obj6 = PatchProxy.apply(objArray, uoa, b.class, "4");
                                     if (obj6 != patchProxyRe) {
                                        i1 = obj6.booleanValue();
                                     }else if(t.b(uoa.d).a(Integer.valueOf(false)).intValue() < uoa.b){
                                        i1 = true;
                                     }else {
                                        i1 = false;
                                     }
                                     if (!i1) {
                                     label_01a5 :
                                        i1 = false;
                                     }
                                  }else {
                                     goto label_01a5 ;
                                  }
                               }
                            label_01a3 :
                               i1 = true;
                            }
                            if (!i1) {
                               this.k9("单自然日到上限");
                               return true;
                            }
                         }
                         return false;
                      }
                   }
                }
             }
          }
       }
       this.k9("其它控件在展示");
       return true;
    }
    public abstract void X8();
    public abstract String Y8();
    public abstract String Z8();
    public final boolean a9(){
       return this.z;
    }
    public final QPhoto b9(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final Handler c9(){
       return this.B;
    }
    public final long d9(){
       long l;
       TimeUnit obj = PatchProxy.apply(null, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = TimeUnit.MILLISECONDS;
       FollowFeatureSnackBarGuideConfig uFollowFeatu = FollowConfigUtil.n();
       uFollowFeatu = (uFollowFeatu != null)? uFollowFeatu.mShowDuration: 0;
       return obj.convert(uFollowFeatu, TimeUnit.SECONDS);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       this.A = p0;
       return;
    }
    public final void e9(FollowFeatureGuideSnackBarResponse p0){
       FollowFeatureGuideSnackBarResponse$SnackBarInfo mSnackBarUse;
       Iterator iterator;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "20")) {
          return;
       }
       a.p(p0, "response");
       ArrayList uArrayList = 1;
       if (!PatchProxy.applyVoid(null, this, uoa, "28")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = this.Z8();
          i3 oi3 = i3.f();
          oi3.d("click_area", "to_followpage");
          uElementPack.params = oi3.e();
          u1.B(new ClickMetaData().setElementPackage(uElementPack).setType(uArrayList));
       }
       FeatureToFollowGuideRequestModel uFeatureToFo = new FeatureToFollowGuideRequestModel();
       FollowFeatureGuideSnackBarResponse mSnackBarInf = p0.mSnackBarInfo;
       if (mSnackBarInf != null && mSnackBarInf.mType == uArrayList) {
          uArrayList = new ArrayList();
          mSnackBarInf = p0.mSnackBarInfo;
          if (mSnackBarInf != null) {
             mSnackBarUse = mSnackBarInf.mSnackBarUserInfos;
             if (mSnackBarUse != null) {
                iterator = mSnackBarUse.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(Long.valueOf(iterator.next().mUserID));
                }
             }
          }
          uFeatureToFo.mNewLiveAuthorIds = uArrayList;
       }
       FollowFeatureGuideSnackBarResponse mSnackBarInf1 = p0.mSnackBarInfo;
       if (mSnackBarInf1 != null && mSnackBarInf1.mType == 2) {
          uArrayList = new ArrayList();
          mSnackBarInf = p0.mSnackBarInfo;
          if (mSnackBarInf != null) {
             mSnackBarUse = mSnackBarInf.mSnackBarUserInfos;
             if (mSnackBarUse != null) {
                iterator = mSnackBarUse.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(Long.valueOf(iterator.next().mUserID));
                }
             }
          }
          uFeatureToFo.mNewPhotoAuthorIds = uArrayList;
       }
       p0 = p0.mSnackBarInfo;
       FollowFeatureGuideSnackBarResponse$SnackBarInfo mRefreshMyFo = (p0 != null)? p0.mRefreshMyFollow: null;
       StringBuilder str = "kwai://home/following";
       if (mRefreshMyFo != null) {
          str = str+"?followCardInfo="+a.a.q(uFeatureToFo)+"&refreshMyfollow=true";
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
       }
       return;
    }
    public final void h9(FollowFeatureGuideSnackBarResponse p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "13")) {
          return;
       }
       FollowFeatureGuideSnackBarResponse obj = PatchProxy.applyOneRefs(p0, this, uoa, "14");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = p0.mSnackBarInfo;
          b = (obj != null && !TextUtils.x(obj.mDesc))? true: false;
       }
       if (b && this.z != null) {
          c.i(KsLogFollowTag.FOLLOW_GUIDE.appendTag("BaseFeatureToFollowGuidePresenter"), this.Y8()+"引导数据请求成功");
          this.n9(p0);
       }else {
          this.q = 3;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.v = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.w = obj;
       obj = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       a.o(obj, "inject\(AccessIds.DETAIL_SCREEN_TOUCH_LISTENER\)");
       this.x = obj;
       this.t = this.t8("PLC_STRONG_SHOW_LIVE_DATA_PUBLISHER");
       return;
    }
    public final void j9(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "21")) {
          return;
       }
       a tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       tw.setFeatureToFollowGuideShow(true);
       this.q = 2;
       a.E = a.E + true;
       tw = this.p;
       if (tw != null && !PatchProxy.applyVoid(objArray, tw, b.class, "5")) {
          t ot = t.c(tw.c);
          t ot1 = t.b(tw.d);
          if (!tw.c(ot.a(Long.valueOf(0)).longValue())) {
             ot1.d(Integer.valueOf(0));
          }
          ot.d(Long.valueOf(System.currentTimeMillis()));
          ot1.d(Integer.valueOf((ot1.a(Integer.valueOf(0)).intValue() + true)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "29")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = this.Z8();
          u1.B0(new ShowMetaData().setElementPackage(uElementPack));
       }
       c.i(KsLogFollowTag.FOLLOW_GUIDE.appendTag("BaseFeatureToFollowGuidePresenter"), this.Y8()+"onGuideShowSuccess");
       return;
    }
    public final void k9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       a.p(p0, "text");
       if (this.r == null) {
          c.i(KsLogFollowTag.FOLLOW_GUIDE.appendTag("BaseFeatureToFollowGuidePresenter"), p0);
          this.r = true;
       }
       return;
    }
    public final void l9(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.q = 1;
       Object obj = b.a(0x5eeadcc5);
       a.o(obj, "Singleton.get\(FollowApiService::class.java\)");
       obj.p().map(new e()).doOnError(new a$h(this)).subscribe(new a$i(this), c.a);
       return;
    }
    public final void m9(boolean p0){
       this.z = p0;
    }
    public abstract void n9(FollowFeatureGuideSnackBarResponse p0);
}
