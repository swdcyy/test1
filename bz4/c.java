package bz4.c;
import y06.a;
import java.lang.Object;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import f4a.b0;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import android.app.Activity;
import a16.a;
import u06.b;
import f4a.i;
import lnc.b9;

public class c implements a	// class@0003f5
{
    public QPhoto a;
    public PlcEntryStyleInfo b;
    public Activity c;
    public BaseFragment d;
    public i e;
    public b f;
    public b0 g;
    public a h;
    public PlcEntryStyleInfo$PageType i;
    public PLCLogHelper j;
    public a k;

    public void c(){
       super();
       this.i = PlcEntryStyleInfo$PageType.UNKNOWN;
    }
    public void a(b p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "6") && this.h == null) {
          this.h = new a();
       }
       this.h.c(p0);
       return;
    }
    public BaseFragment b(){
       return this.d;
    }
    public PLCLogHelper c(){
       return this.j;
    }
    public b0 d(){
       return this.g;
    }
    public PlcEntryStyleInfo e(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          PlcEntryStyleInfo plcEntryStyl = this.a.getPlcEntryStyleInfo();
       }
       return obj;
    }
    public boolean f(){
       c obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && obj.isWeakValid())? true: false;
       return b;
    }
    public void g(PlcEntryStyleInfo p0){
       this.b = p0;
    }
    public Activity getActivity(){
       return this.c;
    }
    public PlcEntryStyleInfo$PageType getPageType(){
       return this.i;
    }
    public QPhoto getPhoto(){
       return this.a;
    }
    public boolean h(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && obj.isStrongValid())? true: false;
       return b;
    }
    public a i(){
       return this.k;
    }
    public b j(){
       return this.f;
    }
    public i k(){
       return this.e;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       b9.a(this.h);
       return;
    }
}
