package aqb.a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import fqb.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import aqb.i;
import java.util.Map;
import java.util.HashMap;

public class a implements g	// class@0002bc
{
    public PublishSubject b;
    public y c;
    public t d;
    public PublishSubject e;
    public y f;
    public t g;
    public b h;
    public PublishSubject i;

    public void a(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.b = publishSubje;
       this.c = publishSubje;
       this.d = publishSubje;
       publishSubje = PublishSubject.g();
       this.e = publishSubje;
       this.f = publishSubje;
       this.g = publishSubje;
       this.h = new b();
       this.i = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new i());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
