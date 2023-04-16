package a2.i0$b;
import a2.i0$g;
import java.lang.Class;
import android.view.View;
import java.lang.Object;
import java.lang.Boolean;

public class i0$b extends i0$g	// class@000061
{

    public void i0$b(int p0,Class p1,int p2){
       super(p0, p1, p2);
    }
    public Object b(View p0){
       return this.e(p0);
    }
    public void c(View p0,Object p1){
       this.f(p0, p1);
    }
    public Boolean e(View p0){
       return Boolean.valueOf(p0.isScreenReaderFocusable());
    }
    public void f(View p0,Boolean p1){
       p0.setScreenReaderFocusable(p1.booleanValue());
    }
}
