package esa.a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import esa.g;
import java.util.Map;
import java.util.HashMap;

public class a implements g	// class@0027c0
{
    public boolean b;
    public PublishSubject c;
    public t d;
    public t e;
    public List f;

    public void a(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.c = publishSubje;
       this.d = publishSubje.hide();
       this.f = new ArrayList(1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
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
          obj.put(a.class, new g());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
