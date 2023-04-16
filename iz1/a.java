package iz1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;
import lnc.a1;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class a	// class@0029e3
{

    public void a(){
       super();
    }
    public static int a(){
       int i;
       Object obj = PatchProxy.apply(null, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          i = Color.parseColor("#1F295F");
       }catch(java.lang.Exception e0){
          i = a1.a(R.color.arg_RES_7f06018a);
       }
       return i;
    }
    public static boolean b(QLivePlayConfig p0){
       boolean i;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (a.j()) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.mIsLiveShowMultiTab == null) {
          i = (p0.mSubType == 101 && p0.mPatternType == b)? 1: 0;
          if (!i) {
             i = false;
          label_0037 :
             if (!i || !a.f()) {
                b = false;
             }
             return b;
          }
       }
       i = true;
       goto label_0037 ;
    }
    public static boolean c(LiveStreamFeedWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.mEntity != null) {
          return a.b(p0.getLivePlayConfig());
       }
       return false;
    }
    public static boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.mEntity instanceof LiveStreamFeed) {
          return a.b(p0.getLivePlayConfig());
       }
       return false;
    }
    public static boolean e(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.mEntity instanceof LiveStreamFeed) {
          return a.b(p0.getLivePlayConfig());
       }
       return false;
    }
}
