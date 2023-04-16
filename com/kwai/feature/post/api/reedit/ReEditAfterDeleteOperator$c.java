package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$c;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class ReEditAfterDeleteOperator$c implements PopupInterface$b	// class@00142e
{
    public static final ReEditAfterDeleteOperator$c a;

    static {
       ReEditAfterDeleteOperator$c.a = new ReEditAfterDeleteOperator$c();
    }
    public void ReEditAfterDeleteOperator$c(){
       super();
    }
    public final Animator a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0}).setDuration(400);
    }
}
