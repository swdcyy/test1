package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ena.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$a;

public final class GrowthCleanerCorePresenter$onBind$2$1 extends Lambda implements a	// class@00132a
{
    public final GrowthCleanerCorePresenter$onBind$2 this$0;

    public void GrowthCleanerCorePresenter$onBind$2$1(GrowthCleanerCorePresenter$onBind$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthCleanerCorePresenter$onBind$2$1.class, "1")) {
          return;
       }
       GrowthCleanerCorePresenter$onBind$2 b = this.this$0.b;
       Objects.requireNonNull(b);
       String str = "6";
       if (!PatchProxy.applyVoid(objArray, b, GrowthCleanerCorePresenter.class, str)) {
          b.z = true;
          GrowthCleanerCorePresenter f = b.F;
          Activity activity = b.getActivity();
          if (!PatchProxy.applyVoidOneRefs(activity, objArray, h.class, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RESCAN";
             h.a(activity, uElementPack);
          }
          if (f == null) {
             b.w = true;
             b.S8();
          }else {
             f.a().c();
          }
       }
       return;
    }
}
