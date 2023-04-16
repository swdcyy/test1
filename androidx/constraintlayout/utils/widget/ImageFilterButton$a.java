package androidx.constraintlayout.utils.widget.ImageFilterButton$a;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;
import android.view.View;
import android.graphics.Outline;
import android.widget.ImageButton;
import java.lang.Math;

public class ImageFilterButton$a extends ViewOutlineProvider	// class@0006a5
{
    public final ImageFilterButton a;

    public void ImageFilterButton$a(ImageFilterButton p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       int width = this.a.getWidth();
       int height = this.a.getHeight();
       p1.setRoundRect(0, 0, width, height, (((float)Math.min(width, height) * this.a.f) / 2.00f));
    }
}
