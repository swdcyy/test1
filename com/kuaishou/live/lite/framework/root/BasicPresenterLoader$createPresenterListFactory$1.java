package com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;

public final class BasicPresenterLoader$createPresenterListFactory$1 extends Lambda implements a	// class@00094a
{
    public static final BasicPresenterLoader$createPresenterListFactory$1 INSTANCE;

    static {
       BasicPresenterLoader$createPresenterListFactory$1.INSTANCE = new BasicPresenterLoader$createPresenterListFactory$1();
    }
    public void BasicPresenterLoader$createPresenterListFactory$1(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BasicPresenterLoader$createPresenterListFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteLongConnectionPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
