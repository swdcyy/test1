package f69.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f69.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import com.yxcorp.utility.TextUtils;
import f69.b;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.utility.n;
import qvb.n0;
import com.yxcorp.gifshow.aggregate.model.UserRelationAggregateResponse;
import ekd.m1;
import f69.a;
import m01.a;
import d69.p;
import y8c.g;

public class c extends PresenterV2	// class@0022b2
{
    public RelationAggregateFragment p;
    public p q;
    public g r;
    public String s;
    public String t;
    public String u;
    public String v;
    public TextView w;
    public TextView x;
    public final q y;

    public void c(){
       super();
       this.y = new c$a(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       this.q.h(this.y);
       this.P8();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          if (this.p.Hh()) {
             this.x.setText(this.u);
             this.x.setTextColor(a1.a(R.color.arg_RES_7f0607c2));
             this.x.setCompoundDrawablePadding(a1.e(0x3fc00000));
             c tx = this.x;
             Drawable uDrawable = PatchProxy.apply(objArray, this, uoc, "7");
             if (uDrawable != PatchProxyResult.class) {
             }else if(TextUtils.n(String.valueOf(1), this.t)){
                uDrawable = a1.f(R.drawable.arg_RES_7f082219);
             }else if(TextUtils.n(String.valueOf(2), this.t)){
                uDrawable = a1.f(R.drawable.arg_RES_7f082218);
             }else if(TextUtils.n(String.valueOf(3), this.t)){
                uDrawable = a1.f(R.drawable.arg_RES_7f082216);
             }else {
                uDrawable = objArray;
             }
             tx.setCompoundDrawablesWithIntrinsicBounds(uDrawable, objArray, objArray, objArray);
             this.x.setOnClickListener(new b(this));
             View[] viewArray = new View[]{this.x};
             n.Z(0, viewArray);
          }else {
             View[] viewArray1 = new View[]{this.x};
             n.Z(8, viewArray1);
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.q.f(this.y);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.q.L0() != null && !TextUtils.x(this.q.L0().mResponseTitle)) {
          this.w.setText(this.q.L0().mResponseTitle);
       }else if(this.p.Hh()){
          this.w.setTextSize(15.00f);
       }
       this.w.setText(TextUtils.I(this.s));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a3595);
       this.x = m1.f(p0, 0x7f0a3594);
       m1.a(p0, new a(this), R.id.reminder_mix_arrow_view);
       m1.a(p0, a.b, R.id.header);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("RELATION_USER_FRAGMENT");
       this.q = this.r8("RELATION_USER_PAGE_LIST");
       this.s = this.r8("RELATION_USER_TITLE");
       this.r = this.r8("ADAPTER");
       this.t = this.r8("MATERIAL_TYPE");
       this.u = this.r8("MATERIAL_TITLE");
       this.v = this.r8("MATERIAL_URL");
       return;
    }
}
