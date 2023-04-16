package androidx.appcompat.widget.DialogTitle;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.text.Layout;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;

public class DialogTitle extends AppCompatTextView	// class@0005fd
{

    public void DialogTitle(Context p0){
       super(p0);
    }
    public void DialogTitle(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DialogTitle(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       Layout layout = this.getLayout();
       if (layout != null) {
          int lineCount = layout.getLineCount();
          if (lineCount > 0 && layout.getEllipsisCount((lineCount - 1)) > 0) {
             this.setSingleLine(false);
             this.setMaxLines(2);
             TypedArray typedArray = this.getContext().obtainStyledAttributes(null, c$b.E5, 0x1010041, 0x1030044);
             int dimensionPix = typedArray.getDimensionPixelSize(false, false);
             if (dimensionPix) {
                this.setTextSize(false, (float)dimensionPix);
             }
             typedArray.recycle();
             super.onMeasure(p0, p1);
          }
       }
       return;
    }
}
