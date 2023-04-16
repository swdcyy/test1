package am4.a$a;
import com.kuaishou.merchant.transaction.base.purchasepanel.a;
import java.util.List;
import com.kuaishou.merchant.transaction.base.purchasepanel.b$a;
import com.kuaishou.merchant.transaction.base.purchasepanel.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import lnc.a1;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class a$a extends a	// class@000099
{

    public void a$a(List p0,b$a p1){
       super(p0, p1);
    }
    public void J0(a$a p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       super.J0(p0, p1);
       TextView textView = m1.f(p0.itemView, R.id.live_audience_order_confirm_more_item_title);
       int i = 0x7f070271;
       if (!p1) {
          this.L0(textView, a1.d(R.dimen.arg_RES_7f070334), a1.d(i));
       }else if(p1 == (this.getItemCount() - 1)){
          this.L0(textView, a1.d(R.dimen.arg_RES_7f07025d), a1.d(i));
       }else {
          this.L0(textView, a1.d(R.dimen.pv), a1.d(R.dimen.pv));
       }
       return;
    }
    public a$a K0(ViewGroup p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a$a(this, a.c(LayoutInflater.from(p0.getContext()), 0x7f0d0f43, p0, false));
    }
    public final void L0(View p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "3")) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = p1;
       layoutParams.bottomMargin = p2;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.J0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.K0(p0, p1);
    }
}
