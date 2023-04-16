package g6b.c;
import java.lang.Object;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import i6b.a;
import java.lang.String;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.Boolean;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c	// class@002a8c
{
    public i a;
    public b b;
    public b c;
    public b d;
    public b e;
    public MapCenterInfo f;
    public a g;
    public String h;
    public String i;
    public int j;
    public b k;
    public String l;
    public int m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public String u;
    public final a v;
    public final PublishSubject w;
    public final PublishSubject x;
    public final b y;

    public void c(){
       super();
       this.f = new MapCenterInfo();
       this.g = new a(false, "ERROR");
       this.h = "";
       this.i = "";
       this.p = "";
       this.q = "";
       this.r = "";
       this.s = "";
       this.t = false;
       this.u = "";
       this.v = a.g();
       this.w = PublishSubject.g();
       this.x = PublishSubject.g();
       this.y = new b(Boolean.FALSE);
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.hide();
    }
    public void b(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.y.d(Boolean.valueOf(p0));
       return;
    }
    public void c(MapCenterInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       p0.mMapEnterSource = this.f.mMapEnterSource;
       this.f = p0;
       this.g.a = p1;
       this.w.onNext(p0);
       return;
    }
    public void d(String p0){
       this.g.a = p0;
    }
}
