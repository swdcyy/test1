package com.yxcorp.gifshow.v3.editor.BaseEditorFragment$b;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.Set;
import voc.y;

public class BaseEditorFragment$b implements Animation$AnimationListener	// class@000d91
{
    public final BaseEditorFragment b;

    public void BaseEditorFragment$b(BaseEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment$b.class, "2")) {
          return;
       }
       if (this.b.getView() == null) {
          return;
       }
       this.b.getView().setVisibility(8);
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().O();
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment$b.class, "3")) {
          return;
       }
       if (this.b.getView() == null) {
          return;
       }
       this.b.getView().setVisibility(8);
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().N0();
       }
       return;
    }
}
