package nfd.e1;
import erd.g;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import crd.b;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import nfd.j1;
import dd.d;
import kb.c;

public final class e1 implements g	// class@001da0
{
    public final ImageRequest b;
    public final String c;
    public final PublishSubject d;

    public void e1(ImageRequest p0,String p1,PublishSubject p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       Fresco.getImagePipeline().prefetchToDiskCache(this.b, null, new j1(this.c, this.d));
    }
}
