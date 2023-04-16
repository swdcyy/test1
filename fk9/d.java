package fk9.d;
import fk9.c;
import java.lang.Object;
import qk9.b;
import android.util.SparseArray;
import tkd.b;
import tkd.d;
import bl9.a;
import qk9.h;
import qk9.f;
import qk9.d;
import qk9.j;
import qk9.i;
import qk9.c;
import qk9.e;
import qk9.a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class d implements c	// class@002328
{
    public h a;
    public final SparseArray b;

    public void d(){
       super();
       this.a = new b();
       SparseArray sparseArray = new SparseArray();
       this.b = sparseArray;
       sparseArray.put(3, new f());
       sparseArray.put(6, new d());
       sparseArray.put(2, new j());
       sparseArray.put(10, new i());
       sparseArray.put(1, new i());
       sparseArray.put(5, d.a(0x480b4273).OO());
       sparseArray.put(9, new c());
       sparseArray.put(7, new e());
       sparseArray.put(11, new a());
    }
    public f a(ViewGroup p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       h oh = this.b.get(p1);
       if (oh != null) {
          return oh.c(p0);
       }else {
          return this.a.c(p0);
       }
    }
}
