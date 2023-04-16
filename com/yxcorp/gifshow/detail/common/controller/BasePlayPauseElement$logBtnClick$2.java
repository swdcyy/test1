package com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$logBtnClick$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement;
import java.lang.Object;
import q76.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o76.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class BasePlayPauseElement$logBtnClick$2 extends Lambda implements a	// class@0013a7
{
    public final boolean $isPause;
    public final BasePlayPauseElement this$0;

    public void BasePlayPauseElement$logBtnClick$2(BasePlayPauseElement p0,boolean p1){
       this.this$0 = p0;
       this.$isPause = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, BasePlayPauseElement$logBtnClick$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String photoId = this.this$0.r0().getPhotoId();
       int i = (this.$isPause != null)? 0x76f1: 0x76f2;
       b uob = new b(photoId, null, null, -1, i, null);
       return obj;
    }
}
