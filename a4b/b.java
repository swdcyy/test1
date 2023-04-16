package a4b.b;
import java.util.HashMap;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiUserInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w3b.l;
import e4b.b;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;

public final class b	// class@000044
{
    public static MagicEmojiUserInfo a;
    public static final HashMap b;
    public static final HashMap c;
    public static final b d;

    static {
       b.d = new b();
       b.b = new HashMap();
       b.c = new HashMap();
    }
    public void b(){
       super();
    }
    public final HashMap a(){
       return b.b;
    }
    public final HashMap b(){
       return b.c;
    }
    public final MagicEmojiUserInfo c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MagicEmojiUserInfo obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (b.a == null) {
          obj = PatchProxy.apply(objArray, objArray, l.class, "20");
          if (obj != patchProxyRe) {
          }else {
             obj = b.c();
          }
          b.a = obj;
          objArray = new Object[0];
          b.D().w("MagicEditionResourceInstance", "get magicUserInfo from response: "+b.a, objArray);
       }
       return b.a;
    }
}
