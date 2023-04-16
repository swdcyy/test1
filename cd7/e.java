package cd7.e;
import java.util.concurrent.Callable;
import java.io.File;
import java.lang.Object;
import cd7.g;
import java.util.List;

public final class e implements Callable	// class@000535
{
    public final File b;

    public void e(File p0){
       this.b = p0;
    }
    public final Object call(){
       return g.a(this.b, g.b, g.c);
    }
}
