package i02.d;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService;
import lp3.a;
import i02.d$a;
import nsd.u;
import java.util.LinkedHashMap;
import java.lang.Integer;
import com.kuaishou.live.basic.model.StreamType;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import trd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public abstract class d extends a implements LiveSceneInfoService	// class@0027ec
{
    public static final Map d;
    public static final d$a e;

    static {
       d.e = new d$a(null);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Integer[] integerArray = new Integer[]{Integer.valueOf(StreamType.AUDIO.toInt()),Integer.valueOf(StreamType.LINE_LIVE.toInt())};
       linkedHashMa.put(Integer.valueOf(2), CollectionsKt__CollectionsKt.L(integerArray));
       linkedHashMa.put(Integer.valueOf(1), t.k(Integer.valueOf(StreamType.VIDEO.toInt())));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(StreamType.VOICEPARTY.toInt()),Integer.valueOf(StreamType.KTV.toInt())};
       linkedHashMa.put(Integer.valueOf(3), CollectionsKt__CollectionsKt.L(integerArray1));
       linkedHashMa.put(Integer.valueOf(4), t.k(Integer.valueOf(StreamType.GAME_LIVE.toInt())));
       d.d = linkedHashMa;
    }
    public void d(){
       super();
    }
    public final int So(int p0){
       Iterator obj;
       Map$Entry uEntry;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = d.d.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return 1;
          }
          uEntry = obj.next();
          if (uEntry.getValue().contains(Integer.valueOf(p0))) {
             break ;
          }
       }
       return uEntry.getKey().intValue();
    }
}
