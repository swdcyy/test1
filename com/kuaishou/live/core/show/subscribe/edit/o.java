package com.kuaishou.live.core.show.subscribe.edit.o;
import java.lang.String;
import d61.l0;
import androidx.lifecycle.MutableLiveData;
import ok.x;
import java.lang.Object;
import java.util.ArrayList;
import crd.a;
import cp3.h;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Base64;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextMessage;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import ekd.j;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentTextSegment;
import android.text.SpannableStringBuilder;
import tk2.e;
import java.util.List;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$b;
import java.lang.Number;
import com.kuaishou.live.core.show.subscribe.edit.k;
import com.kuaishou.live.core.show.subscribe.edit.n;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import com.kuaishou.live.core.show.subscribe.edit.l;
import com.kuaishou.live.core.show.subscribe.edit.m;
import sk2.q;
import sk2.r;
import java.util.Set;
import java.lang.Boolean;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$AutoFillInfo;
import com.kuaishou.live.core.show.subscribe.edit.o$c;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$a;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.edit.i;
import com.kuaishou.live.core.show.subscribe.edit.j;
import androidx.fragment.app.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import androidx.lifecycle.LiveData;
import brd.t;
import pk2.c;
import pk2.b;
import com.kwai.framework.model.user.QCurrentUser;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.subscribe.edit.g;
import erd.r;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.subscribe.edit.f;
import erd.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.util.Objects;
import o31.l;
import sk2.o;
import com.kuaishou.live.core.show.subscribe.edit.o$b;
import vk2.b;
import d61.g;
import android.content.res.Resources;
import zf6.j;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import com.kuaishou.live.webview.widget.LiveRoundCornerDialogContainerFragment;
import kq3.a;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import vk2.a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import com.kuaishou.live.core.show.subscribe.edit.c;
import com.kuaishou.live.core.show.subscribe.edit.o$a;
import crd.b;

public class o	// class@001121
{
    public final MutableLiveData a;
    public final x b;
    public final x c;
    public final x d;
    public final x e;
    public final MutableLiveData f;
    public final List g;
    public final a h;
    public boolean i;
    public LiveAnchorSubscribeContainerFragment j;
    public LiveAnchorSubscribeChoosePhotoContainerFragment k;
    public LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail l;
    public static final l0 m;
    public static final l0 n;

    static {
       o.m = l0.e("live.SubscribeDescriptionDialogShowTimes");
       o.n = l0.d("live.SubscribeAutoFillStatus");
    }
    public void o(MutableLiveData p0,x p1,x p2,x p3,x p4){
       super();
       this.f = new MutableLiveData();
       this.g = new ArrayList();
       this.h = new a();
       this.i = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static CharSequence k(String p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       LiveCommentRichTextMessage$CommentRichTextMessage uCommentRich = LiveCommentRichTextMessage$CommentRichTextMessage.parseFrom(Base64.decode(p0, i));
       LiveSpannable liveSpannabl = new LiveSpannable();
       if (!j.h(uCommentRich.segment)) {
          uCommentRich = uCommentRich.segment;
          int len = uCommentRich.length;
          while (i < len) {
             object oobject = uCommentRich[i];
             if (oobject.hasTextSegment()) {
                liveSpannabl.b(p1.a(oobject.getTextSegment()));
             }
             i = i + 1;
          }
       }
       return liveSpannabl.k();
    }
    public void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "26")) {
          return;
       }
       this.g.add(p0);
       return;
    }
    public LiveSubscribeEditFragment b(LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p0,SubscribeDialogParams p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       LiveSubscribeEditFragment$b obj = PatchProxy.applyTwoRefs(p0, p1, this, oo, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new LiveSubscribeEditFragment$b();
       obj.b = p0;
       Object obj1 = PatchProxy.applyOneRefs(p0, this, oo, "18");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): k0.b(p0, k.a, n.a).or(Integer.valueOf(11)).intValue();
       obj.c = i;
       Object obj2 = PatchProxy.applyOneRefs(p0, this, oo, "19");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = k0.b(p0, l.a, m.a).orNull();
       }
       obj.d = obj2;
       obj.e = new q(this);
       obj.f = new r(this);
       obj.g = p0.getEditableSubscribeTypes();
       obj.h = p1.f ^ 0x01;
       obj.i = p1.h;
       obj.a = p1.b;
       if (this.j().booleanValue()) {
          obj.j = this.d(p0);
       }
       return new LiveSubscribeEditFragment(obj, new o$c(this, p1));
    }
    public final Activity c(){
       Object obj = PatchProxy.apply(null, this, o.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
    public final LiveAnchorSubscriberCreateConfig$AutoFillInfo d(LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.b(p0, i.a, j.a).orNull();
    }
    public c e(){
       Object obj = PatchProxy.apply(null, this, o.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get();
    }
    public ClientContent$LiveStreamPackage f(){
       Object obj = PatchProxy.apply(null, this, o.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.get();
    }
    public LiveData g(){
       return this.f;
    }
    public final t h(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.b().E0(QCurrentUser.me().getId(), p0).map(new e()).filter(g.b).observeOn(d.c).doOnNext(f.b).observeOn(d.a);
    }
    public ClientContent$LiveVoicePartyPackageV2 i(){
       Object obj = PatchProxy.apply(null, this, o.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.get();
    }
    public final Boolean j(){
       Object obj = PatchProxy.apply(null, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.n.b(Boolean.TRUE);
    }
    public t l(g p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oo = this.h;
       Objects.requireNonNull(oo);
       return this.h(p1).doOnSubscribe(new l(oo)).doOnNext(new o(this, p0)).doOnError(new o$b(this));
    }
    public final void m(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "24")) {
          return;
       }
       this.a.setValue(Boolean.valueOf(p0));
       return;
    }
    public void n(LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p0){
       int g;
       LiveRoundCornerDialogContainerFragment liveRoundCor;
       a uoa;
       LiveWebViewParam liveWebViewP;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "12")) {
          return;
       }
       Activity uActivity = this.c();
       c uoc = this.e();
       o ti = this.i;
       if (!PatchProxy.isSupport(b.class) || (!PatchProxy.applyVoidFourRefs(uActivity, uoc, p0, Boolean.valueOf(ti), null, b.class, "3") && !g.h(uActivity))) {
          LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail mHelpUrl = (ti != null || j.o(uActivity.getResources()))? p0.mHelpUrl: p0.mHelpUrlLight;
          if (TextUtils.x(mHelpUrl)) {
             b.d(uActivity, p0);
          }else {
             g = LiveAnchorSubscribeContainerFragment.G;
             if (PatchProxy.isSupport(b.class)) {
                Object[] objArray = new Object[]{uActivity,uoc,mHelpUrl,Integer.valueOf(g),Boolean.valueOf(ti)};
                if (!PatchProxy.applyVoid(objArray, null, b.class, "5")) {
                }
             }else {
             }
          }
       }
    label_00f0 :
       return;
    }
    public void o(SubscribeDialogParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.h.d();
       this.i = p0.h;
       this.h.c(this.h(p0.b).subscribe(new c(this, p0), new o$a(this)));
       return;
    }
}
