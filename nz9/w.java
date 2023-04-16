package nz9.w;
import ok.h;
import nz9.z0;
import java.lang.Object;
import java.lang.Void;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import nz9.o;
import sfc.a;
import erd.g;
import crd.b;

public final class w implements h	// class@003253
{
    public final z0 b;

    public void w(z0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       w tb = this.b;
       o oo = new o(tb);
       return tb.u.getUser().observable().subscribe(oo, new a());
    }
}
