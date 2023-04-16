package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import java.util.ArrayList;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.c;
import java.lang.Runnable;
import android.os.Handler;
import com.yxcorp.utility.Log;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import p79.h;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.b;
import java.util.Objects;

public class a$b extends AnimatorListenerAdapter	// class@000df3
{
    public final RecyclerView$ViewHolder a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final ArrayList d;
    public final a e;

    public void a$b(a p0,RecyclerView$ViewHolder p1,ViewPropertyAnimator p2,View p3,ArrayList p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.e.v.post(new c(this, this.c));
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       Log.b("TimelineItemAnimator", "removeItemAnimatorImpl end");
       this.b.setListener(null);
       this.c.setAlpha(0x3f800000);
       this.e.I(this.a);
       this.d.remove(this.a);
       this.e.P();
       this.e.v.post(new b(this, this.c));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.e);
       return;
    }
}
