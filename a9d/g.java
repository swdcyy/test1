package a9d.g;
import a9d.c;
import android.view.View;
import android.app.Activity;
import com.yxcorp.plugin.search.entity.BubbleConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uy5.b;
import java.lang.StringBuilder;
import f9d.a;
import com.kwai.library.widget.popup.bubble.a$c;
import j06.b;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import zf6.j;
import android.text.TextPaint;

public class g extends c	// class@0000aa
{

    public void g(View p0,Activity p1){
       super(p0, p1);
    }
    public boolean a(BubbleConfig p0){
       c obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0.mTitle)) {
          b.c("SimpleBubbleProcessor", "checkValid, mTitle is null");
          return b;
       }else if(p0.mStaySeconds <= null){
          b.c("SimpleBubbleProcessor", "checkValid, mStaySeconds:"+p0.mStaySeconds);
          return b;
       }else if(p0.mRuleId <= null){
          b.c("SimpleBubbleProcessor", "checkValid, mRuleId:"+p0.mRuleId);
          return b;
       }else {
          obj = this.d;
          if (obj != null && !obj.a(p0)) {
             b.c("SimpleBubbleProcessor", "checkValid,mPeriodLimit:"+p0.mPeriodLimit+",shownCount");
             return b;
          }else if(p0.mType == 2){
             b = true;
          }
          return b;
       }
    }
    public a$c c(BubbleConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a$c uoc = super.c(p0);
       if (uoc != null) {
          uoc.C0((- b.b));
          uoc.v0(0);
          uoc.p0((- b.j));
          uoc.s0(b.Y);
       }
       return uoc;
    }
    public int d(){
       return 0x7f0d013b;
    }
    public void f(a p0,BubbleConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       View view = p0.z();
       if (view == null) {
          return;
       }
       view.setPadding(b.z, 0, b.n, 0);
       TextView textView = view.findViewById(R.id.text);
       if (textView != null) {
          textView.setEllipsize(TextUtils$TruncateAt.END);
          textView.setMaxLines(1);
          textView.setTextColor(j.d(textView, R.color.arg_RES_7f0607b1));
          textView.setPadding(textView.getPaddingLeft(), b.h, textView.getPaddingRight(), b.h);
          TextPaint paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(1);
          }
       }
       return;
    }
}
