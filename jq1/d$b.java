package jq1.d$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import jq1.d;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import jq1.e;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;

public final class d$b implements ViewModelProvider$Factory	// class@002bf8
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p0");
       return new e(this.a.n);
    }
}
