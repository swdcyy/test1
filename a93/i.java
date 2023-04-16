package a93.i;
import java.util.concurrent.Callable;
import com.kuaishou.live.lite.background.b;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class i implements Callable	// class@00008a
{
    public final b b;

    public void i(b p0){
       this.b = p0;
    }
    public final Object call(){
       return this.b.D2().getResources().getDrawable(0x7f08109b);
    }
}
