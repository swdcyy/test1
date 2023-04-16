package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$5;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.CallableReference;

public final class GrowthCleanerCorePresenter$onBind$5 extends FunctionReferenceImpl implements l	// class@00132d
{

    public void GrowthCleanerCorePresenter$onBind$5(GrowthCleanerCorePresenter p0){
       super(1, p0, GrowthCleanerCorePresenter.class, "backward", "backward\(Landroidx/fragment/app/Fragment;\)Z", 0);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCorePresenter$onBind$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.receiver.R8(p0);
    }
}
