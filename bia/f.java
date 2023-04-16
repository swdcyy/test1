package bia.f;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kha.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.lang.Number;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsFrequencyConfig;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsFrequency;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsFullyGuide;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsSimpleGuide;
import bia.f$a;
import el.a;

public final class f	// class@0003c6
{
    public static int a;
    public static int b;

    public static final FollowLiveTipsGuideConfig a(){
       Object[] objArray = null;
       FollowLiveTipsGuideConfig obj = PatchProxy.apply(objArray, objArray, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowLiveTipsGuideConfig.class;
       String str = a.a.getString("myFollowLiveGuide", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static final long b(){
       List obj = PatchProxy.apply(null, null, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = f.f();
       if (obj != null && (obj.isEmpty() ^ 1) == 1) {
          return CollectionsKt___CollectionsKt.Y2(obj).mGuideShowTime;
       }
       return 0;
    }
    public static final FollowLiveTipsGuideConfig$LiveTipsFrequency c(){
       Object[] objArray = null;
       FollowLiveTipsGuideConfig obj = PatchProxy.apply(objArray, objArray, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a();
       if (obj != null) {
          objArray = obj.mFrequency;
       }
       return objArray;
    }
    public static final FollowLiveTipsGuideConfig$LiveTipsFullyGuide d(){
       Object[] objArray = null;
       FollowLiveTipsGuideConfig obj = PatchProxy.apply(objArray, objArray, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a();
       if (obj != null) {
          objArray = obj.mFullyGuide;
       }
       return objArray;
    }
    public static final FollowLiveTipsGuideConfig$LiveTipsSimpleGuide e(){
       Object[] objArray = null;
       FollowLiveTipsGuideConfig obj = PatchProxy.apply(objArray, objArray, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a();
       if (obj != null) {
          objArray = obj.mSimpleGuide;
       }
       return objArray;
    }
    public static final List f(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f$a().getType();
       String str = a.a.getString("liveTipsShowConfigDayList", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static final int g(){
       return f.b;
    }
}
