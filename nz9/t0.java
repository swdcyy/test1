package nz9.t0;
import msd.a;
import nz9.z0;
import java.lang.Object;
import java.util.Objects;
import o76.b;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class t0 implements a	// class@003247
{
    public final z0 b;

    public void t0(z0 p0){
       this.b = p0;
    }
    public final Object invoke(){
       t0 tb = this.b;
       Objects.requireNonNull(tb);
       b uob = new b(tb.u.getPhotoId(), null, null, -1, 31, null);
       return v8;
    }
}
