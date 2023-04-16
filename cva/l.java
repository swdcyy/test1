package cva.l;
import cva.a;
import y8c.f$b;
import com.yxcorp.gifshow.log.e;
import com.kwai.component.photo.reduce.f;
import ha5.e;
import pa5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import aa9.b;
import aa9.c$a;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import aa9.c;
import com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback;
import w99.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cva.r;
import java.util.Map;

public final class l extends a	// class@0023dd
{
    public b r;
    public p s;
    public VideoAutoPlayerStateRecordCallback t;
    public f u;

    public void l(f$b p0,e p1,f p2,e p3,a p4,QPhoto p5){
       a.p(p5, "photo");
       super(p0, p1, p2, p3, p4);
       f$b tf = this.f;
       Objects.requireNonNull(tf, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
       c$a uoa = new c$a(p5, tf);
       this.r = new b(uoa.b(true).a());
       this.t = new VideoAutoPlayerStateRecordCallback();
       this.u = new f();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(l.class, new r());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
}
