package dlb.e;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.mockphoto.j;
import java.util.Map;
import java.lang.Class;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements g	// class@0024c2
{
    public final String b;

    public void e(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       j.b.remove(tb);
       PostUtils.D(j.class.getName(), "poolingUploadStatus error photoId = "+tb, p0);
    }
}
