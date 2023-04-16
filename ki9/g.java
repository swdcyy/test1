package ki9.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Object;
import android.content.res.Resources;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;

public final class g implements Runnable	// class@002c94
{
    public final FocusView b;

    public void g(FocusView p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       tb.e = tb.getResources().getDrawable(0x7f082017);
       tb.f = tb.getResources().getDrawable(0x7f08201a);
       tb.g.setColor(tb.getResources().getColor(R.color.arg_RES_7f062041));
    }
}
