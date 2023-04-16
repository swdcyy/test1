package a42.b;
import y8c.g;
import y8c.f;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import a42.f;
import ml8.c;
import a42.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import g9c.a;
import a42.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class b extends g	// class@000034
{
    public boolean w;
    public QPhoto x;
    public a y;

    public void b(){
       super(false);
    }
    public void b(boolean p0){
       super();
       this.w = p0;
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       this.n1("PHOTO_FEED_SIDE_BAR_PAY_LOADS", p2);
       super.g1(p0, p1, p2);
       return;
    }
    public f h1(ViewGroup p0,int p1){
       f obj;
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b = false;
       obj = (this.w != null)? new f(a.k(p0, 0x7f0d0aa5, b), new f(this)): new f(a.k(p0, 0x7f0d0aa4, b), new d(this));
       return obj;
    }
    public QPhoto r1(){
       return this.x;
    }
    public int s1(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Q0().indexOf(p0);
    }
    public void t1(a p0){
       this.y = p0;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
