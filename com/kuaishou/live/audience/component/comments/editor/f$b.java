package com.kuaishou.live.audience.component.comments.editor.f$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kuaishou.live.audience.component.comments.editor.f;
import brd.v;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zx0.u;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import wd3.a;
import ft5.b;
import k2b.e0;
import z12.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import d61.y;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import pf1.f;
import v37.a;
import android.view.View;
import brd.g;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import gt5.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import gq5.f;
import java.util.Iterator;
import java.lang.Iterable;
import ft5.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;

public final class f$b implements BaseEditorFragment$c	// class@000aad
{
    public final f a;
    public final v b;

    public void f$b(f p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       a0 a1;
       String str3;
       f$b a;
       Object obj = this;
       String str = p0;
       if (PatchProxy.applyVoidOneRefs(str, obj, f$b.class, "3")) {
          return;
       }
       a.p(str, "event");
       if (obj.b.isDisposed()) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String str1 = "mLivePlayCallContext.mLiveBasicContext";
       if (!qCurrentUser.isLogined() && str.a == null) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          String str2 = uoc.a().getString(R.string.arg_RES_7f103076);
          a.o(str2, "AppEnv.get\(\).appContext.¡­ing.login_prompt_comment\)");
          a0 z2 = u.S8(obj.a.b).Z2;
          a.o(z2, str1);
          y.a(obj.a.b.getActivity(), z2.b().getUrl(), "live_comment", 38, str2, u.V8(obj.a.b).mEntity, null, null, null);
          return;
       }else {
          f b = obj.a.b;
          u e = b.E;
          ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = null;
          BaseEditorFragment v = (e != null)? e.V: liveVoicePar;
          str.o = v;
          if (e != null) {
             str.p = e.W;
          }
          if (str.a == null) {
             a1 = u.S8(b).a1;
             if (a1 != null) {
                liveVoicePar = a1.B();
             }
             ClientContentWrapper$LiveVoicePartyPackage liveVoicePar1 = liveVoicePar;
             a1 = u.S8(obj.a.b).Y1;
             a.o(a1, "mLivePlayCallContext.mSendCommentsService");
             if (a1.T6()) {
                str3 = "CNY_COMMENT";
             }else {
                a1 = u.S8(obj.a.b).Y1;
                a.o(a1, "mLivePlayCallContext.mSendCommentsService");
                if (a1.Kh()) {
                   str3 = "FLOATING_COMMENT";
                }else {
                   a1 = u.S8(obj.a.b).Y1;
                   a.o(a1, "mLivePlayCallContext.mSendCommentsService");
                   str3 = (a1.Xd())? "CUSTOMER_SERVICE": "COMMENT";
                }
             }
             String str4 = str3;
             a1 = u.S8(obj.a.b).Z2;
             a.o(a1, str1);
             ClientContent$LiveStreamPackage liveStreamPa = a1.a();
             a = obj.a;
             b = obj.a.b;
             f.f(x.l(u.S8(obj.a.b)), liveStreamPa, str.c, str.p, u.S8(obj.a.b).i, a.c, str.k, y.d(a.b.getActivity()), str.l, str4, b.J, liveVoicePar1, u.S8(b).c0());
             u.S8(obj.a.b).X2.d(str.o);
          }
          u b1 = obj.a.b.B;
          if (b1 != null) {
             b1.setEnabled(true);
          }
          a1 = u.S8(obj.a.b).Y1;
          a.o(a1, "mLivePlayCallContext.mSendCommentsService");
          str.n = a1.Xd();
          obj.b.onNext(str);
          obj.b.onComplete();
          return;
       }
    }
    public void c(BaseEditorFragment$h p0){
       BaseEditorFragment$h oh;
       boolean b2;
       boolean b3;
       BaseEditorFragment$h a;
       u e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       u ou = u.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       a.p(p0, "event");
       f b = this.a.b;
       if (b.E == null) {
          return;
       }
       u y = b.y;
       if (y == null) {
          a.S("mLiveCommentsService");
       }
       ViewGroup viewGroup = y.a2();
       a.o(viewGroup, "mLiveCommentsService.commentContainerView");
       Objects.requireNonNull(viewGroup.getLayoutParams(), "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       Activity activity = this.a.b.getActivity();
       Object[] objArray = null;
       Integer integer = (activity != null)? Integer.valueOf(n.j(activity)): objArray;
       int i = 1;
       int i1 = 0;
       if (p0.b > null) {
          int i2 = (integer != null)? integer.intValue(): p0.a - 0;
          if (i2 >= p0.b) {
             oh = 1;
          label_0067 :
             f b1 = this.a.b;
             Objects.requireNonNull(b1);
             u obj = PatchProxy.apply(objArray, b1, ou, "5");
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else {
                obj = b1.E;
                if (obj instanceof LiveAsrFloatEditorFragment) {
                   if (b1.Z8()) {
                      e = b1.E;
                      Objects.requireNonNull(e, "null cannot be cast to non-null type com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment");
                      if (e.Th()) {
                      label_0098 :
                         b2 = true;
                      }
                   }
                }else if(obj instanceof EmotionFloatEditorFragment && b1.Z8()){
                   e = b1.E;
                   Objects.requireNonNull(e, "null cannot be cast to non-null type com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment");
                   if (e.Th()) {
                      goto label_0098 ;
                   }
                }
                b2 = false;
             }
             if (!b2) {
                b1 = this.a.b;
                Objects.requireNonNull(b1);
                Object obj1 = PatchProxy.apply(objArray, b1, ou, "6");
                if (obj1 != patchProxyRe) {
                   b3 = obj1.booleanValue();
                }else if(b1.E instanceof LiveAsrFloatEditorFragment && b1.Z8()){
                   ou = b1.E;
                   Objects.requireNonNull(ou, "null cannot be cast to non-null type com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment");
                   Object obj2 = PatchProxy.apply(objArray, ou, LiveAsrFloatEditorFragment.class, "4");
                   if (obj2 != patchProxyRe) {
                      b3 = obj2.booleanValue();
                   }else {
                      LiveAsrFloatEditorFragment h1 = ou.h1;
                      b3 = (h1 != null && (ou.u1 != null || !h1.getVisibility()))? true: false;
                   }
                   if (b3) {
                      i1 = 1;
                   }
                }
             label_0108 :
                b3 = i1;
                if (!b3) {
                   i = oh;
                }
             }
             b3 = y.d(this.a.b.getActivity());
             if (b3 && (p0.a > null && i != null)) {
                u.S8(this.a.b).g2.n();
             }else if(!b3){
                a = p0.a;
                if (a > null && i != null) {
                   this.a.b.W8(a);
                   Iterator iterator = this.a.b.K.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(p0.a, p0.b);
                   }
                }
             }
             return;
          }
       }
       oh = null;
       goto label_0067 ;
    }
    public void d(BaseEditorFragment$m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       a.p(p0, "event");
       this.a.b.G = p0.a;
       return;
    }
}
