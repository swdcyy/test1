package frd.a;
import brd.t;
import crd.b;
import io.reactivex.internal.util.e;
import erd.g;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import ird.a;

public abstract class a extends t	// class@000e5a
{

    public void a(){
       super();
    }
    public final b b(){
       e uoe = new e();
       this.c(uoe);
       return uoe.b;
    }
    public abstract void c(g p0);
    public t d(){
       return a.h(new ObservableRefCount(this));
    }
}
