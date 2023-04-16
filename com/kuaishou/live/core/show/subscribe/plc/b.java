package com.kuaishou.live.core.show.subscribe.plc.b;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import android.app.Activity;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import com.kuaishou.live.core.show.subscribe.plc.LiveSubscribeHalfDialogEvent$EventType;
import com.kuaishou.live.core.show.subscribe.plc.f;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import wk2.s;
import rk2.n;
import zk2.i;
import zk2.h;
import zk2.j;
import ok.x;
import com.kuaishou.live.core.show.subscribe.dosubscribe.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zk2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import kq3.a;
import android.net.Uri;
import ekd.x0;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import b22.a;
import com.kuaishou.live.webview.a;
import android.content.DialogInterface$OnDismissListener;
import d61.g0;

public final class b implements g	// class@00115b
{
    public final QPhoto b;
    public final String c;
    public final String d;
    public final LiveSubscribeStatInfo e;
    public final Activity f;
    public final boolean g;

    public void b(QPhoto p0,String p1,String p2,LiveSubscribeStatInfo p3,Activity p4,boolean p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       b te = this.e;
       b tf = this.f;
       b tg = this.g;
       boolean b = true;
       f.d(tb, b, LiveSubscribeHalfDialogEvent$EventType.SUBSCRIBE_SUCCESS);
       j.i(tc, 2);
       if (f.g(tb, td)) {
          s.f(tb, 0, b);
       }
       new l(new n(new i(tb), new h(te), new j(td)), tb).a(tf, p0, tc);
       if (tg != null && (p0.mEnableAutoFollow != null && !TextUtils.x(p0.mAnchorId))) {
          f.b(tf, tb, p0.mAnchorId, 207, null);
       }
    label_0054 :
       if (tf instanceof GifshowActivity && !TextUtils.x(p0.mJumpUrl)) {
          p0 = p0.mJumpUrl;
          if (PatchProxy.applyThreeRefsWithListener(tf, p0, null, null, q.class, "3") != PatchProxyResult.class) {
          }else {
             a uoa = a.c(tf, tf.getSupportFragmentManager());
             uoa.g("live_subscribe_success_web_dialog");
             uoa.f("live_subscribe_success_web_dialog");
             p0 = x0.f(p0);
             LiveWebViewParam liveWebViewP = a.a(tf, p0);
             if (liveWebViewP != null) {
                uoa.b = liveWebViewP;
             }
             a uoa1 = a.c();
             uoa1.f(null);
             uoa1.h(x0.a(p0, "url"), uoa);
             PatchProxy.onMethodExit(q.class, "3");
          }
       }else {
          g0.b(R.string.arg_RES_7f102bcc);
       }
       return;
    }
}
