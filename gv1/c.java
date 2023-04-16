package gv1.c;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import xp5.i;
import ks5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import com.kuaishou.live.viewcontroller.ViewController;

public final class c extends ViewControllerAdapter$a	// class@00258c
{
    public final i f;

    public void c(ViewGroup p0,LifecycleOwner p1,Activity p2,i p3,i p4){
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "activity");
       a.p(p3, "liveLogPackageProvider");
       a.p(p4, "topPendantEnterAnimationService");
       super(p0, p1, p2);
       this.f = p3;
       LiveData liveData = this.b();
       Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayFlipperPendantItem>");
       this.E2(p0, new TempPlayPendantFlipperViewController(liveData, p3, p4));
    }
}
