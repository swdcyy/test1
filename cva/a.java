package cva.a;
import pa5.n$c;
import y8c.f$b;
import com.yxcorp.gifshow.log.e;
import com.kwai.component.photo.reduce.f;
import ha5.e;
import pa5.a;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import cva.a$a;
import java.lang.Object;
import cva.a$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cva.e;
import java.util.Map;

public class a extends n$c	// class@0023d2
{
    public PublishSubject p;
    public b q;

    public void a(f$b p0,e p1,f p2,e p3,a p4){
       super(p0, p1, p2, p3, p4);
       this.p = PublishSubject.g();
       this.q = new b(new a$a(this));
       this.l = new a$b(this);
    }
    public String c(){
       return "LIFE";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
