package b77.l;
import android.view.View;
import fq5.b;
import java.lang.Object;
import b77.l$a;
import com.kwai.live.gzone.widget.ViewFlipperScrollView;
import b77.k;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b77.l$b;
import android.view.View$OnDragListener;
import java.lang.Boolean;
import b77.l$c;
import com.kwai.live.gzone.widget.ViewAnimator2;
import android.animation.Animator$AnimatorListener;

public class l	// class@0003e1
{
    public final View a;
    public ViewFlipperScrollView b;
    public Runnable c;
    public boolean d;
    public b e;
    public boolean f;

    public void l(View p0,b p1){
       super();
       this.c = new l$a(this);
       this.d = false;
       this.e = p1;
       this.a = p0;
       ViewFlipperScrollView viewFlipperS = p0.findViewById(R.id.gzone_sport_message_flipper_view);
       this.b = viewFlipperS;
       k ok = new k(this);
       Objects.requireNonNull(viewFlipperS);
       if (PatchProxy.applyVoidOneRefs(ok, viewFlipperS, ViewFlipperScrollView.class, "9")) {
       }else {
          viewFlipperS.g.add(ok);
       }
       this.b.addView(LayoutInflater.from(p0.getContext()).inflate(R.layout.arg_RES_7f0d0bea, null));
       this.b.addView(LayoutInflater.from(p0.getContext()).inflate(R.layout.arg_RES_7f0d0bea, null));
       this.b.setOnDragListener(new l$b(this));
       this.a(false);
       return;
    }
    public void a(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "4")) {
          return;
       }
       ol = this.b;
       if (ol != null && p0) {
          l$c uoc = new l$c(this);
          Objects.requireNonNull(ol);
          if (!PatchProxy.applyVoidOneRefs(uoc, ol, ViewAnimator2.class, "22")) {
             ol.c(ol.getCurrentView(), uoc);
          }
       }else {
          this.a.setVisibility(8);
       }
       return;
    }
}
