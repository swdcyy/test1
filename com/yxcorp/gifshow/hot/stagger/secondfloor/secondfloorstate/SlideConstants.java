package com.yxcorp.gifshow.hot.stagger.secondfloor.secondfloorstate.SlideConstants;
import com.yxcorp.gifshow.hot.stagger.secondfloor.secondfloorstate.SlideConstants$SHOW_SECOND_FLOOR$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hot.stagger.secondfloor.secondfloorstate.SlideConstants$ENTER_SECOND_FLOOR$2;
import com.yxcorp.gifshow.hot.stagger.secondfloor.secondfloorstate.SlideConstants$GUIDE_DOWN_OFFSET$2;
import com.yxcorp.gifshow.hot.stagger.secondfloor.secondfloorstate.SlideConstants$GUIDE_UP_OFFSET$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class SlideConstants	// class@0018dc
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final SlideConstants e;

    static {
       SlideConstants.e = new SlideConstants();
       SlideConstants.a = s.c(SlideConstants$SHOW_SECOND_FLOOR$2.INSTANCE);
       SlideConstants.b = s.c(SlideConstants$ENTER_SECOND_FLOOR$2.INSTANCE);
       SlideConstants.c = s.c(SlideConstants$GUIDE_DOWN_OFFSET$2.INSTANCE);
       SlideConstants.d = s.c(SlideConstants$GUIDE_UP_OFFSET$2.INSTANCE);
    }
    public void SlideConstants(){
       super();
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, SlideConstants.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = SlideConstants.a.getValue();
       }
       return obj.intValue();
    }
}
