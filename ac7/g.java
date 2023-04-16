package ac7.g;
import erd.o;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import brd.t;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;

public final class g implements o	// class@0000a6
{
    public final g b;
    public final Activity c;
    public final String d;

    public void g(g p0,Activity p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       return KsAlbumPermissionUtils.e(this.b, this.c, this.d);
    }
}
