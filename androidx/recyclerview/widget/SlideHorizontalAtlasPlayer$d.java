package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$d;
import y8c.g;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import java.util.List;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import android.content.Context;
import xb.t$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b;
import android.view.View;
import ml8.c;

public final class SlideHorizontalAtlasPlayer$d extends g	// class@0008b7
{
    public final SlideHorizontalAtlasPlayer w;

    public void SlideHorizontalAtlasPlayer$d(SlideHorizontalAtlasPlayer p0){
       this.w = p0;
       super();
    }
    public int getItemCount(){
       return this.Q0().size();
    }
    public f h1(ViewGroup p0,int p1){
       a.p(p0, "parent");
       Context context = p0.getContext();
       a.o(context, "parent.context");
       SlideAtlasItemView slideAtlasIt = new SlideAtlasItemView(context);
       if (this.w.getItemImageScaleType() != null) {
          a hierarchy = slideAtlasIt.getImageView().getHierarchy();
          a.o(hierarchy, "view.imageView.hierarchy");
          hierarchy.u(this.w.getItemImageScaleType());
       }
       if (this.w.getItemBackground() != null) {
          slideAtlasIt.setBackground(this.w.getItemBackground());
       }
       return new f(slideAtlasIt, new SlideHorizontalAtlasPlayer$b(this.w, p0));
    }
}
