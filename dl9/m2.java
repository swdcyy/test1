package dl9.m2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import lu7.f;
import dl9.j2;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import ak5.j;
import tyc.a1;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.lang.CharSequence;
import dl9.l2;
import lnc.c3$b;
import lnc.c3;
import cl9.x1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;
import hl9.t;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import nx9.c;
import com.yxcorp.gifshow.widget.FasterTextView;
import android.text.TextPaint;
import com.lsjwzh.widget.text.FastTextView;
import dl9.k2;
import ekd.m1;
import android.content.res.ColorStateList;
import lnc.a1;
import yk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class m2 extends PresenterV2	// class@001f85
{
    public EmojiTextView p;
    public EmojiTextView q;
    public View r;
    public QComment s;
    public QPhoto t;
    public d u;
    public CommentsFragment v;

    public void m2(){
       super();
    }
    public void E8(){
       String obj;
       boolean b;
       m2 om2 = m2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om2, "3")) {
          return;
       }
       String str = f.a(this.s.getUser());
       this.X7(c.a(this.p, new j2(this)));
       if (j.o().t()) {
          this.p.setKSTextDisplayHandler(new a1(this.p));
       }
       this.p.setText(str);
       str = c3.a(c3.a(this.s.mParent, l2.a), x1.a);
       if (this.s.getUser() != null) {
          String id = this.s.getUser().getId();
          obj = PatchProxy.applyTwoRefs(id, str, this, om2, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.P8(str)){
             b = false;
          }else {
             b = TextUtils.n(this.t.getUserId(), id);
          }
          if (b) {
             this.r.setVisibility(0);
             t.h9(this.r, true);
             om2 = this.r;
             Typeface typeface = d0.a("alte-din.ttf", this.getContext());
             if (!PatchProxy.applyVoidTwoRefs(om2, typeface, objArray, t.class, "4") && om2 != null) {
                if (c.f() && om2 instanceof FasterTextView) {
                   om2.getPaint().setTypeface(typeface);
                }else {
                   om2.getPaint().setTypeface(typeface);
                }
             }
          }else {
          label_00d0 :
             this.r.setVisibility(8);
          }
       }else {
          goto label_00d0 ;
       }
       if (this.P8(str)) {
          this.q.setVisibility(0);
          om2 = this.s;
          obj = f.b(om2.mReplyToUserId, om2.mReplyToUserName);
          this.X7(c.a(this.q, new k2(this)));
          if (j.o().t()) {
             this.q.setKSTextDisplayHandler(new a1(this.q));
          }
          this.q.setText(obj);
       }else {
          this.q.setVisibility(8);
       }
       return;
    }
    public final boolean P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.n(p0, this.s.mReplyToUserId) ^ 0x01);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m2.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2d10);
       this.r = m1.f(p0, 0x7f0a084a);
       this.q = m1.f(p0, 0x7f0a35b2);
       t.b9(this.r, false);
       t.X8(this.q);
       if (c.d() || c.c()) {
          t.c9(this.p, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
          t.c9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
          t.Z8(this.q, false, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
       }else {
          t.c9(this.p, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, 0x7f0601d9)));
          t.c9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, 0x7f0601d9)));
          t.Z8(this.q, false, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, 0x7f0601d9)));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m2.class, "1")) {
          return;
       }
       this.s = this.q8(QComment.class);
       this.t = this.q8(QPhoto.class);
       this.u = this.q8(d.class);
       this.v = this.r8("FRAGMENT");
       return;
    }
}
