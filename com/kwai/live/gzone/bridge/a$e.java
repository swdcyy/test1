package com.kwai.live.gzone.bridge.a$e;
import n3d.a;
import com.kwai.live.gzone.bridge.a;
import f55.g;
import r4d.a;
import com.kwai.live.gzone.bridge.function.GzoneJsObtainOpenIdParams;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u37.d;
import u37.e;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Number;
import brd.t;
import com.kwai.live.gzone.bridge.a$e$a;
import com.kwai.live.gzone.bridge.a$e$b;
import erd.g;
import crd.b;

public class a$e implements a	// class@000c7a
{
    public final g b;
    public final a c;
    public final GzoneJsObtainOpenIdParams d;
    public final a e;

    public void a$e(a p0,g p1,a p2,GzoneJsObtainOpenIdParams p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       a$e this;
       String str;
       if (PatchProxy.isSupport(a$e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a$e.class, "1")) {
          return;
       }
       if (!p1) {
          this.e.Oa(this.b, 0, R.string.arg_RES_7f104fc9);
          return;
       }else if(this.c.isLogined()){
          a$e td = this.d;
          if (td.mRecordOpenId != null) {
             td = 3;
             if (TextUtils.n(this.c.getName(), "qq2.0")) {
                td = 1;
             }else if(TextUtils.n(this.c.getName(), "weixin")){
                td = 2;
             }
             d uod = e.b();
             this = this.e;
             String openId = this.c.getOpenId();
             String token = this.c.getToken();
             String refreshToken = this.c.getRefreshToken();
             Objects.requireNonNull(this);
             if (PatchProxy.isSupport(a.class)) {
                str = PatchProxy.applyFourRefs(openId, token, Integer.valueOf(td), refreshToken, this, a.class, "9");
                if (str != PatchProxyResult.class) {
                label_00be :
                   uod.f(str).subscribe(new a$e$a(this), new a$e$b(this));
                }
             }
             i3 oi3 = i3.f();
             oi3.d("openId", TextUtils.k(openId));
             oi3.d("accessToken", TextUtils.k(token));
             oi3.c("channel", Integer.valueOf(td));
             oi3.d("refreshToken", TextUtils.k(refreshToken));
             str = oi3.e();
             goto label_00be ;
          }else {
             this.e.Pa(this.c, td, this.b);
          }
       }else {
          this.e.Oa(this.b, 413, R.string.arg_RES_7f105019);
       }
       return;
    }
}
