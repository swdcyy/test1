package h4a.i;
import f4a.z;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import f4a.i;

public class i implements z	// class@002564
{
    public final PLCLogHelper a;

    public void i(PLCLogHelper p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       i obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj.i == null) {
          return false;
       }
       return this.a.i.c(obj.b(obj.i()));
    }
    public boolean b(){
       i obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = false;
       if (obj.i == null) {
          return b;
       }
       String str = obj.b(obj.i());
       if (this.a.i.g(str) || this.a.i.d(str)) {
          b = true;
       }
       return b;
    }
}
