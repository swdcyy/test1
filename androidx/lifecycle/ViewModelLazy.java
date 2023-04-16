package androidx.lifecycle.ViewModelLazy;
import qrd.p;
import vsd.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelProvider;
import java.lang.Class;
import lsd.a;

public final class ViewModelLazy implements p	// class@000803
{
    public ViewModel cached;
    public final a factoryProducer;
    public final a storeProducer;
    public final d viewModelClass;

    public void ViewModelLazy(d p0,a p1,a p2){
       a.q(p0, "viewModelClass");
       a.q(p1, "storeProducer");
       a.q(p2, "factoryProducer");
       super();
       this.viewModelClass = p0;
       this.storeProducer = p1;
       this.factoryProducer = p2;
    }
    public ViewModel getValue(){
       ViewModelLazy tcached = this.cached;
       if (tcached == null) {
          tcached = new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke()).get(a.c(this.viewModelClass));
          this.cached = tcached;
          a.h(tcached, "ViewModelProvider\(store,¡­ed = it\n                }");
       }
       return tcached;
    }
    public Object getValue(){
       return this.getValue();
    }
    public boolean isInitialized(){
       boolean b = (this.cached != null)? true: false;
       return b;
    }
}
