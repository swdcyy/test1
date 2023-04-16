package com.kuaishou.live.lite.krn.RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver;
import android.content.BroadcastReceiver;
import java.lang.String;
import vq5.d;
import xp5.g;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.krn.RouterScanDebugTool;
import java.util.Objects;
import com.kuaishou.live.lite.krn.RouterScanDebugTool$Companion;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import d61.s;
import d61.s$a;

public final class RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver extends BroadcastReceiver	// class@0009e1
{
    public final WeakReference a;
    public final WeakReference b;
    public final String c;

    public void RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver(String p0,d p1,g p2){
       a.p(p0, "pageId");
       a.p(p1, "routerManager");
       a.p(p2, "liveInfoManager");
       super();
       this.c = p0;
       this.a = new WeakReference(p1);
       this.b = new WeakReference(p2);
    }
    public void onReceive(Context p0,Intent p1){
       s$a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       String stringExtra = p1.getStringExtra("pageSource");
       if (stringExtra != null) {
          a.o(stringExtra, "intent.getStringExtra\(keyPageSource\) ?: return");
          RouterScanDebugTool$Companion f = RouterScanDebugTool.f;
          Objects.requireNonNull(f);
          String str = PatchProxy.applyOneRefs(stringExtra, f, RouterScanDebugTool$Companion.class, "2");
          String str1 = null;
          if (str != PatchProxyResult.class) {
          }else {
             int i = StringsKt__StringsKt.i3(stringExtra, ":", 0, false, 6, null);
             if (i == -1) {
                str = str1;
             }else {
                stringExtra = stringExtra.substring((i + 1));
                a.o(stringExtra, "\(this as java.lang.String\).substring\(startIndex\)");
                str = stringExtra;
             }
          }
          if (a.g(str, this.c) ^ 0x01) {
             return;
          }else {
             String stringExtra1 = p1.getStringExtra("live_router_scheme");
             if (stringExtra1 != null) {
                a = s.a;
                a.o(stringExtra1, "router");
                if (a.a(stringExtra1)) {
                   g og = this.b.get();
                   str = (og != null)? og.d(): str1;
                   g og1 = this.b.get();
                   if (og1 != null) {
                      str1 = og1.getLiveStreamId();
                   }
                   stringExtra1 = a.b(stringExtra1, str, str1);
                }
                d uod = this.a.get();
                if (uod != null) {
                   uod.r4(stringExtra1, p0);
                }
             }
          }
       }
    label_00a2 :
       return;
    }
}
