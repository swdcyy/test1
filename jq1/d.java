package jq1.d;
import com.kuaishou.live.viewcontroller.ViewController;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import n91.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import jq1.d$b;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import jq1.d$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.b;
import jq1.b;
import jq1.e;
import androidx.lifecycle.ViewModel;
import hr1.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.pk.b;
import android.animation.AnimatorSet;
import java.lang.CharSequence;
import android.widget.TextView;

public final class d extends ViewController	// class@002bf9
{
    public b j;
    public final ViewModelProvider k;
    public final d$a l;
    public final g m;
    public final LiveMultiLineGiftBattleModel n;
    public final f o;

    public void d(g p0,LiveMultiLineGiftBattleModel p1,f p2){
       a.p(p0, "liveInfoManager");
       a.p(p1, "giftBattleModel");
       a.p(p2, "liveServerTimeProvider");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.k = new ViewModelProvider(this, new d$b(this));
       this.l = new d$a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       View view = b.b(this.D2(), R.layout.arg_RES_7f0d0caf);
       a.o(view, "LiteLayoutInflater.infla¡­_animation_layout\n      \)");
       this.R2(view);
       ViewModel viewModel = this.k.get(e.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­ionViewModel::class.java\)");
       b uob = new b(this.l, this.n, this.m, this.o, viewModel);
       this.j = view;
       return;
    }
    public void J2(){
       b d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "2")) {
          return;
       }
       d tj = this.j;
       if (tj != null) {
          b uob = b.class;
          if (!PatchProxy.applyVoid(objArray, tj, uob, "7") && !PatchProxy.applyVoid(objArray, tj, uob, "6")) {
             b.l(tj.a);
             d = tj.d;
             if (d != null && d.isRunning() == true) {
                d = tj.d;
                if (d != null) {
                   d.end();
                }
             }
             tj.b.setText("");
             tj.b.setAlpha(0x3f800000);
          }
       }
       return;
    }
}
