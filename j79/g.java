package j79.g;
import erd.g;
import com.yxcorp.gifshow.album.preview.MediaPreviewActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class g implements g	// class@002776
{
    public final MediaPreviewActivity b;

    public void g(MediaPreviewActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       Log.e("MediaPreviewActivity", "accept: ", p0);
       tb.f = null;
    }
}
