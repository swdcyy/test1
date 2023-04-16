package com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import tyb.a;
import ihc.a;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import android.content.Context;
import android.content.Intent;

public final class FreeDataTrafficItem$action$1 extends Lambda implements l	// class@001b2c
{
    public final FreeDataTrafficItem this$0;

    public void FreeDataTrafficItem$action$1(FreeDataTrafficItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeDataTrafficItem$action$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Intent intent = d.a(-1671712621).wQ(this.this$0.b, WebEntryUrls.y, "isp");
       a.o(intent, "PluginManager.get\(YodaPl¡­ODA, FREE_TRAFFIC_BIZ_ID\)");
       this.this$0.b.startActivity(intent);
       return;
    }
}
