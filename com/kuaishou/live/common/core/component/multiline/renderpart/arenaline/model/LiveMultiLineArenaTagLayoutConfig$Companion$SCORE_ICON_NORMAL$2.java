package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$b;
import android.util.Size;

public final class LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2 extends Lambda implements a	// class@001532
{
    public static final LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2 INSTANCE;

    static {
       LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2.INSTANCE = new LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2();
    }
    public void LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2(){
       super(0);
    }
    public final LiveMultiLineIconTextView$a invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineArenaTagLayoutConfig$Companion$SCORE_ICON_NORMAL$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveMultiLineIconTextView$a uoa = new LiveMultiLineIconTextView$a(a1.e(20.00f), new LiveMultiLineIconTextView$b(a1.e(2.00f), a1.e(6.00f), 0, 0), a1.e(2.00f), new Size(a1.e(16.00f), a1.e(16.00f)), a1.e(9.00f), a1.e(11.00f), a1.e(32.00f));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
