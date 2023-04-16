package gra.n;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import rsd.e;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import fra.b;
import gra.n$a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fra.d;

public final class n extends KPresenterV2	// class@002bbe
{
    public d q;
    public final e r;
    public static final n[] s;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(n.class, "mLoadingView", "getMLoadingView\(\)Lcom/kwai/library/widget/refresh/KwaiLoadingView;", 0))};
       n.s = onArray;
    }
    public void n(){
       super();
       this.r = this.S8(0x7f0a28fe);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tq = this.q;
       if (tq == null) {
          a.S("mCallContext");
       }
       tq.a().add(new n$a(this));
       return;
    }
    public final KwaiLoadingView W8(){
       Object obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.a(this, n.s[0]);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.q = obj;
       return;
    }
}
