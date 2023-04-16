package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.debuginfo.LiteDebugInfoAudiencePresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$1 extends Lambda implements a	// class@000951
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$1 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$1.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$1();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$1(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiteDebugInfoAudiencePresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
