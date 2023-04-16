package androidx.appcompat.app.AlertController$RecycleListView;
import android.widget.ListView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;

public class AlertController$RecycleListView extends ListView	// class@00055a
{
    public final int b;
    public final int c;

    public void AlertController$RecycleListView(Context p0){
       super(p0, null);
    }
    public void AlertController$RecycleListView(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.z4);
       this.c = typedArray.getDimensionPixelOffset(0, -1);
       this.b = typedArray.getDimensionPixelOffset(1, -1);
    }
    public void a(boolean p0,boolean p1){
       if (!p1 || !p0) {
          int paddingLeft = this.getPaddingLeft();
          int paddingTop = (p0)? this.getPaddingTop(): this.b;
          int paddingRight = this.getPaddingRight();
          int paddingBotto = (p1)? this.getPaddingBottom(): this.c;
          this.setPadding(paddingLeft, paddingTop, paddingRight, paddingBotto);
       }
       return;
    }
}
