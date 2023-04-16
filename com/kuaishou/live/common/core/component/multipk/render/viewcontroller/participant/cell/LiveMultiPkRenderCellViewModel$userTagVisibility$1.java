package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$userTagVisibility$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import lu1.r;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveMultiPkRenderCellViewModel$userTagVisibility$1 extends Lambda implements p	// class@001694
{
    public static final LiveMultiPkRenderCellViewModel$userTagVisibility$1 INSTANCE;

    static {
       LiveMultiPkRenderCellViewModel$userTagVisibility$1.INSTANCE = new LiveMultiPkRenderCellViewModel$userTagVisibility$1();
    }
    public void LiveMultiPkRenderCellViewModel$userTagVisibility$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1));
    }
    public final boolean invoke(r p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiPkRenderCellViewModel$userTagVisibility$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !TextUtils.x(p1))? true: false;
       return b;
    }
}
