package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding$layoutManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding;
import android.view.View;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding$layoutManager$2$$special$$inlined$apply$lambda$1;

public final class LiveHotSpotRankListDataBinding$layoutManager$2 extends Lambda implements a	// class@001430
{
    public final View $rootView;
    public final LiveHotSpotRankListDataBinding this$0;

    public void LiveHotSpotRankListDataBinding$layoutManager$2(LiveHotSpotRankListDataBinding p0,View p1){
       this.this$0 = p0;
       this.$rootView = p1;
       super(0);
    }
    public final LiveHotSpotRankListLayoutManager invoke(){
       LiveHotSpotRankListLayoutManager obj = PatchProxy.apply(null, this, LiveHotSpotRankListDataBinding$layoutManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = this.$rootView.getContext();
       a.o(context, "rootView.context");
       obj = new LiveHotSpotRankListLayoutManager(context);
       obj.s = new LiveHotSpotRankListDataBinding$layoutManager$2$$special$$inlined$apply$lambda$1(this);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
