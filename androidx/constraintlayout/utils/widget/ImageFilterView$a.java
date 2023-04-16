package androidx.constraintlayout.utils.widget.ImageFilterView$a;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import android.view.View;
import android.graphics.Outline;
import android.widget.ImageView;
import java.lang.Math;

public class ImageFilterView$a extends ViewOutlineProvider	// class@0006a8
{
    public final ImageFilterView a;

    public void ImageFilterView$a(ImageFilterView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       int width = this.a.getWidth();
       int height = this.a.getHeight();
       p1.setRoundRect(0, 0, width, height, (((float)Math.min(width, height) * this.a.g) / 2.00f));
    }
}
