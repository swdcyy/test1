package c7c.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import brd.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.pymk.b;
import com.yxcorp.gifshow.b;
import c7c.w;
import erd.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c7c.u;
import c7c.v;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.widget.EmojiTextView;
import lnc.a1;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import a7c.h;
import java.lang.Boolean;

public class x extends PresenterV2	// class@000558
{
    public TextView p;
    public User q;
    public h r;
    public boolean s;
    public static boolean t;

    public void x(){
       super();
    }
    public void x(boolean p0){
       super();
       x.t = p0;
    }
    public static a0 P8(User p0,UserExtraInfo p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, x.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = " ";
       String str = "\\s+";
       if (p1 != null) {
          if (p1.mRecoTextInfo != null) {
             int i = (x.t)? 20: 9;
             return b.e(p1, i);
          }else if(p1.mRecommendReasonValue == 7){
             return b.b(p1).C(new w(p1));
          }else if(!TextUtils.x(p1.mRecommendReason)){
             Object[] objArray = new Object[]{TextUtils.I(p1.mRecommendReason),TextUtils.I(p1.mOpenUserName)};
             return a0.B(String.format("%s%s", objArray));
          }else if(!TextUtils.x(p0.getText())){
             return a0.B((p0.getText()).replaceAll(str, obj));
          }else {
             return a0.B("");
          }
       }else if(!TextUtils.x(p0.getText())){
          return a0.B((p0.getText()).replaceAll(str, obj));
       }else {
          return a0.B("");
       }
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "4")) {
          return;
       }
       x tq = this.q;
       User mExtraInfo = tq.mExtraInfo;
       this.X7(x.P8(tq, mExtraInfo).R(new u(this), new v(this, mExtraInfo)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       x tp = this.p;
       if (tp instanceof EmojiTextView) {
          tp.setPreventDeadCycleInvalidate(true);
       }
       this.p.setCompoundDrawablePadding(a1.d(R.dimen.arg_RES_7f07031b));
       return;
    }
    public final void R8(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "6")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.p.setText("");
          if (this.s != null) {
             this.p.setVisibility(8);
          }else {
             this.p.setVisibility(4);
          }
       }else {
          this.p.setVisibility(0);
          this.p.setText(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3deb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       this.r = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.s = this.v8("KEY_NAME_CENTER", Boolean.class).booleanValue();
       return;
    }
}
