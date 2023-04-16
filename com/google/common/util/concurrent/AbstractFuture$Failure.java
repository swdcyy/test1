package com.google.common.util.concurrent.AbstractFuture$Failure;
import com.google.common.util.concurrent.AbstractFuture$Failure$1;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import ok.n;

public final class AbstractFuture$Failure	// class@001922
{
    public final Throwable a;
    public static final AbstractFuture$Failure b;

    static {
       AbstractFuture$Failure.b = new AbstractFuture$Failure(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
    }
    public void AbstractFuture$Failure(Throwable p0){
       super();
       n.j(p0);
       this.a = p0;
    }
}
