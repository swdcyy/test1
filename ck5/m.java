package ck5.m;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.String;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class m	// class@0006df
{
    public final Map a;

    public void m(){
       super();
       this.a = Collections.synchronizedMap(new LinkedHashMap());
    }
    public void a(String p0,EmotionPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
    public EmotionPackage b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(p0);
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.a.values());
    }
}
