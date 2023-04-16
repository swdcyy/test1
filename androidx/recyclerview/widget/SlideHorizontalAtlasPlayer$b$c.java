package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import id5.v;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$c;
import q87.c;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;

public final class SlideHorizontalAtlasPlayer$b$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@0008b2
{
    public final SlideHorizontalAtlasPlayer$b b;

    public void SlideHorizontalAtlasPlayer$b$c(SlideHorizontalAtlasPlayer$b p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       ViewTreeObserver viewTreeObse = SlideHorizontalAtlasPlayer$b.P8(this.b).getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideAtlasRecyclerView", " mImageView.viewTreeObserver adjustCoverSize: "+SlideHorizontalAtlasPlayer$b.S8(this.b).c(), objArray);
       SlideHorizontalAtlasPlayer$b$c tb = this.b;
       View view = tb.m8();
       a.o(view, "rootView");
       tb.V8(view);
       return;
    }
}
