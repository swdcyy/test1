package com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jra.c;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1;
import android.app.Activity;
import com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper;

public final class AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a implements View$OnClickListener	// class@001606
{
    public final AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a b;
    public final c c;

    public void AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a(AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a.class, "1")) {
          return;
       }
       AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a tc = this.c;
       if (tc != null) {
          tc.o();
       }
       c.b.f(this.b.b.$activity);
       PatchProxy.onMethodExit(AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a.class, "1");
       return;
    }
}
