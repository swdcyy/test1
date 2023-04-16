package j0a.f;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j0a.n;
import java.util.Map;
import java.util.HashMap;

public class f implements g	// class@0028e3
{
    public PublishSubject b;
    public y c;
    public t d;
    public PublishSubject e;
    public y f;
    public t g;
    public ViewStubInflater2 h;
    public ViewStubInflater2 i;

    public void f(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.b = publishSubje;
       this.c = publishSubje;
       this.d = publishSubje.hide();
       publishSubje = PublishSubject.g();
       this.e = publishSubje;
       this.f = publishSubje;
       this.g = publishSubje.hide();
       this.h = new ViewStubInflater2(0x7f0a04ef, 0x7f0a2d23);
       this.i = new ViewStubInflater2(0x7f0a0490);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new n());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
}
