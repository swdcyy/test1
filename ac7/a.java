package ac7.a;
import u07.u;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;

public final class a implements u	// class@0000a0
{
    public final Activity b;

    public void a(Activity p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       KsAlbumPermissionUtils.i(this.b);
    }
}
