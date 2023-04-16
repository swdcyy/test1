package c7a.a;
import c7a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class a implements b	// class@000567
{
    public final QPhoto a;

    public void a(QPhoto p0){
       a.p(p0, "photo");
       super();
       this.a = p0;
    }
    public boolean a(){
       a uoa = a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(uoa, "2");
       return this.a.isAtlasPhotos();
    }
    public boolean b(){
       a uoa = a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(uoa, "3");
       return this.a.isLongPhotos();
    }
    public boolean c(){
       a uoa = a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.a.isVideoType() && (this.a.isSinglePhoto() || this.a.isKtv()))? true: false;
       PatchProxy.onMethodExit(uoa, "1");
       return b;
    }
    public boolean isVideoType(){
       a uoa = a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(uoa, "4");
       return this.a.isVideoType();
    }
}
