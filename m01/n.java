package m01.n;
import ml8.d;
import com.yxcorp.gifshow.widget.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.view.View$OnClickListener;

public class n implements d	// class@0030a7
{
    public int b;
    public int c;
    public int d;
    public m e;
    public boolean f;
    public View g;
    public View h;

    public void n(int p0,int p1,m p2){
       super();
       this.d = 1;
       this.b = p0;
       this.c = p1;
       this.e = p2;
    }
    public int a(){
       return this.d;
    }
    public View b(){
       return this.h;
    }
    public View c(){
       return this.g;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.h = m1.f(p0, this.c);
       p0 = m1.f(p0, this.b);
       this.g = p0;
       p0.setOnClickListener(this.e);
       return;
    }
}
