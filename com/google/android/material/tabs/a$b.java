package com.google.android.material.tabs.a$b;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.a;
import com.google.android.material.tabs.a$a;
import android.animation.Animator;
import java.util.Collection;
import ekd.q;
import java.lang.Object;
import java.util.HashSet;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;

public class a$b extends AnimatorListenerAdapter	// class@0016d3
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a$b(a p0,a$a p1){
       super(p0);
    }
    public void onAnimationEnd(Animator p0){
       if (!q.f(this.a.d)) {
          Iterator iterator = this.a.d.clone().iterator();
          while (iterator.hasNext()) {
             iterator.next().onAnimationEnd(p0);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (!q.f(this.a.d)) {
          Iterator iterator = this.a.d.clone().iterator();
          while (iterator.hasNext()) {
             iterator.next().onAnimationStart(p0);
          }
       }
       return;
    }
}
