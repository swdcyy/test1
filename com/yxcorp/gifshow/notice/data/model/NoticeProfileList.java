package com.yxcorp.gifshow.notice.data.model.NoticeProfileList;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;
import java.lang.StringBuilder;

public class NoticeProfileList implements Serializable	// class@00218b
{
    public QUserContactName mContactName;
    public int mCount;
    public String mDecodedContactName;
    public int mPeriodDays;
    public int mRelationType;
    public String mThirdPlatformName;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0xcfa5f7766fb5d47b;

    public void NoticeProfileList(){
       super();
       this.mDecodedContactName = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeProfileList.class, "1");
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
       if (this.mCount != p0.mCount || (this.mPeriodDays != p0.mPeriodDays || (this.mRelationType != p0.mRelationType || (!k.a(this.mThirdPlatformName, p0.mThirdPlatformName) || (!k.a(this.mUserInfo, p0.mUserInfo) || (!k.a(this.mContactName, p0.mContactName) || !k.a(this.mDecodedContactName, p0.mDecodedContactName))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, NoticeProfileList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mCount),Integer.valueOf(this.mPeriodDays),Integer.valueOf(this.mRelationType),this.mThirdPlatformName,this.mUserInfo,this.mContactName,this.mDecodedContactName};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NoticeProfileList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoticeProfileList{mCount="+this.mCount+", mPeriodDays="+this.mPeriodDays+", mRelationType="+this.mRelationType+", mThirdPlatformName=\'"+this.mThirdPlatformName+'''+", mUserInfo="+this.mUserInfo+", mContactName="+this.mContactName+", mDecodedContactName=\'"+this.mDecodedContactName+'''+'}';
    }
}
