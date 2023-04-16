package dl9.f2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.CommentParams;
import ak5.j;
import tyc.a1;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiTextView;
import lu7.f;
import java.lang.CharSequence;
import dl9.b2;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import o56.c;
import o56.a;
import lnc.a1;
import dl9.d2;
import lnc.c3$b;
import lnc.c3;
import cl9.x1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;
import hl9.t;
import android.text.TextPaint;
import dl9.c2;
import ekd.m1;
import nx9.c;
import android.content.Context;
import android.content.res.ColorStateList;
import yk9.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f2 extends PresenterV2	// class@001f5f
{
    public CommentParams p;
    public EmojiTextView q;
    public View r;
    public QComment s;
    public QPhoto t;
    public d u;
    public BaseFragment v;
    public EmojiTextView w;
    public String x;

    public void f2(){
       super();
    }
    public void E8(){
       int b;
       f2 uof2 = f2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof2, "3")) {
          return;
       }
       if (this.s.getUser() == null) {
          return;
       }
       f2 tp = this.p;
       if (tp != null) {
          this.x = tp.mADCallback;
       }
       if (j.o().t()) {
          this.q.setKSTextDisplayHandler(new a1(this.q));
       }
       this.q.setText(f.a(this.s.getUser()));
       this.X7(c.a(this.q, new b2(this)));
       if (!PatchProxy.applyVoid(objArray, this, uof2, "4") && a.a().c()) {
          f2 tq = this.q;
          if (tq != null) {
             tq.setContentDescription(a1.p(R.string.arg_RES_7f103941));
          }
       }
       String str = c3.a(c3.a(this.s.mParent, d2.a), x1.a);
       tp = this.r;
       String id = this.s.getUser().getId();
       String obj = PatchProxy.applyTwoRefs(id, str, this, uof2, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.P8(str)){
          b = false;
       }else {
          b = TextUtils.n(this.t.getUserId(), id);
       }
       f2 uof21 = 8;
       b = (b)? 0: 8;
       tp.setVisibility(b);
       boolean b1 = true;
       t.h9(this.r, b1);
       uof2 = this.w;
       if (uof2 != null) {
          uof2.getPaint().setFakeBoldText(b1);
          if (this.P8(str)) {
             this.w.setVisibility(0);
             uof2 = this.s;
             obj = f.b(uof2.mReplyToUserId, uof2.mReplyToUserName);
             this.X7(c.a(this.w, new c2(this)));
             if (j.o().t()) {
                this.w.setKSTextDisplayHandler(new a1(this.w));
             }
             this.w.setText(obj);
          }else {
             this.w.setVisibility(uof21);
          }
       }
       return;
    }
    public final boolean P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.n(p0, this.s.mReplyToUserId) ^ 0x01);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f2.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2d10);
       this.r = m1.f(p0, 0x7f0a084a);
       this.w = m1.f(p0, 0x7f0a35b2);
       t.b9(this.r, false);
       t.X8(this.w);
       if (c.d() || c.c()) {
          t.c9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
          t.c9(this.w, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
       }else {
          t.c9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, 0x7f0601d9)));
          t.c9(this.w, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, 0x7f0601d9)));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f2.class, "1")) {
          return;
       }
       this.s = this.q8(QComment.class);
       this.t = this.q8(QPhoto.class);
       this.u = this.q8(d.class);
       this.v = this.r8("FRAGMENT");
       this.p = this.q8(CommentParams.class);
       return;
    }
}
