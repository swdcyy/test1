package jk9.g;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggDemotionConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import l27.g;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.perf.phonelevel.d;

public final class g	// class@002afe
{

    public static final boolean a(CommentAtTailEasterEggDemotionConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 26) {
          return false;
       }
       if (p0 == null) {
          return true;
       }
       return (g.b(p0.mEnableWolverine, p0.mMidPhoneCommonPerf, Boolean.valueOf(p0.mDisableLowPhoneAnim), Boolean.valueOf(p0.mDisableMidPhoneAnim), Boolean.valueOf(p0.mDisableAnim)).booleanValue() ^ true);
    }
    public static final Object b(boolean p0,int p1,Object p2,Object p3,Object p4){
       Object obj;
       g og = g.class;
       WolverinePerformanceLevelInterface wolverinePer = null;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, wolverinePer, og, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          g og1 = FeedWolverinePerformanceHolder.c.c();
          if (og1 != null) {
             wolverinePer = og1.a();
          }
          if (wolverinePer == WolverinePerformanceLevel.GRADE_E) {
             return p2;
          }
       }
       int i = -404437045;
       obj = b.a(i);
       a.o(obj, "Singleton.get\(PhoneLevelUtils::class.java\)");
       if (obj.g()) {
          return p2;
       }else {
          Object obj1 = b.a(i);
          a.o(obj1, "Singleton.get\(PhoneLevelUtils::class.java\)");
          if (obj1.c() > p1) {
             return p4;
          }else {
             return p3;
          }
       }
    }
}
