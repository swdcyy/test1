package com.yxcorp.gifshow.entity.QPreInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class QPreInfo implements Serializable	// class@000d74
{
    public boolean mLiveStream;
    public String mPreExpTag;
    public String mPreLLSId;
    public String mPreLiveStreamId;
    public String mPrePhotoId;
    public int mPrePhotoIndex;
    public String mPreUserId;
    public static final long serialVersionUID = 0xea4485ff4927ecf4;

    public void QPreInfo(){
       super();
    }
    public static QPreInfo createPreInfo(String p0,String p1,String p2,String p3,boolean p4,int p5){
       QPreInfo obj;
       if (PatchProxy.isSupport(QPreInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, QPreInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new QPreInfo();
       obj.mPrePhotoId = p0;
       obj.mPreExpTag = p1;
       obj.mPreUserId = p2;
       obj.mPrePhotoIndex = p5;
       obj.mPreLLSId = p3;
       obj.mLiveStream = p4;
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QPreInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QPreInfo{mPreExpTag=\'"+this.mPreExpTag+'''+", mPrePhotoId=\'"+this.mPrePhotoId+'''+", mPreUserId=\'"+this.mPreUserId+'''+", mPrePhotoIndex="+this.mPrePhotoIndex+", mPreLLSId=\'"+this.mPreLLSId+'''+", mLiveStream="+this.mLiveStream+", mPreLiveStreamId=\'"+this.mPreLiveStreamId+'''+'}';
    }
}
