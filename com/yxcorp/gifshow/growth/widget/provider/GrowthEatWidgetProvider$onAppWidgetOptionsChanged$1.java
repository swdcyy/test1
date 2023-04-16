package com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$a;
import crd.b;
import java.util.Objects;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider$a;

public final class GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1 extends Lambda implements a	// class@0015fd
{
    public final int $maxWidth;
    public final GrowthEatWidgetProvider this$0;

    public void GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1(GrowthEatWidgetProvider p0,int p1){
       this.this$0 = p0;
       this.$maxWidth = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1.class, "1")) {
          return;
       }
       GrowthEatWidgetProvider$a uoa = 340;
       GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1 t$maxWidth = this.$maxWidth;
       if (1 <= t$maxWidth && (uoa >= t$maxWidth && !GrowthWidgetManager.k.a())) {
          GrowthEatWidgetProvider b = this.this$0.b;
          if (b != null) {
             b.dispose();
          }
          Objects.requireNonNull(GrowthEatWidgetProvider.d);
          this.this$0.a().m(GrowthEatWidgetProvider.c, WidgetType.TODAY_EAT_SMALL, false);
       }
    label_003a :
       GrowthEatWidgetProvider.d.a(null);
       return;
    }
}
