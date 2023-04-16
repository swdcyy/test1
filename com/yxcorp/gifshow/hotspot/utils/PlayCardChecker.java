package com.yxcorp.gifshow.hotspot.utils.PlayCardChecker;
import java.lang.Enum;
import com.yxcorp.gifshow.hotspot.utils.PlayCardChecker$INVALID;
import java.lang.String;
import com.yxcorp.gifshow.hotspot.utils.PlayCardChecker$HORIZONTAL_CARD_CHECKER;
import android.graphics.Rect;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Boolean;
import android.view.ViewParent;
import a2.i0;
import kotlin.jvm.internal.a;

public abstract class PlayCardChecker extends Enum	// class@0018ee
{
    public Rect mRect;
    public static final PlayCardChecker[] $VALUES;
    public static final PlayCardChecker HORIZONTAL_CARD_CHECKER;
    public static final PlayCardChecker INVALID;

    static {
       PlayCardChecker$INVALID iNVALID;
       PlayCardChecker$HORIZONTAL_CARD_CHECKER hORIZONTAL_C;
       PlayCardChecker[] playCardChec = new PlayCardChecker[]{iNVALID,hORIZONTAL_C};
       iNVALID = new PlayCardChecker$INVALID("INVALID", 0);
       PlayCardChecker.INVALID = iNVALID;
       hORIZONTAL_C = new PlayCardChecker$HORIZONTAL_CARD_CHECKER("HORIZONTAL_CARD_CHECKER", 1);
       PlayCardChecker.HORIZONTAL_CARD_CHECKER = hORIZONTAL_C;
       PlayCardChecker.$VALUES = playCardChec;
    }
    public void PlayCardChecker(String p0,int p1){
       super(p0, p1);
       this.mRect = new Rect();
    }
    public void PlayCardChecker(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static PlayCardChecker valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayCardChecker.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayCardChecker.class, p0);
    }
    public static PlayCardChecker[] values(){
       Object obj = PatchProxy.apply(null, null, PlayCardChecker.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayCardChecker.$VALUES.clone();
    }
    public abstract boolean checkPlay(View p0);
    public final boolean checkViewState(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayCardChecker.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!p0.getVisibility() && (p0.getMeasuredHeight() && (p0.getMeasuredWidth() && (p0.getParent() != null && i0.X(p0))))))? true: false;
       return b;
    }
    public final Rect getMRect(){
       return this.mRect;
    }
    public final void setMRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayCardChecker.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mRect = p0;
       return;
    }
}
