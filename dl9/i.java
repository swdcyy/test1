package dl9.i;
import com.yxcorp.gifshow.widget.textview.CommentTextView$a;
import dl9.m;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.widget.textview.CommentTextView;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.text.Layout;
import android.widget.TextView;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.kuaishou.android.model.mix.QComment;
import android.text.SpannableString;
import dl9.e;
import com.yxcorp.gifshow.comment.utils.c;
import crd.b;
import android.view.View$OnTouchListener;
import android.view.View;
import hl9.w;
import java.lang.Runnable;
import crd.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements CommentTextView$a	// class@001f6d
{
    public final m a;

    public void i(m p0){
       this.a = p0;
    }
    public final void a(int p0,int p1){
       boolean b1;
       i ta = this.a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       if (TextUtils.x(ta.q.getText())) {
       }else {
          CommentTextView$a uoa = null;
          ta.q.setOnMeasureListener(uoa);
          ta.Q = new SpannableStringBuilder(ta.q.getText());
          m q = ta.q;
          m obj = PatchProxy.applyOneRefs(q, ta, om, "9");
          boolean b = false;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(q.getLayout().getLineCount() > ta.A){
             b1 = true;
          }else {
             b1 = false;
          }
          ta.V = b1;
          if (b1) {
             if (ta.r.getEntity().mIsOpen != null || ta.Z8()) {
                ta.c9(ta.r, b);
             }else {
                ta.S8(ta.r, b);
             }
          }else {
             ta.P8(ta.r, ta.q, new SpannableString(TextUtils.k(ta.V8())));
             ta.a9();
          }
          q = ta.q;
          obj = ta.V;
          if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidTwoRefs(q, Boolean.valueOf(obj), ta, om, "22")) {
             e uoe = new e(ta);
             b uob = PatchProxy.applyTwoRefs(q, uoe, uoa, c.class, "3");
             if (uob != patchProxyRe) {
             }else {
                q.setOnTouchListener(uoe);
                uob = c.d(new w(q));
             }
             ta.X7(uob);
          }
       }
       return;
    }
}
