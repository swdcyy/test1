package dwa.k;
import y8c.f$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback;
import u99.b;
import w99.f;
import u99.f;
import aa9.b;
import com.kwai.robust.PatchProxyResult;
import aa9.c;
import aa9.c$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dwa.j;
import dwa.i;
import dwa.u;
import java.util.Map;

public class k extends f$b	// class@002594
{
    public QPhoto h;
    public g i;
    public p j;
    public VideoAutoPlayerStateRecordCallback k;
    public g l;
    public b m;
    public f n;
    public f o;

    public void k(f$b p0,QPhoto p1){
       super(p0);
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p1, this, ok, "1")) {
       }else {
          this.h = p1;
          this.k = new VideoAutoPlayerStateRecordCallback();
          this.m = new b();
          this.n = new f();
          this.o = new f();
          k th = this.h;
          c uoc = PatchProxy.applyOneRefs(th, this, ok, "2");
          if (uoc != PatchProxyResult.class) {
          }else {
             c$a uoa = new c$a(th, this.f);
             uoa.c(this.o);
             uoc = uoa.b(true).a();
          }
          this.i = new b(uoc);
          this.j = new j(this);
          this.l = i.a;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(k.class, new u());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
}
