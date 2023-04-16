package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.lang.Number;
import lu1.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import pq1.b;
import f02.c;

public final class LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2 extends Lambda implements p	// class@001558
{
    public static final LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2 INSTANCE;

    static {
       LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2.INSTANCE = new LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2();
    }
    public void LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final r invoke(a p0,int p1){
       if (PatchProxy.isSupport(LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "participantInfo");
       int i = 1;
       if (p1 == i) {
          i = false;
       }
       return c.b(p0, i);
    }
}
