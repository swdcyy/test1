package i0a.k;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i0a.v;
import java.util.Map;
import java.util.HashMap;

public class k implements g	// class@002750
{
    public PublishSubject b;
    public y c;
    public t d;
    public List e;
    public PublishSubject f;
    public y g;
    public t h;
    public ViewStubInflater2 i;
    public ViewStubInflater2 j;
    public ViewStubInflater2 k;
    public ViewStubInflater2 l;

    public void k(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.b = publishSubje;
       this.c = publishSubje;
       this.d = publishSubje.hide();
       this.e = new ArrayList();
       publishSubje = PublishSubject.g();
       this.f = publishSubje;
       this.g = publishSubje;
       this.h = publishSubje.hide();
       this.i = new ViewStubInflater2(0x7f0a04ef, 0x7f0a2d23);
       this.j = new ViewStubInflater2(0x7f0a0490);
       this.k = new ViewStubInflater2(0x7f0a049a);
       this.l = new ViewStubInflater2(0x7f0a0501);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new v());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
}
