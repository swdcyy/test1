package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.gesture.LiveLiteGesturePresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$6 extends Lambda implements a	// class@000967
{
    public final Context $context;

    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$6(Context p0){
       this.$context = p0;
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteGesturePresenter(this.$context);
    }
    public Object invoke(){
       return this.invoke();
    }
}
