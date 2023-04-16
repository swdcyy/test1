package m3a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Bitmap;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a	// class@002f0d
{
    public final QPhoto a;
    public final boolean b;
    public final Bitmap c;
    public final PhotoDetailLogger d;

    public void a(QPhoto p0,boolean p1,Bitmap p2,PhotoDetailLogger p3){
       a.p(p0, "photo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean a(){
       return this.b;
    }
}
