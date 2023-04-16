package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createTeeRecoSubConfigs$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.component.kcube.model.model.TabBizParams;

public final class ChildHomeTabDataFactory$createTeeRecoSubConfigs$3 extends Lambda implements l	// class@0019eb
{
    public final HotChannel $channel;

    public void ChildHomeTabDataFactory$createTeeRecoSubConfigs$3(HotChannel p0){
       this.$channel = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$createTeeRecoSubConfigs$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = this.$channel.mId;
       p0.mType = "ato_chl";
       TabBizParams tabBizParams = new TabBizParams();
       tabBizParams.mHotChannel = this.$channel;
       p0.mBizParams = tabBizParams;
       return;
    }
}
