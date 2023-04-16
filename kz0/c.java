package kz0.c;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import java.lang.Object;
import android.view.View;
import ya1.f0;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public final class c implements LiveViewFlipper$a	// class@002e2c
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public void a(View p0,int p1){
       f0.a(this, p0, p1);
    }
    public final void b(View p0,int p1){
       c tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), tb, uof, "8")) {
          if (tb.s != null && (tb.y == null || tb.z == null)) {
             tb.y = AnimationUtils.loadAnimation(tb.getContext(), 0x7f0100ac);
             tb.z = AnimationUtils.loadAnimation(tb.getContext(), 0x7f0100ad);
             tb.s.setInAnimation(tb.y);
             tb.s.setOutAnimation(tb.z);
          }
          tb.P8(p0);
       }
       return;
    }
}
