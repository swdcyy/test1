package b99.h;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b99.n0;
import java.util.Map;
import java.util.HashMap;

public class h implements g	// class@0003a4
{
    public f A;
    public f B;
    public PhotosViewPager C;
    public a D;
    public j0 E;
    public a F;
    public t G;
    public final PublishSubject b;
    public final PublishSubject c;
    public t d;
    public y e;
    public t f;
    public y g;
    public PublishSubject h;
    public i i;
    public PublishSubject j;
    public PlcEntryStyleInfo k;
    public b0 l;
    public a m;
    public PublishSubject n;
    public QPhoto o;
    public PhotoDetailLogger p;
    public BaseFragment q;
    public PublishSubject r;
    public c s;
    public PublishSubject t;
    public Set u;
    public ViewGroup v;
    public y w;
    public b x;
    public a y;
    public f z;

    public void h(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.b = publishSubje;
       PublishSubject publishSubje1 = PublishSubject.g();
       this.c = publishSubje1;
       this.d = publishSubje;
       this.e = publishSubje;
       this.f = publishSubje1;
       this.g = publishSubje1;
       this.h = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new n0());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
}
