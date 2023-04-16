package wl4.b;
import wl4.q;
import ok0.n;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import java.lang.Object;
import crd.a;
import qk0.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.m;
import android.widget.TextView;
import ok0.o;
import ok0.i;
import ok0.h;
import android.view.View;
import com.kuaishou.ksmvvm.command.KSCommand;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.lang.Boolean;
import msd.p;
import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.image.KwaiImageView;
import ok0.e;
import ok0.d;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import wl4.n;
import lnc.b9;

public abstract class b implements q, n	// class@00363e
{
    public a b;
    public Fragment c;
    public a d;
    public final b e;
    public TabBusinessPayload f;
    public p g;

    public void b(Fragment p0,a p1){
       super();
       this.d = new a();
       this.e = new b();
       this.c = p0;
       this.b = p1;
    }
    public void J0(LiveData p0,Observer p1){
       m.a(this, p0, p1);
    }
    public void V2(TextView p0,LiveData p1,o p2){
       h.b(this, p0, p1, p2);
    }
    public void W1(View[] p0,KSCommand[] p1){
       m.c(this, p0, p1);
    }
    public void Z5(Observer p0,LiveData[] p1){
       m.d(this, p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       this.d.c(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.c(null);
       return;
    }
    public void c(MerchantEventModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (this.g != null) {
          a.s(MerchantTransactionLogBiz.ORDER, "BaseTabBusinessEvent", "onExecuteBusinessFailure, mPayload=["+this.f+"]");
          this.g.invoke(Boolean.FALSE, p0);
       }
       return;
    }
    public void d(MerchantEventModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       if (this.g != null) {
          a.s(MerchantTransactionLogBiz.ORDER, "BaseTabBusinessEvent", "onExecuteBusinessSuccess, mPayload=["+this.f+"]");
          this.g.invoke(Boolean.TRUE, p0);
       }
       return;
    }
    public void h3(EditText p0,MutableLiveData p1){
       m.e(this, p0, p1);
    }
    public void i7(KwaiImageView p0,LiveData p1){
       d.a(this, p0, p1);
    }
    public LifecycleOwner j(){
       return this.c;
    }
    public void o3(View p0,KSCommand[] p1){
       m.b(this, p0, p1);
    }
    public abstract void onEvent(TabBusinessPayload p0);
    public final void onEvent(TabBusinessPayload p0,p p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       this.g = p1;
       this.f = p0;
       if (this instanceof n ^ 0x01) {
          if (p0 != null) {
             this.onEvent(p0);
          }
       }else {
          this.onEvent(p0);
       }
       return;
    }
    public void q1(TextView p0,LiveData p1){
       h.a(this, p0, p1);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b9.a(this.d);
       this.e.b();
       return;
    }
    public b z6(){
       return this.e;
    }
}
