package laa.e;
import java.io.File;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.edit.draft.model.d;
import ekd.q$b;
import ekd.q;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.Boolean;
import java.util.Iterator;

public abstract class e	// class@002d81
{
    public GeneratedMessageLite a;
    public GeneratedMessageLite$Builder b;
    public c c;
    public List d;
    public File e;

    public void e(File p0,GeneratedMessageLite p1,c p2){
       super();
       this.c = p2;
       this.e = p0;
       if (p1 != null) {
       }else {
          p1 = this.d();
       }
       this.a = p1;
       return;
    }
    public abstract GeneratedMessageLite d();
    public List e(){
       List obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j(this.a);
       if (obj == null) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList(obj);
       q.c(uArrayList, d.a);
       return uArrayList;
    }
    public GeneratedMessageLite$Builder f(){
       GeneratedMessageLite$Builder uBuilder;
       e obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = this.a.toBuilder();
       }
       obj = this.b;
       if (obj == null) {
          uBuilder = this.a.toBuilder();
       }
       return uBuilder;
    }
    public GeneratedMessageLite g(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.k()) {
          return this.a;
       }
       this.l();
       return this.f().build();
    }
    public GeneratedMessageLite h(){
       return this.a;
    }
    public File i(){
       return this.e;
    }
    public abstract List j(GeneratedMessageLite p0);
    public boolean k(){
       Iterator obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null) {
          return true;
       }
       if (q.f(this.d)) {
          return false;
       }
       obj = this.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().F()) {
             break ;
          }
       }
       return true;
    }
    public abstract void l();
}
