package dc.b;
import dc.a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import dc.d;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public class b implements a	// class@001e32
{
    public a a;
    public int b;
    public ColorFilter c;
    public Rect d;

    public void b(a p0){
       super();
       this.b = -1;
       this.a = p0;
    }
    public a a(){
       return this.a;
    }
    public void clear(){
       b ta = this.a;
       if (ta != null) {
          ta.clear();
       }
       return;
    }
    public boolean drawFrame(Drawable p0,Canvas p1,int p2){
       b ta = this.a;
       boolean b = (ta != null && ta.drawFrame(p0, p1, p2))? true: false;
       return b;
    }
    public int getFrameCount(){
       b ta = this.a;
       int i = (ta == null)? 0: ta.getFrameCount();
       return i;
    }
    public int getFrameDurationMs(int p0){
       b ta = this.a;
       p0 = (ta == null)? 0: ta.getFrameDurationMs(p0);
       return p0;
    }
    public int getIntrinsicHeight(){
       b ta = this.a;
       int i = (ta == null)? -1: ta.getIntrinsicHeight();
       return i;
    }
    public int getIntrinsicWidth(){
       b ta = this.a;
       int i = (ta == null)? -1: ta.getIntrinsicWidth();
       return i;
    }
    public int getLoopCount(){
       b ta = this.a;
       int i = (ta == null)? 0: ta.getLoopCount();
       return i;
    }
    public int getSizeInBytes(){
       b ta = this.a;
       int i = (ta == null)? 0: ta.getSizeInBytes();
       return i;
    }
    public void setAlpha(int p0){
       b ta = this.a;
       if (ta != null) {
          ta.setAlpha(p0);
       }
       this.b = p0;
       return;
    }
    public void setBounds(Rect p0){
       b ta = this.a;
       if (ta != null) {
          ta.setBounds(p0);
       }
       this.d = p0;
       return;
    }
    public void setColorFilter(ColorFilter p0){
       b ta = this.a;
       if (ta != null) {
          ta.setColorFilter(p0);
       }
       this.c = p0;
       return;
    }
}
