package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$searchHotWordStyle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.d;
import xf6.l;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;

public final class HotWordExperimentUtil$searchHotWordStyle$2 extends Lambda implements a	// class@0018fe
{
    public static final HotWordExperimentUtil$searchHotWordStyle$2 INSTANCE;

    static {
       HotWordExperimentUtil$searchHotWordStyle$2.INSTANCE = new HotWordExperimentUtil$searchHotWordStyle$2();
    }
    public void HotWordExperimentUtil$searchHotWordStyle$2(){
       super(0);
    }
    public final int invoke(){
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, HotWordExperimentUtil$searchHotWordStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = Integer.valueOf(l.e("KEY_FEATURED_SEARCH_STYLE", -1));
       int i = (obj.intValue() >= 0)? 1: 0;
       if (i) {
          objArray = obj;
       }
       int i1 = (objArray != null)? objArray.intValue(): a.t().a("searchEntryKwaiBubbleStyle", 0);
       return i1;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
