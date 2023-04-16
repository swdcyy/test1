package com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.RomUtils;
import f55.g;
import kotlin.jvm.internal.a;
import wkd.b;
import ira.m;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.growth.widget.onekeyadd.SearchOrRankWidgetOneKeyAddWidget;
import ira.n;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$oneKeyAddWidget$1;
import msd.a;
import lnc.i3;
import java.lang.Boolean;

public class AddGrowthWidgetTaskHelper	// class@00160b
{
    public static final AddGrowthWidgetTaskHelper$a a;

    static {
       AddGrowthWidgetTaskHelper.a = new AddGrowthWidgetTaskHelper$a(null);
    }
    public void AddGrowthWidgetTaskHelper(){
       super();
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, AddGrowthWidgetTaskHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (RomUtils.q()) {
          return "xiaomi";
       }
       if (RomUtils.w()) {
          return "vivo";
       }
       if (RomUtils.s()) {
          return "oppo";
       }
       if (RomUtils.m()) {
          return "huawei";
       }
       return "";
    }
    public final void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AddGrowthWidgetTaskHelper.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       if (b.a(-2009612988).b() && Build$VERSION.SDK_INT >= 26) {
          SearchOrRankWidgetOneKeyAddWidget searchOrRank = new SearchOrRankWidgetOneKeyAddWidget();
          searchOrRank.d();
          searchOrRank.h(new AddGrowthWidgetTaskHelper$oneKeyAddWidget$1(p0));
       }else {
          i3 oi3 = i3.f();
          oi3.a("addGrowthWidgetSuccess", Boolean.TRUE);
          oi3.d("phoneName", this.a());
          oi3.a("oneKeyAddGrowthWidget", Boolean.FALSE);
          p0.onSuccess(oi3.e());
       }
       return;
    }
}
