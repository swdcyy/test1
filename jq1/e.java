package jq1.e;
import yh3.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import jq1.e$a;
import oh3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public final class e extends a	// class@002bfb
{
    public final MutableLiveData a;
    public final e$a b;
    public final LiveMultiLineGiftBattleModel c;

    public void e(LiveMultiLineGiftBattleModel p0){
       a.p(p0, "giftBattleModel");
       super();
       this.c = p0;
       Integer integer = p0.W();
       int i = (integer != null)? integer.intValue(): 0;
       this.a = new MutableLiveData(Integer.valueOf(i));
       e$a uoa = new e$a(this);
       this.b = uoa;
       p0.O(uoa);
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.onCleared();
       this.c.R(this.b);
       return;
    }
}
