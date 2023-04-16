package androidx.lifecycle.VMAutoDisposeHelper;
import java.io.Closeable;
import brd.x;
import java.lang.Object;
import crd.a;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import brd.w;
import qrd.l1;

public final class VMAutoDisposeHelper implements Closeable, x	// class@000800
{
    public final a closeSignal;
    public final a compositeDisposable;

    public void VMAutoDisposeHelper(){
       super();
       this.compositeDisposable = new a();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Unit>\(\)");
       this.closeSignal = uoa;
    }
    public w apply(t p0){
       a.p(p0, "upstream");
       p0 = p0.takeUntil(this.closeSignal);
       a.o(p0, "upstream.takeUntil\(closeSignal\)");
       return p0;
    }
    public void close(){
       this.compositeDisposable.dispose();
       this.closeSignal.onNext(l1.a);
    }
    public final a getCompositeDisposable(){
       return this.compositeDisposable;
    }
}
