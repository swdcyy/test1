package pa.b;
import y49.f;
import com.example.commercial.diversead.banner.AdTKBannerView;
import java.lang.String;
import msd.l;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import yx.j0;
import com.tkruntime.v8.NativeObjectWrapper;
import a59.a$a;
import a59.e;

public final class b extends f	// class@0028f6
{
    public final AdTKBannerView d;

    public void b(AdTKBannerView p0,String p1,l p2){
       this.d = p0;
       super(p1, p2);
    }
    public Object c(JSONObject p0,a p1){
       a.p(p0, "data");
       Object[] objArray = new Object[0];
       j0.f("AdTKBannerView", "GET_PLAYER_FEED", objArray);
       NativeObjectWrapper nativeObject = NativeObjectWrapper.wrapNativeObject(this.d.m);
       a.o(nativeObject, "NativeObjectWrapper.wrapNativeObject\(mQPhoto\)");
       if (p1 != null) {
          a$a.a(p1, nativeObject, null, 2, null);
       }
       return this.e();
    }
}
