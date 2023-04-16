package mg.o1;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class o1 implements o	// class@002643
{
    public final GifshowActivity b;

    public void o1(GifshowActivity p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO","android.permission.WRITE_EXTERNAL_STORAGE"};
       return PermissionUtils.j(this.b, p0);
    }
}
