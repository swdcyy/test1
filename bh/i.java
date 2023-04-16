package bh.i;
import java.lang.Object;
import java.util.List;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.Integer;
import android.util.SparseArray;
import dh.b;
import gh.c;
import gh.f;
import gh.b;
import gh.e;
import gh.a;
import gh.g;
import bh.i$a;
import java.util.Comparator;
import java.util.Collections;

public class i	// class@000b37
{
    public float a;
    public Map b;
    public SparseArray c;
    public Map d;

    public void i(){
       super();
    }
    public void a(List p0,View p1,String p2,boolean p3){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, i.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       String str = PatchProxy.applyOneRefs(p2, this, oi, "2");
       if (str != PatchProxyResult.class) {
       }else if(this.d.containsKey(p2)){
          str = this.c.get(this.d.get(p2).intValue());
       }else {
          str = null;
       }
       if (str != null) {
          this.a(p0, p1, str, true);
       }
       b uob = this.b.get(p2);
       if (uob == null) {
          return;
       }else if(PatchProxy.applyVoidThreeRefs(p1, p0, uob, null, c.class, "1")){
          c.a(p1, p0, uob, f.a);
       }
       if (!PatchProxy.applyVoidThreeRefs(p1, p0, uob, null, c.class, "3")) {
          c.a(p1, p0, uob, e.a);
       }
       if (!p3 && !PatchProxy.applyVoidThreeRefs(p1, p0, uob, null, c.class, "2")) {
          c.a(p1, p0, uob, a.a);
       }
       if (!PatchProxy.applyVoidThreeRefs(p1, p0, uob, null, c.class, "4")) {
          c.a(p1, p0, uob, g.a);
       }
       Collections.sort(p0, new i$a(this));
       return;
    }
}
