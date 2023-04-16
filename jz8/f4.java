package jz8.f4;
import im8.g;
import java.lang.Object;
import sy8.l;
import io.reactivex.subjects.PublishSubject;
import g19.l;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jz8.t4;
import java.util.Map;
import java.util.HashMap;

public class f4 implements g	// class@0029ff
{
    public l b;
    public PublishSubject c;
    public l d;
    public final PublishSubject e;
    public final y f;
    public final t g;
    public Boolean h;
    public e i;
    public Boolean j;
    public final c k;
    public y l;
    public t m;
    public ScreenCleanController n;
    public PublishSubject o;

    public void f4(){
       super();
       this.b = new l();
       this.c = PublishSubject.g();
       this.d = new l();
       PublishSubject publishSubje = PublishSubject.g();
       this.e = publishSubje;
       this.f = publishSubje;
       this.g = publishSubje;
       Boolean fALSE = Boolean.FALSE;
       this.h = fALSE;
       this.j = fALSE;
       publishSubje = PublishSubject.g();
       this.k = publishSubje;
       this.l = publishSubje;
       this.m = publishSubje;
       this.o = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f4.class, new t4());
       }else {
          obj.put(f4.class, null);
       }
       return obj;
    }
}
