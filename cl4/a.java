package cl4.a;
import al4.b;
import java.lang.Object;
import crd.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import al4.a;
import androidx.fragment.app.Fragment;
import al4.f;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.merchant.api.core.model.MerchantEventLoggerParam;
import al4.e;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventContinuationInfo;
import lnc.b9;

public abstract class a implements b	// class@00048c
{
    public MerchantEventModel a;
    public Fragment b;
    public f c;
    public ClientEvent$UrlPackage d;
    public a e;
    public Map f;

    public void a(){
       super();
       this.e = new a();
    }
    public void a(MerchantEventModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (!this.f() && p0 != null) {
          b uob = a.a(p0.mType);
          if (uob != null) {
             uob.b(this.b, p0, this.c, this.f, this.d);
          }else {
             e.b(p0.mLogs, this.d);
          }
       }
       return;
    }
    public void b(Fragment p0,MerchantEventModel p1,f p2,Map p3,ClientEvent$UrlPackage p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       this.a = p1;
       this.b = p0;
       this.c = p2;
       this.f = p3;
       MerchantEventModel mPayload = p1.mPayload;
       this.d = p4;
       MerchantTransactionLogBiz mERCHANT_EVE = MerchantTransactionLogBiz.MERCHANT_EVENT;
       a.s(mERCHANT_EVE, this.e(), "doEvent, model = ["+p1+" ]");
       if (mPayload != null) {
          this.onEvent(mPayload, this.f);
       }else {
          a.s(mERCHANT_EVE, this.e(), "do onEvent error, because payload is null");
       }
       e.b(this.a.mLogs, p4);
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.e.c(p0);
       return;
    }
    public FragmentActivity d(){
       a obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null || !obj.isAdded()) {
          return null;
       }
       return this.b.getActivity();
    }
    public String e(){
       return "MerchantEvent";
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d() == null || this.d().isFinishing())? true: false;
       return b;
    }
    public void g(int p0,MerchantEventModel p1){
       EventContinuationInfo mFailureEven;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "3")) {
          return;
       }
       if (p1 != null) {
          p1 = p1.mContinuationInfo;
          if (p1 != null) {
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 == 3) {
                      mFailureEven = p1.mFailureEvent;
                      if (!PatchProxy.applyVoidOneRefs(mFailureEven, this, a.class, "9") && mFailureEven != null) {
                         this.a(mFailureEven);
                      }
                   }
                }else {
                   mFailureEven = p1.mSuccessEvent;
                   if (!PatchProxy.applyVoidOneRefs(mFailureEven, this, a.class, "8") && mFailureEven != null) {
                      this.a(mFailureEven);
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(p1, this, a.class, "10") || p1 == null){
                mFailureEven = p1.mSuccessEvent;
                if (mFailureEven != null) {
                   this.a(mFailureEven);
                }else {
                   mFailureEven = p1.mFailureEvent;
                   if (mFailureEven != null) {
                      this.a(mFailureEven);
                   }
                }
             }
          }
       }
       return;
    }
    public abstract void onEvent(EventPayloadInfo p0,Map p1);
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.b = null;
       this.a = null;
       this.c = null;
       this.f = null;
       b9.a(this.e);
       return;
    }
}
