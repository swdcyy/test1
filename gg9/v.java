package gg9.v;
import erd.o;
import com.yxcorp.gifshow.camera.record.permission.c;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class v implements o	// class@002488
{
    public final c b;

    public void v(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = this.b;
       p0.b(1669);
       String[] stringArray = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO"};
       return PermissionUtils.j(p0.l, stringArray);
    }
}
