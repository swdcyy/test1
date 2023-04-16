package androidx.fragment.app.f$c;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import androidx.collection.ArrayMap;
import android.view.View;
import k2.f;
import android.graphics.Rect;
import java.lang.Object;
import androidx.fragment.app.f;

public final class f$c implements Runnable	// class@0007ac
{
    public final Fragment b;
    public final Fragment c;
    public final boolean d;
    public final ArrayMap e;
    public final View f;
    public final f g;
    public final Rect h;

    public void f$c(Fragment p0,Fragment p1,boolean p2,ArrayMap p3,View p4,f p5,Rect p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void run(){
       f.f(this.b, this.c, this.d, this.e, false);
       f$c tf = this.f;
       if (tf != null) {
          this.g.k(tf, this.h);
       }
       return;
    }
}
