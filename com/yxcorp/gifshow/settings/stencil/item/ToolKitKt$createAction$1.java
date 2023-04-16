package com.yxcorp.gifshow.settings.stencil.item.ToolKitKt$createAction$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import nf6.i;
import com.yxcorp.gifshow.settings.stencil.item.ToolKitKt;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import com.google.common.collect.ImmutableList;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;

public final class ToolKitKt$createAction$1 extends Lambda implements l	// class@001b3d
{
    public final Context $context;
    public final SettingPageAction $this_createAction;

    public void ToolKitKt$createAction$1(SettingPageAction p0,Context p1){
       this.$this_createAction = p0;
       this.$context = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       ImmutableList a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolKitKt$createAction$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ToolKitKt$createAction$1 t$context = this.$context;
       i oi = b.a(0x66dce92a);
       ToolKitKt$createAction$1 t$context1 = this.$context;
       String url = this.$this_createAction.getUrl();
       String str = PatchProxy.applyOneRefs(url, null, ToolKitKt.class, "6");
       if (str != PatchProxyResult.class) {
       }else if(b.g()){
          a = ToolKitKt.a;
          if (a.contains(url)) {
             str = a.C(url, "Tablet");
          }else if(url != null && StringsKt__StringsKt.i3(url, "?", 0, false, 6, null) > -1){
             str = url.substring(0, StringsKt__StringsKt.i3(url, "?", 0, false, 6, null));
             a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             if (a.contains(str)) {
                int i = StringsKt__StringsKt.i3(url, "?", 0, false, 6, null);
                String str1 = url.substring(0, i);
                a.o(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                url = url.substring(i);
                a.o(url, "\(this as java.lang.String\).substring\(startIndex\)");
                url = str1+"Tablet"+url;
             }
          }
       }
       str = url;
       t$context.startActivity(oi.a(t$context1, w0.f(str)));
       return;
    }
}
