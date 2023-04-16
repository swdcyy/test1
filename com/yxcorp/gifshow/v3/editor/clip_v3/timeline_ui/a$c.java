package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import p79.h;
import java.util.ArrayList;
import java.util.Objects;

public class a$c extends AnimatorListenerAdapter	// class@000df4
{
    public final RecyclerView$ViewHolder a;
    public final int b;
    public final View c;
    public final int d;
    public final ViewPropertyAnimator e;
    public final a f;

    public void a$c(a p0,RecyclerView$ViewHolder p1,int p2,View p3,int p4,ViewPropertyAnimator p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       if (this.b != null) {
          this.c.setTranslationX(0);
       }
       if (this.d != null) {
          this.c.setTranslationY(0);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "3")) {
          return;
       }
       Log.b("TimelineItemAnimator", "animateMoveImpl end");
       this.e.setListener(null);
       this.f.H(this.a);
       this.f.p.remove(this.a);
       this.f.P();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.f);
       return;
    }
}
