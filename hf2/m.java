package hf2.m;
import android.animation.AnimatorListenerAdapter;
import hf2.l;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class m extends AnimatorListenerAdapter	// class@002d89
{
    public final l a;

    public void m(l p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.a.v.setEnableGravityEffect(true);
       m ta = this.a;
       ta.v.setBackground(ta.l8().getDrawable(R.drawable.arg_RES_7f081188).mutate());
       return;
    }
}
