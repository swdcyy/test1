package ck5.i$c;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bk5.g;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import ok5.a;
import com.kwai.emotionsdk.bean.EmotionResponse;
import com.kwai.emotionsdk.core.j;
import java.util.List;
import il5.b;

public final class i$c implements o	// class@0006d9
{
    public static final i$c b;

    static {
       i$c.b = new i$c();
    }
    public void i$c(){
       super();
    }
    public Object apply(Object p0){
       g og = PatchProxy.applyOneRefs(p0, this, i$c.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          a.a("EmotionDataProcessor", "tryToLoadDataFromRemote - error "+p0);
          p0 = new EmotionResponse();
          j oj = j.e();
          a.o(oj, "EmotionDataManagerInternal.getInstance\(\)");
          p0.mEmotionPackageList = oj.a();
          p0.mEmotionVersion = b.a("getEmotionCurVersion");
          a.a("EmotionDataProcessor", "loadData - local data");
          og = new g(0, p0);
       }
       return og;
    }
}
