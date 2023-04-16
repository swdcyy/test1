package ond.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;

public final class b implements ViewTreeObserver$OnGlobalLayoutListener	// class@002024
{
    public final AtlasOrSinglePictureSubViewBinder b;
    public final a c;

    public void b(AtlasOrSinglePictureSubViewBinder p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.invoke();
       return;
    }
}
