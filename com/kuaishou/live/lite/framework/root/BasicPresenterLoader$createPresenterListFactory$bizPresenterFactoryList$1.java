package com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter;

public final class BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1 extends Lambda implements a	// class@00094b
{
    public static final BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1 INSTANCE;

    static {
       BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1.INSTANCE = new BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1();
    }
    public void BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteBizPlayerPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}