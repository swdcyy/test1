package bl4.j;
import cl4.a;
import android.os.Handler;
import android.os.Looper;
import bl4.j$a;
import wk4.l;
import androidx.fragment.app.Fragment;
import wk4.c;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionPayPayloadInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import ae4.b;
import ae4.a;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import brd.t;
import cjd.e;
import erd.o;
import wk4.f;
import android.app.Activity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.HashMap;
import wk4.j;
import erd.g;
import crd.b;
import lnc.b9;
import java.lang.ref.WeakReference;

public class j extends a	// class@000396
{
    public final Handler g;
    public boolean h;
    public c i;
    public l j;

    public void j(){
       super();
       this.g = new Handler(Looper.getMainLooper());
       j$a uoa = new j$a(this);
       this.i = uoa;
       this.j = new l(this.b, uoa);
    }
    public String e(){
       return "MerchantActionPayEvent";
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       j j;
       j oj;
       FragmentActivity uFragmentAct1;
       f uof;
       j oj1;
       boolean b = this;
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, b, j.class, "2")) {
          return;
       }
       if (!this.f() && obj instanceof ActionPayPayloadInfo) {
          b.h = TextUtils.x(obj.mOrderDetailLink);
          j = b.j;
          FragmentActivity uFragmentAct = this.d();
          ActionPayPayloadInfo mTid = obj.mTid;
          ActionPayPayloadInfo ifRepay = obj.ifRepay;
          ActionPayPayloadInfo mOrderDetail = obj.mOrderDetailLink;
          ActionPayPayloadInfo mPayScene = obj.mPayScene;
          ActionPayPayloadInfo mPageSource = obj.mPageSource;
          ActionPayPayloadInfo mAttachedPar = obj.mAttachedParams;
          Objects.requireNonNull(j);
          l ol = l.class;
          if (PatchProxy.isSupport(ol)) {
             Object[] objArray = new Object[10];
             objArray[0] = uFragmentAct;
             objArray[1] = mTid;
             objArray[2] = Boolean.valueOf(ifRepay);
             objArray[3] = mOrderDetail;
             objArray[4] = mPayScene;
             objArray[5] = obj;
             objArray[6] = Integer.valueOf(mPageSource);
             object oobject = null;
             objArray[7] = oobject;
             objArray[8] = oobject;
             objArray[9] = mAttachedPar;
             if (!PatchProxy.applyVoid(objArray, j, ol, "1")) {
             }
          }else {
          }
       }
    label_00e6 :
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       j tj = this.j;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(null, tj, l.class, "12")) {
          b9.a(tj.a);
          b9.a(tj.b);
          tj.d = null;
          l c = tj.c;
          if (c != null) {
             c.clear();
             tj.c = null;
          }
       }
       tj = this.g;
       if (tj != null) {
          tj.removeCallbacksAndMessages(null);
       }
       super.release();
       return;
    }
}
