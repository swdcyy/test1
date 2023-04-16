package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$e;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import java.util.Objects;
import rd0.r;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.model.CompleteTipConfigV2;
import com.google.gson.JsonObject;
import id0.d;
import ld0.d;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import ae0.b;

public final class SectionPendantV2$e extends m	// class@000623
{
    public final SectionPendantV2 c;

    public void SectionPendantV2$e(SectionPendantV2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2$e.class, "1")) {
          return;
       }
       a.p(p0, "view");
       SectionPendantV2$e tc = this.c;
       SectionPendantV2 f = tc.F;
       Context realContext = tc.getRealContext();
       Objects.requireNonNull(f);
       r obj = PatchProxy.applyOneRefs(realContext, f, r.class, "5");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(f.a != null){
          obj = f.c;
          if (obj != null) {
             JsonObject jsonObject = null;
             String mBubbleLinkU = obj.getMBubbleLinkUrl();
             obj = (mBubbleLinkU == null || !mBubbleLinkU.length())? 1: null;
             if (!obj) {
                obj = f.c;
                if (obj != null) {
                   jsonObject = obj.getMReport();
                }
                d uod = ((f.d).length() > 0)? 1: null;
                if (uod && jsonObject != null) {
                   d.f().d(jsonObject, f.d);
                }
                r c = f.c;
                if (c != null) {
                   String mBubbleLinkU1 = c.getMBubbleLinkUrl();
                   if (mBubbleLinkU1 != null) {
                      c.i(realContext, KwaiWebViewActivity.N3(a.b(), mBubbleLinkU1).a());
                   }
                }
             }
          }
       }
    label_0086 :
       b = false;
       if (!b) {
          SectionPendantV2 b1 = this.c.B;
          if (b1 != null) {
             b1.a(p0);
          }
       }
       return;
    }
}
