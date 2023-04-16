package kb.a;
import java.lang.Runnable;
import com.facebook.datasource.AbstractDataSource;
import kb.e;
import java.lang.Object;
import kb.c;

public class a implements Runnable	// class@002496
{
    public final e b;
    public final AbstractDataSource c;

    public void a(AbstractDataSource p0,e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.onProgressUpdate(this.c);
    }
}
