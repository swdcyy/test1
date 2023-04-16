package com.kwai.live.gzone.accompanyplay.audience.v0$a;
import lf3.g;
import com.kwai.live.gzone.accompanyplay.audience.v0;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceHide;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import fq5.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import mq5.b;
import z1.e;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.f;
import k37.i1;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import f37.b0;
import lf3.f;

public class v0$a implements g	// class@000bbd
{
    public final v0 b;

    public void v0$a(v0 p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       v0$a uoa = v0$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
       }else {
          String id = QCurrentUser.ME.getId();
          if (!TextUtils.equals(this.b.t.I().getId(), id) && !this.b.v.U0()) {
             v0$a tb = this.b;
             v0 q = tb.q;
             if (q != null) {
                q = q.a;
                if (!TextUtils.equals(tb.s, q)) {
                   tb = this.b;
                   q = tb.r;
                   if (q != null) {
                      int i = q.b.intValue();
                      if (tb.S8(i)) {
                         this.b.X8();
                      }else if(this.b.w.q()){
                         tb = this.b;
                         Objects.requireNonNull(tb);
                         i = PatchProxy.applyVoid(null, tb, v0.class, "7");
                         if (!i) {
                            t$a uoa1 = new t$a(tb.getActivity());
                            uoa1.W0(R.string.arg_RES_7f102330);
                            uoa1.S0(R.string.arg_RES_7f103a83);
                            uoa1 = f.e(uoa1);
                            uoa1.u0(new i1(tb));
                            i = uoa1.Y(PopupInterface.a);
                            tb.P8(i);
                         }
                      }
                   }else {
                      goto label_0061 ;
                   }
                   tb = this.b;
                   q = tb.q.a;
                   tb.s = q;
                }
             }
             tb = this.b;
             tb.q = null;
             tb.r = null;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
