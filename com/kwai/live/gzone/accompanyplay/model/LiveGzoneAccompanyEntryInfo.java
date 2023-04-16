package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyEntryInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import java.lang.Number;

public class LiveGzoneAccompanyEntryInfo implements Serializable	// class@000c2e
{
    public String mAccompanyId;
    public int mAccompanyStatus;
    public long mTime;
    public String mUserEntranceStatusText;
    public LiveGzoneAccompanyUserOrderInfo mUserOrderInfo;

    public void LiveGzoneAccompanyEntryInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyEntryInfo.class, "1");
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
       if (this.mAccompanyStatus != p0.mAccompanyStatus) {
          return false;
       }
       LiveGzoneAccompanyEntryInfo tmAccompanyI = this.mAccompanyId;
       if (tmAccompanyI != null) {
          if (!tmAccompanyI.equals(p0.mAccompanyId)) {
          label_003f :
             return false;
          }
       }else if(p0.mAccompanyId != null){
          goto label_003f ;
       }
       tmAccompanyI = this.mUserEntranceStatusText;
       if (tmAccompanyI != null) {
          if (!tmAccompanyI.equals(p0.mUserEntranceStatusText)) {
          label_0051 :
             return false;
          }
       }else if(p0.mUserEntranceStatusText != null){
          goto label_0051 ;
       }
       tmAccompanyI = this.mUserOrderInfo;
       if (tmAccompanyI != null) {
          b = tmAccompanyI.equals(p0.mUserOrderInfo);
       }else if(p0.mUserOrderInfo == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       LiveGzoneAccompanyEntryInfo obj = PatchProxy.apply(null, this, LiveGzoneAccompanyEntryInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mAccompanyId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGzoneAccompanyEntryInfo tmUserEntran = this.mUserEntranceStatusText;
       int i2 = (tmUserEntran != null)? tmUserEntran.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.mAccompanyStatus) * 31;
       tmUserEntran = this.mUserOrderInfo;
       if (tmUserEntran != null) {
          i = tmUserEntran.hashCode();
       }
       return (i1 + i);
    }
}
