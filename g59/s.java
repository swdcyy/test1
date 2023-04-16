package g59.s;
import erd.g;
import g59.q;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import g59.q$a;
import java.lang.StringBuilder;
import yx.j0;

public final class s implements g	// class@002416
{
    public final q b;

    public void s(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          boolean b = false;
          this.b.d.setNeedRetryFreeTraffic(b);
          this.b.e.onError();
          StringBuilder str = "";
          p0 = (p0 != null)? p0.getMessage(): null;
          Object[] objArray = new Object[b];
          j0.f("ADRequestPhotoApi", str+p0+" , "+this.b.d.getServerExpTag()+" , "+this.b.d+" £¬"+this.b.d.getUserName(), objArray);
       }
       return;
    }
}
