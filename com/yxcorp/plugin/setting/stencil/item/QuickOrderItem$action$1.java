package com.yxcorp.plugin.setting.stencil.item.QuickOrderItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.QuickOrderItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ihc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import ahd.i;
import n3d.a;
import com.yxcorp.gifshow.webview.c;

public final class QuickOrderItem$action$1 extends Lambda implements l	// class@000918
{
    public final QuickOrderItem this$0;

    public void QuickOrderItem$action$1(QuickOrderItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, QuickOrderItem$action$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       QuickOrderItem$action$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tthis$0, QuickOrderItem.class, str)) {
          a c = tthis$0.c;
          if (c instanceof GifshowActivity) {
             objArray = c;
          }
          if (objArray != null) {
             SettingPageAction action = tthis$0.q.getAction();
             if (action != null) {
                String url = action.getUrl();
                if (url != null) {
                   c.k(objArray, KwaiWebViewActivity.N3(objArray, TextUtils.i(url, WebEntryUrls.z)).a(), 352, i.b);
                }
             }
          }
       }
    label_004e :
       return;
    }
}
