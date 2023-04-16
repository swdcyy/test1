package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectMagicSelectAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import dqc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lqc.d;
import nsd.u;
import raa.c;
import com.kuaishou.edit.draft.FaceMagicEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.kuaishou.edit.draft.TimeRange;
import lqc.b;
import eqc.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import k2b.u1;
import java.lang.Number;
import usd.q;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import haa.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import dqc.a;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Double;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import tkd.b;
import tkd.d;
import t5b.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import ixc.c;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import wba.d0;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import haa.e;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams$a;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.google.protobuf.GeneratedMessageLite;
import trd.u;
import com.yxcorp.gifshow.model.FileMd5Info;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5$a;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5;

public final class EffectMagicSelectAction extends EditSdkAction	// class@000f29
{
    public final c advEffect;
    public final double currentTime;
    public final boolean enableHighLight;
    public double finalStart;
    public final double forceDuration;
    public final boolean hasTimeReverse;
    public final c lastEffect;
    public final double totalDuration;

    public void EffectMagicSelectAction(c p0,c p1,double p2,double p3,double p4,boolean p5){
       a.p(p0, "advEffect");
       a.p(p1, "lastEffect");
       super();
       this.advEffect = p0;
       this.lastEffect = p1;
       this.currentTime = p2;
       this.totalDuration = p3;
       this.forceDuration = p4;
       this.hasTimeReverse = p5;
       this.finalStart = p2;
       this.enableHighLight = d.a();
    }
    public void EffectMagicSelectAction(c p0,c p1,double p2,double p3,double p4,boolean p5,int p6,u p7){
       double d = (p6 & 0x10)? 0xbff0000000000000: p4;
       boolean b = (p6 & 0x20)? false: p5;
       super(p0, p1, p2, p3, d, b);
       return;
    }
    public final FaceMagicEffect clearCurrentMagicEmojiEffectIfNeeded(c p0){
       Object obj3;
       int i2;
       Object obj = this;
       Object obj1 = p0;
       List obj2 = PatchProxy.applyOneRefs(obj1, obj, EffectMagicSelectAction.class, "4");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = p0.z();
       a.o(obj2, "draft.messages");
       int i = 0;
       Iterator iterator = obj2.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj3 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj3, "faceMagicEffect");
          if (obj3.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
             TimeRange range = obj3.getRange();
             if (range != null) {
                double d = range.getStart() + range.getDuration();
                i2 = i1;
                if (b.a.a(obj.hasTimeReverse, obj.currentTime, range.getStart(), d, obj.totalDuration)) {
                   break ;
                }else {
                label_006c :
                   i = i2;
                }
             }
          }
          i2 = i1;
          goto label_006c ;
       }
       obj1.V(i);
       return obj3;
    }
    public final FaceMagicEffect clearLastMagicEmojiEffect(c p0){
       a a;
       ClientContent$ContentPackage obj1;
       ClientContent$MagicFacePackage[] magicFacePac1;
       FaceMagicEffect obj = PatchProxy.applyOneRefs(p0, this, EffectMagicSelectAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "draft");
       obj = null;
       a = a.a;
       EffectMagicSelectAction tlastEffect = this.lastEffect;
       Objects.requireNonNull(a);
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(tlastEffect, a, a.class, "9")) {
          a.p(tlastEffect, "effect");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECORD_VIDEO_EDIT_OPERATION";
          uElementPack.name = "unselect_magic_face";
          obj1 = new ClientContent$ContentPackage();
          ClientContent$MagicFaceShowPackage magicFaceSho = new ClientContent$MagicFaceShowPackage();
          ClientContent$MagicFacePackage magicFacePac = a.a(tlastEffect);
          int i3 = 1;
          if (magicFacePac != null) {
             magicFacePac1 = new ClientContent$MagicFacePackage[i3];
             magicFacePac1[i] = magicFacePac;
          }else {
             magicFacePac1 = ClientContent$MagicFacePackage.emptyArray();
          }
          magicFaceSho.magicFacePackage = magicFacePac1;
          obj1.magicFaceShowPackage = magicFaceSho;
          u1.u(i3, uElementPack, obj1);
       }
       List list = p0.z();
       a.o(list, "draft.messages");
       Iterator iterator = list.iterator();
       int i1 = -1;
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          int i2 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj1, "faceMagicEffect");
          if (obj1.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
             i1 = i;
             obj = obj1;
          }
          i = i2;
       }
       if (i1 > -1) {
          p0.V(i1);
       }
       return obj;
    }
    public final double findCurrentEffectEnd(c p0){
       EffectMagicSelectAction obj = PatchProxy.applyOneRefs(p0, this, EffectMagicSelectAction.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "draft");
       obj = this.totalDuration;
       List list = p0.z();
       a.o(list, "draft.messages");
       int i = 0;
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj1, "faceMagicEffect");
          if (obj1.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
             TimeRange range = obj1.getRange();
             if (range != null && range.getStart() - this.currentTime > 0) {
                double d = q.s(obj, range.getStart());
             }
          }
          i = i1;
       }
       return obj;
    }
    public final double findCurrentEffectStart(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectMagicSelectAction.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "draft");
       double d = 0;
       List list = p0.z();
       a.o(list, "draft.messages");
       int i = 0;
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj1, "faceMagicEffect");
          if (obj1.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
             TimeRange range = obj1.getRange();
             if (range != null) {
                double d1 = range.getStart() + range.getDuration();
                if (d1 - this.currentTime < 0) {
                   d1 = range.getStart() + range.getDuration();
                   d = q.l(d, d1);
                }
             }
          }
          i = i1;
       }
       return d;
    }
    public final c getAdvEffect(){
       return this.advEffect;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final boolean getEnableHighLight(){
       return this.enableHighLight;
    }
    public final double getFinalStart(){
       return this.finalStart;
    }
    public final double getForceDuration(){
       return this.forceDuration;
    }
    public final boolean getHasTimeReverse(){
       return this.hasTimeReverse;
    }
    public final c getLastEffect(){
       return this.lastEffect;
    }
    public final double getTotalDuration(){
       return this.totalDuration;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectMagicSelectAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       this.performActionX(p0);
       return;
    }
    public final void performActionX(c p0){
       EffectMagicSelectAction tforceDurati;
       a a;
       SimpleMagicFace mId;
       ArrayList uArrayList;
       int len;
       int i;
       object oobject;
       ArrayList uArrayList1;
       List list;
       List list1;
       String str3;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectMagicSelectAction.class, str)) {
          return;
       }
       p0 = a.k(p0);
       Object[] objArray = new Object[0];
       String str1 = "EffectMagicSelectAction";
       a.D().w(str1, "performActionX advEffect:"+this.advEffect+", lastEffect:"+this.lastEffect+','+"currentTime:"+this.currentTime+", totalDuration:"+this.totalDuration+", forceDuration:"+this.forceDuration+", hasTimeReverse:"+this.hasTimeReverse, objArray);
       FaceMagicEffect uFaceMagicEf = (this.enableHighLight != null)? this.clearCurrentMagicEmojiEffectIfNeeded(p0): this.clearLastMagicEmojiEffect(p0);
       if (this.advEffect.a == null) {
          Object[] objArray1 = new Object[0];
          a.D().w(str1, "performActionX return", objArray1);
          return;
       }else {
          EffectMagicSelectAction uEffectMagic = 0x3fb999999999999a;
          double d = (this.hasTimeReverse != null)? this.findCurrentEffectStart(p0): Math.min(this.currentTime, (this.totalDuration - uEffectMagic));
          if (uFaceMagicEf != null) {
             TimeRange range = uFaceMagicEf.getRange();
             if (range != null && (d - range.getStart() > 0 && d - (range.getStart() + range.getDuration()) < 0)) {
                d = range.getStart();
             }
          }
          if (this.enableHighLight != null) {
             tforceDurati = this.forceDuration;
             if (tforceDurati - (double)0 <= 0) {
                double d1 = (this.hasTimeReverse != null)? Math.max((this.currentTime - d), uEffectMagic): this.findCurrentEffectEnd(p0) - d;
                Integer integer = (this.advEffect.c() > 0)? Integer.valueOf(this.advEffect.c()): Double.valueOf(d1);
                tforceDurati = q.s(d1, integer.doubleValue());
             }
          }else {
             tforceDurati = this.totalDuration - this.currentTime;
          }
          if (this.hasTimeReverse != null) {
             d = Math.max((this.currentTime - tforceDurati), 0);
          }
          if (uFaceMagicEf != null) {
             TimeRange range1 = uFaceMagicEf.getRange();
             if (range1 != null) {
                d = range1.getStart();
                tforceDurati = range1.getDuration();
             }
          }
          this.finalStart = d;
          objArray = new Object[0];
          a.D().w(str1, "performActionX finalStart:"+this.finalStart+", start"+d+", duration:"+tforceDurati, objArray);
          FaceMagicEffect$b uob = p0.b();
          uob.b(DraftUtils.i());
          File uFile = d.a(0x3bf0d115).K00(this.advEffect.n());
          a.o(uFile, "PluginManager.get\(MagicE¡­ile\(advEffect.magicFaces\)");
          uob.a(p0.Q(d0.b(d, tforceDurati, uFile.getPath()).assetDir()));
          TimeRange$b uob1 = TimeRange.newBuilder();
          uob1.b(d);
          uob1.a(tforceDurati);
          uob.d(uob1);
          FeatureId$b uob2 = FeatureId.newBuilder();
          uob2.a(String.valueOf(this.advEffect.a));
          uob.c(uob2);
          a.o(uob, "faceMagicDraft.append\(\)\n¡­dvEffect.mId.toString\(\)\)\)");
          uob.e(FaceMagicEffect$Type.MAGIC_EMOJI);
          if (this.advEffect.n() != null) {
             MagicEmoji$MagicFace magicFace = this.advEffect.n();
             a.m(magicFace);
             GeneratedMessageLite generatedMes = PatchProxy.applyOneRefs(magicFace, null, e.class, str);
             if (generatedMes != PatchProxyResult.class) {
             }else {
                a.p(magicFace, "$this$toFaceMagicEffectExtra");
                FaceMagicEffect$Extra$a uExtra$a = FaceMagicEffect$Extra.newBuilder();
                mId = magicFace.mId;
                String str2 = "";
                if (mId == null) {
                   str3 = str2;
                }
                uExtra$a.copyOnWrite();
                uExtra$a.instance.setId(mId);
                mId = magicFace.mName;
                if (mId == null) {
                   str3 = str2;
                }
                uExtra$a.copyOnWrite();
                uExtra$a.instance.setName(mId);
                uExtra$a.copyOnWrite();
                uExtra$a.instance.setVersion(magicFace.mVersion);
                uExtra$a.copyOnWrite();
                uExtra$a.instance.setResourceType(magicFace.mResourceType);
                mId = magicFace.mImages;
                str1 = "it";
                if (mId != null) {
                   uArrayList = new ArrayList(mId.length);
                   len = mId.length;
                   for (i = 0; i < len; i = i + 1) {
                      oobject = mId[i];
                      a.o(oobject, str1);
                      uArrayList.add(e.c(oobject));
                   }
                }else {
                   list1 = CollectionsKt__CollectionsKt.E();
                }
                uExtra$a.copyOnWrite();
                uExtra$a.instance.addAllImage(uArrayList);
                MagicBaseConfig mTag = magicFace.mTag;
                if (mTag == null) {
                   mTag = str2;
                }
                uExtra$a.copyOnWrite();
                uExtra$a.instance.setTag(mTag);
                uExtra$a.copyOnWrite();
                uExtra$a.instance.setCheckSum(magicFace.mChecksum);
                mTag = magicFace.mResources;
                if (mTag != null) {
                   uArrayList = new ArrayList(mTag.length);
                   len = mTag.length;
                   for (i = 0; i < len; i = i + 1) {
                      oobject = mTag[i];
                      a.o(oobject, str1);
                      uArrayList.add(e.c(oobject));
                   }
                }else {
                   list1 = CollectionsKt__CollectionsKt.E();
                }
                uExtra$a.copyOnWrite();
                uExtra$a.instance.addAllResource(uArrayList);
                FaceMagicEffect$Extra$PassThroughParams$a uExtra$PassT = FaceMagicEffect$Extra$PassThroughParams.newBuilder();
                MagicBaseConfig mPassThrough = magicFace.mPassThroughParams;
                if (mPassThrough != null) {
                   PassThroughParams mYModels = mPassThrough.mYModels;
                   if (mYModels != null) {
                   label_0293 :
                      uExtra$PassT.copyOnWrite();
                      uExtra$PassT.instance.addAllYModel(mYModels);
                      mPassThrough = magicFace.mDependSo;
                      if (mPassThrough == null) {
                         list = CollectionsKt__CollectionsKt.E();
                      }
                      uExtra$PassT.copyOnWrite();
                      uExtra$PassT.instance.addAllSharedObject(mPassThrough);
                      uExtra$a.copyOnWrite();
                      uExtra$a.instance.setPassThroughParams(uExtra$PassT.build());
                      MagicEmoji$MagicFace mTopic = magicFace.mTopic;
                      if (mTopic == null) {
                         mTopic = str2;
                      }
                      uExtra$a.copyOnWrite();
                      uExtra$a.instance.setTopic(mTopic);
                      magicFace = magicFace.mFileMd5CheckList;
                      if (magicFace != null) {
                         uArrayList1 = new ArrayList(u.Y(magicFace, 10));
                         Iterator iterator = magicFace.iterator();
                         while (iterator.hasNext()) {
                            FileMd5Info uFileMd5Info = iterator.next();
                            FaceMagicEffect$Extra$CheckMd5$a uExtra$Check = FaceMagicEffect$Extra$CheckMd5.newBuilder();
                            FileMd5Info mFileName = uFileMd5Info.mFileName;
                            if (mFileName == null) {
                               mFileName = str2;
                            }
                            uExtra$Check.copyOnWrite();
                            uExtra$Check.instance.setFile(mFileName);
                            uFileMd5Info = uFileMd5Info.mMd5;
                            if (uFileMd5Info == null) {
                               str1 = str2;
                            }
                            uExtra$Check.copyOnWrite();
                            uExtra$Check.instance.setMd5(uFileMd5Info);
                            uArrayList1.add(uExtra$Check.build());
                         }
                      }else {
                         uArrayList1 = CollectionsKt__CollectionsKt.E();
                      }
                      uExtra$a.copyOnWrite();
                      uExtra$a.instance.addAllCheckMd5(uArrayList1);
                      GeneratedMessageLite generatedMes1 = uExtra$a.build();
                      a.o(generatedMes1, "FaceMagicEffect.Extra.ne¡­emptyList\(\)\)\n    .build\(\)");
                      generatedMes = generatedMes1;
                   }
                }
                list = CollectionsKt__CollectionsKt.E();
                goto label_0293 ;
             }
             uob.copyOnWrite();
             uob.instance.setExtra(generatedMes);
          }
          a = a.a;
          EffectMagicSelectAction tadvEffect = this.advEffect;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(tadvEffect, a, a.class, "8")) {
             a.p(tadvEffect, "effect");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RECORD_VIDEO_EDIT_OPERATION";
             uElementPack.name = "select_magic_face";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$MagicFaceShowPackage magicFaceSho = new ClientContent$MagicFaceShowPackage();
             ClientContent$MagicFacePackage magicFacePac = a.a(tadvEffect);
             ClientContent$MagicFacePackage[] magicFacePac1 = (magicFacePac != null)? new ClientContent$MagicFacePackage[]{magicFacePac}: ClientContent$MagicFacePackage.emptyArray();
             magicFaceSho.magicFacePackage = magicFacePac1;
             uContentPack.magicFaceShowPackage = magicFaceSho;
             u1.u(1, uElementPack, uContentPack);
          }
          return;
       }
    }
    public final void setFinalStart(double p0){
       this.finalStart = p0;
    }
}
