package com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CollectView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CollectView;
import com.kuaishou.android.model.mix.PhotoMeta;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class CollectView$a extends AnimatorListenerAdapter	// class@0015f4
{
    public final PhotoMeta a;
    public final CollectView b;

    public void CollectView$a(CollectView p0,PhotoMeta p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectView$a.class, "1")) {
          return;
       }
       boolean b = this.a.isCollected();
       this.b.b.setSelected(b);
       this.b.b.setScaleX(0x3f800000);
       this.b.b.setScaleY(0x3f800000);
       this.b.b.setVisibility(0);
       this.b.c.setScaleX(0);
       this.b.c.setScaleY(0);
       this.b.c.setVisibility(8);
       this.b.c.setSelected((b ^ 0x01));
       this.b.d(b);
       return;
    }
}
