package com.yxcorp.gifshow.postentrance.bubblev2.util.OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import zsd.k;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1 extends Lambda implements l	// class@00103c
{
    public static final OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1 INSTANCE;

    static {
       OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1.INSTANCE = new OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1();
    }
    public void OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1(){
       super(1);
    }
    public final CharSequence invoke(k p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return (p0.getValue()).subSequence(2, ((p0.getValue()).length() - 1));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
