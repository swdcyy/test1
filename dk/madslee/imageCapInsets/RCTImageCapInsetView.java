package dk.madslee.imageCapInsets.RCTImageCapInsetView;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.Rect;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.StringBuilder;
import java.lang.String;
import vpd.a;
import java.lang.Object;
import java.util.HashMap;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import wpd.b;
import dk.madslee.imageCapInsets.RCTImageCapInsetView$a;
import wpd.a;
import android.os.AsyncTask;

public class RCTImageCapInsetView extends ImageView	// class@000ccf
{
    public Rect b;
    public String c;

    public void RCTImageCapInsetView(Context p0){
       super(p0);
       this.b = new Rect();
    }
    public int a(float p0){
       return (int)((p0 * c.c(this.getResources()).density) + 0x3f000000);
    }
    public void b(){
       String str = this.c+"-"+this.b.toShortString();
       if (a.b == null) {
          a.b = new a();
       }
       a b = a.b;
       if (b.a.containsKey(str)) {
          this.setBackground(b.a.get(str).getConstantState().newDrawable());
          return;
       }else {
          String[] stringArray = new String[0];
          new b(this.c, this.getContext(), new RCTImageCapInsetView$a(this, b, str)).execute(stringArray);
          return;
       }
    }
    public void setCapInsets(Rect p0){
       this.b = p0;
       if (this.c != null) {
          this.b();
       }
       return;
    }
    public void setSource(String p0){
       this.c = p0;
       this.b();
    }
}
