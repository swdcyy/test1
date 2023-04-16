package m3a.d;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m3a.n;
import java.util.Map;
import java.util.HashMap;

public final class d implements g	// class@002f10
{
    public final PublishSubject b;
    public final y c;
    public final t d;
    public final PublishSubject e;
    public final y f;
    public final t g;
    public final PublishSubject h;
    public final y i;
    public final t j;
    public final PublishSubject k;
    public final y l;
    public final t m;

    public void d(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.b = publishSubje;
       this.c = publishSubje;
       this.d = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<En¡­ePictureInPictureEvent>\(\)");
       this.e = publishSubje;
       this.f = publishSubje;
       this.g = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<SyncPlayerProgressEvent>\(\)");
       this.h = publishSubje;
       this.i = publishSubje;
       this.j = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Sm¡­WindowPlayInfoListener>\(\)");
       this.k = publishSubje;
       this.l = publishSubje;
       this.m = publishSubje;
    }
    public final t a(){
       return this.d;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new n());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
}
