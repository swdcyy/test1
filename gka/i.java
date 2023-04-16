package gka.i;
import androidx.fragment.app.d;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class i extends d	// class@002b0e
{
    public final List k;

    public void i(c p0){
       super(p0);
       this.k = new ArrayList();
    }
    public void A(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       this.k.clear();
       this.k.addAll(p0);
       return;
    }
    public void B(int p0,Fragment p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "7")) {
          return;
       }
       this.k.set(p0, p1);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.size();
    }
    public int k(Object p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       i = -2;
       if (!p0 instanceof Fragment) {
          return i;
       }
       int i1 = this.k.indexOf(p0);
       if (i1 != -1) {
          i = i1;
       }
       return i;
    }
    public Fragment z(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0 && p0 < this.k.size()) {
          return this.k.get(p0);
       }else {
          return null;
       }
    }
}
