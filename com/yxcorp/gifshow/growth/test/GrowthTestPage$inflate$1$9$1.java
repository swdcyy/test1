package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$9$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.android.dispatcher.KwaiPush;

public final class GrowthTestPage$inflate$1$9$1 extends Lambda implements a	// class@00153d
{
    public static final GrowthTestPage$inflate$1$9$1 INSTANCE;

    static {
       GrowthTestPage$inflate$1$9$1.INSTANCE = new GrowthTestPage$inflate$1$9$1();
    }
    public void GrowthTestPage$inflate$1$9$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestPage$inflate$1$9$1.class, "1")) {
          return;
       }
       KwaiPush.refreshToken();
       return;
    }
}
