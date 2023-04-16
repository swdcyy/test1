package bzc.a;
import android.widget.TextView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;

public class a	// class@0004bd
{
    public TextView a;
    public boolean b;

    public void a(TextView p0){
       super();
       this.a = p0;
    }
    public void a(Drawable p0,float p1){
       if (p0 == null) {
          return;
       }
       Rect bounds = p0.getBounds();
       p0.setBounds(0, 0, (int)((float)bounds.right * p1), (int)((float)bounds.bottom * p1));
       return;
    }
    public void b(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (this.b == null) {
          return;
       }
       Configuration fontScale = this.a.getContext().getResources().getConfiguration().fontScale;
       if (!fontScale - 0x3f800000) {
          return;
       }
       this.a(p0, fontScale);
       this.a(p1, fontScale);
       this.a(p2, fontScale);
       this.a(p3, fontScale);
       return;
    }
}
