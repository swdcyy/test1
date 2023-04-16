package b77.k;
import com.kwai.live.gzone.widget.ViewFlipperScrollView$b;
import b77.l;
import java.lang.Object;
import android.view.View;
import w77.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.CharSequence;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class k implements ViewFlipperScrollView$b	// class@0003dd
{
    public final l a;

    public void k(l p0){
       this.a = p0;
    }
    public void a(View p0,int p1){
       i.a(this, p0, p1);
    }
    public final void b(View p0,int p1,Object p2){
       k ta = this.a;
       Objects.requireNonNull(ta);
       l ol = l.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p2, ta, ol, "2")) {
       }else {
          TextView textView = p0.findViewById(R.id.text_view);
          if (p2 instanceof KwaiMsg) {
             textView.setText(p2.getText());
          }
          if (!PatchProxy.applyVoid(null, ta, ol, "3")) {
             l b = ta.b;
             if (b != null) {
                b.removeCallbacks(ta.c);
                ta.b.postDelayed(ta.c, 6000);
             }
          }
       }
       return;
    }
}
