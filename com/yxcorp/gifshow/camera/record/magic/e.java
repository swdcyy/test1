package com.yxcorp.gifshow.camera.record.magic.e;
import vm6.d;
import ui9.b;
import ui9.c;
import oc9.q;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController;
import oc9.t;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController;
import qf9.c;
import of9.a;
import pf9.a;
import ff9.a;
import oe9.a;
import xe9.a;
import com.yxcorp.gifshow.camera.record.base.d;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import um6.e;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import tkd.b;
import tkd.d;
import um6.f;
import qe9.a;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.yxcorp.gifshow.camera.record.magic.e$a;
import m4b.c;
import re9.b;
import de9.a;
import lnc.s6;
import we9.d;
import nf9.g;
import je9.b;
import le9.f;
import n0c.a;
import java.lang.Class;
import java.lang.Object;
import hp.f;
import ce9.l;
import ce9.e;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ig9.c;
import ce9.f;
import erd.g;
import crd.b;
import uc9.b;
import ce9.h;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import ce9.g;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xi9.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import s16.h;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Integer;
import qr4.i;
import qr4.k$j;
import org.json.JSONObject;
import lq.i;
import lq.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.lang.StringBuffer;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import lnc.p3;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Boolean;
import qh9.c;
import k4b.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import j8c.b;
import hp.c;
import w3b.l;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.WishMagicInfo;
import elb.a;
import com.yxcorp.gifshow.model.VoteConfig;
import w3b.p;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import android.view.View;
import android.view.ViewGroup;
import ug9.c;
import wd9.a;
import pi9.e;
import com.yxcorp.gifshow.camera.record.magic.b;
import java.lang.Runnable;
import i5b.c;
import i5b.c$a;
import s5b.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import a4b.b;
import java.util.HashMap;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import kuaishou.perf.page.impl.d;
import android.content.Intent;
import hka.a;
import com.kwai.video.westeros.models.EffectHint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import lnc.a1;
import uyb.c;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import uyb.m;
import uyb.c$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hka.n;
import ce9.g0;
import hka.h;
import android.util.Log;
import com.yxcorp.gifshow.util.PostUtils;
import h80.h;
import h80.k;
import java.lang.Enum;
import om6.r;
import lnc.s;
import om6.p;
import om6.q;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroup;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;

public abstract class e extends q implements d, b, c	// class@000e32
{
    public AbsRecordBottomBarViewBinder p;
    public a q;
    public l r;
    public boolean s;
    public b t;
    public MagicEmoji$MagicFace u;
    public ViewGroup v;
    public View w;
    public f x;

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
       this.L0(new MagicInputTextController(p0, p1));
       this.L0(new MagicMultiInputTextController(p0, p1));
       this.L0(new c(p0, p1));
       this.L0(new a(p0, p1));
       this.L0(new a(p0, p1));
       this.L0(new a(p0, p1));
       a uoa = new a(p0, p1);
       this.q = uoa;
       this.L0(uoa);
       this.L0(new a(p0, p1));
       if (!e.b(this.f.getArguments())) {
          this.L0(new MagicSafeUIAreaController(p0, p1));
       }else {
          this.L0(d.a(0x6d6c0f8b).Io(p0, p1));
       }
       this.L0(new a(p0, p1));
       d tf = this.f;
       if (tf instanceof a) {
          this.p = tf.zb();
       }
       l ol = new l(new e$a(this));
       this.r = ol;
       this.L0(new b(p0, p1, ol));
       this.L0(new a(p0, p1, this.r));
       if (s6.h()) {
          this.L0(new d(p0, p1));
       }
       this.L0(new g(p0, p1));
       this.L0(new b(p0, p1));
       this.L0(new f(p0, p1));
       this.x = this.d.c(a.class).d();
       this.d.n(l.class, new e(this));
       this.d.l(c.class, new f(p1));
       this.d.l(b.class, new h(this));
       this.d.l(c.class, new g(this));
       return;
    }
    private String f2(){
       d obj = PatchProxy.apply(null, this, e.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       String str = (obj != null && obj.getActivityId())? String.valueOf(this.g.getActivityId()): "";
       return str;
    }
    public MagicEmoji$MagicFace E(){
       Object obj = PatchProxy.apply(null, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.i();
    }
    public void L3(a p0){
       a e;
       String str2;
       Object[] objArray;
       Object obj;
       h oh = h.class;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "16")) {
          return;
       }
       super.L3(p0);
       if (p0 == null) {
          return;
       }
       e = p0.e;
       int i = 2;
       Objects.requireNonNull(e);
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Integer.valueOf(i), e, videoContext, "18") != patchProxyRe) {
       }else {
          VideoContext.b();
          e.a.c.A = i;
       }
       String str = p0.e.i();
       JSONObject jSONObject = PatchProxy.applyOneRefs(str, this, uoe, "35");
       String str1 = "MagicController";
       if (jSONObject != patchProxyRe) {
       }else {
          str2 = i.m().k().c();
          try{
             if (!TextUtils.x(str2)) {
                jSONObject = new JSONObject(str2);
             }else if(!TextUtils.x(str)){
                jSONObject = new JSONObject(str);
             }else {
                jSONObject = new JSONObject();
             }
          }catch(org.json.JSONException e1){
             Object[] objArray2 = new Object[0];
             a.D().u(str1, e1, objArray2);
             jSONObject = new JSONObject();
          }
          objArray = new Object[0];
          a.D().w(str1, "createActivityObj, obj: "+jSONObject.toString(), objArray);
       }
       str2 = jSONObject.toString();
       objArray = new Object[0];
       a.D().w(str1, "add activity info："+str2, objArray);
       p0.e.o0(str2);
       if (i.h()) {
          a l = p0.l;
          obj = null;
          str1 = PatchProxy.applyOneRefs(l, obj, oh, "3");
          String str3 = "";
          if (str1 != patchProxyRe) {
          }else if(q.f(l)){
             str1 = str3;
          }else {
             ArrayList uArrayList = new ArrayList();
             StringBuffer str4 = "";
             Iterator iterator1 = l.iterator();
             while (iterator1.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator1.next();
                if (magicFace != null && (!TextUtils.x(magicFace.mTopic) && (!uArrayList.contains(magicFace.mTopic) && !MagicEmoji$MagicFace.isPlatformMagicFace(magicFace)))) {
                   if (uArrayList.size() >= 5) {
                      break ;
                   }else if(str4.length() > 0){
                      str4 = str4+" #";
                   }
                   str4 = str4+magicFace.mTopic;
                   uArrayList.add(magicFace.mTopic);
                }
             }
             str1 = str4;
          }
          p0 = p0.l;
          MagicEmoji$MagicFace obj1 = PatchProxy.applyOneRefs(p0, obj, oh, "4");
          if (obj1 != patchProxyRe) {
             str3 = obj1;
          }else if(q.f(p0)){
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                if (obj1 != null) {
                   str2 = obj1.getStickerTopic();
                   if (!TextUtils.x(str2) && !MagicEmoji$MagicFace.isPlatformMagicFace(obj1)) {
                      str3 = str2;
                      break ;
                   }
                }else {
                   Object[] objArray1 = new Object[0];
                   p3.D().A("ShareTagUtil", "null magic face occurred.", objArray1);
                }
             }
          }
          if (!TextUtils.x(str1)) {
             i.m().k().q(str1);
          }
          if (!TextUtils.x(str3)) {
             i.m().k().v(str3);
          }
       }
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "15")) {
          return;
       }
       this.d.m(new c(false));
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, tr, l.class, "20")) {
          tr.m(p0);
          if (tr.p.I0() && p0 != null) {
             MagicEmoji$MagicFace magicFace = tr.i();
             if (magicFace != null && !MagicEmoji$MagicFace.isPlatformMagicFace(magicFace)) {
                String topic = magicFace.getTopic();
                if (TextUtils.x(topic)) {
                   topic = tr.p.F0();
                }
                if (!TextUtils.x(topic)) {
                   magicFace.mTopic = topic;
                }
             }
          label_006c :
             l d = tr.d;
             if (d != null) {
                d.setSelected(true);
             }
             if (magicFace != null) {
                b.d("MagicHandler", "魔表应用完成 "+magicFace.mName);
             }
          }
       }
       this.x.c(this.E());
       this.x.b(l.b(p0));
       return;
    }
    public abstract MagicBusinessId g2();
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "14")) {
          return;
       }
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tr, l.class, "19")) {
          tr.m(p0);
       }
       return;
    }
    public l h2(){
       d obj = PatchProxy.apply(null, this, e.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MagicEmoji$MagicFace magicFace = this.E();
       if (magicFace != null) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("MagicController", "getMagicData setActivity id: "+this.f2(), objArray);
          if (TextUtils.x(magicFace.getActivityId())) {
             magicFace.setActivityId(this.f2());
          }
          magicFace.mWishMagicInfo = this.d.c(WishMagicInfo.class);
          magicFace.mActivityCount = this.d.c(a.class);
          magicFace.mVoteConfig = this.d.c(VoteConfig.class);
          obj = this.g;
          if (obj != null && obj.D()) {
             i = true;
          }
          magicFace.mHasMusic = i;
       }
       l ol = new l(magicFace, this.k2(), this.r.l(), this.r.g(), p.b().f(this.k2(), magicFace), this.g2());
       return obj;
    }
    public MagicEmojiPageConfig$b i2(){
       Object obj = PatchProxy.apply(null, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.f();
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       super.k(p0);
       this.r.doBindView(p0);
       this.v = p0.findViewById(0x7f0a0612);
       this.w = p0.findViewById(0x7f0a05c0);
       if (this.d.d(c.c).a != null || this.d.d(a.i).d != null) {
          e.d(this.w);
       }
       this.b2(new b(this));
       return;
    }
    public String k2(){
       Object obj = PatchProxy.apply(null, this, e.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "magic"+this.hashCode();
    }
    public boolean l2(EffectDescription p0,MagicEmoji$MagicFace p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!this.n2(p1) && (!q.f(p0.getPopupConfigList()) || c.k.a(p0).f())))? true: false;
       return b;
    }
    public void m2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "20")) {
          return;
       }
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, l.class, "40")) {
          Object[] objArray1 = new Object[0];
          b.D().s("MagicHandler", "hideMagicEmoji: ...", objArray1);
          l g = tr.g;
          if (g != null && g.isAdded()) {
             c childFragmen = tr.p.getChildFragmentManager();
             if (childFragmen != null && !tr.g.isHidden()) {
                e uoe = childFragmen.beginTransaction();
                uoe.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
                uoe.s(tr.g).m();
             }
          }
       }
       return;
    }
    public boolean n2(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0.mExtraParams != null) {
          Boolean uBoolean = b.d.b().get(Integer.valueOf(p0.mExtraParams.mRecordId));
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          }
       }
       return b;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       super.nb(p0);
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(null, tr, l.class, "14")) {
          if (tr.p.isPreviewing()) {
             tr.o(tr.i());
          }
          tr.p.A0(tr);
       }
       return;
    }
    public void o2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "27")) {
          return;
       }
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, l.class, "22") && tr.p.a0()) {
          d.d("postMagicPanelMonitor").n();
          d.d("postMagicPanelMonitor").g("clickToCreate");
          tr.p.g0(true);
       }
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e.class, "18")) {
          return;
       }
       super.onActivityCallback(p0, p1, p2);
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       Object[] objArray1 = new Object[0];
       a.D().w("MagicController", String.format("onActivityResult requestCode:%d resultCode:%d", objArray), objArray1);
       return;
    }
    public boolean onBackPressed(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       super.onBackPressed();
       obj = this.r;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, l.class, "16");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          l g = obj.g;
          if (g != null && g.onBackPressed()) {
             obj.k();
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       super.onDestroy();
       this.r.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.r.unbind();
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       this.r.onEffectHintUpdated(p0);
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       boolean b;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoe = this.r;
       Objects.requireNonNull(uoe);
       if (PatchProxy.isSupport(l.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, uoe, l.class, "15");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
          label_003d :
             b = false;
             if (p1 == null || (!p1.isSystem() || (uoe.l() && !uoe.p.H()))) {
                uoe.k();
                b = true;
             }
          }
       }else {
          goto label_003d ;
       }
       return b;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "5")) {
          return;
       }
       super.onPause();
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, l.class, "10") && tr.i() != null) {
          tr.p.l();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       super.onResume();
       this.r.onResume();
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "3")) {
          return;
       }
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, l.class, "7") && (tr.i() != null && tr.p.B())) {
          tr.p.l();
       }
    label_002f :
       super.onStart();
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       boolean b;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.onTouch(p0, p1);
       obj = this.r;
       Objects.requireNonNull(obj);
       p0 = PatchProxy.applyTwoRefs(p0, p1, obj, l.class, "13");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else if(obj.l() && (!obj.p.H() && !p1.getAction())){
          obj.k();
          b = true;
       }else if(!obj.p.I0()){
          b = false;
       }else {
          obj.p.J0(p1);
          b = obj.p.D0();
       }
       return b;
    }
    public void p2(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "29")) {
          return;
       }
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(p0, tr, l.class, "24") && (p0.b == tr.h && PanelShowEvent.a(tr.p.getActivity(), p0))) {
          PanelShowEvent a = p0.a;
          if (a == null && (PanelShowEvent$PanelType.MAGIC != p0.c && a != null)) {
             p0 = p0.c;
             if (p0 != PanelShowEvent$PanelType.MAGIC && p0 != PanelShowEvent$PanelType.IMMERSE_MODE) {
                tr.k();
             }
          }
       }
    label_0049 :
       return;
    }
    public boolean r2(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r.o(p0);
    }
    public void s2(boolean p0){
       e uoe1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "26")) {
          return;
       }
       MagicEmojiPageConfig$b uob = this.r.f();
       e tv = this.v;
       int i = 0;
       int i1 = (tv != null)? (int)tv.getY(): 0;
       uob.z = i1;
       uoe = this.r;
       Objects.requireNonNull(uoe);
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoe, ol, "38")) {
          if (uoe.p.S()) {
             Object[] objArray = new Object[i];
             b.D().A("MagicHandler", "showMagicEmoji when status of activity or fragment is invalid", objArray);
          }else {
             uoe.n.t = uoe.p.z();
             ol = uoe.n;
             ol.a = p0;
             ol.m = a1.k();
             EffectDescription uEffectDescr = uoe.p.w0();
             int i2 = -314635782;
             String str = "postMagicPanelMonitor";
             if (uoe.g == null) {
                d.d(str).k("cold");
                BaseFragment uBaseFragmen = d.a(i2).if(uoe.n.a(), uEffectDescr, uoe.u, uoe.p.R());
                uoe.g = uBaseFragmen;
                uBaseFragmen.A4(new g0(uoe));
             }else {
                d.d(str).k("warm");
                d.a(i2).bP(uoe.g, uoe.n.a(), uEffectDescr);
                d.d(str).h("clickToCreate");
                d.d(str).c();
             }
             i1 = 0x7f0a29f1;
             uoe.p.getActivity().findViewById(i1).setVisibility(i);
             if (uoe.g.isAdded()) {
                Object[] objArray1 = new Object[i];
                b.D().w("MagicHandler", "show MagicEmoji fragment", objArray1);
                uoe1 = uoe.p.getChildFragmentManager().beginTransaction();
                uoe1.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
                uoe1.E(uoe.g).m();
             }else {
                uoe.b();
                Object[] objArray2 = new Object[i];
                b.D().w("MagicHandler", "add MagicEmoji fragment", objArray2);
                uoe.p.getChildFragmentManager().beginTransaction().u(uoe.g).m();
                uoe1 = uoe.p.getChildFragmentManager().beginTransaction();
                uoe1.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
                l g = uoe.g;
                if (g != null) {
                   try{
                      uoe1.g(i1, g, uoe.i);
                      uoe1.m();
                   }catch(java.lang.IllegalArgumentException e8){
                      PostUtils.x("magic_exception", Log.getStackTraceString(e8));
                      a.D().e("MagicHandler", "magic_exception", e8);
                   }
                }
             }
          }
       }
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       super.w();
       if (this.E() != null) {
          Object[] objArray = new Object[0];
          a.D().w("MagicController", "相机开启时有魔表待恢复", objArray);
          this.x.e(true);
       }
       this.r.w();
       return;
    }
    public void w1(Intent p0){
       AssistantUtils d;
       List list1;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.w1(p0);
       h oh = k.c();
       b uob = 1;
       int i = 0;
       boolean b = (oh == null || oh.c())? true: false;
       e tr = this.r;
       d tc = this.c;
       String str = this.k2();
       Objects.requireNonNull(tr);
       if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), tc, str, p0, tr, l.class, "3")) {
          tr.h = tc;
          tr.i = tc.toString()+"_MagicEmojiFragment";
          MagicEmojiPageConfig$b uob1 = MagicEmojiPageConfig$b.c(str);
          uob1.k(b);
          uob1.j(tc);
          String str1 = (d.a(-831446984).isAvailable())? d.a(-1768785573).AS(p0): "";
          uob1.n(str1);
          uob1.k = tr.j;
          uob1.l(tr.p.X());
          tr.n = uob1;
          if (s6.u() == 3) {
             l n = tr.n;
             if (!PatchProxy.applyVoidTwoRefs(n, p0, tr, l.class, "4") && p0 != null) {
                Serializable serializable = j0.e(p0, "tag_recommend_templates");
                if (serializable instanceof AssistantResponse) {
                   d = AssistantUtils.d;
                   Objects.requireNonNull(d);
                   ArrayList uArrayList = PatchProxy.applyOneRefs(serializable, d, AssistantUtils.class, "24");
                   if (uArrayList != PatchProxyResult.class) {
                   }else {
                      a.p(serializable, "response");
                      Iterator iterator = serializable.getTemplateGroup().iterator();
                      while (true) {
                         List list = null;
                         if (iterator.hasNext()) {
                            list1 = iterator.next();
                            Object obj = (list1.getGroupType() == uob)? 1: null;
                            if (!obj) {
                               continue ;
                            }
                         }else {
                            list1 = list;
                         }
                         if (list1 != null) {
                            list = list1.getTemplates();
                         }
                         uArrayList = new ArrayList();
                         if (list != null) {
                            Iterator iterator1 = list.iterator();
                            while (iterator1.hasNext()) {
                               g og = iterator1.next();
                               if (og instanceof MagicAssistantTemplate) {
                                  MagicEmoji$MagicFace magicFace = og.getMagicFace();
                                  if (magicFace != null) {
                                     uArrayList.add(magicFace);
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                   Object[] objArray = new Object[i];
                   b.D().w("MagicHandler", "initMagicTopFaces", objArray);
                   n.p = uArrayList;
                   p0.removeExtra("tag_recommend_templates");
                }
             }
          }
       }
    label_013d :
       this.r.w1(p0);
       return;
    }
}
