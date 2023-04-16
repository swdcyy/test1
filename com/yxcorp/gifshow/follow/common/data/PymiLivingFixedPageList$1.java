package com.yxcorp.gifshow.follow.common.data.PymiLivingFixedPageList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PymiLivingFixedPageList$1 extends Lambda implements l	// class@001022
{
    public static final PymiLivingFixedPageList$1 INSTANCE;

    static {
       PymiLivingFixedPageList$1.INSTANCE = new PymiLivingFixedPageList$1();
    }
    public void PymiLivingFixedPageList$1(){
       super(1);
    }
    public final QPhoto invoke(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymiLivingFixedPageList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       p0.setShowed(false);
       return p0;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
