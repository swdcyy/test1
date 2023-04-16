package l79.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager;
import l79.m;

public final class h implements Runnable	// class@002cbd
{
    public final AlbumSelectedContainer b;

    public void h(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       float f = (float)((this.b.D().computeHorizontalScrollRange() - this.b.D().computeHorizontalScrollExtent()) - this.b.D().computeHorizontalScrollOffset()) + (float)1;
       float f1 = (f - 0x447a0000 < 0)? 100.00f: 200.00f;
       f1 = f1 / f;
       Log.b("MediaSelectManager", "onMediaItemClicked\(\) called with: "+"range = ["+this.b.D().computeHorizontalScrollRange()+"]  "+"offset = ["+this.b.D().computeHorizontalScrollOffset()+"]  "+"extend = ["+this.b.D().computeHorizontalScrollExtent()+"]  "+"speed = ["+f1+"], distance = ["+f+']');
       AlbumSelectedContainer y = this.b.y;
       if (y != null) {
          y.W0(f1);
       }
       if ((AlbumSelectedContainer.f(this.b).Z0() - 1) > 0) {
          this.b.D().smoothScrollToPosition((AlbumSelectedContainer.f(this.b).Z0() - 1));
       }
       return;
    }
}
