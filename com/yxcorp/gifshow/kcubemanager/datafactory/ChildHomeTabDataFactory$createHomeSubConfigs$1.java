package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createHomeSubConfigs$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ChildHomeTabDataFactory$createHomeSubConfigs$1 extends Lambda implements l	// class@0019e8
{
    public static final ChildHomeTabDataFactory$createHomeSubConfigs$1 INSTANCE;

    static {
       ChildHomeTabDataFactory$createHomeSubConfigs$1.INSTANCE = new ChildHomeTabDataFactory$createHomeSubConfigs$1();
    }
    public void ChildHomeTabDataFactory$createHomeSubConfigs$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$createHomeSubConfigs$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "follow";
       p0.mType = "ato_follow";
       p0.mTabName = "¹Ø×¢";
       p0.mTabNameEn = "Follow";
       p0.mTabNameTc = "×·Û™";
       return;
    }
}
