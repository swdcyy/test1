package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1 extends Lambda implements l	// class@0015a2
{
    public static final LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1 INSTANCE;

    static {
       LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1.INSTANCE = new LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1();
    }
    public void LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1.class, "1")) {
          return;
       }
       b.I(LiveLogTag.LIVE_LINE_PUZZLE, "bindAnswerBgError", p0);
       return;
    }
}
