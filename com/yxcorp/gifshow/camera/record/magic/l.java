package com.yxcorp.gifshow.camera.record.magic.l;
import m4b.e;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import lnc.a1;
import m4b.c;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.camera.record.magic.l$a;
import com.yxcorp.gifshow.camera.record.magic.l$b;
import com.kwai.framework.model.user.QCurrentUser;
import m4b.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import s5b.b;
import q87.c;
import w3b.p;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.k;
import android.content.Context;
import j4b.l;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import q5b.f;
import android.view.View$OnClickListener;
import lnc.s6;
import pi9.i;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import ce9.s;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import ce9.b0;
import erd.g;
import crd.b;
import eoc.f;
import j4b.f;
import ce9.e0;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.camera.record.magic.k;
import pi9.e;
import lnc.m4;
import z3b.s0;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Float;
import java.lang.Number;
import java.util.Map;
import uyb.c$b;
import w46.b;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import k4b.a;
import o56.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import java.lang.StringBuilder;
import j4b.i;
import v4b.o;
import java.lang.Boolean;
import j8c.b;
import j4b.n;
import com.yxcorp.gifshow.model.RuntimeData;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import qr4.k$j;
import com.google.protobuf.nano.MessageNano;
import ce9.x;
import java.util.concurrent.Callable;
import brd.m;
import t45.d;
import brd.z;
import ce9.y;
import com.yxcorp.gifshow.camera.record.magic.j;
import ce9.v;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import a4b.b;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiUserInfo;
import e4b.a;
import e4b.c;
import brd.t;
import p4b.e;
import p4b.f;
import q5b.l;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import i4b.g;
import u4b.e;
import lnc.o4;
import kotlin.jvm.internal.a;
import ce9.w;
import t45.c;
import be9.a;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelMagic$1;
import msd.l;
import c4b.f;
import java.util.ArrayList;
import t3b.d;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import a5b.f;
import a5b.h;
import w3b.l;
import w3b.s;
import java.util.concurrent.ConcurrentMap;
import com.kwai.video.westeros.models.EffectResource;
import android.widget.ImageView;
import com.kwai.video.westeros.models.EffectHint;
import o56.c;
import j4b.g;
import z3b.a0;
import com.yxcorp.gifshow.camera.record.magic.l$c;
import z3b.f;
import xf6.g;
import tkd.b;
import tkd.d;
import uyb.c;
import com.yxcorp.gifshow.model.ChildMagicFace;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import lnc.e0;
import com.google.common.collect.Lists;
import java.lang.Iterable;
import s0d.f;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import vb5.c;
import jd.c;
import s0d.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.yxcorp.gifshow.model.MagicEmoji$a;
import uyb.c$a;
import vm6.b;
import ce9.c0;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import z3b.h;
import java.util.Queue;
import java.util.Set;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import q5b.e;
import j4b.d;
import ce9.z;
import com.yxcorp.gifshow.camera.record.magic.h;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.b;
import ce9.f0;
import com.yxcorp.gifshow.camera.record.magic.i;
import e4b.b;
import ce9.a0;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import f4b.k;
import ce9.t;
import com.kuaishou.live.common.core.basic.tools.h;
import a5b.e;
import java.util.concurrent.ConcurrentHashMap;
import c5b.c;
import c5b.d;
import cjd.e;
import erd.o;
import a5b.c;
import a5b.d;

public class l implements e, FaceMagicController$FaceMagicLoadEffectFailedListener	// class@000e48
{
    public View b;
    public View c;
    public KwaiImageView d;
    public View e;
    public TextView f;
    public BaseFragment g;
    public CameraPageType h;
    public String i;
    public boolean j;
    public MagicEmoji$MagicFace k;
    public MagicEmoji$MagicFace l;
    public n$c m;
    public MagicEmojiPageConfig$b n;
    public b o;
    public c p;
    public MagicEditionHandler q;
    public int r;
    public byte[] s;
    public Map t;
    public final c$a u;
    public final m v;
    public static final int w;
    public static final int x;

    static {
       l.w = a1.e(0x3f800000);
       l.x = a1.e(0);
    }
    public void l(c p0){
       super();
       this.r = 0;
       this.t = new HashMap();
       this.u = new l$a(this);
       this.v = new l$b(this);
       this.j = QCurrentUser.ME.isLogined() ^ 0x01;
       this.p = p0;
    }
    public void G(){
       d.e(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       if (this.p.getActivity() != null) {
          Object[] objArray = new Object[0];
          b.D().w("MagicHandler", "cancel magic face", objArray);
          String str = this.p.o0();
          MagicEmoji$MagicFace magicFace = p.b().c(str);
          if (magicFace != null) {
             RxBus f = RxBus.f;
             f.b(new k(null, this.p.getActivity()));
             f.b(new l(null, magicFace.mId, magicFace.mChildId, str));
             this.o(null);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, l.class, "48")) {
          return;
       }
       c childFragmen = this.p.getChildFragmentManager();
       if (childFragmen != null) {
          Fragment uFragment = childFragmen.findFragmentByTag(this.i);
          if (uFragment != null) {
             childFragmen.beginTransaction().u(uFragment).m();
          }
       }
       return;
    }
    public final MagicEmoji$MagicFace c(MagicEmojiResponse p0,int p1){
       MagicEmoji$MagicFace obj;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       MagicEmoji briefEmoji = p0.getBriefEmoji(p0.mDefaultTabId);
       obj = null;
       if (briefEmoji != null && (!q.f(briefEmoji.mMagicFaces) && briefEmoji.mMagicFaces.size() > p1)) {
          obj = briefEmoji.mMagicFaces.get(p1);
       }
    label_003b :
       return obj;
    }
    public final List d(MagicEmojiResponse p0){
       List list;
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MagicEmoji briefEmoji = p0.getBriefEmoji(p0.mDefaultTabId);
       briefEmoji = (briefEmoji != null)? briefEmoji.mMagicFaces: null;
       return briefEmoji;
    }
    public void doBindView(View p0){
       l tf;
       RoundingParams roundingPara;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       this.b = this.p.F(0x7f0a0622, p0);
       this.d = this.p.F(0x7f0a0621, p0);
       this.c = this.p.F(0x7f0a0620, p0);
       this.f = this.p.F(0x7f0a0623, p0);
       if (p0 != null) {
          this.e = p0.findViewById(0x7f0a05c0);
       }
       if (f.a()) {
          tf = this.f;
          if (tf != null) {
             tf.setText(R.string.arg_RES_7f104a51);
          }
       }
       tf = this.c;
       int i = 0;
       if (tf != null) {
          tf.setVisibility(i);
          this.c.setOnClickListener(this.v);
       }
       if (s6.m()) {
          View[] viewArray = new View[]{this.d};
          i.a(this.f, viewArray);
          tf = this.d;
          if (tf != null) {
             tf.setPlaceHolderImage(R.drawable.arg_RES_7f081c1e);
             if (s6.w() == 3) {
                roundingPara = new RoundingParams();
                roundingPara.q(1);
                this.d.getHierarchy().L(roundingPara);
             }
          }
       }
       this.m = new s(this);
       this.p.a(f.a(PanelShowEvent.class, new b0(this)));
       this.p.a(f.a(f.class, new e0(this)));
       this.p.a(f.a(MagicEmojiEntrance.class, new k(this)));
       if (this.d != null) {
          if (e.e() && !this.p.V()) {
             m4.a(this.d, i);
             e.h(this.f);
             e.j(this.e);
             roundingPara = new RoundingParams();
             roundingPara.q(1);
             this.d.getHierarchy().L(roundingPara);
          }
          this.p.Z(this.d);
       }
       s0 os0 = s0.e();
       if (j0.e(this.p.getActivity().getIntent(), "magic_face") == null) {
          i = true;
       }
       os0.a(i, 1);
       return;
    }
    public final float e(String p0,MagicEmoji$SeekBarType p1,float p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, l.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       Map map = this.t.get(p0);
       if (map != null && map.get(p1) != null) {
          return map.get(p1).floatValue();
       }else {
          return p2;
       }
    }
    public void e1(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "21")) {
          return;
       }
       ol = this.g;
       if (ol instanceof c$b) {
          ol.e1(p0);
       }else {
          Object[] objArray = new Object[0];
          b.D().t("MagicHandler", "notifyGenderResult with invalid mMagicEmojiFragment", objArray);
       }
       return;
    }
    public MagicEmojiPageConfig$b f(){
       return this.n;
    }
    public byte[] g(){
       return this.s;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "19")) {
          return;
       }
       this.m(p0);
       return;
    }
    public MagicEmoji$MagicFace i(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, l.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n == null || !this.p.I0()) {
          return objArray;
       }
       return p.b().c(this.n.b());
    }
    public final void j(MagicEmojiEntrance p0,MagicEmojiResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "26")) {
          return;
       }
       int i = 0;
       MagicEmoji$MagicFace magicFace = this.c(p1, i);
       MagicEmoji$MagicFace magicFace1 = this.c(p1, 1);
       if (p0 != null) {
          p0 = p0.mMagicFaceInfo;
          if (a.d() && (p0 != null && !TextUtils.x(p0.mId))) {
             SimpleMagicFace mId = (magicFace != null)? magicFace.mId: "";
             if (!TextUtils.n(mId, p0.mId)) {
                i.d(R.style.arg_RES_7f110668, "运营位魔表与面板首位不一致");
             }
             Object[] objArray = new Object[i];
             b.D().w("MagicHandler", "coverid:"+p0.mId+" firstId:"+mId, objArray);
          }
       }
       this.p.D(new i(magicFace, magicFace1, this.d(p1)));
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, l.class, "39")) {
          return;
       }
       if (this.p.H()) {
          return;
       }
       if (this.p.d0()) {
          RxBus.f.b(new o(false));
       }else {
          this.p.h0();
       }
       return;
    }
    public boolean l(){
       l obj = PatchProxy.apply(null, this, l.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       boolean b = (obj != null && obj.isVisible())? true: false;
       return b;
    }
    public void m(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "41")) {
          return;
       }
       l tr = this.r;
       if (tr > null && p0 == null) {
          this.r = tr - 1;
          return;
       }else if(this.p.I0()){
          MagicEmoji$MagicFace magicFace = this.i();
          this.r(magicFace);
          this.n(magicFace, p0);
          return;
       }else {
          Object[] objArray = new Object[0];
          b.D().t("MagicHandler", "notifyDescription with null mImageHelper", objArray);
          return;
       }
    }
    public final void n(MagicEmoji$MagicFace p0,EffectDescription p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "42")) {
          return;
       }
       l tg = this.g;
       if (tg instanceof c$b) {
          tg.hc(p0, p1);
       }else {
          Object[] objArray = new Object[0];
          b.D().A("MagicHandler", "notifyDescription with invalid mMagicEmojiFragment", objArray);
       }
       return;
    }
    public boolean o(MagicEmoji$MagicFace p0){
       boolean b;
       a a;
       l ol = l.class;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, ol, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "[magicface][keypath][apply] ";
       String str = "null";
       String str1 = (p0 != null)? p0.toString(): str;
       str1 = "MagicHandler";
       b.b(str1, obj+str1);
       b = false;
       if (this.p.isRecording()) {
          b.b(str1, "已经开始录制，舍弃此次魔表设置");
          return b;
       }else {
          MagicEmoji$MagicFace magicFace = null;
          this.k = magicFace;
          if (!this.p.I0() || (!this.p.G0() && p0 == null)) {
             b.d(str1, "MagicSDK不可用 || \(魔表特效不可用 && 魔表为空\)");
             return b;
          }else {
             this.p.D(new n(p0));
             if (p0 != null) {
                b.a(str1, "set magic:"+p0.mName+" switchable:"+p0.mSwitchable);
             }else {
                b.a(str1, "set magic null");
             }
             if (PatchProxy.applyVoidOneRefs(p0, this, ol, "35") || (p0 == null || (!TextUtils.x(p0.mId) && p0.mExtraParams != null))) {
                RuntimeData runtimeData = this.p.c0(p0.mId);
                if (runtimeData != null) {
                   p0.mExtraParams.mRunTimeData = runtimeData;
                }
             }
          label_00b2 :
             this.p(p0);
             this.q(p0);
             if (!PatchProxy.applyVoidOneRefs(p0, this, ol, "36")) {
                try{
                   if (p0 == null) {
                      this.s = magicFace;
                   }else {
                      k$e uoe = b.n(p0, 0, 0, p.b().f(this.n.b(), p0));
                      k$j oj = new k$j();
                      k$e[] uoeArray = new k$e[1];
                      oj.u = uoeArray;
                      uoeArray[b] = uoe;
                      m.r(new x(MessageNano.toByteArray(oj))).B(d.c).u(d.a).y(new y(this), j.b);
                   }
                }catch(java.lang.IllegalArgumentException e0){
                }
                if (p0.mResourceType == 3) {
                   ol.b = p0;
                   if (b.d.c() == null) {
                      c.a().getUserInfo().subscribe(new e(ol), f.b);
                   }
                }
             }
             if (this.d != null) {
                k1.o(new v(this, p0));
             }
             ol = this.q;
             if (ol != null) {
                Objects.requireNonNull(ol);
                if (!PatchProxy.applyVoidOneRefs(p0, ol, MagicEditionHandler.class, "7")) {
                   b uob = b.D();
                   StringBuilder str2 = "magicEmojiSelected: resourceType: ";
                   Integer integer = (p0 != null)? Integer.valueOf(p0.mResourceType): magicFace;
                   Object[] objArray = new Object[b];
                   uob.w("MagicEditionController", str2+integer, objArray);
                   ol.b = magicFace;
                   ol.c = magicFace;
                   if (p0 != null && p0.mResourceType == 3) {
                      goto label_015b ;
                   }
                }
             }
          label_0177 :
             int i = j0.b(this.p.getActivity().getIntent(), "frame_mode", b);
             if (i && (!l.a(p0) || l.b(i, p0))) {
                String absolutePath = (p0 != null)? g.j(p0).getAbsolutePath(): magicFace;
                if (e.a(p0)) {
                   absolutePath = p0.mResource;
                }
                l tl = this.l;
                Objects.requireNonNull(o4.a);
                if (tl != null && (p0 != null && (a.g(tl.mId, p0.mId) && (a.g(tl.mChildId, p0.mChildId) ^ 1)))) {
                   b = true;
                }
             label_01ec :
                if (b) {
                   this.r = this.r + 1;
                   this.p.j(magicFace, magicFace);
                }
                this.l = p0;
                this.p.j(p0, absolutePath);
                if (p0 != null && p0.mFileMd5CheckList == null) {
                   c.a(new w(this, p0, absolutePath));
                   a = a.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidOneRefs(p0, a, a.class, "3")) {
                      PostFunnelManager.j.a().d().l(CameraFunnel$funnelMagic$1.INSTANCE);
                   }
                }
                return 1;
             }else {
                obj = "选择的魔表和画幅不匹配 ";
                if (p0 != null) {
                   str = p0.mName;
                }
                b.b(str1, obj+str+" frameMode="+i);
                return 1;
             }
          }
       }
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       d.d(this, p0, p1, p2);
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "12")) {
          return;
       }
       f uof = f.b();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "2")) {
          uof.b = objArray;
          uof.f = new ArrayList();
       }
       this.p(objArray);
       d.c().h((b.a(0x5f2ddeb4).h() ^ 0x01));
       l tn = this.n;
       if (tn != null) {
          f.d.c(tn.b(), objArray);
       }
       s e = l.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(objArray, e, s.class, "3")) {
          e.a.clear();
          e.b.clear();
       }
       return;
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "20")) {
          return;
       }
       this.m(p0);
       if (this.p.I0() && p0 != null) {
          MagicEmoji$MagicFace magicFace = this.i();
          if (magicFace != null && !MagicEmoji$MagicFace.isPlatformMagicFace(magicFace)) {
             String topic = magicFace.getTopic();
             if (TextUtils.x(topic)) {
                topic = this.p.F0();
             }
             if (!TextUtils.x(topic)) {
                magicFace.mTopic = topic;
             }
          }
       label_0041 :
          l td = this.d;
          if (td != null) {
             td.setSelected(true);
          }
          if (magicFace != null) {
             b.d("MagicHandler", "魔表应用完成 "+magicFace.mName);
          }
       }
    label_0063 :
       return;
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "18")) {
          return;
       }
       if (p0 != null && this.p.I0()) {
          l tg = this.g;
          if (tg instanceof c$b) {
             tg.onEffectHintUpdated(p0);
          }
       }
       return;
    }
    public void onLoadFileError(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "47")) {
          return;
       }
       String str = "MagicHandler";
       if (a.a().c()) {
          i.d(R.style.arg_RES_7f11066a, "魔表缺失文件："+new File(p0).getName());
          b.d(str, "魔表缺失文件 "+p0);
       }
       if (!this.p.K0(p0, p1)) {
          b.d(str, "error info is not valid, path="+p0+" type="+p1);
          return;
       }else {
          MagicEmoji$MagicFace magicFace = this.i();
          String str1 = null;
          String absolutePath = (magicFace != null)? g.j(magicFace).getAbsolutePath(): str1;
          if (magicFace == null) {
             b.b(str, "MagicHandler处理load失败魔表, 当前魔表为空 "+p0);
             return;
          }else {
             b.d(str, "MagicHandler处理load失败魔表 "+magicFace.mName);
             if (!TextUtils.x(absolutePath) && p0.startsWith(absolutePath)) {
                b.d(str, "[magicface][keypath][effect]  onLoadFileError...path"+p0+" , download magic face, name: "+magicFace.mName);
                if (this.p.l0(p0)) {
                   RxBus.f.b(new g());
                   this.o(str1);
                   this.q(str1);
                   b.b(str, "达到最大重试次数，the magic face : "+magicFace.mId+" may be wrong, please contact zhoumo@kuaishou.com.");
                   return;
                }else {
                   this.o(str1);
                   this.k = magicFace;
                   b.a(str, magicFace.mName+" 重新下载");
                   a0.o().b("record", "inner_resource", magicFace, new l$c(this, p0));
                }
             }else {
                b.b(str, "非魔表资源路径, "+p0+" != "+absolutePath);
             }
             return;
          }
       }
    }
    public void onResume(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       g.D();
       MagicEmoji$MagicFace magicFace = this.i();
       if (magicFace != null) {
          g og = g.class;
          if (PatchProxy.isSupport(og)) {
             Object obj = PatchProxy.applyTwoRefs(magicFace, Boolean.TRUE, null, og, "26");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(g.J() && (magicFace.mResourceType != 13 && (!g.z(magicFace) && (!g.B(magicFace) && (!g.s(magicFace) && (!g.w(magicFace) && (!g.x(magicFace) && (g.t(magicFace) || g.v(magicFace, true))))))))){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_0030 ;
          }
          if (b) {
             this.o(null);
          }
       }
       return;
    }
    public void p(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "31")) {
          return;
       }
       if (this.n != null && this.p.I0()) {
          d.a(-314635782).Di(this.n.b(), p0);
       }
       return;
    }
    public final void q(MagicEmoji$MagicFace p0){
       ChildMagicFace mIcons;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "37")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       if (e.a(p0)) {
          return;
       }
       if (p0 != null && !TextUtils.x(p0.mImage)) {
          p0 = p.b().h(this.n.b(), p0);
          int i = 3;
          if (e.e() || s6.w() == i) {
             m4.a(this.d, true);
             f uof = f.x();
             if (MagicEmoji$MagicFace.isChildMagicFace(p0)) {
                MagicEmoji$MagicFace mChildMagicF = p0.mChildMagicFace;
                if (mChildMagicF != null && !j.h(mChildMagicF.mIcons)) {
                   mIcons = p0.mChildMagicFace.mIcons;
                label_0097 :
                   CoverPicRecommendedCropWindow uCoverPicRec = new CoverPicRecommendedCropWindow();
                   uCoverPicRec.mCropWidth = 100;
                   uCoverPicRec.mCropHeight = 100;
                   uCoverPicRec.mBeginX = 8;
                   uCoverPicRec.mBeginY = 8;
                   uCoverPicRec.mPhotoHeight = 116;
                   uCoverPicRec.mPhotoWidth = 116;
                   d uod = Fresco.newDraweeControllerBuilder();
                   uod.u(uof.r(mIcons).l(new c(uCoverPicRec)).w());
                   AbstractDraweeController uAbstractDra = uod.e();
                   this.d.setController(uAbstractDra);
                   if (s6.w() == i) {
                      this.d.setPadding(a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3));
                   }
                }
             }
             mIcons = p0.mImages;
             goto label_0097 ;
          }else if(MagicEmoji$MagicFace.isChildMagicFace(p0)){
             MagicEmoji$MagicFace mChildMagicF1 = p0.mChildMagicFace;
             if (mChildMagicF1 != null && !j.h(mChildMagicF1.mIcons)) {
                this.d.a0(p0.mChildMagicFace.mIcons, null);
             label_006b :
                this.d.setPadding(l.w, l.w, l.w, l.w);
             }
          }
          this.d.O(Lists.e(e0.b(p0.mImages, p0.mImage)), null);
          goto label_006b ;
       }else if(e.e()){
          m4.a(this.d, false);
       }else {
          l td = this.d;
          int i1 = (s6.m())? 0x7f081c1e: 0x7f081c1c;
          td.setImageResource(i1);
          this.d.setPadding(l.x, l.x, l.x, l.x);
       }
       return;
    }
    public final void r(MagicEmoji$MagicFace p0){
       MagicEmoji$SeekBarType sLIMMING;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "45")) {
          return;
       }
       Object obj = null;
       boolean b = false;
       if (p0 != null) {
          AdjustIntensityConfig adjustIntens = this.p.getAdjustIntensityConfig();
          if (adjustIntens != null && adjustIntens.getEnabled()) {
             List effectTypesL = adjustIntens.getEffectTypesList();
             MagicEmoji$SeekBarType seekBarType = PatchProxy.applyOneRefs(effectTypesL, obj, MagicEmoji$a.class, "1");
             if (seekBarType != PatchProxyResult.class) {
             }else if(effectTypesL != null && (!effectTypesL.size() || effectTypesL.contains("slimming"))){
                seekBarType = MagicEmoji$SeekBarType.SLIMMING;
             }else {
                boolean b1 = effectTypesL.contains("makeup");
                boolean b2 = effectTypesL.contains("lookup");
                if (b1 && b2) {
                   seekBarType = MagicEmoji$SeekBarType.MAKEUP_LOOKUP;
                }else if(!b2 && !b1){
                   seekBarType = MagicEmoji$SeekBarType.UNKNOWN;
                }else if(b1){
                   sLIMMING = MagicEmoji$SeekBarType.MAKEUP;
                }else {
                   sLIMMING = MagicEmoji$SeekBarType.LOOKUP;
                }
                seekBarType = sLIMMING;
             }
             if (seekBarType == MagicEmoji$SeekBarType.UNKNOWN) {
                p0.clearSeekBarConfig();
             }else {
                sLIMMING = MagicEmoji$SeekBarType.SLIMMING;
                if (seekBarType == sLIMMING || (!p0.isNotSupportMakeUpSeekBar() && (!this.p.w() && q.f(this.p.g())))) {
                   if (seekBarType == sLIMMING) {
                      p0.setSeekBarConfig(adjustIntens.getDefaultIntensity(), seekBarType);
                      if (this.g == null) {
                         this.p.j0().c(this.e(p0.mId, seekBarType, adjustIntens.getDefaultIntensity()), seekBarType, b);
                      }
                   }else {
                      sLIMMING = MagicEmoji$SeekBarType.MAKEUP;
                      if (seekBarType == sLIMMING) {
                         p0.setSeekBarConfig(adjustIntens.getDefaultIntensity(), seekBarType);
                         if (p0.getSeekBarConfigs().get(sLIMMING) != null) {
                            p0.getSeekBarConfigs().get(sLIMMING).h(adjustIntens.getDefaultMaleMakeupIntensity());
                            p0.getSeekBarConfigs().get(sLIMMING).i(adjustIntens.getDefaultMaleMakeupIntenistyEnabled());
                         }
                         if (this.g == null) {
                            this.p.j0().c(this.e(p0.mId, seekBarType, adjustIntens.getDefaultIntensity()), seekBarType, b);
                         }
                      }else {
                         MagicEmoji$SeekBarType lOOKUP = MagicEmoji$SeekBarType.LOOKUP;
                         if (seekBarType == lOOKUP) {
                            p0.setSeekBarConfig(adjustIntens.getDefaultLookupIntensity(), seekBarType);
                         }else if(seekBarType == MagicEmoji$SeekBarType.MAKEUP_LOOKUP){
                            p0.setSeekBarConfig(adjustIntens.getDefaultIntensity(), sLIMMING);
                            if (p0.getSeekBarConfigs().get(sLIMMING) != null) {
                               p0.getSeekBarConfigs().get(sLIMMING).h(adjustIntens.getDefaultMaleMakeupIntensity());
                               p0.getSeekBarConfigs().get(sLIMMING).i(adjustIntens.getDefaultMaleMakeupIntenistyEnabled());
                            }
                            if (this.g == null) {
                               this.p.j0().c(this.e(p0.mId, seekBarType, adjustIntens.getDefaultIntensity()), seekBarType, b);
                            }
                            p0.setSeekBarConfig(adjustIntens.getDefaultLookupIntensity(), lOOKUP);
                         }
                         b = 1;
                      }
                   }
                }
             }
          }else {
             p0.clearSeekBarConfig();
          }
       }
    label_0165 :
       if (!PatchProxy.applyVoid(obj, this, ol, "44")) {
          l to = this.o;
          if (to != null) {
             to.dispose();
             this.o = obj;
          }
       }
       if (b) {
          this.o = this.p.i0(b.class, new c0(this));
       }
       return;
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       l tm = this.m;
       if (tm != null) {
          n.w(tm);
          this.m = null;
       }
       this.p.n0(this);
       a0 uoa0 = a0.o();
       Objects.requireNonNull(uoa0);
       if (!PatchProxy.applyVoid(null, uoa0, a0.class, "24")) {
          h oh = h.g();
          Objects.requireNonNull(oh);
          if (!PatchProxy.applyVoid(null, oh, h.class, "14")) {
             h.d.clear();
             h.e.clear();
          }
       }
       s0 os0 = s0.e();
       Objects.requireNonNull(os0);
       if (!PatchProxy.applyVoid(null, os0, s0.class, "16")) {
          s0.d.clear();
          s0.b.clear();
          s0.e = null;
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, l.class, "17")) {
          return;
       }
       f.b().f(this.p.k0());
       this.o(this.i());
       return;
    }
    public void w1(Intent p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.b();
       d uod = d.c();
       Objects.requireNonNull(uod);
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, uod, d.class, "3") && uod.d != null) {
          uod.d = i;
          objArray1 = new Object[i];
          e.C().w("magic_face_cleaner", "stopAutoClean", objArray1);
       }
       this.p.i0(d.class, new z(this));
       n.C().observeOn(d.c).subscribe(h.b);
       this.q = this.p.f0();
       this.p.a(b.a().observeOn(d.a).subscribe(new f0(this), i.b));
       if (!this.p.T()) {
          b.d(this.p.k0(), objArray);
       }
       objArray1 = new Object[i];
       b.D().E("MagicHandler", "[magicface][keypath] ", "setCacheResponse null", objArray1);
       return;
    }
    public void x1(){
       if (PatchProxy.applyVoid(null, this, l.class, "14")) {
          return;
       }
       if (this.p.isPreviewing()) {
          this.o(this.i());
       }
       this.p.A0(this);
       return;
    }
    public void y1(){
       e b;
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       l tm = this.m;
       if (tm != null) {
          n.a(tm);
       }
       this.p.a(RxBus.f.f(d.class).subscribe(new a0(this), Functions.e));
       MagicBusinessId magicBusines = this.p.k0();
       if (magicBusines != MagicBusinessId.VIDEO || (!this.p.O() && !this.p.T())) {
          Object[] objArray = new Object[0];
          b.D().E("MagicHandler", "[magicface][keypath][remote] ", "/rest/n/magicFace/page start "+magicBusines+" afterResume", objArray);
          k.b(magicBusines, this.n.a()).subscribe(new t(this, magicBusines), h.b);
       }
       if (this.p.W()) {
          b = e.b;
          String str = this.p.X();
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(magicBusines, Boolean.FALSE, str, b, e.class, "1")) {
             a.p(magicBusines, "businessId");
             if (e.a.get(Integer.valueOf(magicBusines.mId)) == null) {
                c.b.a().a(magicBusines.mId, str).map(new e()).subscribeOn(d.c).observeOn(d.a).subscribe(new c(magicBusines), d.b);
             }
          }
       }
       return;
    }
}
