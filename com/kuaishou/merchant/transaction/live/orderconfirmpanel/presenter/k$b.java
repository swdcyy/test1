package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k$b;
import com.kuaishou.merchant.transaction.base.widget.NumberPickerView$a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import com.kuaishou.merchant.transaction.base.widget.NumberPickerView;

public class k$b implements NumberPickerView$a	// class@00082e
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public boolean a(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(k$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, k$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.a.u.getAddIv().setSelected(p0);
       return (p0 ^ 0x01);
    }
    public void b(int p0){
    }
    public boolean c(int p0,int p1){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = p0 - 1;
       if (this.a.S8(p0, p1) || this.a.P8(p0)) {
          return 1;
       }else {
          return false;
       }
    }
    public boolean d(int p0,int p1){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = p0 + 1;
       if (this.a.R8(p0, p1) || this.a.P8(p0)) {
          return 1;
       }else {
          return false;
       }
    }
    public boolean e(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(k$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, k$b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.a.u.getMinusIv().setSelected(p0);
       return (p0 ^ 0x01);
    }
}
