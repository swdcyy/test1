package com.yxcorp.plugin.setting.stencil.item.DarkModeItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.DarkModeItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity;
import ihc.a;
import java.util.Objects;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity$a;
import android.content.Intent;
import rkd.b;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivityTablet;
import android.content.Context;

public final class DarkModeItem$action$1 extends Lambda implements l	// class@00090c
{
    public final DarkModeItem this$0;

    public void DarkModeItem$action$1(DarkModeItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, DarkModeItem$action$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       DarkModeSettingsActivity$a d = DarkModeSettingsActivity.D;
       a b = this.this$0.b;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(b, d, DarkModeSettingsActivity$a.class, str)) {
          a.p(b, "context");
          DarkModeSettingsActivityTablet uDarkModeSet = (b.g())? DarkModeSettingsActivityTablet.class: DarkModeSettingsActivity.class;
          b.startActivity(new Intent(b, uDarkModeSet));
       }
       return;
    }
}
