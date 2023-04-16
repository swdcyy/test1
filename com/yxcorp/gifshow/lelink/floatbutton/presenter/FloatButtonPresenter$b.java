package com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$b;
import fw8.b;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wh5.c;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.lelink.ScreencastManager$a;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import com.kwai.robust.PatchProxyResult;
import d0b.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import d0b.a;
import java.util.Set;

public final class FloatButtonPresenter$b extends b	// class@001a45
{
    public final FloatButtonPresenter b;

    public void FloatButtonPresenter$b(FloatButtonPresenter p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FloatButtonPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       p0.getClass();
       return;
    }
    public void onActivityResumed(Activity p0){
       ScreencastManager$a a;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatButtonPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       if (c.b()) {
          a = ScreencastManager.A;
          a.a().w();
          a.a().c();
          FloatButtonManager.i.a().a();
          return;
       }else {
          String simpleName = p0.getClass().getSimpleName();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.applyOneRefs(simpleName, null, b.class, "1");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(TextUtils.isEmpty(simpleName)){
             b = true;
          }else {
             obj = PatchProxy.applyOneRefs(simpleName, null, a.class, "1");
             b = (obj != patchProxyRe)? obj.booleanValue(): a.a.contains(simpleName);
             b = b ^ 1;
          }
          if (!b) {
             FloatButtonManager.i.a().hide();
          }else {
             FloatButtonManager.i.a().show();
          }
          return;
       }
    }
}
