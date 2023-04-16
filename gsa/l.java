package gsa.l;
import im8.g;
import java.lang.Object;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gsa.z;
import java.util.Map;

public class l implements g	// class@002bf8
{
    public d b;
    public j0 c;
    public h d;
    public final List e;
    public boolean f;
    public PublishSubject g;
    public PublishSubject h;
    public List i;
    public List j;
    public final PublishSubject k;
    public final y l;
    public final t m;
    public Map n;

    public void l(){
       super();
       this.e = new ArrayList();
       this.g = PublishSubject.g();
       this.h = PublishSubject.g();
       this.i = new ArrayList(1);
       this.j = new ArrayList();
       PublishSubject publishSubje = PublishSubject.g();
       this.k = publishSubje;
       this.l = publishSubje;
       this.m = publishSubje;
       this.n = new HashMap();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new z());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
}
