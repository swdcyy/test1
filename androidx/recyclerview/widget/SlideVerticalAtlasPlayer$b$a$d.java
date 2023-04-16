package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a;
import java.lang.Object;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public final class SlideVerticalAtlasPlayer$b$a$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@0008c6
{
    public final SlideVerticalAtlasPlayer$b$a b;

    public void SlideVerticalAtlasPlayer$b$a$d(SlideVerticalAtlasPlayer$b$a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       ViewTreeObserver viewTreeObse = this.b.d().getImageView().getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       this.b.a();
       return;
    }
}
