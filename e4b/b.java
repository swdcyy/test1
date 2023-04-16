package e4b.b;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiUserInfo;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;

public final class b	// class@00260e
{
    public static Map a;
    public static MagicEmojiUserInfo b;

    static {
       b.a = new ConcurrentHashMap();
       b.b = null;
    }
    public void b(){
       super();
    }
    public static Set a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a.entrySet();
    }
    public static MagicEmojiResponse b(MagicBusinessId p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a.get(p0);
    }
    public static MagicEmojiUserInfo c(){
       return b.b;
    }
    public static void d(MagicBusinessId p0,MagicEmojiResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "4")) {
          return;
       }
       if (p1 != null) {
          b.a.put(p0, p1);
       }else {
          b.a.remove(p0);
       }
       return;
    }
    public static void e(MagicEmojiUserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       b.b = p0;
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiDataCacheHelper", "setUserInfo:"+p0, objArray);
       return;
    }
}
