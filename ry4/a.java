package ry4.a;
import u06.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Integer;
import dz4.a;

public abstract class a implements d	// class@003109
{

    public void a(){
       super();
    }
    public boolean a(QPhoto p0,PlcEntryStyleInfo p1,PlcPreDecideWhiteInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "plcEntryStyleInfo");
       return this.h(this.f(p0, p1, 6), p2);
    }
    public boolean b(QPhoto p0,PlcEntryStyleInfo p1,PlcPreDecideWhiteInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "plcEntryStyleInfo");
       return this.h(this.f(p0, p1, 4), p2);
    }
    public boolean c(QPhoto p0,PlcEntryStyleInfo p1,PlcPreDecideWhiteInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "plcEntryStyleInfo");
       int i = 1;
       boolean b = this.h(this.f(p0, p1, 2), p2);
       if (!this.h(this.f(p0, p1, i), p2) || !b) {
          i = false;
       }
       return i;
    }
    public boolean e(QPhoto p0,PlcEntryStyleInfo p1,PlcPreDecideWhiteInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "plcEntryStyleInfo");
       return this.h(this.f(p0, p1, 3), p2);
    }
    public final PlcEntryDataAdapter f(QPhoto p0,PlcEntryStyleInfo p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "photo");
       a.p(p1, "plcEntryStyleInfo");
       return a.a(p0, p1, p2);
    }
    public final boolean g(PlcEntryDataAdapter p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0.getActionType() != p1) {
          b = false;
       }
       return b;
    }
    public abstract boolean h(PlcEntryDataAdapter p0,PlcPreDecideWhiteInfo p1);
}
