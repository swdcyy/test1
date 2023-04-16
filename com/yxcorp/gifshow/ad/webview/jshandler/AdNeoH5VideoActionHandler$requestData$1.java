package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$requestData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import s49.b;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;

public final class AdNeoH5VideoActionHandler$requestData$1 extends Lambda implements l	// class@0018dc
{
    public static final AdNeoH5VideoActionHandler$requestData$1 INSTANCE;

    static {
       AdNeoH5VideoActionHandler$requestData$1.INSTANCE = new AdNeoH5VideoActionHandler$requestData$1();
    }
    public void AdNeoH5VideoActionHandler$requestData$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdNeoH5VideoActionHandler$requestData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List list = p0.a();
       QPhoto qPhoto = (list != null)? CollectionsKt___CollectionsKt.p2(list): null;
       boolean b = (qPhoto != null)? true: false;
       return b;
    }
}
