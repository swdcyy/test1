package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import java.util.ArrayList;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Number;
import java.lang.Float;
import java.util.Collection;
import ekd.q;
import m16.k;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.PassThroughParams$PresetPartId;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import g16.a;
import q87.c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Boolean;
import m16.l;
import java.util.Map;

public class MakeupSuite extends MakeupItem	// class@0012ff
{
    public boolean c;
    public int mGroupId;
    public String mGroupName;
    public ItemNameStyle mItemNameStyle;
    public List mParts;
    public MakeupPart mSelectedPart;
    public float mSuiteIntensity;
    public Float mUserIntensity;

    public void MakeupSuite(){
       super();
       this.mParts = new ArrayList();
       this.mSelectedPart = MakeupPart.getPreset();
       this.mGroupId = 0;
    }
    public void MakeupSuite(String p0){
       super(p0);
       this.mParts = new ArrayList();
       this.mSelectedPart = MakeupPart.getPreset();
       this.mGroupId = 0;
    }
    public static MakeupSuite getDivider(){
       MakeupSuite obj = PatchProxy.apply(null, null, MakeupSuite.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MakeupSuite("-11");
       obj.mPassThroughParams = new PassThroughParams();
       return obj;
    }
    public static MakeupSuite getEmpty(){
       MakeupSuite obj = PatchProxy.apply(null, null, MakeupSuite.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MakeupSuite("-10");
       obj.mPassThroughParams = new PassThroughParams();
       return obj;
    }
    public MakeupSuite clone(){
       MakeupSuite obj = PatchProxy.apply(null, this, MakeupSuite.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       if (obj != null) {
          obj.c = this.c;
       }
       return obj;
    }
    public MagicBaseConfig clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public int getGroupId(){
       return this.mGroupId;
    }
    public String getGroupName(){
       return this.mGroupName;
    }
    public float getIntensity(){
       MakeupSuite obj = PatchProxy.apply(null, this, MakeupSuite.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mUserIntensity;
       if (obj != null) {
          return obj.floatValue();
       }
       return this.getRecommendIntensity();
    }
    public MakeupPart getPart(String p0){
       MakeupSuite obj = PatchProxy.applyOneRefs(p0, this, MakeupSuite.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mParts;
       if (q.f(obj)) {
          return null;
       }
       return y.y(obj, new k(p0)).orNull();
    }
    public List getParts(){
       return this.mParts;
    }
    public String getPresetMaterialId(String p0){
       PassThroughParams$PresetPartId presetPartId;
       PassThroughParams obj = PatchProxy.applyOneRefs(p0, this, MakeupSuite.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPassThroughParams.mPresetPartIds;
       if (obj == null) {
          return "-1000";
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return "-1000";
          }
          presetPartId = iterator.next();
          if (TextUtils.n(presetPartId.mPartId, p0)) {
             break ;
          }
       }
       return presetPartId.mMaterialId;
    }
    public float getRecommendIntensity(){
       return this.mSuiteIntensity;
    }
    public List getSelectedMaterials(){
       ArrayList obj = PatchProxy.apply(null, this, MakeupSuite.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       MakeupSuite tmParts = this.mParts;
       int i = 0;
       if (q.f(tmParts)) {
          Object[] objArray = new Object[i];
          a.C().A("MakeupSuite", "do not call select part before set parts", objArray);
          return obj;
       }else {
          Iterator iterator = tmParts.iterator();
          while (iterator.hasNext()) {
             MakeupPart makeupPart = iterator.next();
             MakeupMaterial selectMateri = makeupPart.getSelectMaterial();
             if (!selectMateri.isEmpty()) {
                Object[] objArray1 = new Object[i];
                a.C().s("MakeupSuite", "got selected material "+selectMateri.mId+" for "+makeupPart.mId, objArray1);
                obj.add(selectMateri);
             }
          }
          return obj;
       }
    }
    public MakeupPart getSelectedPart(){
       return this.mSelectedPart;
    }
    public boolean inPresetState(boolean p0){
       MakeupPart obj;
       Object[] objArray;
       MakeupPart makeupPart;
       Object[] objArray1;
       if (PatchProxy.isSupport(MakeupSuite.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, MakeupSuite.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getSelectedPart();
       boolean b = true;
       if (obj.isPreset() && p0) {
          objArray = new Object[0];
          a.C().s("MakeupSuite", "in PresetState for preset and ignore", objArray);
          return b;
       }else if(obj.isNull()){
          objArray = new Object[0];
          a.C().s("MakeupSuite", "in PresetState for null", objArray);
          return b;
       }else {
          MakeupSuite tmParts = this.mParts;
          if (q.f(tmParts)) {
             objArray = new Object[0];
             a.C().A("MakeupSuite", "cannot just state before set parts", objArray);
             return b;
          }else {
             Iterator iterator = tmParts.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   makeupPart = iterator.next();
                   if (!this.partInPresetState(makeupPart, p0)) {
                      break ;
                   }
                }else {
                   objArray1 = new Object[0];
                   a.C().s("MakeupSuite", "in PresetState for "+this.mId, objArray1);
                   return b;
                }
             }
             objArray1 = new Object[0];
             a.C().s("MakeupSuite", "not in PresetState for "+this.mId+"£¬ part "+makeupPart.mId, objArray1);
             return 0;
          }
       }
    }
    public boolean isDivider(){
       Object obj = PatchProxy.apply(null, this, MakeupSuite.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.mId, "-11");
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, MakeupSuite.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("-10", this.mId);
    }
    public boolean isReco(){
       return this.c;
    }
    public boolean needAutoDownload(){
       MagicBaseConfig tmPassThroug = this.mPassThroughParams;
       boolean b = (tmPassThroug != null && tmPassThroug.mAutoDownload != null)? true: false;
       return b;
    }
    public boolean partInPresetState(MakeupPart p0,boolean p1){
       Object[] obj;
       if (PatchProxy.isSupport(MakeupSuite.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, MakeupSuite.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0.isNull() || p0.isPreset()) {
          Object[] objArray = new Object[0];
          a.C().s("MakeupSuite", "part in PresetState for null or preset", objArray);
          return b;
       }else {
          MakeupMaterial selectMateri = p0.getSelectMaterial();
          if (!TextUtils.n(this.getPresetMaterialId(p0.mId), selectMateri.mId)) {
             obj = new Object[0];
             a.C().s("MakeupSuite", "part not in PresetState for "+p0.mId, obj);
             return 0;
          }else if(p1){
             obj = new Object[0];
             a.C().s("MakeupSuite", "part in PresetState for "+p0.mId+", and ignore", obj);
             return b;
          }else if(!Float.compare(selectMateri.getRecommendIntensity(), selectMateri.getIntensity())){
             b = false;
          }
          return b;
       }
    }
    public void setGroupId(int p0){
       this.mGroupId = p0;
    }
    public void setGroupName(String p0){
       this.mGroupName = p0;
    }
    public void setIntensity(Float p0){
       this.mUserIntensity = p0;
    }
    public void setIsReco(boolean p0){
       this.c = p0;
    }
    public void setPartToPreset(boolean p0){
       if (PatchProxy.isSupport(MakeupSuite.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MakeupSuite.class, "7")) {
          return;
       }
       MakeupSuite tmParts = this.mParts;
       if (q.f(tmParts)) {
          Object[] objArray = new Object[0];
          a.C().A("MakeupSuite", "do not call 2Preset before set parts", objArray);
          return;
       }else {
          Iterator iterator = tmParts.iterator();
          while (iterator.hasNext()) {
             MakeupPart makeupPart = iterator.next();
             MakeupMaterial material = makeupPart.getMaterial(this.getPresetMaterialId(makeupPart.mId));
             if (material == null) {
                material = MakeupMaterial.getEmpty();
             }
             makeupPart.setSelectMaterial(material);
             makeupPart.setMaterialToPreset();
             if (p0 && !material.isEmpty()) {
                float f = this.getIntensity() * material.getRecommendIntensity();
                material.setUserIntensity(Float.valueOf(f));
             }
          }
          return;
       }
    }
    public void setParts(List p0){
       this.mParts = p0;
    }
    public void setSelectedPart(MakeupPart p0){
       this.mSelectedPart = p0;
    }
    public void setSelectedPart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeupSuite.class, "9")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       MakeupSuite tmParts = this.mParts;
       int i = 0;
       if (q.f(tmParts)) {
          Object[] objArray = new Object[i];
          a.C().A("MakeupSuite", "do not call select part before set parts", objArray);
          return;
       }else {
          MakeupPart makeupPart = y.y(tmParts, new l(p0)).orNull();
          if (makeupPart == null) {
             Object[] objArray1 = new Object[i];
             a.C().w("MakeupSuite", "user select part not exist. "+p0, objArray1);
             return;
          }else {
             Object[] objArray2 = new Object[i];
             a.C().s("MakeupSuite", "set selected part "+p0+" for "+this.mId, objArray2);
             this.mSelectedPart = makeupPart;
             return;
          }
       }
    }
    public void updatePartsSelectedMaterial(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeupSuite.class, "8")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          MakeupSuite tmParts = this.mParts;
          if (q.f(tmParts)) {
             Object[] objArray = new Object[0];
             a.C().A("MakeupSuite", "do not call update before set parts", objArray);
             return;
          }else {
             Iterator iterator = tmParts.iterator();
             while (iterator.hasNext()) {
                MakeupPart makeupPart = iterator.next();
                String str = p0.get(makeupPart.mId);
                if (str == null) {
                   str = "-1000";
                }
                MakeupMaterial material = makeupPart.getMaterial(str);
                if (material != null) {
                   makeupPart.setSelectMaterial(material);
                }
             }
          }
       }
       return;
    }
}
