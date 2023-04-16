package pb.e;
import ab.h;
import android.content.Context;
import pb.b;
import vc.j;
import java.util.Set;
import java.lang.Object;
import com.facebook.imagepipeline.core.ImagePipeline;
import pb.f;
import android.content.res.Resources;
import tb.a;
import zc.a;
import ya.i;
import tc.v;
import com.facebook.common.internal.ImmutableList;
import java.util.concurrent.Executor;
import rb.g;
import pb.d;

public class e implements h	// class@002189
{
    public final Context a;
    public final ImagePipeline b;
    public final f c;
    public final Set d;
    public final Set e;
    public final g f;

    public void e(Context p0){
       super(p0, null);
    }
    public void e(Context p0,b p1){
       super(p0, j.j(), null, null, p1);
    }
    public void e(Context p0,j p1,Set p2,Set p3,b p4){
       super();
       this.a = p0;
       ImagePipeline imagePipelin = p1.h();
       this.b = imagePipelin;
       this.c = (p4 != null && p4.d() != null)? p4.d(): new f();
       e tc = this.c;
       Resources resources = p0.getResources();
       a uoa = a.b();
       a uoa1 = p1.b(p0);
       i oi = i.d();
       v bitmapMemory = imagePipelin.getBitmapMemoryCache();
       g og = null;
       ImmutableList immutableLis = (p4 != null)? p4.a(): og;
       h oh = (p4 != null)? p4.b(): og;
       tc.a(resources, uoa, uoa1, oi, bitmapMemory, immutableLis, oh);
       this.d = p2;
       this.e = p3;
       if (p4 != null) {
          og = p4.c();
       }
       this.f = og;
       return;
    }
    public d b(){
       d uod = new d(this.a, this.c, this.b, this.d, this.e);
       return v6.C(this.f);
    }
    public Object get(){
       return this.b();
    }
}
