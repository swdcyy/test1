package com.yxcorp.gifshow.v3.editor.BaseEditorFragment$c;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import voc.y;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;

public class BaseEditorFragment$c implements Animation$AnimationListener	// class@000d92
{
    public final BaseEditorFragment b;

    public void BaseEditorFragment$c(BaseEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment$c.class, "2")) {
          return;
       }
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().z2();
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment$c.class, "1")) {
          return;
       }
       BaseEditorFragment$c tb = this.b;
       if (tb.s != BaseEditor$EditorShowMode.SHOW_BACKGROUND) {
          float f = 0x3f800000;
          if (tb.mh() != null) {
             this.b.mh().setAlpha(f);
          }
          if (this.b.mh().getParent() != null) {
             this.b.mh().getParent().setAlpha(f);
          }
       }
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().c2();
       }
       return;
    }
}
