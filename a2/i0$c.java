package a2.i0$c;
import a2.i0$g;
import java.lang.Class;
import android.view.View;
import java.lang.Object;
import java.lang.CharSequence;

public class i0$c extends i0$g	// class@000062
{

    public void i0$c(int p0,Class p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public Object b(View p0){
       return this.e(p0);
    }
    public void c(View p0,Object p1){
       this.f(p0, p1);
    }
    public CharSequence e(View p0){
       return p0.getAccessibilityPaneTitle();
    }
    public void f(View p0,CharSequence p1){
       p0.setAccessibilityPaneTitle(p1);
    }
}