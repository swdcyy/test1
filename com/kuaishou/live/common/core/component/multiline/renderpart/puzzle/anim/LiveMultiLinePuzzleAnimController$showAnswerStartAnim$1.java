package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import gs1.h;
import androidx.lifecycle.MutableLiveData;

public final class LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1 extends Lambda implements l	// class@00159c
{
    public final LiveMultiLinePuzzleAnimController this$0;

    public void LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1(LiveMultiLinePuzzleAnimController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       String str = "1";
       if (PatchProxy.isSupport(LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1.class, str)) {
          return;
       }
       LiveMultiLinePuzzleAnimController s = this.this$0.s;
       Objects.requireNonNull(s);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), s, h.class, str)) {
          s.a().setValue(Boolean.valueOf(p0));
       }
       return;
    }
}
