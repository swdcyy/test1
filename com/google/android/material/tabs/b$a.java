package com.google.android.material.tabs.b$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.b;
import sn5.g;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import com.google.android.material.tabs.a;
import java.lang.Object;
import java.util.List;

public class b$a extends AnimatorListenerAdapter	// class@0016d5
{
    public final g a;
    public final b b;

    public void b$a(b p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.b.c.o(this);
       this.b.g.remove(this);
       this.b.n(this.a);
    }
}
