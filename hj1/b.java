package hj1.b;
import hj1.c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import gj1.b;
import java.util.Set;
import java.util.Collections;
import d61.l0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashSet;
import androidx.collection.ArraySet;
import java.util.Collection;

public final class b implements c	// class@0026ee
{
    public final List a;

    public void b(List p0){
       a.p(p0, "keyList");
       super();
       this.a = p0;
    }
    public boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Object obj = PatchProxy.apply(objArray, this, b.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, b.class, str);
       if (obj != patchProxyRe) {
       }else {
          obj = b.b.b(Collections.emptySet());
       }
       int i = 1;
       int i1 = this.a.size() - i;
       while (true) {
          str = "PUBLIC_ID_CACHE";
          if (i1 >= 0) {
             if (obj.contains(this.a.get(i1))) {
                break ;
             }else {
                i1 = i1 - 1;
             }
          }else {
             b.S(LiveLogTag.PK.appendTag(str), "show confirm alert", "key list", this.a.toString());
             return i;
          }
       }
       b.S(LiveLogTag.PK.appendTag(str), "dont show confirm alert, hit not notice key", "key", this.a.get(i1));
       return false;
    }
    public void b(){
       l0 b;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, b.class, str)) {
          return;
       }
       b ta = this.a;
       String str1 = ta.get((ta.size() - 1));
       if (!PatchProxy.applyVoidOneRefs(str1, objArray, b.class, str)) {
          b = b.b;
          HashSet hashSet = new HashSet(b.b(new ArraySet()));
          hashSet.add(str1);
          b.i(hashSet);
       }
       b.S(LiveLogTag.PK.appendTag("PUBLIC_ID_CACHE"), "append key to local cache", "key", str1);
       return;
    }
}
