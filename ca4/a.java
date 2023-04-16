package ca4.a;
import sk0.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q94.b;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Iterable;
import y94.a;

public final class a extends a	// class@0004d9
{
    public LiveMerchantContainerDataList b;
    public boolean c;
    public List d;
    public int e;
    public b f;

    public void a(){
       super();
       this.b = new LiveMerchantContainerDataList();
       this.d = new ArrayList();
       this.e = -1;
    }
    public final String getLiveStreamId(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          objArray = obj.getLiveStreamId();
       }
       return objArray;
    }
    public final String p0(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          objArray = obj.h();
       }
       return objArray;
    }
    public final int q0(){
       return this.e;
    }
    public final void r0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       boolean b = (this.e != p0)? true: false;
       this.e = p0;
       if (b && (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9"))) {
          Iterator iterator = this.d.iterator();
          while (iterator.hasNext()) {
             iterator.next().onChanged(Integer.valueOf(p0));
          }
       }
       return;
    }
}
