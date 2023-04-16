package io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.Object;

public final class AtomicThrowable extends AtomicReference	// class@00194f
{
    public static final long serialVersionUID = 0x36ce8ce03b5e1eab;

    public void AtomicThrowable(){
       super();
    }
    public boolean addThrowable(Throwable p0){
       return ExceptionHelper.a(this, p0);
    }
    public boolean isTerminated(){
       boolean b = (this.get() == ExceptionHelper.a)? true: false;
       return b;
    }
    public Throwable terminate(){
       return ExceptionHelper.b(this);
    }
}
