package c8c.c;
import qvb.g;
import vvb.a;
import qvb.a;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.rankgather.api.RankGatherFeedResponse;
import qvb.n0;
import java.util.List;
import java.lang.Boolean;
import qvb.o;
import c8c.c$a;
import com.yxcorp.gifshow.rankgather.api.b;
import qvb.q;

public class c extends a implements g, a	// class@00055c
{
    public b d;
    public boolean e;
    public boolean f;
    public List g;

    public void c(){
       super();
       this.g = new ArrayList();
    }
    public void F(int p0,Object p1){
    }
    public Object L0(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, c.class, "5");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          c td = this.d;
          if (td != null) {
             objArray = td.L0();
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.invalidate();
       this.load();
       return;
    }
    public List d1(){
       return this.b;
    }
    public boolean g(){
       return this.f;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.hasMore();
    }
    public final void invalidate(){
       this.f = true;
    }
    public void load(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.e == null && (this.hasMore() || this.f != null)) {
          this.e = true;
          this.c.N0(true, true);
          c td = this.d;
          td.h(new c$a(this, td));
          if (this.f != null) {
             td.a();
          }else {
             td.load();
          }
       }
       return;
    }
    public boolean v1(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.f;
    }
    public List z0(){
       return this.g;
    }
}
