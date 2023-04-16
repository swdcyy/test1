package com.yxcorp.gifshow.model.SimpleMagicFace;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class SimpleMagicFace implements Serializable, Cloneable	// class@001e91
{
    public String mChildId;
    public List mHdImageUrls;
    public String mId;
    public String mImage;
    public CDNUrl[] mImages;
    public boolean mIsOffline;
    public String mName;
    public int mResourceType;
    public String mUnSupportReason;
    public long mUseTime;
    public int mVersion;
    public long magicFacePlayCount;
    public static final long serialVersionUID = 0x1;

    public void SimpleMagicFace(){
       super();
    }
    public static SimpleMagicFace transformMagicFace(MagicEmoji$MagicFace p0){
       SimpleMagicFace obj = PatchProxy.applyOneRefs(p0, null, SimpleMagicFace.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SimpleMagicFace();
       obj.mId = p0.mId;
       obj.mChildId = p0.mChildId;
       obj.mName = p0.mName;
       obj.mImages = p0.mImages;
       obj.mImage = p0.mImage;
       obj.mVersion = p0.mVersion;
       obj.mIsOffline = p0.mIsOffline;
       obj.mResourceType = p0.mResourceType;
       obj.magicFacePlayCount = p0.magicFacePlayCount;
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleMagicFace.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.equals(p0);
       if (!b) {
          b = (p0 instanceof SimpleMagicFace && TextUtils.n(p0.mId, this.mId))? true: false;
       }
    label_002e :
       return b;
    }
    public MagicEmoji$MagicFace toMagicFace(){
       MagicEmoji$MagicFace obj = PatchProxy.apply(null, this, SimpleMagicFace.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MagicEmoji$MagicFace();
       obj.mId = this.mId;
       obj.mChildId = this.mChildId;
       obj.mName = this.mName;
       obj.mImages = this.mImages;
       obj.mImage = this.mImage;
       obj.mVersion = this.mVersion;
       obj.mIsOffline = this.mIsOffline;
       obj.mResourceType = this.mResourceType;
       obj.magicFacePlayCount = this.magicFacePlayCount;
       return obj;
    }
}
