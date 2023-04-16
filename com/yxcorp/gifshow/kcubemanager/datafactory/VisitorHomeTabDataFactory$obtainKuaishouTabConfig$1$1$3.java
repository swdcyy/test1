package com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3 extends Lambda implements l	// class@0019f3
{
    public static final VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3 INSTANCE;

    static {
       VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3.INSTANCE = new VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3();
    }
    public void VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "fakeTab_msg";
       p0.mType = "ato_fakeTab";
       p0.mTabName = "消息";
       p0.mTabNameEn = "Message";
       p0.mTabNameTc = "消息";
       return;
    }
}
