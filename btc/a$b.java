package btc.a$b;
import android.animation.AnimatorListenerAdapter;
import btc.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import java.util.ArrayList;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import p79.h;
import java.util.Objects;

public final class a$b extends AnimatorListenerAdapter	// class@000489
{
    public final a a;
    public final RecyclerView$ViewHolder b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final ArrayList e;

    public void a$b(a p0,RecyclerView$ViewHolder p1,ViewPropertyAnimator p2,View p3,ArrayList p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       Object[] objArray = new Object[0];
       a.D().s("AlbumItemAnimator", "onAnimationEnd\(\) removeItemAnimatorImpl called with: animator = ["+p0+"]", objArray);
       this.c.setListener(null);
       this.d.setAlpha(0x3f800000);
       this.d.setScaleX(0x3f800000);
       this.d.setScaleY(0x3f800000);
       a$b td = this.d;
       float f = (float)2;
       td.setPivotX(((float)td.getWidth() / f));
       td = this.d;
       td.setPivotY(((float)td.getHeight() / f));
       this.d.setVisibility(0);
       this.a.I(this.b);
       this.e.remove(this.b);
       this.a.P();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       Object[] objArray = new Object[0];
       a.D().s("AlbumItemAnimator", "onAnimationStart\(\) removeItemAnimatorImpl called with: animator = ["+p0+"]", objArray);
       Objects.requireNonNull(this.a);
       return;
    }
}
