package com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.animation.AnimatorSet;
import android.view.View;

public class LiveAsrInputRecordView$b extends AnimatorListenerAdapter	// class@000a9e
{
    public final LiveAsrInputRecordView a;

    public void LiveAsrInputRecordView$b(LiveAsrInputRecordView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(LiveAsrInputRecordView$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAsrInputRecordView$b.class, "1")) {
          return;
       }
       LiveAsrInputRecordView i = this.a.i;
       if (i != null) {
          i.removeAllListeners();
       }
       LiveAsrInputRecordView$b ta = this.a;
       if (ta.f == null) {
          ta.a();
       }else {
          ta.b.setScaleX(0x3f400000);
          this.a.b.setScaleY(0x3f400000);
          this.a.b.setVisibility(8);
       }
       return;
    }
}
