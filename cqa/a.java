package cqa.a;
import ayb.b;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig;
import u07.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import ayb.b$a;
import com.yxcorp.gifshow.model.config.DaysGiftBagConfig;
import u07.t$a;
import com.google.gson.JsonElement;

public class a implements b	// class@002369
{

    public void a(){
       super();
    }
    public t Va(Activity p0,IntegrateRedPacketConfig p1,boolean p2){
       t ot;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "config");
       if (PatchProxy.isSupport(b$a.class)) {
          ot = PatchProxy.applyFourRefs(this, p0, p1, Boolean.valueOf(p2), null, b$a.class, "1");
          if (ot != PatchProxyResult.class) {
          label_004c :
             return ot;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "config");
       ot = null;
       goto label_004c ;
    }
    public t$a ab(Activity p0,DaysGiftBagConfig p1){
       t$a this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "config");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, b$a.class, "2");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "activity");
          a.p(p1, "config");
          this = null;
       }
       return this;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean xj(JsonElement p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return false;
    }
}
