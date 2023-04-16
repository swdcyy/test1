package h9a.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import h9a.a;
import android.app.Activity;
import java.util.Objects;
import h9a.a$a;
import java.lang.Integer;
import android.widget.TextView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import o07.n;

public final class b implements PopupInterface$f	// class@0025eb
{
    public final int b;

    public void b(int p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       TextView textView;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (p3 != patchProxyRe) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "<anonymous parameter 1>");
       a.p(p2, "<anonymous parameter 2>");
       a$a e = a.e;
       Activity uActivity = p0.u();
       a.o(uActivity, "popup.context");
       b tb = this.b;
       Objects.requireNonNull(e);
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          textView = PatchProxy.applyTwoRefs(uActivity, Integer.valueOf(tb), e, uoa, "1");
          if (textView != patchProxyRe) {
          label_009d :
             return textView;
          }
       }
       textView = new TextView(uActivity);
       textView.setLayoutParams(new ViewGroup$LayoutParams(a1.d(R.dimen.arg_RES_7f070fc7), a1.e(32.00f)));
       textView.setPadding(a1.e(8.00f), 0, a1.e(15.00f), 0);
       textView.setTextSize(1, 14.00f);
       textView.setGravity(17);
       textView.setBackground(a1.f(R.drawable.arg_RES_7f082103));
       textView.getPaint().setFakeBoldText(1);
       textView.setText(tb);
       textView.setTextColor(a1.a(R.color.arg_RES_7f061d77));
       goto label_009d ;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
