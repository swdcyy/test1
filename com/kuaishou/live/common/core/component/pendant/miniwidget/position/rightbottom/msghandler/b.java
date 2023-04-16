package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import android.content.Context;
import android.app.Activity;
import p91.m;
import cs5.d;
import oq5.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import o56.a;
import d61.y;
import bw1.c;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import lp3.e;
import kq3.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.yxcorp.utility.n;
import yv1.r;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;

public class b	// class@001712
{
    public Context a;
    public Activity b;
    public m c;
    public d d;
    public b e;
    public KwaiDialogFragment f;
    public static final List g;

    static {
       b.g = LiveLogTag.LIVE_RIFHT_BOTTOM_MINI_WIDGET.appendTag("LiveOldActivityMsgHandler");
    }
    public void b(Context p0,Activity p1,m p2,d p3,b p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void a(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "5")) {
          return;
       }
       if (!TextUtils.isEmpty(p1)) {
          p1 = w0.f(p1).buildUpon().appendQueryParameter("widget_kpn", a.x).appendQueryParameter("widget_anchorId", this.c.d()).build().toString();
          if (y.d(this.b)) {
             uob = this.e;
             if (uob != null) {
                uob.d();
                k1.s(new c(this, p0, p1), this, 200);
             }
          }
          this.b(p0, p1, this.b);
       }
       return;
    }
    public final void b(int p0,String p1,Activity p2){
       a b;
       r a;
       String str;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "6")) {
          return;
       }
       a uoa = a.d(this.b, this.c.b().getChildFragmentManager(), this.c.t5());
       uoa.g("live-activity-widget");
       uoa.f("live-activity-widget-fragment");
       b = uoa.b;
       boolean b1 = (p0 == 2)? true: false;
       LiveWebViewParam liveWebViewP = b.setFullScreen(b1).setPortraitHeightPixel((int)((float)n.l(p2) * 0x3f4ccccd));
       a = r.a;
       LiveWebViewParam mFullScreen = uoa.b.mFullScreen;
       Objects.requireNonNull(a);
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          str = PatchProxy.applyOneRefs(Boolean.valueOf(mFullScreen), a, or, "4");
          if (str != PatchProxyResult.class) {
          label_008b :
             liveWebViewP.setWebTypeUA(str).setInOutAnimation(0).setDimAmount(0);
             this.f = a.c().h(p1, uoa);
             return;
          }
       }
       str = "Live_ActivityWidget_"+(mFullScreen ^ 1);
       goto label_008b ;
    }
}
