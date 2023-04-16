package hz8.e;
import erd.g;
import hz8.d;
import em9.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ol9.a;
import com.yxcorp.gifshow.entity.QPhoto;

public final class e implements g	// class@0025f9
{
    public final d b;
    public final c c;

    public void e(d p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          int i = 0x4ffa335e;
          d.a(i).WI(d.P8(this.b), this.c);
          d.a(i).F30(d.P8(this.b));
          if (this.b.t == null) {
             d.a(i).jr(d.P8(this.b));
          }
       }
       return;
    }
}
