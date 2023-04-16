package com.yxcorp.gifshow.util.l;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.util.l$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.view.View;
import msd.q;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import lnc.f3;
import com.yxcorp.gifshow.util.l$b;
import a2.i;
import a2.j;
import com.yxcorp.gifshow.util.l$c;
import android.view.View$OnAttachStateChangeListener;

public final class l	// class@001f8c
{

    public static final void a(Fragment p0){
       a.p(p0, "$this$adaptEdge2Edge");
       p0.getViewLifecycleOwnerLiveData().observe(p0, new l$a(p0));
    }
    public static final void b(View p0,q p1){
       a.p(p0, "$this$doOnApplyWindowInsets");
       a.p(p1, "action");
       if (!Edge2EdgeHelper.b()) {
          return;
       }
       j.c(p0, new l$b(p1, l.c(p0)));
       l.d(p0);
       return;
    }
    public static final f3 c(View p0){
       return new f3(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), p0.getPaddingBottom());
    }
    public static final void d(View p0){
       if (p0.isAttachedToWindow()) {
          p0.requestApplyInsets();
       }else {
          p0.addOnAttachStateChangeListener(new l$c());
       }
       return;
    }
}
