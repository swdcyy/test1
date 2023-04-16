package k41.a;
import rp5.a;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import k41.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Number;

public class a implements a	// class@002c89
{
    public Activity b;
    public final BaseFragment c;
    public b d;

    public void a(Activity p0,BaseFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void a(Activity p0,BaseFragment p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public boolean A4(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.isDetached();
    }
    public boolean X4(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.X4();
       }
       return this.c.isResumed();
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getFragmentManager();
    }
    public Activity c(){
       return this.b;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public c getChildFragmentManager(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getChildFragmentManager();
    }
    public boolean isAdded(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.isAdded();
    }
    public long s0(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.s0();
       }
       return 0;
    }
    public BaseFragment t(){
       return this.c;
    }
}
