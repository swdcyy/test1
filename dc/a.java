package dc.a;
import dc.d;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public interface abstract a implements d	// class@001e31
{

    void clear();
    boolean drawFrame(Drawable p0,Canvas p1,int p2);
    int getIntrinsicHeight();
    int getIntrinsicWidth();
    int getSizeInBytes();
    void setAlpha(int p0);
    void setBounds(Rect p0);
    void setColorFilter(ColorFilter p0);
}
