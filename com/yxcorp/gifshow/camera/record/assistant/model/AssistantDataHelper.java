package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import ac9.j;
import com.yxcorp.gifshow.camera.record.intelligentidentify.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$sdkDetectSubject$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$sdkDetectListener$2;
import java.util.List;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$h;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$i;
import erd.o;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import e4b.a;
import e4b.c;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$c;
import sd9.c;
import sd9.c$a;
import java.util.Objects;
import java.util.ArrayList;
import boc.e;
import java.util.Iterator;
import java.lang.Iterable;
import boc.b;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$d;
import erd.r;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$e;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$f;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$g;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k;
import io.reactivex.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$l;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroup;
import tkd.b;
import tkd.d;
import t5b.a;
import ixc.c;
import g26.d;
import ac9.g;
import java.util.Collection;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import w3b.l;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.o5;
import o4b.a0;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import io.reactivex.subjects.PublishSubject;
import android.app.Activity;
import msd.l;
import qrd.l1;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$j;

public final class AssistantDataHelper implements j	// class@001d09
{
    public Activity a;
    public Runnable b;
    public l c;
    public boolean d;
    public final p e;
    public final p f;
    public final b g;

    public void AssistantDataHelper(b p0){
       a.p(p0, "sdkHelper");
       super();
       this.g = p0;
       this.e = s.c(AssistantDataHelper$sdkDetectSubject$2.INSTANCE);
       this.f = s.c(new AssistantDataHelper$sdkDetectListener$2(this));
    }
    public void A(boolean p0){
       this.d = p0;
    }
    public t B(String p0,String p1,List p2,boolean p3){
       if (PatchProxy.isSupport(AssistantDataHelper.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, AssistantDataHelper.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activityId");
       a.p(p1, "pCursor");
       AssistantDataHelper$i oi = new AssistantDataHelper$i(this, p0, p1, p2, p3);
       t ot = t.fromCallable(AssistantDataHelper$h.b).subscribeOn(d.c).flatMap(v7);
       a.o(ot, "Observable.fromCallable ¡­n = 0\n          }\n      }");
       return ot;
    }
    public t C(MagicEmoji$MagicFace p0,boolean p1){
       AssistantDataHelper uAssistantDa = AssistantDataHelper.class;
       if (PatchProxy.isSupport(uAssistantDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uAssistantDa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = t.just(p0).flatMap(new AssistantDataHelper$a(p1, c.a())).map(AssistantDataHelper$b.b).onErrorReturn(AssistantDataHelper$c.b);
       a.o(ot, "Observable.just\(magic\)\n ¡­ .onErrorReturn { false }");
       return ot;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, AssistantDataHelper.class, "4")) {
          return;
       }
       c uoc = this.g.b();
       c$a uoa = this.b();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(uoa, uoc, c.class, "2") && !uoc.c.contains(uoa)) {
          uoc.c.add(uoa);
       }
       this.g.a(true);
       return;
    }
    public List E(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AssistantDataHelper uAssistantDa = AssistantDataHelper.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, uAssistantDa, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.d != null) {
          return new ArrayList();
       }
       obj = new ArrayList();
       ArrayList uArrayList = PatchProxy.apply(objArray, this, uAssistantDa, "17");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(e.A);
          uArrayList.add(e.l);
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!uob.f()) {
             obj.add(uob);
          }
       }
       return obj;
    }
    public t F(Music p0,boolean p1){
       AssistantDataHelper uAssistantDa = AssistantDataHelper.class;
       if (PatchProxy.isSupport(uAssistantDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uAssistantDa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = t.just(p0).filter(AssistantDataHelper$d.b).flatMap(new AssistantDataHelper$e(p1)).map(AssistantDataHelper$f.b).onErrorReturn(AssistantDataHelper$g.b);
       a.o(ot, "Observable.just\(currentM¡­ .onErrorReturn { false }");
       return ot;
    }
    public boolean G(){
       return this.d;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, AssistantDataHelper.class, "5")) {
          return;
       }
       c uoc = this.g.b();
       c$a uoa = this.b();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(uoa, uoc, c.class, "3")) {
          uoc.c.remove(uoa);
       }
       this.g.a(false);
       return;
    }
    public t I(String p0,int p1){
       AssistantDataHelper uAssistantDa = AssistantDataHelper.class;
       if (PatchProxy.isSupport(uAssistantDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAssistantDa, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "taskId");
       t ot = t.create(new AssistantDataHelper$k(this, this.g.b())).flatMap(new AssistantDataHelper$l(this, p0, p1));
       a.o(ot, "Observable.create\(Observ¡­skId, functionType\)\n    }");
       return ot;
    }
    public final ArrayList a(AssistantResponse p0,boolean p1){
       ArrayList obj;
       boolean b;
       if (PatchProxy.isSupport(AssistantDataHelper.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, AssistantDataHelper.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "response");
       obj = new ArrayList();
       Iterator iterator = p0.getTemplateGroup().iterator();
       int i = 1;
       while (iterator.hasNext()) {
          AssistantTemplateGroup uAssistantTe = iterator.next();
          if (uAssistantTe.getTemplates().isEmpty()) {
             continue ;
          }else if(uAssistantTe.getGroupType() == i){
             b uob = d.a(0x3bf0d115);
             a.o(uob, "PluginManager.get\(MagicEmojiPlugin::class.java\)");
             if (!uob.XQ()) {
                continue ;
             }
          }
          if (uAssistantTe.getGroupType() == 2 && !d.b()) {
          }else {
             Iterator iterator1 = uAssistantTe.getTemplates().iterator();
             while (iterator1.hasNext()) {
                iterator1.next().setRecognitionType(uAssistantTe.getRecognitionType());
             }
             obj.addAll(uAssistantTe.getTemplates());
          }
       }
       ArrayList uArrayList = new ArrayList();
       g og = null;
       List magicFaceCol = p0.getMagicFaceCollectionList();
       List musicCollect = p0.getMusicCollectionList();
       Iterator iterator2 = obj.iterator();
       while (iterator2.hasNext()) {
          g og1 = iterator2.next();
          if ((v8 = og1 instanceof MagicAssistantTemplate) && !l.q(og1.getMagicFace())) {
             continue ;
          }else if(og1 instanceof KSAssistantTemplate){
             g og2 = og1;
             Object obj1 = PatchProxy.applyOneRefs(og2, this, AssistantDataHelper.class, "15");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                KSTemplateDetailInfo kuaishan = og2.getKuaishan();
                b = (kuaishan != null && (!q.f(kuaishan.mCoverUrls) && (!q.f(kuaishan.mDemoUrls) && (TextUtils.x(kuaishan.mName) || TextUtils.x(kuaishan.mTemplateId)))))? false: true;
             }
             if (!b) {
                continue ;
             }
          }
          if (v8 && magicFaceCol.contains(Integer.valueOf(o5.b(og1.getTemplateId(), 0)))) {
             g og3 = og1;
             og3.setCollection(i);
             MagicEmoji$MagicFace magicFace = og3.getMagicFace();
             a.m(magicFace);
             a0.f().b(magicFace.mId, i);
          }
          if (og1 instanceof MusicAssistantTemplate && musicCollect.contains(og1.getTemplateId())) {
             og1.setCollection(i);
          }
          uArrayList.add(og1);
          if (p1 && (og == null || (og.getType() != og1.getType() && og != null))) {
             og.setPartitionItem(i);
          }
          og = og1;
       }
       return uArrayList;
    }
    public final c$a b(){
       Object obj = PatchProxy.apply(null, this, AssistantDataHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final PublishSubject c(){
       Object obj = PatchProxy.apply(null, this, AssistantDataHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final b d(){
       return this.g;
    }
    public final void e(Activity p0){
       this.a = p0;
    }
    public final void f(l p0){
       this.c = p0;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantDataHelper.class, "7")) {
          return;
       }
       a.p(p0, "content");
       AssistantDataHelper tc = this.c;
       if (tc != null) {
          tc.invoke(p0);
       }
       return;
    }
    public Activity getActivity(){
       return this.a;
    }
    public final void h(Runnable p0){
       this.b = p0;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, AssistantDataHelper.class, "6")) {
          return;
       }
       AssistantDataHelper tb = this.b;
       if (tb != null) {
          tb.run();
       }
       return;
    }
    public t z(){
       t obj = PatchProxy.apply(null, this, AssistantDataHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c().flatMap(new AssistantDataHelper$j(this));
       a.o(obj, "sdkDetectSubject.flatMap¡­currentCategoryDesc\n    }");
       return obj;
    }
}
