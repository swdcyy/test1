package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.a$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveClipBoundTextView;
import java.lang.String;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;

public class a$a extends AnimatorListenerAdapter	// class@0012d7
{
    public final LiveClipBoundTextView a;
    public final String b;
    public final a c;

    public void a$a(a p0,LiveClipBoundTextView p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setText(this.b);
       return;
    }
}
