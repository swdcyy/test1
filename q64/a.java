package q64.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import com.kuaishou.merchant.live.marketing.sandeago.model.PropValue;
import ekd.m1;

public abstract class a extends PresenterV2	// class@003a38
{
    public SandeagoPropertyItemModel p;
    public TextView q;
    public TextView r;
    public View s;
    public TextView t;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       SandeagoPropertyItemModel mPropAlias = (!TextUtils.x(this.p.mPropAlias))? this.p.mPropAlias: this.p.mPropName;
       this.q.setText(mPropAlias);
       int i = 0;
       if (this.p.mRequired != null) {
          this.t.setVisibility(i);
       }else {
          this.t.setVisibility(8);
       }
       if (TextUtils.x(this.p.mPropDesc)) {
          this.r.setVisibility(8);
          this.s.setVisibility(8);
       }else {
          this.r.setVisibility(i);
          this.s.setVisibility(i);
          this.r.setText(this.p.mPropDesc);
       }
       mPropAlias = this.p.mDefaultPropValue;
       if (mPropAlias != null && !TextUtils.x(mPropAlias.mPropValue)) {
          this.P8(mPropAlias);
       }
       return;
    }
    public abstract void P8(PropValue p0);
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3304);
       this.r = m1.f(p0, 0x7f0a32fe);
       this.s = m1.f(p0, 0x7f0a0bf2);
       this.t = m1.f(p0, 0x7f0a3302);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(SandeagoPropertyItemModel.class);
       return;
    }
}
