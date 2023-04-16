package e8a.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import lu7.f;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kwai.framework.model.user.UserExtraInfo;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import e8a.p0$a;
import android.view.View$OnClickListener;

public class p0 extends PresenterV2	// class@0020cb
{
    public KwaiImageView p;
    public EmojiTextView q;
    public TextView r;
    public User s;
    public String t;

    public void p0(){
       super();
    }
    public void E8(){
       p0 op0 = p0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, op0, "4")) {
          op0 = this.s;
          this.q.getPaint().setFakeBoldText(true);
          if (op0.mIsHiddenUser != null) {
             p0 tq = this.q;
             String str = (TextUtils.x(op0.mHiddenUserName))? a1.p(R.string.arg_RES_7f103fcb): op0.mHiddenUserName;
             tq.setText(str);
          }else {
             this.q.setText(f.e(op0));
          }
          this.p.getHierarchy().L(RoundingParams.a());
          g.b(this.p, op0, HeadImageSize.MIDDLE);
          User mExtraInfo = op0.mExtraInfo;
          if (mExtraInfo != null) {
             this.r.setText(TextUtils.k(mExtraInfo.mRecommendReason));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0333);
       this.q = m1.f(p0, 0x7f0a2d10);
       this.r = m1.f(p0, 0x7f0a0aac);
       p0.setOnClickListener(new p0$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       this.s = this.q8(User.class);
       this.t = this.r8("NEBULA_PYMK_LOG_PARAMS");
       return;
    }
}
