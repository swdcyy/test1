package j79.m;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
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

public final class m implements Runnable	// class@002783
{
    public final MediaPreviewSelectViewStub b;

    public void m(MediaPreviewSelectViewStub p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       float f = (float)((this.b.m().computeHorizontalScrollRange() - this.b.m().computeHorizontalScrollExtent()) - this.b.m().computeHorizontalScrollOffset()) + (float)1;
       float f1 = (f - 0x447a0000 < 0)? 100.00f: 200.00f;
       f1 = f1 / f;
       Log.b("MediaPreviewSelectViewStub", "onSelectItemAdd\(\) called with: "+"range = ["+this.b.m().computeHorizontalScrollRange()+"]  "+"offset = ["+this.b.m().computeHorizontalScrollOffset()+"]  "+"extend = ["+this.b.m().computeHorizontalScrollExtent()+"]  "+"speed = ["+f1+"], distance = ["+f+']');
       MediaPreviewSelectViewStub n = this.b.n;
       if (n != null) {
          n.W0(f1);
       }
       if ((MediaPreviewSelectViewStub.h(this.b).Z0() - 1) > 0) {
          this.b.m().smoothScrollToPosition((MediaPreviewSelectViewStub.h(this.b).Z0() - 1));
       }
       return;
    }
}
