package fr1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import dr1.f;
import er1.c;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import xp5.i;
import oq1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import fr1.a$b;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import android.content.Context;
import android.view.View;
import fr1.b;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LifecycleOwner;
import ms1.a;
import ms1.b;
import androidx.lifecycle.LiveData;
import xh3.l;
import lnc.a1;
import ekd.p1;
import fr1.a$a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class a extends ViewController	// class@002388
{
    public final ViewModelProvider j;
    public final boolean k;
    public final f l;
    public final c m;
    public final g n;
    public final LiveMultiLineArenaLineMemberModel o;
    public final i p;
    public final b q;

    public void a(boolean p0,f p1,c p2,g p3,LiveMultiLineArenaLineMemberModel p4,i p5,b p6){
       a.p(p1, "arenaLineModel");
       a.p(p2, "widgetDelegate");
       a.p(p3, "infoManager");
       a.p(p4, "arenaMemberModel");
       a.p(p5, "liveLogPackageProvider");
       a.p(p6, "multiLineLogParamsProvider");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.j = new ViewModelProvider(this, new a$b(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       LiveMultiLineIconTextView liveMultiLin = new LiveMultiLineIconTextView(this.D2());
       this.R2(liveMultiLin);
       ViewModel viewModel = this.j.get(b.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­ownViewModel::class.java\)");
       b.a(liveMultiLin, this, viewModel);
       l.d(liveMultiLin, this, viewModel.g, true);
       p1.c(liveMultiLin, a1.d(R.dimen.arg_RES_7f07025d), a1.d(R.dimen.arg_RES_7f07025d), a1.d(R.dimen.arg_RES_7f07025d), a1.d(R.dimen.arg_RES_7f07025d));
       liveMultiLin.setOnClickListener(new a$a(viewModel));
       return;
    }
}
