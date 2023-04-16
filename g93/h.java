package g93.h;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardLineAdapter;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.basic.widget.LiveOverflowHiddenLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g93.h$a;
import androidx.recyclerview.widget.RecyclerView$n;
import g93.h$b;
import androidx.lifecycle.Observer;

public final class h extends ViewController	// class@002ade
{
    public final LiveData j;

    public void h(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       this.j = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0974);
       RecyclerView recyclerView = this.A2(R.id.lite_benefit_card_item_recycler_view);
       LiveLiteBenefitCardLineAdapter liveLiteBene = new LiveLiteBenefitCardLineAdapter(this, this.B2());
       recyclerView.setLayoutManager(new LiveOverflowHiddenLayoutManager(0, 0));
       recyclerView.setAdapter(liveLiteBene);
       recyclerView.addItemDecoration(new h$a(this));
       this.j.observe(this, new h$b(recyclerView, liveLiteBene));
       return;
    }
}
