package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createHomeSubConfigs$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ChildHomeTabDataFactory$createHomeSubConfigs$2 extends Lambda implements l	// class@0019e9
{
    public static final ChildHomeTabDataFactory$createHomeSubConfigs$2 INSTANCE;

    static {
       ChildHomeTabDataFactory$createHomeSubConfigs$2.INSTANCE = new ChildHomeTabDataFactory$createHomeSubConfigs$2();
    }
    public void ChildHomeTabDataFactory$createHomeSubConfigs$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$createHomeSubConfigs$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "feature";
       p0.mType = "ato_feature";
       p0.mTabName = "¾«Ñ¡";
       p0.mTabNameEn = "Featured";
       p0.mTabNameTc = "¾«ßx";
       return;
    }
}
