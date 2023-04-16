package lh.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nh.c;
import android.widget.TextView;
import nh.b;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import zyc.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import ekd.x0;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import zf6.k;
import tkd.b;
import tkd.d;
import vt5.h;
import java.util.List;
import android.widget.LinearLayout;
import java.util.Iterator;
import android.text.SpannableStringBuilder;
import android.graphics.drawable.Drawable;
import lnc.a1;
import y17.a;
import android.content.res.Resources;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.Button;
import android.text.TextPaint;

public class b extends PresenterV2	// class@00255c
{
    public KwaiImageView p;
    public TextView q;
    public LinearLayout r;
    public static final float s;

    static {
       b.s = (float)n.c(a.b(), 6.00f);
    }
    public void b(){
       super();
    }
    public void E8(){
       String str1;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, b.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          b tq = this.q;
          boolean i = (c.a())? 0x7f104d16: 0x7f104d15;
          tq.setText(i);
          Context context = this.getContext();
          i = c.a();
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             str1 = PatchProxy.applyTwoRefs(context, Boolean.valueOf(i), objArray, uob, str);
             if (str1 != PatchProxyResult.class) {
             label_005c :
                if (!TextUtils.x(str1)) {
                   d uod = Fresco.newDraweeControllerBuilder().D(x0.f(str1));
                   uod.q(true);
                   this.p.setController(uod.e());
                }
                if (k.d()) {
                   this.p.setPlaceHolderImage(R.drawable.arg_RES_7f080680);
                }else {
                   this.p.setPlaceHolderImage(R.drawable.arg_RES_7f080c5a);
                }
                this.r.removeAllViews();
                Iterator iterator = d.a(-1486533607).DG().iterator();
                while (iterator.hasNext()) {
                   str = iterator.next();
                   TextView textView = new TextView(this.getContext());
                   SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(str, this, b.class, "4");
                   if (spannableStr != PatchProxyResult.class) {
                   }else {
                      spannableStr = new SpannableStringBuilder();
                      spannableStr.append("   ");
                      spannableStr.append(str).append(" \n ");
                      Drawable uDrawable = a1.f(R.drawable.arg_RES_7f08165e);
                      uDrawable.setBounds(0, 0, uDrawable.getIntrinsicWidth(), uDrawable.getIntrinsicHeight());
                      a uoa = new a(uDrawable, str);
                      int intrinsicWid = uDrawable.getIntrinsicWidth();
                      uoa.c(intrinsicWid, uDrawable.getIntrinsicHeight());
                      spannableStr.setSpan(uoa, 0, true, 34);
                   }
                   textView.setText(spannableStr);
                   Context context1 = this.getContext();
                   if (context1 == null) {
                      context1 = a.b();
                   }
                   textView.setTextColor(context1.getResources().getColor(R.color.arg_RES_7f06012d));
                   textView.setTextSize(true, 14.00f);
                   textView.setLineSpacing(b.s, 0x3f800000);
                   this.r.addView(textView);
                }
             }
          }
          a.p(context, "$this$floatViewSwitchPageAnimUrl");
          int i1 = (i)? 0x7f1012dd: 0x7f1012de;
          str1 = f.g(context, "motion", i1, 0);
          goto label_005c ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a116a);
       this.q = m1.f(p0, 0x7f0a116c);
       this.r = m1.f(p0, 0x7f0a078b);
       Button uButton = m1.f(p0, R.id.close_floatView_guide_btn);
       uButton.getPaint().setFakeBoldText(true);
       uButton.setWidth((int)((double)(n.z(this.getContext()) - (a1.e(19.00f) * 2)) * 0x3fe6666666666666));
       return;
    }
}
