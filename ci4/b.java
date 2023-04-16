package ci4.b;
import xf4.b;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nh4.b;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin$a;
import lnc.a1;
import android.graphics.Typeface;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin;
import ye4.c;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import ye4.a;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionBorderCard;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin$DefaultInfo;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.UseRuleInfo;
import java.util.List;
import java.lang.CharSequence;
import nsd.u;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.RuleItem;
import ci4.a;
import java.util.Objects;
import java.util.Collection;
import nsd.s0;
import ei4.k;
import android.view.View;
import ekd.m1;

public final class b extends b	// class@000474
{
    public final List A;
    public TransactionBorderCard x;
    public TransactionDefaultBorderPlugin y;
    public final List z;

    public void b(Fragment p0){
       super(p0);
       this.z = new ArrayList();
       this.A = new ArrayList();
    }
    public void E8(){
       boolean b;
       a uoa;
       b tx;
       TransactionBorderCard transactionB;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       UseRuleInfo obj = PatchProxy.apply(objArray, this, uob, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.u.e == null){
          this.Y8();
          b = false;
       }else {
          this.X8();
          b = true;
       }
       if (b) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uob, "6")){
          if (!PatchProxy.applyVoid(objArray, this, uob, "7") && this.y == null) {
             TransactionDefaultBorderPlugin$a uoa1 = new TransactionDefaultBorderPlugin$a();
             uoa1.b(a1.a(R.color.arg_RES_7f061e52));
             uoa1.u(16.00f);
             uoa1.t(a1.a(R.color.arg_RES_7f061d77));
             uoa1.v(Typeface.DEFAULT_BOLD);
             TransactionDefaultBorderPlugin transactionD = uoa1.c(this.P8());
             this.y = transactionD;
             if (transactionD != null) {
                transactionD.e();
                tx = this.x;
                if (tx == null) {
                   a.S("mRuleView");
                }
                transactionB = a.a(tx, transactionD);
             }
          }
          b ty = this.y;
          if (ty != null) {
             ty.b(this.u.d);
             TransactionDefaultBorderPlugin$DefaultInfo uDefaultInfo = new TransactionDefaultBorderPlugin$DefaultInfo(null, this.u.d.mTitle, null, null, 13, null);
             ty.b(v5);
             tx = this.x;
             if (tx == null) {
                a.S("mRuleView");
             }
             transactionB = a.a(tx, ty);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.z.clear();
          obj = this.u.d.mRuleList;
          if (obj != null) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                RuleItem ruleItem = iterator.next();
                if (PatchProxy.applyVoidOneRefs(ruleItem, this, uob, "5")) {
                   continue ;
                }else if(this.A.size() > 0){
                   uoa = this.A.get(0);
                }else {
                   uoa = objArray;
                }
                b tA = this.A;
                Objects.requireNonNull(tA, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                s0.a(tA).remove(uoa);
                if (uoa == null) {
                   uoa = new a(this.P8());
                   uoa.e();
                   tA = this.x;
                   if (tA == null) {
                      a.S("mRuleView");
                   }
                   a.a(tA, uoa);
                }
                uoa.b(ruleItem);
                tx = this.x;
                if (tx == null) {
                   a.S("mRuleView");
                }
                a.a(tx, uoa);
                this.z.add(uoa);
             }
          }
          this.A.clear();
          this.A.addAll(this.z);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.H8();
       b tx = this.x;
       if (tx == null) {
          a.S("mRuleView");
       }
       tx.j();
       return;
    }
    public void V8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a0b3e);
       return;
    }
}
