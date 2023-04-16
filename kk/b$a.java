package kk.b$a;
import android.animation.AnimatorListenerAdapter;
import kk.b;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.CharSequence;

public class b$a extends AnimatorListenerAdapter	// class@0024b3
{
    public final int a;
    public final TextView b;
    public final int c;
    public final TextView d;
    public final b e;

    public void b$a(b p0,int p1,TextView p2,int p3,TextView p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       b$a te = this.e;
       te.i = this.a;
       te.g = null;
       te = this.b;
       if (te != null) {
          te.setVisibility(4);
          if (this.c == 1) {
             b m = this.e.m;
             if (m != null) {
                m.setText(null);
             }
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       b$a td = this.d;
       if (td != null) {
          td.setVisibility(0);
       }
       return;
    }
}
