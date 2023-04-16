package com.yxcorp.gifshow.prettify.makeup.MakeupResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import f1c.o1;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.lang.Boolean;
import f1c.n1;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import f1c.l1;
import f1c.m1;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.model.PassThroughParams$PresetPartId;
import xyb.a;
import java.lang.StringBuilder;
import w46.b;
import f1c.j1;
import f1c.k1;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;

public class MakeupResponse implements Serializable	// class@00115f
{
    public int mLiveDefaultId;
    public String mLiveVersionId;
    public List mMakeupGroups;
    public List mMakeupParts;
    public List mMakeupSuites;
    public static final long serialVersionUID = 0xfd40f32fe2b0295e;

    public void MakeupResponse(){
       super();
       this.mLiveDefaultId = -1;
       this.mLiveVersionId = "";
    }
    public List cloneParts(){
       Object[] objArray = null;
       MakeupResponse obj = PatchProxy.apply(objArray, this, MakeupResponse.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMakeupParts;
       if (q.f(obj)) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().clone());
       }
       return uArrayList;
    }
    public List cloneSuites(){
       Object[] objArray = null;
       MakeupResponse obj = PatchProxy.apply(objArray, this, MakeupResponse.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMakeupSuites;
       if (q.f(obj)) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().clone());
       }
       return uArrayList;
    }
    public List getAutoDownloadMaterials(){
       MakeupResponse obj = PatchProxy.apply(null, this, MakeupResponse.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMakeupParts;
       if (q.f(obj)) {
          return new ArrayList();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          List materials = iterator.next().getMaterials();
          if (q.f(materials)) {
             continue ;
          }else {
             Iterator iterator1 = materials.iterator();
             while (iterator1.hasNext()) {
                MakeupMaterial makeupMateri = iterator1.next();
                if (makeupMateri.needAutoDownload()) {
                   uArrayList.add(makeupMateri);
                }else {
                   continue ;
                }
             }
          }
       }
       return uArrayList;
    }
    public List getAutoDownloadSuites(){
       MakeupResponse obj = PatchProxy.apply(null, this, MakeupResponse.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMakeupSuites;
       if (q.f(obj)) {
          return new ArrayList();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          MakeupSuite makeupSuite = iterator.next();
          if (makeupSuite.needAutoDownload()) {
             uArrayList.add(makeupSuite);
          }
       }
       return uArrayList;
    }
    public List getGroupInfos(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, MakeupResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMakeupGroups == null) {
          return objArray;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMakeupGroups.iterator();
       while (iterator.hasNext()) {
          MakeupGroup makeupGroup = iterator.next();
          MakeupGroup$a uoa = new MakeupGroup$a();
          uoa.a = makeupGroup.mGroupId;
          uoa.b = makeupGroup.mGroupName;
          obj.add(uoa);
       }
       return obj;
    }
    public List getParts(){
       return this.mMakeupParts;
    }
    public List getPresetMaterials(MakeupSuite p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SimpleMagicFace obj = PatchProxy.applyOneRefs(p0, this, MakeupResponse.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.mId;
       List list = PatchProxy.applyOneRefs(obj, this, MakeupResponse.class, "11");
       List list1 = null;
       if (list != patchProxyRe) {
       }else {
          MakeupResponse tmMakeupSuit = this.mMakeupSuites;
          list = (q.f(tmMakeupSuit))? list1: y.y(tmMakeupSuit, new o1(obj)).orNull();
       }
       if (list == null) {
          return list1;
       }else {
          List parts = this.getParts();
          if (q.f(parts)) {
             return list1;
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = parts.iterator();
             while (iterator.hasNext()) {
                MakeupPart makeupPart = iterator.next();
                String presetMateri = p0.getPresetMaterialId(makeupPart.mId);
                if (!MakeupMaterial.isEmpty(presetMateri)) {
                   MakeupMaterial material = makeupPart.getMaterial(presetMateri);
                   if (material != null && !material.isEmpty()) {
                      uArrayList.add(material);
                   }
                }
             }
             return uArrayList;
          }
       }
    }
    public void init(boolean p0,boolean p1){
       Iterator iterator1;
       String str1;
       Object[] objArray;
       MakeupResponse tmMakeupSuit;
       if (PatchProxy.isSupport(MakeupResponse.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, MakeupResponse.class, "6")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, MakeupResponse.class, "3")) {
          Iterator iterator2 = this.mMakeupParts.iterator();
          while (iterator2.hasNext()) {
             MakeupPart makeupPart1 = iterator2.next();
             if (makeupPart1 == null || q.f(makeupPart1.mMaterials)) {
                continue ;
             }else {
                y.q(makeupPart1.mMaterials, new n1(this));
                if (q.f(makeupPart1.mMaterials)) {
                }else {
                   makeupPart1.mMaterials.add(i, MakeupMaterial.getEmpty());
                   for (int i3 = 0; i3 < makeupPart1.mMaterials.size(); i3 = i3 + 1) {
                      makeupPart1.mMaterials.get(i3).setPosition(i3);
                   }
                }
             }
          }
       }
       if (!PatchProxy.isSupport(MakeupResponse.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MakeupResponse.class, "4")) {
          y.q(this.mMakeupParts, new l1(this));
          if (p0) {
             this.mMakeupParts.add(i, MakeupPart.getNull());
          }
          for (int i2 = 0; i2 < this.mMakeupParts.size(); i2++) {
             this.mMakeupParts.get(i2).setPosition(i2);
          }
       }
       if (!PatchProxy.isSupport(MakeupResponse.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, MakeupResponse.class, "5")) {
          y.q(this.mMakeupSuites, new m1(this));
          Iterator iterator = this.mMakeupSuites.iterator();
          while (iterator.hasNext()) {
             MakeupSuite makeupSuite = iterator.next();
             if (!PatchProxy.applyVoidOneRefs(makeupSuite, this, MakeupResponse.class, "10") && makeupSuite.isValid()) {
                PassThroughParams mPresetPartI = makeupSuite.mPassThroughParams.mPresetPartIds;
                if (mPresetPartI == null) {
                }else {
                   iterator1 = mPresetPartI.iterator();
                   while (iterator1.hasNext()) {
                      PassThroughParams$PresetPartId presetPartId = iterator1.next();
                      String str = "MakeupResponse";
                      if (!presetPartId.isValid()) {
                         str1 = "-";
                         objArray = new Object[i];
                         a.D().t(str, "MakeupPresetPartInvalid:"+makeupSuite.mId+str1+presetPartId.mPartId+str1+presetPartId.mMaterialId, objArray);
                         iterator1.remove();
                      }else {
                         MakeupPart makeupPart = y.y(this.mMakeupParts, new j1(presetPartId)).orNull();
                         String str2 = " , version: ";
                         str1 = " , id:";
                         if (makeupPart == null) {
                            objArray = new Object[i];
                            a.D().t(str, "SuitePartError[name:"+makeupSuite.mName+str1+makeupSuite.mId+str2+makeupSuite.mVersion+"] check failed... , part ["+presetPartId.mPartId+"]", objArray);
                            iterator1.remove();
                            continue ;
                         }else if(!y.y(makeupPart.mMaterials, new k1(presetPartId)).isPresent()){
                            objArray = new Object[i];
                            a.D().t(str, "SuiteMaterialError[name:"+makeupSuite.mName+str1+makeupSuite.mId+str2+makeupSuite.mVersion+"] check failed... , material ["+presetPartId.mMaterialId+"] is not exist in list.", objArray);
                            iterator1.remove();
                            continue ;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
          if (q.f(this.mMakeupGroups)) {
             this.mMakeupSuites.add(i, MakeupSuite.getEmpty());
             if (p1) {
                this.mMakeupSuites.add(1, RecoSuiteGroup.getRecoGroup());
             }
             tmMakeupSuit = this.mMakeupSuites;
          }else {
             tmMakeupSuit = new ArrayList();
             iterator1 = this.mMakeupGroups.iterator();
             while (iterator1.hasNext()) {
                MakeupGroup makeupGroup = iterator1.next();
                if (p1 && !tmMakeupSuit.size()) {
                   RecoSuiteGroup recoGroup = RecoSuiteGroup.getRecoGroup();
                   recoGroup.setGroupId(makeupGroup.mGroupId);
                   recoGroup.setGroupName(makeupGroup.mGroupName);
                   tmMakeupSuit.add(i, recoGroup);
                }
                tmMakeupSuit.addAll(makeupGroup.getMakeupSuites(this.mMakeupSuites));
                tmMakeupSuit.add(MakeupSuite.getDivider());
             }
          }
          while (i < tmMakeupSuit.size()) {
             int i1 = tmMakeupSuit.size() - 1;
             if (i == i1 && tmMakeupSuit.get(i).isDivider()) {
                tmMakeupSuit.remove(i);
                break ;
             }
             tmMakeupSuit.get(i).setPosition(i);
             i = i + 1;
          }
          this.mMakeupSuites = tmMakeupSuit;
       }
       return;
    }
    public boolean isResponseValid(){
       Object obj = PatchProxy.apply(null, this, MakeupResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (q.f(this.mMakeupSuites) || q.f(this.mMakeupParts))? true: false;
       return b;
    }
}
