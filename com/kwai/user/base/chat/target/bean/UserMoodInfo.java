package com.kwai.user.base.chat.target.bean.UserMoodInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Long;

public class UserMoodInfo implements Serializable	// class@00197b
{
    public long mCreateTime;
    public ArrayList mIcons;
    public boolean mLiked;
    public String mMoodId;
    public String mMoodText;
    public ArrayList mStaticImage;
    public String mTitle;

    public void UserMoodInfo(){
       super();
       this.mLiked = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserMoodInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mLiked != p0.mLiked || (this.mCreateTime - p0.mCreateTime || (!k.a(this.mStaticImage, p0.mStaticImage) || (!k.a(this.mMoodText, p0.mMoodText) || (!k.a(this.mMoodId, p0.mMoodId) || (!k.a(this.mIcons, p0.mIcons) || !k.a(this.mTitle, p0.mTitle))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, UserMoodInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Boolean.valueOf(this.mLiked),this.mStaticImage,this.mMoodText,this.mMoodId,this.mIcons,this.mTitle,Long.valueOf(this.mCreateTime)};
       return k.b(obj);
    }
}
