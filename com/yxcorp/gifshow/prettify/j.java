package com.yxcorp.gifshow.prettify.j;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.prettify.RecordPrettifyFragment;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.RecordPrettifyFragment$c;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o0c.h;

public class j extends AnimatorListenerAdapter	// class@001159
{
    public final RecordPrettifyFragment a;

    public void j(RecordPrettifyFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       RecordPrettifyFragment h = this.a.H;
       if (h != null) {
          h.a(true);
       }
       this.a.C.ch(true);
       Iterator iterator = new ArrayList(this.a.F).iterator();
       while (iterator.hasNext()) {
          iterator.next().z2();
       }
       h = this.a.C;
       if (h instanceof PrettifyBaseFragment) {
          h.fh(true);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       Iterator iterator = new ArrayList(this.a.F).iterator();
       while (iterator.hasNext()) {
          iterator.next().c2();
       }
       return;
    }
}
