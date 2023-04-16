package jf1.p;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import android.text.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.p$a;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class p implements d	// class@002b7a
{
    public final f a;

    public void p(){
       super(null);
    }
    public void p(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       return this.b(p0, p1);
    }
    public CharSequence b(FollowAnchorMessage p0,g p1){
       LiveSpannable$b uob;
       p obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          obj.a(p0);
       }
       LiveSpannable liveSpannabl = new LiveSpannable();
       f.b(p0, liveSpannabl, p1);
       String str = p1.i(p0);
       if (!TextUtils.isEmpty(str)) {
          uob = f.c(str, p1);
          int i = (p1.p())? p1.k(): 0x7f060871;
          liveSpannabl.j(uob.d(i));
       }
       if (!TextUtils.isEmpty(p0.mBeforeFollowString)) {
          uob = f.c(p0.mBeforeFollowString, p1);
          this.c(p1, uob);
          liveSpannabl.j(uob);
          if (p1.p()) {
             liveSpannabl.e();
          }
       }
       uob = f.c(p0.mUserNameString, p1);
       if (p1.p()) {
          uob.d(p1.h());
       }else {
          uob.d(R.color.arg_RES_7f060871);
       }
       liveSpannabl.j(uob);
       if (p1.p()) {
          liveSpannabl.e();
       }
       uob = f.c(p0.mAfterFollowString, p1);
       this.c(p1, uob);
       liveSpannabl.j(uob);
       if (p0.shouldShowButton() && this.a != null) {
          LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f102208);
          if (p1.n()) {
             liveSpannabl.c();
          }else {
             liveSpannabl.e();
          }
          uoa.a(new p$a(this, p0, p1));
          liveSpannabl.h(uoa);
          p0.setHasLastButton(true);
       }
       return liveSpannabl.k();
    }
    public final void c(g p0,LiveSpannable$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "2")) {
          return;
       }
       if (p0.p()) {
          p1.d(p0.k());
       }else {
          p1.d(R.color.arg_RES_7f060871);
       }
       return;
    }
}
