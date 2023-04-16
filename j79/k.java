package j79.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$b;

public final class k implements Runnable	// class@00277f
{
    public final MediaPreviewGenerateCoverManager b;
    public final MediaPreviewGenerateCoverManager$a c;

    public void k(MediaPreviewGenerateCoverManager p0,MediaPreviewGenerateCoverManager$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       k tb = this.b;
       k tc = this.c;
       tb.b.remove(tc);
       tb.a = false;
       MediaPreviewGenerateCoverManager c = tb.c;
       if (c != null) {
          c.a(tc.a);
       }
       tb.a();
       return;
    }
}
