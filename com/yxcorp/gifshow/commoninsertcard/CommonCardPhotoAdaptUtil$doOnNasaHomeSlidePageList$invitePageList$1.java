package com.yxcorp.gifshow.commoninsertcard.CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.commoninsertcard.entity.d;

public final class CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1 extends Lambda implements l	// class@001197
{
    public static final CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1 INSTANCE;

    static {
       CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1.INSTANCE = new CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1();
    }
    public void CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (r1.K2(p0.mEntity) || d.b(p0.mEntity))? true: false;
       return b;
    }
}
