package com.kwai.video.wayne.player.PlayerIndexInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

public final class PlayerIndexInfo	// class@000caa
{
    public int mActiveRetryCount;
    public String mDebugIndexDetail;
    public String mDestroyIndexDetail;
    public int mPassiveRetryCount;
    public int mRetryCount;
    public int mTotalCount;

    public void PlayerIndexInfo(){
       super();
       this.mDestroyIndexDetail = "";
       this.mDebugIndexDetail = "";
    }
    public final void addReleasePlayer(int p0,long p1,String p2,String p3){
       PlayerIndexInfo playerIndexI = this;
       long l = p1;
       String obj = p2;
       Object obj1 = p3;
       if (PatchProxy.isSupport(PlayerIndexInfo.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, p3, this, PlayerIndexInfo.class, "3")) {
          return;
       }
       a.p(obj, "type");
       a.p(obj1, "error");
       int i = 1;
       playerIndexI.mTotalCount = playerIndexI.mTotalCount + i;
       String str = "Error";
       if (a.g(obj, "Release") ^ i) {
          playerIndexI.mRetryCount = playerIndexI.mRetryCount + i;
          playerIndexI.mActiveRetryCount = (a.g(obj, str))? playerIndexI.mActiveRetryCount + i: playerIndexI.mPassiveRetryCount + i;
       }
    label_005a :
       String str1 = (p3.length() > 0)? 1: null;
       String str2 = "";
       str1 = (str1)? '_'+obj1: str2;
       PlayerIndexInfo playerIndexI1 = (playerIndexI.mDestroyIndexDetail.length() > 0)? 1: null;
       if (playerIndexI1) {
          playerIndexI.mDestroyIndexDetail = playerIndexI.mDestroyIndexDetail+",";
       }
       playerIndexI.mDestroyIndexDetail = playerIndexI.mDestroyIndexDetail+'['+p0+"_"+l+"_"+obj+str1+']';
       if (playerIndexI.mTotalCount <= 7) {
          str1 = '|'+obj;
          if (a.g(obj, str)) {
             str1 = (p3.length() > 0)? 1: null;
             if (str1) {
                obj = "|";
                String[] stringArray = new String[]{obj};
                if (StringsKt__StringsKt.H4(p3, stringArray, false, 0, 6, null).size() == 2) {
                   stringArray = new String[]{obj};
                   if (a.g("0", StringsKt__StringsKt.H4(p3, stringArray, false, 0, 6, null).get(i))) {
                      stringArray = new String[]{obj};
                      str1 = obj+StringsKt__StringsKt.H4(p3, stringArray, false, 0, 6, 0).get(0);
                   }else {
                      stringArray = new String[]{obj};
                      str1 = obj+StringsKt__StringsKt.H4(p3, stringArray, false, 0, 6, 0).get(i);
                   }
                }
             }
             str1 = str2;
          }else {
             str2 = str1;
             str1 = str2;
          }
          if (playerIndexI.mDebugIndexDetail.length()) {
             i = 0;
          }
          if (i) {
             playerIndexI.mDebugIndexDetail = playerIndexI.mDebugIndexDetail+"player: ";
          }
          playerIndexI.mDebugIndexDetail = playerIndexI.mDebugIndexDetail+'['+l+str2+str1+']';
       }
       return;
    }
    public final int getMActiveRetryCount(){
       return this.mActiveRetryCount;
    }
    public final String getMDebugIndexDetail(){
       return this.mDebugIndexDetail;
    }
    public final String getMDestroyIndexDetail(){
       return this.mDestroyIndexDetail;
    }
    public final int getMPassiveRetryCount(){
       return this.mPassiveRetryCount;
    }
    public final int getMRetryCount(){
       return this.mRetryCount;
    }
    public final int getMTotalCount(){
       return this.mTotalCount;
    }
    public final void setMActiveRetryCount(int p0){
       this.mActiveRetryCount = p0;
    }
    public final void setMDebugIndexDetail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerIndexInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mDebugIndexDetail = p0;
       return;
    }
    public final void setMDestroyIndexDetail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerIndexInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mDestroyIndexDetail = p0;
       return;
    }
    public final void setMPassiveRetryCount(int p0){
       this.mPassiveRetryCount = p0;
    }
    public final void setMRetryCount(int p0){
       this.mRetryCount = p0;
    }
    public final void setMTotalCount(int p0){
       this.mTotalCount = p0;
    }
}
