package io.reactivex.internal.util.ExceptionHelper$Termination;
import java.lang.Throwable;
import java.lang.String;

public final class ExceptionHelper$Termination extends Throwable	// class@0014ca
{
    public static final long serialVersionUID = 0xbf78ef258dae43e4;

    public void ExceptionHelper$Termination(){
       super("No further exceptions");
    }
    public Throwable fillInStackTrace(){
       return this;
    }
}
