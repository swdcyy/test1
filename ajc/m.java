package ajc.m;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n80.b;
import q87.c;

public final class m implements g	// class@000141
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.C().s("SystemPhotoForward", "downloadQrCode done", objArray);
       }
       return;
    }
}
