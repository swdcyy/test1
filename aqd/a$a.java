package aqd.a$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import aqd.a;
import java.lang.Object;

public class a$a implements ViewTreeObserver$OnPreDrawListener	// class@00021a
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       this.b.n();
       return true;
    }
}
