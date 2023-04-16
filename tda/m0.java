package tda.m0;
import tda.n0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;

public abstract class m0	// class@0041d6
{
    public final n0 a;

    public void m0(n0 p0){
       a.p(p0, "mFactory");
       super();
       this.a = p0;
    }
    public abstract void a(PresenterV2 p0);
    public abstract void b(Object[] p0);
    public abstract void c(View p0);
    public abstract void d();
    public abstract PresenterV2 e();
    public final n0 f(){
       return this.a;
    }
    public abstract boolean g();
}
