package l59.d;
import erd.g;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import vq4.d;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import o56.a;
import yx.j0;

public final class d implements g	// class@002c87
{
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;

    public void d(int p0,String p1,String p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       String str;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       c f = p0.F;
       f.n = this.b;
       f.d0 = tc;
       f.E0 = 1;
       if (PatchProxy.isSupport(BlackUrlUtil.class)) {
          str = PatchProxy.applyThreeRefs(td, tc, Boolean.valueOf(te), null, BlackUrlUtil.class, "16");
          if (str != PatchProxyResult.class) {
          label_0059 :
             f.i3 = str;
             if (a.d()) {
                Object[] objArray = new Object[0];
                j0.a("BlackUrlUtil", p0.F.i3, objArray);
             }
             return;
          }
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("advertiser_url", td);
       if (te != null) {
          jsonObject.c0("apk_url", tc);
       }else {
          jsonObject.c0("black_url", tc);
       }
       jsonObject.a0("block_timestamp", Long.valueOf(System.currentTimeMillis()));
       str = jsonObject.toString();
       goto label_0059 ;
    }
}
