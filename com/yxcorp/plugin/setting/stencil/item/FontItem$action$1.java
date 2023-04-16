package com.yxcorp.plugin.setting.stencil.item.FontItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.FontItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.activity.FontScaleSettingsActivity;
import ihc.a;
import java.util.Objects;
import com.yxcorp.plugin.setting.activity.FontScaleSettingsActivity$a;
import android.content.Intent;
import rkd.b;
import com.yxcorp.plugin.setting.activity.FontScaleSettingsActivityTablet;
import android.content.Context;

public final class FontItem$action$1 extends Lambda implements l	// class@000915
{
    public final FontItem this$0;

    public void FontItem$action$1(FontItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, FontItem$action$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       FontScaleSettingsActivity$a z = FontScaleSettingsActivity.z;
       a b = this.this$0.b;
       Objects.requireNonNull(z);
       if (!PatchProxy.applyVoidOneRefs(b, z, FontScaleSettingsActivity$a.class, str)) {
          a.p(b, "context");
          FontScaleSettingsActivityTablet uFontScaleSe = (b.g())? FontScaleSettingsActivityTablet.class: FontScaleSettingsActivity.class;
          b.startActivity(new Intent(b, uFontScaleSe));
       }
       return;
    }
}
