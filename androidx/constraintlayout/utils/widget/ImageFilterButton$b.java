package androidx.constraintlayout.utils.widget.ImageFilterButton$b;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;
import android.view.View;
import android.graphics.Outline;
import android.widget.ImageButton;

public class ImageFilterButton$b extends ViewOutlineProvider	// class@0006a6
{
    public final ImageFilterButton a;

    public void ImageFilterButton$b(ImageFilterButton p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       p1.setRoundRect(0, 0, this.a.getWidth(), this.a.getHeight(), this.a.g);
    }
}
