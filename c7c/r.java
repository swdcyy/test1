package c7c.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import ki5.b;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import crd.b;
import com.yxcorp.gifshow.pymk.b;
import android.view.View;
import ekd.m1;
import a7c.h;
import nu7.a;

public class r extends PresenterV2	// class@000552
{
    public TextView p;
    public User q;
    public h r;
    public a s;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.p.getPaint().setFakeBoldText(true);
       r tq = this.q;
       if (tq.mIsHiddenUser != null) {
          this.p.setText(TextUtils.i(tq.mHiddenUserName, b.b().c(R.string.arg_RES_7f103fcb)));
       }else {
          this.X7(b.l(this.p, tq));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2d10);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       this.r = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.s = this.t8("AUTO_ALIAS_CALLER_CONTEXT");
       return;
    }
}
