package hg9.v0;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;

public final class v0 implements View$OnTouchListener	// class@00267b
{
    public final p b;

    public void v0(p p0){
       super();
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       v0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w(tb.a, "captureFinish is showing, intercept touch event!", objArray);
       return true;
    }
}
