package com.yxcorp.gifshow.prettify.makeup.v$c;
import ekd.f$j;
import com.yxcorp.gifshow.prettify.makeup.v;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import f1c.d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;

public class v$c extends f$j	// class@00119b
{
    public final v a;

    public void v$c(v p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(v$c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, v$c.class, "1")) {
          return;
       }
       PrettifyConfigView prettifyConf = this.a.f.c();
       if (prettifyConf != null) {
          prettifyConf.d(true);
       }
       return;
    }
}
