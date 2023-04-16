package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.a;
import tl8.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$g;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;

public final class a implements g	// class@0014c2
{
    public final MusicWheelElement$g a;

    public void a(MusicWheelElement$g p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "contentPackage");
          p0.photoPackage = w1.f(MusicWheelElement.p0(this.a.b).mEntity);
       }
       return;
    }
}
