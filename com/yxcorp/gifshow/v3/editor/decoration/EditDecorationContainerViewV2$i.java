package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$i;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class EditDecorationContainerViewV2$i extends AnimatorListenerAdapter	// class@000f00
{
    public final EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2 a;

    public void EditDecorationContainerViewV2$i(EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EditDecorationContainerViewV2$i.class, "2")) {
          return;
       }
       this.a.invoke();
       PatchProxy.onMethodExit(EditDecorationContainerViewV2$i.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EditDecorationContainerViewV2$i.class, "1")) {
          return;
       }
       this.a.invoke();
       PatchProxy.onMethodExit(EditDecorationContainerViewV2$i.class, "1");
       return;
    }
}
