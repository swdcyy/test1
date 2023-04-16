package n90.f;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import java.lang.Object;
import java.util.Objects;
import u80.e;
import java.lang.String;
import q87.c;
import android.app.Activity;

public final class f implements Runnable	// class@0026d3
{
    public final KSPostAlbumProcessActivity b;

    public void f(KSPostAlbumProcessActivity p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       e.D().A("KSPostAlbumProcessActivity", "ServerSupportDialog onCancel", objArray);
       tb.setResult(0);
       tb.finish();
    }
}
