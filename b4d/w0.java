package b4d.w0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import b4d.v0;
import android.graphics.drawable.Drawable;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;

public class w0 implements ViewTreeObserver$OnGlobalLayoutListener	// class@00039c
{
    public final int b;
    public final int c;
    public final Drawable d;
    public final EmotionInfo e;
    public final v0 f;

    public void w0(v0 p0,int p1,int p2,Drawable p3,EmotionInfo p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onGlobalLayout(){
       boolean b = PatchProxy.applyVoid(null, this, w0.class, "1");
       if (b) {
          return;
       }
       w0 tf = this.f;
       tf.Y8(tf.F, this.b, this.c, this.d, this.e);
       this.f.z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
