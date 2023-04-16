package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.Float;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import g16.a;
import java.lang.StringBuilder;
import q87.c;

public class MakeupMaterial extends MakeupItem	// class@0012fb
{
    public ItemNameStyle mItemNameStyle;
    public Float mUserIntensity;

    public void MakeupMaterial(){
       super();
    }
    public void MakeupMaterial(String p0){
       super(p0);
    }
    public static MakeupMaterial getEmpty(){
       MakeupMaterial obj = PatchProxy.apply(null, null, MakeupMaterial.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MakeupMaterial("-1000");
       obj.mPassThroughParams = new PassThroughParams();
       return obj;
    }
    public static boolean isEmpty(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeupMaterial.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("-1000", p0);
    }
    public void clearUserIntensity(){
       this.mUserIntensity = null;
    }
    public MakeupMaterial clone(){
       Object obj = PatchProxy.apply(null, this, MakeupMaterial.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public MagicBaseConfig clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public float getIntensity(){
       MakeupMaterial obj = PatchProxy.apply(null, this, MakeupMaterial.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mUserIntensity;
       if (obj != null) {
          return obj.floatValue();
       }
       return this.getRecommendIntensity();
    }
    public int getPriority(){
       MagicBaseConfig tmPassThroug = this.mPassThroughParams;
       PassThroughParams mPriority = (tmPassThroug != null)? tmPassThroug.mPriority: 0;
       return mPriority;
    }
    public float getRecommendIntensity(){
       MagicBaseConfig tmPassThroug = this.mPassThroughParams;
       if (tmPassThroug == null) {
          return 0;
       }
       return tmPassThroug.mIntensity;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, MakeupMaterial.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MakeupMaterial.isEmpty(this.mId);
    }
    public boolean needAutoDownload(){
       MagicBaseConfig tmPassThroug = this.mPassThroughParams;
       boolean b = (tmPassThroug != null && tmPassThroug.mAutoDownload != null)? true: false;
       return b;
    }
    public void setUserIntensity(Float p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeupMaterial.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("MakeupMaterial", "setUserIntensity for "+this.mId+" to "+p0, objArray);
       this.mUserIntensity = p0;
       return;
    }
}
