package c47.m;
import lf3.g;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveActivityCommonNotice;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import e47.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import e47.a$a;
import com.google.gson.Gson;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import androidx.fragment.app.Fragment;
import mq5.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.live.gzone.commandlottery.a$c;
import com.kwai.live.gzone.commandlottery.a;
import com.kwai.library.widget.popup.common.c;
import c47.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import f37.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import c47.o;
import java.lang.Runnable;
import ekd.k1;
import oq5.a;
import crd.b;
import lnc.b9;
import c47.p;
import oq5.c;
import com.kwai.live.gzone.commandlottery.f;
import erd.g;
import brd.t;
import oq5.b;
import android.content.Context;
import vq5.d;
import lf3.f;

public final class m implements g	// class@0004d8
{
    public final d b;

    public void m(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       a a;
       m tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b.c0(LiveLogTag.GZONE, "Receive SCGzoneLiveActivityCommonNotice", "message", p0);
       Object obj = null;
       a uoa = PatchProxy.applyOneRefs(p0, obj, a.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a();
          uoa.a = p0.bizType;
          uoa.b = p0.bizId;
          uoa.c = p0.liveStreamId;
          uoa.d = a.a.h(p0.payloadData, a$a.class);
       }
       d uod = d.class;
       if (!PatchProxy.applyVoidOneRefs(uoa, tb, uod, "4") && a1.i(tb.getActivity())) {
          obj = PatchProxy.apply(obj, tb, uod, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(tb.q.b() != null && (tb.q.b().getUserVisibleHint() && tb.q.b().isResumed())){
             b = true;
          }else {
             b = false;
          }
          if (b && (tb.s.U0() || (uoa != null && (uoa.d != null && TextUtils.equals(tb.q.getLiveStreamId(), uoa.c))))) {
             a = uoa.a;
             if (a == 2) {
                if (!PatchProxy.applyVoidOneRefs(uoa, tb, uod, "6")) {
                   tb.P8();
                   a$c uoc = new a$c(tb.getActivity());
                   uoc.I = uoa;
                   uoc.J = tb.q;
                   uoc.K = tb.C;
                   a = new a(uoc);
                   tb.D = a;
                   a.X(false);
                   tb.D.i0(new q(tb));
                   tb.D.Z();
                }
             }else if(a == 3){
                if (!a.a.getBoolean(b.d("user")+"gzone_command_lottery_notice_dialog_showed", false)) {
                   k1.s(new o(tb, uoa), tb, uoa.d.mDelay);
                }
             }else if(a != 4 || (PatchProxy.applyVoidOneRefs(uoa, tb, uod, "5") || (TextUtils.isEmpty(uoa.d.mJumpUrl) || (uoa.d.mIgnoreLandscape != null && tb.x.H2())))){
                b9.a(tb.z);
                if (uoa.d.mForcePortrait != null && tb.x.H2()) {
                   if (tb.w != null) {
                      if (tb.A == null) {
                         p op = new p(tb);
                         tb.A = op;
                         tb.x.H6(op);
                      }
                      tb.z = tb.y.subscribe(new f(tb, uoa));
                      tb.w.d();
                   }
                }else {
                   tb.v.r4(uoa.d.mJumpUrl, tb.getContext());
                }
             }
          }
       }
    label_0190 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
