package h71.l$b;
import erd.g;
import asd.c;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h71.l$a;
import kotlin.Result;
import o63.m;
import o63.m$a;

public final class l$b implements g	// class@00263b
{
    public final c b;

    public void l$b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
       }else {
          WalletResponse walletRespon = -1;
          WalletResponse mKwaiCoin = (p0 != null)? p0.mKwaiCoin: walletRespon;
          WalletResponse mYellowDiamo = (p0 != null)? p0.mYellowDiamond: walletRespon;
          if (p0 != null) {
             walletRespon = p0.mKwaiShell;
          }
          l$a uoa = new l$a(mKwaiCoin, mYellowDiamo, walletRespon);
          this.b.resumeWith(Result.constructor-impl(m$a.g(m.g, v0, false, 2, null)));
       }
       return;
    }
}
