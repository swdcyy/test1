package am4.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.b;
import android.app.Activity;
import android.view.View;
import com.kuaishou.merchant.transaction.base.purchasepanel.b$a;
import java.util.List;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kuaishou.merchant.transaction.base.purchasepanel.a;
import am4.a$a;

public class a extends b	// class@00009a
{
    public int v;

    public void a(Activity p0,View p1,b$a p2,List p3){
       super(p0, p1, p2, p3);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       if (this.v > null) {
          view.findViewById(R.id.order_confirm_more_root).setBackgroundResource(this.v);
       }
       return view;
    }
    public void b0(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       int[] ointArray = new int[2];
       this.t.getLocationOnScreen(ointArray);
       this.f.setTranslationX((((float)ointArray[0] - ((float)this.t.getMeasuredWidth() / 2.00f)) - (float)this.u));
       this.f.setTranslationY((float)((ointArray[1] - this.f.getMeasuredHeight()) - a1.d(R.dimen.arg_RES_7f0702ef)));
       return;
    }
    public a c0(List p0,b$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(p0, p1);
    }
}
