package com.kwai.feature.post.api.util.d;
import java.lang.Runnable;
import com.kwai.feature.post.api.util.e;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import e17.q;
import q46.k;
import android.animation.Animator$AnimatorListener;

public final class d implements Runnable	// class@001460
{
    public final e b;
    public final View c;

    public void d(e p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       tc.setVisibility(0);
       q.a.a(tc, new k(tb));
    }
}
