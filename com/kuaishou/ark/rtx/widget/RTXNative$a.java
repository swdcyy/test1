package com.kuaishou.ark.rtx.widget.RTXNative$a;
import com.tkruntime.v8.V8ObjectProxy;
import com.kuaishou.ark.rtx.widget.RTXNative;
import com.tkruntime.v8.V8;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.tkruntime.v8.V8Object;
import java.lang.Integer;
import android.content.Context;
import iq8.q;
import iq8.n;
import com.tachikoma.core.component.TKBaseNativeModule;
import ekd.p0;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;

public class RTXNative$a extends V8ObjectProxy	// class@000f95
{
    public final RTXNative b;

    public void RTXNative$a(RTXNative p0,V8 p1,String p2){
       this.b = p0;
       super(p1, p2);
    }
    public Object onPropCall(boolean p0,String p1,Object p2){
       int i;
       if (PatchProxy.isSupport(RTXNative$a.class)) {
          p2 = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, RTXNative$a.class, "1");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       if (TextUtils.x(p1) || !p0) {
          return V8ObjectProxy.PROP_SET_IGNORE;
       }else {
          RTXNative$a uoa = null;
          Objects.requireNonNull(p1);
          switch (p1.hashCode()){
              case 0x8c5181d9:
                if (p1.equals("networkName")) {
                   i = 0;
                }
                break;
              case 0x8c549688:
                if (p1.equals("networkType")) {
                   i = 1;
                }
                break;
              case 0xa714ac1a:
                if (p1.equals("productName")) {
                   i = 2;
                }
                break;
              case 0xd27f48:
                if (p1.equals("statusBarHeight")) {
                   i = 3;
                }
                break;
              case 0x5fd2309:
                if (p1.equals("isPad")) {
                   i = 4;
                }
                break;
              case 0x5875c377:
                if (p1.equals("appVersion")) {
                   i = 5;
                }
                break;
              case 0x7f4b7fa2:
                if (p1.equals("titleBarHeight")) {
                   i = 6;
                }
                break;
              default:
             label_0032 :
                i = -1;
          }
          switch (i){
              case 0:
                uoa = p0.p(this.b.getContext());
                break;
              case 1:
                if (p0.F(this.b.getContext())) {
                   uoa = "WIFI";
                }else {
                   uoa = (p0.u(this.b.getContext())).toUpperCase();
                }
                break;
              case 2:
                uoa = this.b.appKpn;
                this.add(p1, uoa);
                break;
              case 3:
                if (RTXNative.sStatusBarHeight == -1) {
                   RTXNative.sStatusBarHeight = n.f(RTXNative.getStatusBarHeight(q.a()));
                }
                this.add(p1, RTXNative.sStatusBarHeight);
                uoa = Integer.valueOf(RTXNative.sStatusBarHeight);
                break;
              case 4:
                if (RTXNative.sIsPad == null) {
                   RTXNative.sIsPad = Boolean.valueOf(RTXNative.isPad(q.a()));
                }
                this.add(p1, RTXNative.sIsPad.booleanValue());
                uoa = RTXNative.sIsPad;
                break;
              case 5:
                uoa = this.b.appVersion;
                this.add(p1, uoa);
                break;
              case 6:
                this.add(p1, 50);
                uoa = Integer.valueOf(50);
                break;
              default:
          }
          return V8ObjectUtilsQuick.toReturnObjectForV8(this.v8, uoa);
       }
    }
}
