package az9.i0$a;
import qvb.q;
import az9.i0;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import brd.z;
import io.reactivex.android.schedulers.a;
import az9.h0;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import crd.b;

public class i0$a implements q	// class@00032a
{
    public final i0 b;

    public void i0$a(i0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p0.t = true;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.c().e(new h0(this), 500, TimeUnit.MILLISECONDS);
       return;
    }
}
