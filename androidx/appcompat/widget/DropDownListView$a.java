package androidx.appcompat.widget.DropDownListView$a;
import s0.c;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;

public class DropDownListView$a extends c	// class@0005fe
{
    public boolean c;

    public void DropDownListView$a(Drawable p0){
       super(p0);
       this.c = true;
    }
    public void c(boolean p0){
       this.c = p0;
    }
    public void draw(Canvas p0){
       if (this.c != null) {
          super.draw(p0);
       }
       return;
    }
    public void setHotspot(float p0,float p1){
       if (this.c != null) {
          super.setHotspot(p0, p1);
       }
       return;
    }
    public void setHotspotBounds(int p0,int p1,int p2,int p3){
       if (this.c != null) {
          super.setHotspotBounds(p0, p1, p2, p3);
       }
       return;
    }
    public boolean setState(int[] p0){
       if (this.c != null) {
          return super.setState(p0);
       }
       return false;
    }
    public boolean setVisible(boolean p0,boolean p1){
       if (this.c != null) {
          return super.setVisible(p0, p1);
       }
       return false;
    }
}
