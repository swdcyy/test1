package jf1.d0;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.PurchaseInfoMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import android.content.res.Resources;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.d0$a;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class d0 implements d	// class@002b65
{
    public final f a;

    public void d0(){
       super(null);
    }
    public void d0(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, d0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          d0 ta = this.a;
          if (ta != null) {
             ta.a(p0);
          }
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          Object[] objArray = new Object[]{String.valueOf(p0.getPurchaseCount()),p0.getCommodityName()};
          LiveSpannable$b uob = f.c(a1.m().getString(R.string.arg_RES_7f102c41, objArray), p1);
          if (p1.p()) {
             uob.d(p1.l());
          }else {
             uob.d(R.color.arg_RES_7f060871);
          }
          liveSpannabl.j(uob);
          if (p0.mShouldShowViewButton != null && (!p1.m() && this.a != null)) {
             LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f102a7b);
             if (p1.n()) {
                liveSpannabl.c();
             }else {
                liveSpannabl.d();
             }
             uoa.a(new d0$a(p0, this.a));
             liveSpannabl.h(uoa);
             p0.setHasLastButton(1);
          }
       label_008e :
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
