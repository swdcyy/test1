package com.kwai.live.gzone.accompanyplay.audience.u$c;
import com.kwai.live.gzone.accompanyplay.audience.u$b;
import com.kwai.live.gzone.accompanyplay.audience.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.f;
import com.kwai.live.gzone.accompanyplay.audience.t;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import f37.b0;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mq5.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;
import e17.i;
import k37.n;
import com.kwai.live.gzone.accompanyplay.audience.v;
import com.kwai.live.gzone.accompanyplay.audience.u$c$b;
import com.kwai.live.gzone.accompanyplay.audience.u$c$a;

public class u$c implements u$b	// class@000bb9
{
    public final u a;

    public void u$c(u p0){
       this.a = p0;
       super();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$c.class, "4")) {
          return;
       }
       this.a.W8(p0);
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u$c.class, "2")) {
          return;
       }
       u$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, u.class, "3")) {
          t$a uoa = new t$a(ta.getActivity());
          uoa.W0(R.string.arg_RES_7f1023d9);
          uoa.S0(R.string.arg_RES_7f1023dd);
          uoa = f.e(uoa);
          uoa.Q0(R.string.cancel);
          uoa.u0(new t(ta));
          ta.P8(uoa.Y(PopupInterface.a));
       }
       return;
    }
    public boolean h(int p0,String p1){
       u$c ta;
       t$a uoa;
       u$c uoc = u$c.class;
       u ou = u.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.a.r.U0()) {
          return false;
       }else {
          int i = 0x7f1004b4;
          switch (p0){
              case 0xfdfc:
                ta = this.a;
                Objects.requireNonNull(ta);
                if (PatchProxy.applyVoid(null, ta, ou, "6")) {
                label_0190 :
                   return true;
                }else {
                   uoa = new t$a(ta.getActivity());
                   uoa.W0(R.string.arg_RES_7f102385);
                   uoa.S0(R.string.arg_RES_7f102356);
                   uoa.Q0(i);
                   uoa.u0(new v(ta));
                   ta.P8(f.e(uoa).Y(PopupInterface.a));
                   goto label_0190 ;
                }
                break;
              case 0xfdfd:
                ta = this.a;
                Objects.requireNonNull(ta);
                if (PatchProxy.applyVoid(null, ta, ou, "9")) {
                   goto label_0190 ;
                }else {
                   uoa = new t$a(ta.getActivity());
                   uoa.W0(R.string.arg_RES_7f102386);
                   uoa.S0(R.string.arg_RES_7f101e4d);
                   uoa = f.e(uoa);
                   uoa.Q0(i);
                   uoa.u0(new n(ta));
                   ta.P8(uoa.Y(PopupInterface.a));
                   goto label_0190 ;
                }
                break;
              case 0x103be:
                this.a.S8(R.string.arg_RES_7f1023d8, 0x7f102367);
                goto label_0190 ;
                break;
              case 0x103bf:
                if (TextUtils.isEmpty(p1)) {
                   i.a(R.style.arg_RES_7f11066a, 0x7f102360);
                }else {
                   i.d(R.style.arg_RES_7f11066a, p1);
                }
                return true;
                break;
              case 0x103cd:
                if (TextUtils.isEmpty(p1)) {
                   this.a.V8(R.string.arg_RES_7f102313);
                   goto label_0190 ;
                }else {
                   this.a.W8(p1);
                   goto label_0190 ;
                }
                break;
              case 0x103ce:
                this.a.V8(R.string.arg_RES_7f1023af);
                goto label_0190 ;
                break;
              case 0x103dc:
                this.a.V8(R.string.arg_RES_7f1023ad);
                goto label_0190 ;
                break;
              case 0x103dd:
                ta = this.a;
                Objects.requireNonNull(ta);
                if (PatchProxy.applyVoid(null, ta, ou, "4")) {
                   goto label_0190 ;
                }else {
                   a mFleetInfo = ta.t.t().mFleetInfo;
                   if (mFleetInfo != null && !mFleetInfo.mSettingInfo.isFree()) {
                      ta.V8(R.string.arg_RES_7f102371);
                      goto label_0190 ;
                   }else {
                      i.a(R.style.arg_RES_7f11066a, 0x7f1023d3);
                      ta.t.e("ticketTab");
                      goto label_0190 ;
                   }
                }
                break;
              case 0x103f2:
                ta = this.a;
                Objects.requireNonNull(ta);
                if (PatchProxy.applyVoid(null, ta, ou, "10")) {
                   goto label_0190 ;
                }else {
                   uoa = new t$a(ta.getActivity());
                   uoa.W0(R.string.arg_RES_7f102330);
                   uoa.S0(R.string.arg_RES_7f103a83);
                   ta.P8(f.e(uoa).Y(PopupInterface.a));
                   goto label_0190 ;
                }
                break;
              case 0x103f3:
                this.a.t.d();
                return true;
              case 0x989681:
                this.a.S8(R.string.arg_RES_7f1013ac, 0x7f1012ab);
                goto label_0190 ;
                break;
              case 0x989682:
                this.a.S8(R.string.arg_RES_7f1013ab, 0x7f1013bd);
                goto label_0190 ;
                break;
              default:
                if (!TextUtils.isEmpty(p1)) {
                   this.a.W8(p1);
                   goto label_0190 ;
                }else {
                   return false;
                }
          }
       }
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, u$c.class, "3")) {
          return;
       }
       u$c ta = this.a;
       t$a uoa = new t$a(ta.getActivity());
       uoa.W0(R.string.arg_RES_7f1023da);
       uoa.S0(R.string.arg_RES_7f102368);
       uoa = f.e(uoa);
       uoa.Q0(R.string.cancel);
       uoa.u0(new u$c$b(this));
       ta.P8(uoa.Y(new u$c$a(this)));
       return;
    }
}
