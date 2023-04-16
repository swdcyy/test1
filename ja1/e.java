package ja1.e;
import com.kuaishou.live.common.core.basic.resource.controlfiles.LiveControlFilePolicy;
import java.lang.String;
import ja1.f;
import java.util.List;
import la1.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import java.lang.StringBuilder;
import java.io.File;

public final class e	// class@002a69
{
    public String a;
    public LiveControlFilePolicy b;
    public String c;
    public String d;
    public f e;
    public List f;
    public boolean g;
    public a h;

    public void e(LiveControlFilePolicy p0,String p1,String p2,f p3,List p4,boolean p5,a p6){
       a.p(p0, "policy");
       a.p(p1, "targetFileDir");
       a.p(p2, "targetFileName");
       a.p(p4, "patchTaskUnits");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final a a(){
       return this.h;
    }
    public final f b(){
       return this.e;
    }
    public final List c(){
       Iterator obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       obj = this.f.iterator();
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          if (obj1.g()) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public final List d(){
       return this.f;
    }
    public final String e(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c+File.separator+this.d;
    }
}
