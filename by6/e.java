package by6.e;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import by6.e$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import by6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import by6.d;
import by6.e$a;
import java.util.HashMap;
import dy6.c;
import java.util.Collection;
import ekd.q;
import by6.f;
import java.lang.Integer;
import java.util.Map;
import by6.c;
import by6.f$b;
import by6.f$a;
import dy6.b;
import by6.f$c;
import dy6.a;

public class e	// class@0004b4
{
    public List a;

    public void e(){
       super();
       this.a = new ArrayList();
    }
    public void a(NetworkDetectConfig p0,e$b p1){
       NetworkDetectConfig id;
       boolean b;
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "1")) {
          return;
       }
       b.a("NetworkDetectorManager detect config id:"+p0.id);
       id = p0.id;
       d obj = PatchProxy.applyOneRefs(id, this, uoe, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Iterator iterator1 = this.a.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                if (id.equals(iterator1.next().a().id)) {
                   b = true;
                }
             }else {
                b = false;
             }
          }
       }
       if (b) {
          b.a("NetworkDetectorManager detect hasRunningDetectorWithId id:"+p0.id);
          return;
       }else {
          obj = new d(p0);
          this.a.add(obj);
          e$a uoa = new e$a(this, p1, p0, obj);
          if (!PatchProxy.applyVoidOneRefs(uoa, obj, d.class, "1")) {
             HashMap hashMap = new HashMap();
             obj.b = new ArrayList();
             Iterator iterator = obj.a.mNetworkDetectTaskGroups.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                if (q.f(uoc.mNetworkDetectTasks)) {
                   b.a("NetworkDetector detect empty group");
                }else {
                   obj.b.add(new f(uoc));
                   continue ;
                }
             }
             uoa.onProgress(0);
             if (!obj.b.isEmpty()) {
                iterator = obj.b.iterator();
                while (iterator.hasNext()) {
                   f uof = iterator.next();
                   obj.c.put(uof.b(), Integer.valueOf(0));
                   c uoc1 = new c(obj, uof, uoa, hashMap);
                   if (!PatchProxy.applyVoidOneRefs(uoc1, uof, f.class, "1") && uof.g == null) {
                      uof.g = true;
                      uof.b = new f$b(uof, uof.a.mNetworkDetectTasks, null);
                      uof.d = new HashMap();
                      b.a("NetworkTaskGroupDetector detect task count:"+uof.b().mNetworkDetectTasks.size());
                      if (uof.b.b()) {
                         uof.a(uof.b.c(), uoc1);
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }
             }else {
                b.a("NetworkDetector detect empty config");
                uoa.a(null);
             }
          }
          return;
       }
    }
}
