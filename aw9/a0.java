package aw9.a0;
import java.lang.Runnable;
import com.yxcorp.gifshow.decoration.widget.DecorationView;
import java.lang.Object;

public final class a0 implements Runnable	// class@0002c2
{
    public final DecorationView b;

    public void a0(DecorationView p0){
       this.b = p0;
    }
    public final void run(){
       DecorationView.a(this.b);
    }
}
