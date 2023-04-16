package nm9.a;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.feature.api.social.common.jsbridge.model.FaceDetectResult;

public final class a implements g	// class@0031da
{
    public final g b;

    public void a(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onSuccess(new FaceDetectResult(p0.booleanValue()));
    }
}
