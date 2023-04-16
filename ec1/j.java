package ec1.j;
import i81.a;
import ec1.i;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import java.util.Objects;
import bq5.f;
import bq5.b;
import i81.b;
import com.kuaishou.live.comments.bulletin.LiveBulletinViewType;

public class j implements a	// class@0020dd
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
    }
    public int b(int p0){
       j obj;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "1");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, i.class, "5");
       if (obj1 != patchProxyRe) {
          obj = obj1.intValue();
       }else {
          i x = obj.x;
          if (x != null) {
             obj2 = x.c();
             if (obj2 instanceof b) {
                obj2 = obj2.z();
             }
          }
          obj2 = 0;
       }
       return obj;
    }
    public void c(b p0){
       this.a.E = p0;
    }
    public LiveBulletinViewType getViewType(){
       return LiveBulletinViewType.BOTTOM_BUBBLE;
    }
}
