package com.yxcorp.gifshow.growth.widget.onekeyadd.AddWidgetGuideActivity;
import com.yxcorp.gifshow.growth.widget.onekeyadd.BaseWidgetGuideActivity;
import com.yxcorp.gifshow.growth.widget.onekeyadd.BaseWidgetGuideActivity$b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.res.Resources;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class AddWidgetGuideActivity extends BaseWidgetGuideActivity	// class@0015e0
{
    public final List O;

    public void AddWidgetGuideActivity(){
       BaseWidgetGuideActivity$b uob;
       super();
       BaseWidgetGuideActivity$b[] uobArray = new BaseWidgetGuideActivity$b[]{v8,uob,uob,uob,uob,uob,uob,uob};
       uob = new BaseWidgetGuideActivity$b(0x7f1051de, 0x7f1051dd, 0x7f080d09, "com.yxcorp.gifshow.growth.widget.provider.GrowthLightRankWidgetProvider", 0x7f070273, "w,233:130");
       BaseWidgetGuideActivity$b uob1 = new BaseWidgetGuideActivity$b(0x7f1051dc, 0x7f1051dd, 0x7f080d08, "com.yxcorp.gifshow.growth.widget.provider.GrowthDarkRankWidgetProvider", 0x7f070273, "w,233:130");
       BaseWidgetGuideActivity$b uob2 = new BaseWidgetGuideActivity$b(0x7f1051f8, 0x7f1051f6, 0x7f082331, "com.yxcorp.gifshow.relation.appwidget.IntimateSquareProvider", 0x7f070254, "w,100:100");
       uob2 = new BaseWidgetGuideActivity$b(0x7f1051f2, 0x7f1051f1, 0x7f080d13, "com.yxcorp.gifshow.growth.widget.provider.GrowthLightSearchWidgetProvider", 0x7f07032a, "w,244:60");
       uob2 = new BaseWidgetGuideActivity$b(0x7f1051f0, 0x7f1051f1, 0x7f080d0d, "com.yxcorp.gifshow.growth.widget.provider.GrowthDarkSearchWidgetProvider", 0x7f07032a, "w,244:60");
       uob2 = new BaseWidgetGuideActivity$b(0x7f1051fc, 0x7f1051fb, 0x7f080d77, "com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider", 0x7f070262, "w,243:114");
       uob2 = new BaseWidgetGuideActivity$b(0x7f1051d8, 0x7f1051d7, 0x7f081e56, "com.yxcorp.gifshow.growth.widget.provider.GrowthScreensWidgetProvider", 0x7f070254, "w,100:100");
       uob2 = new BaseWidgetGuideActivity$b(0x7f1051e6, 0x7f1051e5, 0x7f081846, "com.yxcorp.gifshow.growth.widgetmiui.provider.MIUINBAWidget42Provider", 0x7f070262, "w,246:114");
       this.O = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AddWidgetGuideActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public List v3(){
       return this.O;
    }
}
