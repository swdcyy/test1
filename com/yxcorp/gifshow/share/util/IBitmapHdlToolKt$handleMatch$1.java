package com.yxcorp.gifshow.share.util.IBitmapHdlToolKt$handleMatch$1;
import msd.r;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import yic.l;

public final class IBitmapHdlToolKt$handleMatch$1 extends Lambda implements r	// class@001c7f
{
    public final String $shareChannel;
    public final String $shareMethod;
    public final String $shareMode;

    public void IBitmapHdlToolKt$handleMatch$1(String p0,String p1,String p2){
       this.$shareChannel = p0;
       this.$shareMethod = p1;
       this.$shareMode = p2;
       super(4);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       return Boolean.valueOf(this.invoke(p0, p1, p2, p3));
    }
    public final boolean invoke(String p0,String p1,String p2,ShareAnyResponse$ShareObject p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IBitmapHdlToolKt$handleMatch$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "givenChannel");
       a.p(p1, "givenMethod");
       a.p(p2, "givenMode");
       a.p(p3, "<anonymous parameter 3>");
       boolean b = (l.c(this.$shareChannel, p0) && (l.c(this.$shareMethod, p1) && l.c(this.$shareMode, p2)))? true: false;
       return b;
    }
}
