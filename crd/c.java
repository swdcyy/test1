package crd.c;
import crd.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.lang.Runnable;
import erd.a;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.disposables.ActionDisposable;
import io.reactivex.disposables.RunnableDisposable;

public final class c	// class@001432
{

    public static b a(){
       return EmptyDisposable.INSTANCE;
    }
    public static b b(){
       return c.d(Functions.b);
    }
    public static b c(a p0){
       a.c(p0, "run is null");
       return new ActionDisposable(p0);
    }
    public static b d(Runnable p0){
       a.c(p0, "run is null");
       return new RunnableDisposable(p0);
    }
}
