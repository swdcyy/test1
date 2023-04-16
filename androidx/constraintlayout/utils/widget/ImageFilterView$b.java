package androidx.constraintlayout.utils.widget.ImageFilterView$b;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import android.view.View;
import android.graphics.Outline;
import android.widget.ImageView;

public class ImageFilterView$b extends ViewOutlineProvider	// class@0006a9
{
    public final ImageFilterView a;

    public void ImageFilterView$b(ImageFilterView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       p1.setRoundRect(0, 0, this.a.getWidth(), this.a.getHeight(), this.a.h);
    }
}
