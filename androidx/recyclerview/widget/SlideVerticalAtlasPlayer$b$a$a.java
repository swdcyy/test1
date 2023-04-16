package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a;
import java.lang.Object;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class SlideVerticalAtlasPlayer$b$a$a implements Runnable	// class@0008c3
{
    public final SlideVerticalAtlasPlayer$b$a b;

    public void SlideVerticalAtlasPlayer$b$a$a(SlideVerticalAtlasPlayer$b$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.d().getImageView().requestLayout();
    }
}
