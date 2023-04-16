package com.kwai.feature.post.api.widget.GrowthGuideDialog$generatePopBuilder$1$1$1$2;
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

public final class GrowthGuideDialog$generatePopBuilder$1$1$1$2 extends FunctionReferenceImpl implements l	// class@001470
{
    public static final GrowthGuideDialog$generatePopBuilder$1$1$1$2 INSTANCE;

    static {
       GrowthGuideDialog$generatePopBuilder$1$1$1$2.INSTANCE = new GrowthGuideDialog$generatePopBuilder$1$1$1$2();
    }
    public void GrowthGuideDialog$generatePopBuilder$1$1$1$2(){
       super(1, d.class, "createBottomDialogOutAnimator", "createBottomDialogOutAnimator\(Landroid/view/View;\)Landroid/animation/Animator;", 0);
    }
    public final Animator invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideDialog$generatePopBuilder$1$1$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
