package com.yxcorp.gifshow.growth.push.BaseHotPushPresenter$showDialog$1$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.library.widget.popup.common.d;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseHotPushPresenter$showDialog$1$1$1 extends FunctionReferenceImpl implements l	// class@001491
{
    public static final BaseHotPushPresenter$showDialog$1$1$1 INSTANCE;

    static {
       BaseHotPushPresenter$showDialog$1$1$1.INSTANCE = new BaseHotPushPresenter$showDialog$1$1$1();
    }
    public void BaseHotPushPresenter$showDialog$1$1$1(){
       super(1, d.class, "createBottomDialogInAnimator", "createBottomDialogInAnimator\(Landroid/view/View;\)Landroid/animation/Animator;", 0);
    }
    public final Animator invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseHotPushPresenter$showDialog$1$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}