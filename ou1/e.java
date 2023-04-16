package ou1.e;
import android.animation.AnimatorListenerAdapter;
import ou1.f;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public final class e extends AnimatorListenerAdapter	// class@003591
{
    public final f a;
    public final TextView b;
    public final int c;
    public final int d;

    public void e(f p0,TextView p1,int p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.a.d.setVisibility(8);
       this.b.setVisibility(0);
       p0.d = this.b;
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.b.setText(String.valueOf(this.c));
       this.a.d.setText(String.valueOf(this.d));
       this.b.setVisibility(0);
       this.a.d.setVisibility(0);
       return;
    }
}
