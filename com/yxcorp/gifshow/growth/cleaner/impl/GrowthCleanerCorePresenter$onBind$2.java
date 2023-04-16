package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$2;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$2$1;
import msd.a;

public final class GrowthCleanerCorePresenter$onBind$2 implements View$OnClickListener	// class@00132b
{
    public final GrowthCleanerCorePresenter b;

    public void GrowthCleanerCorePresenter$onBind$2(GrowthCleanerCorePresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerCorePresenter$onBind$2.class, "1")) {
          return;
       }
       this.b.W8(new GrowthCleanerCorePresenter$onBind$2$1(this));
       return;
    }
}
