package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import p79.h;
import java.util.Objects;

public class a$a extends AnimatorListenerAdapter	// class@000df2
{
    public final RecyclerView$ViewHolder a;
    public final View b;
    public final ViewPropertyAnimator c;
    public final ArrayList d;
    public final a e;

    public void a$a(a p0,RecyclerView$ViewHolder p1,View p2,ViewPropertyAnimator p3,ArrayList p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.b.setVisibility(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       Log.b("TimelineItemAnimator", "addItemAnimatorImpl end");
       this.b.setVisibility(0);
       this.c.setListener(null);
       this.e.F(this.a);
       this.d.remove(this.a);
       this.e.P();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.e);
       return;
    }
}
