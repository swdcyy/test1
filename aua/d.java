package aua.d;
import java.util.concurrent.Callable;
import aua.e;
import java.lang.Object;
import java.lang.String;

public final class d implements Callable	// class@000309
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final Object call(){
       return this.b.P8();
    }
}
