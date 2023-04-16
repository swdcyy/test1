package b8a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xf6.j;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import ekd.r;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.CharSequence;

public class g extends PresenterV2	// class@0003a9
{
    public CommonMeta p;
    public TextView q;

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "2")) {
          return;
       }
       if (!j.d()) {
          og = this.q;
          if (og != null) {
             og.setVisibility(8);
          }
          return;
       }else if(this.q == null){
          AppCompatTextView uAppCompatTe = PatchProxy.apply(objArray, this, og, "3");
          if (uAppCompatTe != PatchProxyResult.class) {
          }else {
             uAppCompatTe = new AppCompatTextView(this.getContext());
             uAppCompatTe.setTextSize(14.00f);
             uAppCompatTe.setBackgroundColor(-2130757072);
             uAppCompatTe.setTextColor(r.b(this.getContext(), R.color.arg_RES_7f061f86));
             uAppCompatTe.setPadding(a1.e(12.00f), a1.e(5.00f), a1.e(12.00f), a1.e(5.00f));
             this.m8().addView(uAppCompatTe);
             int i = a1.d(0x7f070fdf) + n.A(this.getContext());
             if (uAppCompatTe.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                uAppCompatTe.getLayoutParams().topMargin = i;
             }
          }
          this.q = uAppCompatTe;
       }
       this.q.setText(this.p.mExpTag);
       this.q.setVisibility(0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(CommonMeta.class);
       return;
    }
}
