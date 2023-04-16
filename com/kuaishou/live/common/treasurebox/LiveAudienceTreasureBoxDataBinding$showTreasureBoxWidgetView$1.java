package com.kuaishou.live.common.treasurebox.LiveAudienceTreasureBoxDataBinding$showTreasureBoxWidgetView$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import j02.k;
import j02.o;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceTreasureBoxDataBinding$showTreasureBoxWidgetView$1 extends Lambda implements a	// class@001807
{
    public final o $viewModel;
    public final k this$0;

    public void LiveAudienceTreasureBoxDataBinding$showTreasureBoxWidgetView$1(k p0,o p1){
       this.this$0 = p0;
       this.$viewModel = p1;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTreasureBoxDataBinding$showTreasureBoxWidgetView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.this$0.b(this.$viewModel);
    }
}
