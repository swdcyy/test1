package cl9.h0;
import y8c.f$b;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cl9.k1;
import java.util.Map;

public class h0 extends f$b	// class@000628
{
    public k1 A;
    public e B;
    public t0 C;
    public CommentParams D;
    public CommentConfig E;
    public a F;
    public PublishSubject G;
    public t H;
    public b h;
    public QPhoto i;
    public Integer j;
    public QPreInfo k;
    public List l;
    public a m;
    public d n;
    public boolean o;
    public y p;
    public c q;
    public c r;
    public c s;
    public t t;
    public t u;
    public y v;
    public Map w;
    public Map x;
    public Map y;
    public y z;

    public void h0(f$b p0){
       super(p0);
       this.j = Integer.valueOf(0);
       this.p = PublishSubject.g();
       this.q = PublishSubject.g();
       this.r = PublishSubject.g();
       this.s = PublishSubject.g();
       this.z = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, h0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(h0.class, new k1());
       }else {
          obj.put(h0.class, null);
       }
       return obj;
    }
}
