package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$b;
import android.view.View$OnLayoutChangeListener;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b;
import java.lang.Object;
import android.view.View;
import id5.v;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$c;
import q87.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;

public final class SlideHorizontalAtlasPlayer$b$b implements View$OnLayoutChangeListener	// class@0008b1
{
    public final SlideHorizontalAtlasPlayer$b b;

    public void SlideHorizontalAtlasPlayer$b$b(SlideHorizontalAtlasPlayer$b p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if ((p1 - p3) != (p5 - p7) || (p2 - p4) != (p6 - p8)) {
          Object[] objArray = new Object[0];
          v.C().w("SlideAtlasRecyclerView", "mLayoutChangeListener adjustCoverSize: "+SlideHorizontalAtlasPlayer$b.S8(this.b).c(), objArray);
          SlideHorizontalAtlasPlayer$b$b tb = this.b;
          View view = tb.m8();
          a.o(view, "rootView");
          tb.V8(view);
       }
       return;
    }
}
