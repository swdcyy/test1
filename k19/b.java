package k19.b;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator;
import java.lang.Object;
import k19.b$a;
import k19.b$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import android.os.Handler;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;

public class b	// class@002a7b
{
    public RecyclerViewPager a;
    public RecyclerViewPagerIndicator b;
    public boolean c;
    public int d;
    public int e;
    public RecyclerViewPager$b f;
    public long g;
    public RecyclerViewPager$c h;
    public final Handler i;

    public void b(RecyclerViewPager p0,RecyclerViewPagerIndicator p1,int p2){
       super();
       this.c = false;
       this.g = 3000;
       this.h = new b$a(this);
       this.i = new b$b(this);
       this.a = p0;
       this.b = p1;
       this.e = p2;
    }
    public int a(int p0,int p1){
       return (p0 % p1);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.a.getAdapter() == null) {
          return;
       }
       this.a.x(this.h);
       this.i.sendEmptyMessageDelayed(0, this.g);
       return;
    }
    public void c(RecyclerViewPager$b p0){
       this.f = p0;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       this.i.removeCallbacksAndMessages(objArray);
       this.a.y(this.h);
       return;
    }
}
