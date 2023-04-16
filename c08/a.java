package c08.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import fq5.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import java.lang.String;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.util.Map;
import com.kuaishou.krn.event.a;
import java.lang.StringBuilder;
import o08.a;
import oj0.a;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import o63.a;

public final class a	// class@0003ac
{
    public GifshowActivity a;
    public Map b;
    public LiveMerchantBaseContext c;
    public b d;
    public RNLive e;
    public PendantLiveContext f;
    public boolean g;
    public c h;
    public a i;
    public String j;
    public boolean k;

    public void a(){
       super();
    }
    public final GifshowActivity a(){
       return this.a;
    }
    public final b b(){
       return this.d;
    }
    public final LiveMerchantBaseContext c(){
       return this.c;
    }
    public final PendantLiveContext d(){
       return this.f;
    }
    public final String e(){
       return this.j;
    }
    public final RNLive f(){
       return this.e;
    }
    public final boolean g(){
       return this.k;
    }
    public final void h(){
       this.a = null;
       a tb = this.b;
       if (tb != null) {
          tb.clear();
       }
       this.c = null;
       this.d = null;
       tb = this.e;
       if (tb != null) {
          RNLive b = tb.b;
          if (b != null) {
             a.b().c(b.d+"_JsToNative", b.c);
             b.a.clear();
          }
          b = tb.a;
          if (b != null) {
             b.b();
          }
          tb.a = null;
          tb.d = null;
       }
       this.e = null;
       this.f = null;
       this.h = null;
       this.i = null;
       return;
    }
    public final void i(GifshowActivity p0){
       this.a = p0;
    }
    public final void j(Map p0){
       this.b = p0;
    }
    public final void k(a p0){
       this.i = p0;
    }
    public final void l(b p0){
       this.d = p0;
    }
    public final void m(LiveMerchantBaseContext p0){
       this.c = p0;
    }
    public final void n(boolean p0){
       this.g = p0;
    }
    public final void o(PendantLiveContext p0){
       this.f = p0;
    }
    public final void p(String p0){
       this.j = p0;
    }
    public final void q(boolean p0){
       this.k = p0;
    }
}
