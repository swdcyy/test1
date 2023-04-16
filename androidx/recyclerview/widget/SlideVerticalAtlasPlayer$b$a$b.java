package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$b;
import java.lang.Runnable;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a;
import java.lang.Object;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class SlideVerticalAtlasPlayer$b$a$b implements Runnable	// class@0008c4
{
    public final SlideVerticalAtlasPlayer$b$a b;

    public void SlideVerticalAtlasPlayer$b$a$b(SlideVerticalAtlasPlayer$b$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.d().getImageView().requestLayout();
    }
}
