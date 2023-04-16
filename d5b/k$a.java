package d5b.k$a;
import com.yxcorp.gifshow.magic.ui.widget.a;
import d5b.k;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import a5b.h;
import a5b.h$a;

public final class k$a extends a	// class@002446
{
    public final k g;

    public void k$a(k p0,Context p1){
       a.p(p1, "context");
       this.g = p0;
       super(p1);
    }
    public int J0(){
       return 0x7f0d143d;
    }
    public void K0(String p0,int p1){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "keyword");
       k$a tg = this.g;
       Objects.requireNonNull(tg);
       k ok = PatchProxy.apply(null, tg, k.class, "6");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = tg.r;
          if (ok == null) {
             a.S("magicSearchPanelFragment");
          }
       }
       ok.Bh(h.e.c(p0));
       return;
    }
}
