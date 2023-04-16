package com.kwai.video.clipkit.post.ClipPostHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.clipkit.post.ClipPostInfo;

public class ClipPostHelper	// class@001adb
{

    public void ClipPostHelper(){
       super();
    }
    public static double getRecommendProgress(int p0,double p1,double p2,double p3){
       int i;
       if (PatchProxy.isSupport(ClipPostHelper.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), Double.valueOf(p3), null, ClipPostHelper.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       int totalWeight = ClipPostHelper.getTotalWeight(p0);
       double d = 0;
       if (!totalWeight) {
          return d;
       }else if(!ClipPostInfo.isNeedEncode(p0) && !ClipPostInfo.isNeedUpload(p0)){
          i = 1;
       }else {
          i = 0;
       }
       if (i) {
          return p3;
       }else if(ClipPostInfo.isNeedEncode(p0)){
          d = d + ((p1 * 6.00f) / (double)totalWeight);
       }
       if (ClipPostInfo.isNeedUpload(p0)) {
          d = d + ((p2 * 4.00f) / (double)totalWeight);
       }
       return d;
    }
    public static final int getTotalWeight(int p0){
       ClipPostHelper uClipPostHel = ClipPostHelper.class;
       if (PatchProxy.isSupport(uClipPostHel)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uClipPostHel, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (ClipPostInfo.isNeedEncode(p0)) {
          i = 6;
       }
       if (ClipPostInfo.isNeedUpload(p0)) {
          i = i + 4;
       }
       return i;
    }
}
