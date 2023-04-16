package cc8.o;
import cc8.o$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cc8.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.ViewGroup;
import ma8.g;
import android.content.Context;
import com.mini.js.jsapi.ui.nativeui.TextToastView;
import com.mini.js.jsapi.ui.nativeui.PictureToastView;
import android.view.View;
import android.animation.ObjectAnimator;
import cc8.o$a;
import android.animation.Animator$AnimatorListener;
import wi8.c;
import com.mini.d;
import java.lang.Runnable;

public class o	// class@0003f1
{
    public final int a;
    public g b;
    public k c;
    public j d;
    public Runnable e;

    public void o(o$b p0){
       super();
       this.b = p0.a;
       TextToastView textToastVie = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (textToastVie != PatchProxyResult.class) {
       }else if(("none").equals(p0.c) && TextUtils.isEmpty(p0.e)){
          textToastVie = 1;
       }else {
          textToastVie = null;
       }
       Context context = this.b.getContainer().getContext();
       textToastVie = (textToastVie)? new TextToastView(context): new PictureToastView(context);
       textToastVie.b(p0.b, p0.e, p0.c, p0.d, this.b);
       this.c = textToastVie;
       this.a = p0.g;
       this.d = p0.f;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       o tc = this.c;
       if (tc == null) {
          return;
       }
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tc.a(), "alpha", new float[2]{0x3f800000,0});
       objectAnimat.setDuration(300);
       objectAnimat.addListener(new o$a(this));
       objectAnimat.start();
       if (this.e != null) {
          d.v().t5(this.e);
          this.e = null;
       }
       return;
    }
}
