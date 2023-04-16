package c8a.c;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.ImageView;
import android.graphics.PorterDuff$Mode;
import e17.i;
import com.yxcorp.gifshow.entity.QPhoto;

public final class c	// class@000576
{
    public static QPhoto a;
    public static QPhoto b;
    public static boolean c;
    public static int d;
    public static final c e;

    static {
       c.e = new c();
    }
    public void c(){
       super();
    }
    public static final void a(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       a.p(p1, "text");
       View view = p0.findViewById(R.id.lottie);
       a.o(view, "toastView.findViewById\(R.id.lottie\)");
       view.setBackgroundResource(R.drawable.arg_RES_7f080b1d);
       view.setAnimation(0);
       p0.findViewById(R.id.toast_content_layout).setBackgroundResource(R.drawable.arg_RES_7f080154);
       p0.findViewById(R.id.toast_text).setTextColor(a1.a(R.color.arg_RES_7f061642));
       TextView textView = p0.findViewById(R.id.toast_text_go);
       a.o(textView, "toastTextGo");
       textView.setText(p1);
       ImageView imageView = p0.findViewById(R.id.iv_right);
       a.o(imageView, "ivClose");
       imageView.setImageTintMode(null);
       imageView.setImageResource(R.drawable.arg_RES_7f080af6);
       return;
    }
    public static final void b(){
       if (PatchProxy.applyVoid(null, null, c.class, "2")) {
          return;
       }
       i oi = i.l();
       if (oi != null && oi.s()) {
          oi.h();
       }
       return;
    }
    public static final QPhoto c(){
       return c.a;
    }
    public static final QPhoto d(){
       return c.b;
    }
    public static final void e(QPhoto p0){
       c.a = p0;
    }
    public static final void f(QPhoto p0){
       c.b = p0;
    }
    public static final int g(){
       return c.d;
    }
}
