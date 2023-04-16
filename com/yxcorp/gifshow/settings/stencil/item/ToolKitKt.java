package com.yxcorp.gifshow.settings.stencil.item.ToolKitKt;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import android.content.Context;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.settings.stencil.item.ToolKitKt$createAction$1;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import k2b.e0;
import ehc.g;
import tkd.b;
import tkd.d;
import vgc.a;

public final class ToolKitKt	// class@001b3e
{
    public static final ImmutableList a;

    static {
       ToolKitKt.a = ImmutableList.of("kwai://setting/privacy", "kwai://setting/general", "kwai://setting/block", "kwai://setting/aboutus", "kwai://interedit");
    }
    public static final l a(SettingPageAction p0,Context p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ToolKitKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$createAction");
       a.p(p1, "context");
       return new ToolKitKt$createAction$1(p0, p1);
    }
    public static final g b(SettingItemStencil p0,e0 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ToolKitKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$createLoggerHandler");
       a.p(p1, "logPage");
       return d.a(0x5da6cca5).F10(p1, p0);
    }
}
