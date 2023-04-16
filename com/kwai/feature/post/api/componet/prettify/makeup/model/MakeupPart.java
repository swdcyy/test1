package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import g16.a;
import java.lang.StringBuilder;
import q87.c;
import m16.f;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public class MakeupPart implements Serializable, Cloneable	// class@0012fd
{
    public int b;
    public String mId;
    public CDNUrl[] mImageUrls;
    public ItemNameStyle mItemNameStyle;
    public List mMaterials;
    public String mName;
    public CDNUrl[] mSelectedImageUrls;
    public MakeupMaterial mSelectedMaterial;
    public static final long serialVersionUID = 0x39153097dd8ea078;

    public void MakeupPart(){
       super();
       this.mSelectedMaterial = MakeupMaterial.getEmpty();
    }
    public static MakeupPart getNull(){
       MakeupPart obj = PatchProxy.apply(null, null, MakeupPart.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MakeupPart();
       obj.mId = "-10000";
       return obj;
    }
    public static MakeupPart getPreset(){
       MakeupPart obj = PatchProxy.apply(null, null, MakeupPart.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MakeupPart();
       obj.mId = "-100";
       return obj;
    }
    public MakeupPart clone(){
       MakeupPart obj = PatchProxy.apply(null, this, MakeupPart.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          if (q.f(obj.mMaterials)) {
             return obj;
          }
          obj.mMaterials = new ArrayList();
          Iterator iterator = this.mMaterials.iterator();
          while (iterator.hasNext()) {
             obj.mMaterials.add(iterator.next().clone());
          }
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public MakeupMaterial getMaterial(String p0){
       MakeupPart obj = PatchProxy.applyOneRefs(p0, this, MakeupPart.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMaterials;
       if (!q.f(obj)) {
          return y.y(obj, new f(p0)).orNull();
       }
       Object[] objArray = new Object[0];
       a.C().A("MakeupPart", "no materials in "+this.mId, objArray);
       return null;
    }
    public List getMaterials(){
       return this.mMaterials;
    }
    public int getPosition(){
       return this.b;
    }
    public MakeupMaterial getSelectMaterial(){
       return this.mSelectedMaterial;
    }
    public boolean isNull(){
       Object obj = PatchProxy.apply(null, this, MakeupPart.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("-10000", this.mId);
    }
    public boolean isPreset(){
       Object obj = PatchProxy.apply(null, this, MakeupPart.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("-100", this.mId);
    }
    public void setMaterialToPreset(){
       if (PatchProxy.applyVoid(null, this, MakeupPart.class, "8")) {
          return;
       }
       MakeupPart tmMaterials = this.mMaterials;
       if (q.f(tmMaterials)) {
          return;
       }
       Iterator iterator = tmMaterials.iterator();
       while (iterator.hasNext()) {
          iterator.next().clearUserIntensity();
       }
       return;
    }
    public void setPosition(int p0){
       this.b = p0;
    }
    public void setSelectMaterial(MakeupMaterial p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeupPart.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("MakeupPart", "set selected material "+p0.mId+" for "+this.mId, objArray);
       this.mSelectedMaterial = p0;
       return;
    }
}
