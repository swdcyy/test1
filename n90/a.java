package n90.a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import java.lang.Object;
import android.content.DialogInterface;
import n90.g;

public final class a implements DialogInterface$OnCancelListener	// class@0026ce
{
    public final KSPostAlbumProcessActivity b;

    public void a(KSPostAlbumProcessActivity p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       this.b.V.c(true);
    }
}
