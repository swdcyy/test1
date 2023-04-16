package hc9.d;
import java.lang.Object;
import hc9.f;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.IllegalArgumentException;
import nc9.a;
import ic9.b;
import ic9.w;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import fe9.f;
import com.kuaishou.android.model.music.Music;
import xf9.a;
import wf9.f;
import java.lang.Integer;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import a1c.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import g1c.e;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public class d	// class@002585
{

    public void d(){
       super();
    }
    public static Map a(f p0){
       a uoa = null;
       ConcurrentHashMap obj = PatchProxy.applyOneRefs(p0, uoa, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          if (!a.a().c()) {
             return new ConcurrentHashMap();
          }else {
             throw new IllegalArgumentException("生产自动应用option不可为空");
          }
       }else {
          obj = new ConcurrentHashMap();
          Object[] obj1 = p0.h();
          String str = a.b(obj1);
          if (obj1 instanceof b) {
             obj.put(str, new w());
          }else if(obj1 instanceof MagicEmoji$MagicFace){
             obj.put(str, new f());
          }else if(obj1 instanceof Music){
             if (p0 instanceof a) {
                uoa = p0.s;
             }
             obj.put(str, new f(uoa));
          }else if(obj1 instanceof FilterConfig){
             obj.put(str, new d());
          }else if(obj1 instanceof MakeupSuite){
             obj.put(str, new e());
          }
          obj1 = new Object[0];
          a.D().w("AutoApplyProcessorFactor", "createProcessor:"+str, obj1);
          return obj;
       }
    }
}
