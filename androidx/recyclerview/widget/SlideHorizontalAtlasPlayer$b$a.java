package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$a;
import ub.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b;
import java.lang.String;
import bd.f;
import android.graphics.drawable.Animatable;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$c;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import ud5.e;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import ud5.c;
import id5.v;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import java.lang.Throwable;

public final class SlideHorizontalAtlasPlayer$b$a extends a	// class@0008b0
{
    public final SlideHorizontalAtlasPlayer$b b;

    public void SlideHorizontalAtlasPlayer$b$a(SlideHorizontalAtlasPlayer$b p0){
       this.b = p0;
       super();
    }
    public void a(String p0,f p1,Animatable p2){
       SlideHorizontalAtlasPlayer x;
       SlideHorizontalAtlasPlayer$b.S8(this.b).g(true);
       SlideHorizontalAtlasPlayer$b.S8(this.b).f(true);
       SlideHorizontalAtlasPlayer$b$a tb = this.b;
       SlideHorizontalAtlasPlayer$b w = tb.w;
       boolean b = false;
       if (w.v != null) {
          if (w.getCurrentPosition() == SlideHorizontalAtlasPlayer$b.S8(this.b).c()) {
             x = this.b.w.x;
             if (x != null) {
                x.d(b);
             }
          }
       }else {
          SlideHorizontalAtlasPlayer$b.R8(tb).setVisibility(8);
       }
       if (!SlideHorizontalAtlasPlayer$b.S8(this.b).c()) {
          x = this.b.w.w;
          if (x != null) {
             x.b();
          }
       }
       Object[] objArray = new Object[b];
       v.C().s("SlideAtlasRecyclerView", "loadCoverV1 onFinalImageSet: Õº∆¨º”‘ÿ≥…π¶£°£°"+SlideHorizontalAtlasPlayer$b.S8(this.b).c(), objArray);
       return;
    }
    public void onFailure(String p0,Throwable p1){
       SlideHorizontalAtlasPlayer w;
       boolean b = true;
       SlideHorizontalAtlasPlayer$b.S8(this.b).g(b);
       boolean b1 = false;
       SlideHorizontalAtlasPlayer$b.S8(this.b).f(b1);
       if (!SlideHorizontalAtlasPlayer$b.S8(this.b).c()) {
          w = this.b.w.w;
          if (w != null) {
             w.onFailure(p1);
          }
       }
       SlideHorizontalAtlasPlayer$b w1 = this.b.w;
       if (w1.v != null && w1.getCurrentPosition() == SlideHorizontalAtlasPlayer$b.S8(this.b).c()) {
          w = this.b.w.x;
          if (w != null) {
             w.d(b);
          }
       }
       Object[] objArray = new Object[b1];
       v.C().s("SlideAtlasRecyclerView", "loadCoverV1 onFailure: Õº∆¨º”‘ÿ ß∞‹£°£°"+SlideHorizontalAtlasPlayer$b.S8(this.b).c(), objArray);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       this.a(p0, p1, p2);
    }
}
