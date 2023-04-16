package com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2;
import gn1.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.res.Resources;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController;
import androidx.lifecycle.LiveData;

public final class LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2$1 extends Lambda implements a	// class@001371
{
    public final LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2 this$0;

    public void LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2$1(LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final g invoke(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Resources resources = this.this$0.this$0.D2().getResources();
       a.o(resources, "context.resources");
       return new g(resources, this.this$0.this$0.j);
    }
    public Object invoke(){
       return this.invoke();
    }
}
