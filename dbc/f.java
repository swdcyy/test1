package dbc.f;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;

public final class f implements g	// class@002160
{
    public final Promise b;

    public void f(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.reject(p0);
    }
}
