package com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.NumberFormatException;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class MagicBaseConfig extends SimpleMagicFace	// class@001e46
{
    public long mChecksum;
    public int mColumnIndex;
    public List mDependSo;
    public List mFonts;
    public String mGroupId;
    public int mMagicEmojiIndex;
    public PassThroughParams mPassThroughParams;
    public String mResource;
    public CDNUrl[] mResources;
    public int mRowIndex;
    public String mTag;
    public static final long serialVersionUID = 0x1;

    public void MagicBaseConfig(){
       super();
       this.mChecksum = 0;
    }
    public void MagicBaseConfig(String p0){
       super();
       this.mChecksum = 0;
       this.mId = p0;
    }
    public static int getMagicFaceId(MagicBaseConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicBaseConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       try{
          return Integer.parseInt(p0.mId);
       }catch(java.lang.NumberFormatException e3){
          e3.printStackTrace();
          return obj;
       }
    }
    public static boolean same(MagicBaseConfig p0,MagicBaseConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicBaseConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null && p1 == null) {
          return b;
       }
       if (p0 == null || !p0.equals(p1)) {
          b = false;
       }
       return b;
    }
    public MagicBaseConfig clone(){
       Object obj = PatchProxy.apply(null, this, MagicBaseConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public void copyFrom(MagicBaseConfig p0){
       this.mId = p0.mId;
       this.mVersion = p0.mVersion;
       this.mName = p0.mName;
       this.mImage = p0.mImage;
       this.mImages = p0.mImages;
       this.mResource = p0.mResource;
       this.mResources = p0.mResources;
       this.mResourceType = p0.mResourceType;
       this.mPassThroughParams = p0.mPassThroughParams;
       this.mChecksum = p0.mChecksum;
       this.mFonts = p0.mFonts;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicBaseConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof MagicBaseConfig) {
          return b;
       }
       if (!TextUtils.equals(this.mId, p0.mId)) {
          return b;
       }
       if (!TextUtils.isEmpty(this.mChildId) || (TextUtils.isEmpty(p0.mChildId) || TextUtils.equals(this.mChildId, p0.mChildId))) {
          b = true;
       }
       return b;
    }
    public String getUniqueIdentifier(){
       Object obj = PatchProxy.apply(null, this, MagicBaseConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mId+"+"+this.mChecksum;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MagicBaseConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.hashCode();
    }
    public boolean isMagicFace(){
       return false;
    }
    public boolean isMakeup(){
       return false;
    }
    public boolean isNotFullInfo(){
       Object obj = PatchProxy.apply(null, this, MagicBaseConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(this.mName) || !this.mChecksum)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicBaseConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{ "+" id= "+this.mId+" name: "+this.mName+"} ";
    }
}
