package m9a.y;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import java.lang.Number;
import android.os.Build$VERSION;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import p5a.e;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import com.kwai.components.feedmodel.SummaryInfo;
import java.lang.Float;
import uy6.f;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;

public class y	// class@002f9c
{

    public void y(){
       super();
    }
    public static boolean a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p0.isVideoType() || (!p0.isSinglePhoto() || (!j.h(b.b(p0)) || p0.isKtv()))) {
          return true;
       }
       return false;
    }
    public static int b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (Build$VERSION.SDK_INT >= 24 && (p0 != null && p0.getVideoDuration() > 0)) {
          if ((float)p0.getVideoDuration() - 0x482fc800 > 0) {
             return 5;
          }else if((float)p0.getVideoDuration() - 0x47ea6000 > 0){
             return 4;
          }else if((float)p0.getVideoDuration() - 0x47afc800 > 0){
             return 3;
          }else if((float)p0.getVideoDuration() - 0x471c4000 > 0){
             return 2;
          }
       }
       return 1;
    }
    public static long c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (p0 != null && (p0.getPhotoMeta() == null || (p0.getPhotoMeta().mHighLightPosInfo != null && p0.getPhotoMeta().mHighLightPosInfo.length > 0))) {
          object oobject = p0.getPhotoMeta().mHighLightPosInfo[0];
          if (oobject != null && oobject.mHighLightPos > null) {
             l = oobject.getHighLightPosition();
          }
       }
    label_0044 :
       return l;
    }
    public static float d(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0x3f800000;
       if (p0 != null) {
          IKwaiMediaPlayer iKwaiMediaPl = p0.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             f = iKwaiMediaPl.getSpeed(f);
          }
       }
       return f;
    }
    public static float e(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 10.00f;
       if (p0 != null && p0.getPhotoMeta() != null) {
          float f1 = (float)p0.getVideoDuration();
          if (p0.getPhotoMeta().mSummaryInfo != null && p0.getPhotoMeta().mSummaryInfo.mSummaryPosition > 0) {
             f = (float)p0.getPhotoMeta().mSummaryInfo.getSummaryPosition() / f1;
          }
       }
       return f;
    }
    public static long f(QPhoto p0,float p1){
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, oy, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (Build$VERSION.SDK_INT >= 24 && (p0 != null && p0.getVideoDuration() > 0)) {
          if (p0.getVideoDuration() - 0xea60 > 0) {
             return 200;
          }else if(SlidePerformanceExp.d().c()){
             return 120;
          }else if(p1 - 0x3f800000 < 0){
             return 105;
          }else {
             return 60;
          }
       }else {
          return 200;
       }
    }
}
