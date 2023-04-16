package kb.c;
import java.lang.Throwable;
import kb.e;
import java.util.concurrent.Executor;
import java.util.Map;
import java.lang.Object;

public interface abstract c	// class@002498
{

    boolean a();
    boolean c();
    boolean close();
    boolean d();
    Throwable e();
    void f(e p0,Executor p1);
    Map getExtras();
    float getProgress();
    Object getResult();
    boolean hasResult();
    boolean isClosed();
}
