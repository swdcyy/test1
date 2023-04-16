package mg.f1;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import android.app.Activity;
import java.lang.String;
import android.content.Intent;

public final class f1 implements o	// class@0025f9
{
    public final GifshowActivity b;
    public final TakePictureType c;

    public void f1(GifshowActivity p0,TakePictureType p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return p0.iz(this.b, this.c, null);
    }
}
