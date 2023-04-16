package u8a.q;
import u8a.q$b;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import u8a.b;
import msd.a;
import java.util.List;
import u8a.q$a;
import kotlin.Pair;
import qvb.i;

public interface abstract q	// class@003d1a
{
    public static final q$b M0;

    static {
       q.M0 = q$b.a;
    }
    void Dd(FragmentActivity p0);
    int G4();
    void Ig(FragmentActivity p0,String p1,int p2,QPhoto p3,int p4,b p5,boolean p6,a p7);
    void Y2(List p0);
    void Z9(FragmentActivity p0,String p1);
    boolean d();
    void g6(q$a p0);
    Pair getCursor();
    int kg();
    List r8();
    void ve(int p0);
    i wg();
    void ze();
}
