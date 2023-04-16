package com.yxcorp.plugin.setting.stencil.item.RenWoKanItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.RenWoKanItem;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import ihc.a;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;

public final class RenWoKanItem$action$1 extends Lambda implements l	// class@00091a
{
    public final SettingItemStencil $data;
    public final RenWoKanItem this$0;

    public void RenWoKanItem$action$1(RenWoKanItem p0,SettingItemStencil p1){
       this.this$0 = p0;
       this.$data = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenWoKanItem$action$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       SettingPageAction action = this.$data.getAction();
       if (action != null) {
          String url = action.getUrl();
          if (url != null) {
             c.i(this.this$0.c, KwaiWebViewActivity.N3(this.this$0.c, url).m("KEY_ENABLE_SWIPE_BACK", true).o("ks://renwokanbook").a());
          }
       }
       return;
    }
}
