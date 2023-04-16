package th2.d;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;

public abstract class d	// class@0043a9
{
    public ViewGroup a;
    public View b;

    public void d(ViewGroup p0){
       super();
       this.a = p0;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
       }else if(this.a() <= 0){
          this.b = a.d(this.a.getContext(), this.a(), this.a, false);
       }
       return;
    }
    public abstract int a();
    public View b(){
       return this.b;
    }
}
