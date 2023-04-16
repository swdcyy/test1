package pc.e;
import pc.d;
import java.lang.String;
import pc.c;
import qc.b;
import sc.d;
import java.lang.Object;
import java.lang.Class;
import bd.d;
import uc.b;
import android.graphics.Bitmap$Config;
import com.facebook.imagepipeline.image.a;
import com.facebook.common.references.a;
import ab.e;
import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;
import oc.b;
import java.lang.UnsupportedOperationException;
import android.graphics.Bitmap;
import oc.d;
import android.graphics.Rect;
import oc.a;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import pc.e$a;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b;
import java.util.List;
import java.util.ArrayList;
import pc.e$b;
import bd.c;
import bd.g;
import bd.h;
import java.lang.Iterable;
import oc.e;
import java.util.Collection;
import bd.a;

public class e implements d	// class@002911
{
    public final b a;
    public final d b;
    public static c c;
    public static c d;

    static {
       e.c = e.g("com.facebook.animated.gif.GifImage");
       e.d = e.g("com.facebook.animated.webp.WebPImage");
    }
    public void e(b p0,d p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static c g(String p0){
       return Class.forName(p0).newInstance();
    }
    public a a(d p0,b p1,Bitmap$Config p2){
       if (e.d == null) {
          throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
       }
       a uoa = p0.e();
       e.d(uoa);
       PooledByteBuffer pooledByteBu = uoa.j();
       b uob = (pooledByteBu.n() != null)? e.d.decodeFromByteBuffer(pooledByteBu.n(), p1): e.d.decodeFromNativeMemory(pooledByteBu.B(), pooledByteBu.size(), p1);
       a.f(uoa);
       return this.f(p1, uob, p2);
    }
    public a b(d p0,b p1,Bitmap$Config p2){
       if (e.c == null) {
          throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
       }
       a uoa = p0.e();
       e.d(uoa);
       PooledByteBuffer pooledByteBu = uoa.j();
       b uob = (pooledByteBu.n() != null)? e.c.decodeFromByteBuffer(pooledByteBu.n(), p1): e.c.decodeFromNativeMemory(pooledByteBu.B(), pooledByteBu.size(), p1);
       a.f(uoa);
       return this.f(p1, uob, p2);
    }
    public final a c(int p0,int p1,Bitmap$Config p2){
       a uoa = this.b.i(p0, p1, p2);
       uoa.j().eraseColor(0);
       uoa.j().setHasAlpha(true);
       return uoa;
    }
    public final a d(b p0,Bitmap$Config p1,int p2){
       a uoa = this.c(p0.getWidth(), p0.getHeight(), p1);
       new AnimatedImageCompositor(this.a.a(d.a(p0), null), new e$a(this)).d(p2, uoa.j());
       return uoa;
    }
    public final List e(b p0,Bitmap$Config p1){
       a uoa = this.a.a(d.a(p0), null);
       ArrayList uArrayList = new ArrayList(uoa.getFrameCount());
       AnimatedImageCompositor uAnimatedIma = new AnimatedImageCompositor(uoa, new e$b(this, uArrayList));
       for (int i = 0; i < uoa.getFrameCount(); i = i + 1) {
          a uoa1 = this.c(uoa.getWidth(), uoa.getHeight(), p1);
          uAnimatedIma.d(i, uoa1.j());
          uArrayList.add(uoa1);
       }
       return uArrayList;
    }
    public final a f(b p0,b p1,Bitmap$Config p2){
       List list;
       a uoa = null;
       int i = 0;
       int i1 = (p0.d != null)? p1.getFrameCount() - 1: 0;
       if (p0.f != null) {
          a.f(uoa);
          a.g(uoa);
          return new c(this.d(p1, p2, i1), g.d, i);
       }else if(p0.e != null){
          list = this.e(p1, p2);
          uoa = a.d(list.get(i1));
       }else {
          list = uoa;
       }
       if (p0.c != null && uoa == null) {
          uoa = this.d(p1, p2, i1);
       }
       e uoe = d.e(p1);
       uoe.b = a.d(uoa);
       uoe.b(i1);
       uoe.c = a.e(list);
       uoe.e = p0.i;
       a.f(uoa);
       a.g(list);
       return new a(uoe.a());
    }
}
