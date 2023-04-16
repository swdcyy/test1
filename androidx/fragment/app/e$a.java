package androidx.fragment.app.e$a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;

public final class e$a	// class@0007a8
{
    public int a;
    public Fragment b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Lifecycle$State g;
    public Lifecycle$State h;

    public void e$a(){
       super();
    }
    public void e$a(int p0,Fragment p1){
       super();
       this.a = p0;
       this.b = p1;
       Lifecycle$State rESUMED = Lifecycle$State.RESUMED;
       this.g = rESUMED;
       this.h = rESUMED;
    }
    public void e$a(int p0,Fragment p1,Lifecycle$State p2){
       super();
       this.a = p0;
       this.b = p1;
       this.g = p1.mMaxState;
       this.h = p2;
    }
}
