package jg9.s0$a;
import android.animation.AnimatorListenerAdapter;
import jg9.s0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import java.util.ArrayList;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import p79.h;
import java.util.Objects;

public class s0$a extends AnimatorListenerAdapter	// class@002ab1
{
    public final RecyclerView$ViewHolder a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final ArrayList d;
    public final s0 e;

    public void s0$a(s0 p0,RecyclerView$ViewHolder p1,ViewPropertyAnimator p2,View p3,ArrayList p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s0$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AlbumItemAnimator", "onAnimationEnd\(\) removeItemAnimatorImpl called with: animator = ["+p0+"]", objArray);
       this.b.setListener(null);
       this.c.setAlpha(0x3f800000);
       this.c.setScaleX(0x3f800000);
       this.c.setScaleY(0x3f800000);
       s0$a tc = this.c;
       tc.setPivotX((float)(tc.getWidth() / 2));
       tc = this.c;
       tc.setPivotY((float)(tc.getHeight() / 2));
       this.c.setVisibility(0);
       this.e.I(this.a);
       this.d.remove(this.a);
       this.e.P();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s0$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AlbumItemAnimator", "onAnimationStart\(\) removeItemAnimatorImpl called with: animator = ["+p0+"]", objArray);
       Objects.requireNonNull(this.e);
       return;
    }
}
