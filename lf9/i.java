package lf9.i;
import erd.a;
import lf9.e;
import kf9.c;
import kf9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf9.m;
import lf9.b;
import sa6.b;
import kf9.f;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;

public final class i implements a	// class@002dd5
{
    public final e b;
    public final c c;
    public final e d;

    public void i(e p0,c p1,e p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "1")) {
          return;
       }
       Object obj = this.b.a().j().g().get(Integer.valueOf(this.c.b()));
       if (obj instanceof e) {
          objArray = obj;
       }
       Object[] objArray1 = objArray;
       if (objArray1 != null) {
          this.b.a().j().g().put(Integer.valueOf(this.c.b()), e.a(objArray1, null, 100, 2, false, 9, null));
          objArray1 = new Object[0];
          a.D().w("SliMode", "magic: "+this.d.c()+" download "+"success", objArray1);
          this.b.a().h(f.a(this.b.a().j(), null, 0, 0, null, false, false, 63, null));
       }
       return;
    }
}
