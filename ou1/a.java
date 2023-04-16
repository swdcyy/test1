package ou1.a;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Color;

public final class a extends AnimatorListenerAdapter	// class@00358c
{
    public final TextView a;

    public void a(TextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.setTextColor(Color.parseColor("#FF7248"));
       this.a.setVisibility(0);
       return;
    }
}
