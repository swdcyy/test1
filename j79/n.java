package j79.n;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import j79.l0;

public final class n implements Runnable	// class@002785
{
    public final MediaPreviewSelectViewStub b;
    public final int c;

    public void n(MediaPreviewSelectViewStub p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       double d = ((double)(this.b.m().computeHorizontalScrollRange() / this.b.w.D0().size()) * ((double)this.c + 0x3fe0000000000000)) - (double)(((float)this.b.m().computeHorizontalScrollExtent() * 0x3f800000) / (float)2);
       if (d - (double)0 > 0) {
          this.b.m().scrollBy((int)d, 0);
       }
       return;
    }
}
