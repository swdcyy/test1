package com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider;
import mn9.b;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$magicFaceController$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$magicEmojiPageConfig$2;
import lqc.d;
import raa.c;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import haa.e;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import t5b.a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import ixc.c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import mn9.b$a;
import brd.v;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import brd.t;
import f4b.k;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$b;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$c;
import erd.g;
import crd.b;
import mn9.a;
import dqc.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$a;
import s3b.a;
import z3b.a;
import z3b.f;
import java.lang.Integer;
import brd.g;

public final class EffectMagicDataProvider implements b	// class@000f51
{
    public b a;
    public MagicEmoji$MagicFace b;
    public final p c;
    public final p d;
    public final String e;
    public final c f;
    public final boolean g;

    public void EffectMagicDataProvider(String p0,c p1,boolean p2){
       MagicEmoji$MagicFace magicFace1;
       a.p(p0, "taskId");
       a.p(p1, "workspaceDraft");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.c = s.c(EffectMagicDataProvider$magicFaceController$2.INSTANCE);
       this.d = s.c(new EffectMagicDataProvider$magicEmojiPageConfig$2(this));
       MagicEmoji$MagicFace magicFace = null;
       if (d.a()) {
       }else {
          c uoc = p1.z0();
          if (uoc != null) {
             List list = uoc.z();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      magicFace1 = iterator.next();
                      Object obj = magicFace1;
                      a.o(obj, "it");
                      obj = (obj.getType() == FaceMagicEffect$Type.MAGIC_EMOJI)? 1: null;
                      if (!obj) {
                         continue ;
                      }
                   }else {
                      magicFace1 = magicFace;
                   }
                   if (magicFace1 != null) {
                      FaceMagicEffect$Extra extra = magicFace1.getExtra();
                      if (extra != null) {
                         magicFace = e.b(extra);
                         break ;
                      }
                   }
                }
             }
          }
       }
       this.b = magicFace;
       return;
    }
    public static boolean i(EffectMagicDataProvider p0,MagicEmoji$MagicFace p1,boolean p2,int p3,Object p4){
       boolean b;
       int i = 0;
       if (p3 & 0x02) {
          p2 = false;
       }
       Objects.requireNonNull(p0);
       EffectMagicDataProvider uEffectMagic = EffectMagicDataProvider.class;
       if (PatchProxy.isSupport(uEffectMagic)) {
          p0 = PatchProxy.applyTwoRefs(p1, Boolean.valueOf(p2), p0, uEffectMagic, "5");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          label_005b :
             return b;
          }
       }
       b = (p1 != null)? d.a(0x3bf0d115).Mk(p1): p2;
       Object[] objArray = new Object[i];
       a.D().w("EffectMagicDataProvider", "isNeedDownLoad isHighlight:"+p2+", magicFace:"+p1, objArray);
       goto label_005b ;
    }
    public List a(List p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EffectMagicDataProvider.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       return b$a.f(this, p0, p1);
    }
    public void b(v p0){
       EffectMagicDataProvider uEffectMagic = EffectMagicDataProvider.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uEffectMagic, "3")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("EffectMagicDataProvider", "loadDataList", objArray);
       MagicBusinessId eDIT = MagicBusinessId.EDIT;
       MagicEmojiPageConfig magicEmojiPa = PatchProxy.apply(null, this, uEffectMagic, "2");
       if (magicEmojiPa == PatchProxyResult.class) {
          magicEmojiPa = this.d.getValue();
       }
       this.a = k.b(eDIT, magicEmojiPa).subscribe(new EffectMagicDataProvider$b(this, p0), new EffectMagicDataProvider$c(p0));
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectMagicDataProvider.class, "11")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectMagicDataProvider.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return (EffectMagicDataProvider.i(this, p0.n(), false, 2, null) ^ 0x01);
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EffectMagicDataProvider.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return b$a.b(this, p0, p1);
    }
    public void f(a p0,v p1){
       EffectMagicDataProvider uEffectMagic = EffectMagicDataProvider.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uEffectMagic, "4")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "emitter");
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       if (p0 instanceof c) {
          objectRef.element = p0.n();
       }
       Ref$ObjectRef element = objectRef.element;
       if (element == null || !EffectMagicDataProvider.i(this, element, false, 2, null)) {
          Object[] objArray = new Object[false];
          a.D().w("EffectMagicDataProvider", "loadDataItem return", objArray);
          p1.onNext(Integer.valueOf(100));
          p1.onComplete();
          return;
       }else {
          EffectMagicDataProvider$a uoa = new EffectMagicDataProvider$a(objectRef, p1);
          Object[] objArray1 = new Object[false];
          a.D().w("EffectMagicDataProvider", "download start ", objArray1);
          a uoa1 = PatchProxy.apply(null, this, uEffectMagic, "1");
          if (uoa1 == PatchProxyResult.class) {
             uoa1 = this.c.getValue();
          }
          a.o(uoa1, "magicFaceController");
          f[] uofArray = new f[]{uoa};
          uoa1.H0().h(objectRef.element, uofArray);
          return;
       }
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectMagicDataProvider.class, "7")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EffectMagicDataProvider.class, "8")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, EffectMagicDataProvider.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
