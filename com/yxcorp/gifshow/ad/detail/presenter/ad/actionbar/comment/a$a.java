package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class a$a extends AnimatorListenerAdapter	// class@001567
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.p.setVisibility(8);
       return;
    }
}