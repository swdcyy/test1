package b54.a;
import b24.a;
import b54.a$a;
import nsd.u;
import java.lang.Object;
import ds3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import tkd.b;
import tkd.d;
import fs3.d;
import com.kwai.sdk.switchconfig.a;
import b54.a$b;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;

public class a implements a	// class@000316
{
    public boolean a;
    public boolean b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(){
       super();
       this.a = true;
    }
    public boolean a(){
       return this.b;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (a.a().c()) {
          int i = d.a(-322777062).Gp();
          boolean b = true;
          if (i != b) {
             if (i == 2) {
                this.b = false;
                return;
             }
          }else {
             this.b = b;
             return;
          }
       }
       if (this.a == null) {
          this.b = false;
          return;
       }else {
          List value = a.t().getValue("yellowCartUltronAuthorBlacklist", new a$b().getType(), null);
          if (value != null) {
             Iterator iterator = value.iterator();
             while (iterator.hasNext()) {
                if (TextUtils.n(iterator.next(), p0.b().getLiveAuthorId())) {
                   this.b = false;
                   return;
                }
             }
          }
          this.b = a.t().d("enableMerchantYellowCarUltron", false);
          return;
       }
    }
    public void c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a = p0;
       a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "RollbackManager", "receive rollback signal: "+p0);
       return;
    }
}
