package dnc.c0;
import erd.o;
import com.yxcorp.gifshow.upload.x;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.String;
import ojd.f;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import ojd.e;
import java.io.File;
import okhttp3.MultipartBody$Part;
import brd.t;

public final class c0 implements o	// class@00228e
{
    public final x b;
    public final UploadInfo c;
    public final String d;
    public final f e;

    public void c0(x p0,UploadInfo p1,String p2,f p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       c0 tb = this.b;
       c0 tc = this.c;
       Objects.requireNonNull(tb);
       return tb.b(tc, this.d, e.a(p0), e.f("h265video", new File(tc.getFilePath()), this.e));
    }
}
