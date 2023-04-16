package a11.m;
import androidx.lifecycle.ViewModel;
import a11.n;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class m extends ViewModel	// class@000026
{
    public final n a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final MutableLiveData h;
    public final LiveData i;
    public final LiveData j;

    public void m(n p0,LiveData p1,LiveData p2,LiveData p3,LiveData p4,LiveData p5,MutableLiveData p6,LiveData p7,LiveData p8,LiveData p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.f = p9;
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.a.b();
       return;
    }
    public void p0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "4")) {
          return;
       }
       this.a.e(p0);
       return;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.a.c();
       return;
    }
}
