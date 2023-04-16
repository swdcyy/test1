package com.kuaishou.post.story.edit.decoration.text.s$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.kuaishou.post.story.edit.decoration.text.s;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.MotionEvent;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import android.os.SystemClock;

public class s$a extends DecorationContainerView$e	// class@000b13
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s$a.class, "2")) {
       }else {
          super.k(p0, p1);
          this.a.q.R();
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
       }else {
          super.v(p0);
          Object[] objArray = new Object[0];
          a.D().w("StoryEditTextPresenter", "onSelectedTap |||||||||| decorationDrawer:"+p0, objArray);
          s$a ta = this.a;
          if ((SystemClock.elapsedRealtime() - ta.p) - 1000 > 0) {
             ta.p = SystemClock.elapsedRealtime();
             if (p0.getDecorationType() == 1) {
                this.a.R8(p0);
             }
          }
       }
       return;
    }
}
