package cdd.g;
import y8c.g;
import com.yxcorp.plugin.search.entity.SearchItem;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import cdd.g$a;
import ekd.j;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import cdd.g$b;
import ml8.c;

public class g extends g	// class@000533
{
    public SearchItem w;

    public void g(SearchItem p0){
       super();
       this.w = p0;
    }
    public ArrayList a1(int p0,f p1){
       g$a obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, og, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new g$a();
       obj.b = this.w;
       Object[] objArray = new Object[]{obj};
       return j.a(objArray);
    }
    public f h1(ViewGroup p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d13f3), new g$b(this));
    }
}
