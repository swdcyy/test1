package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$f;
import android.database.ContentObserver;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import android.os.Handler;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import o27.a;
import java.util.Set;
import w27.a;
import java.lang.Boolean;
import qrd.l1;
import l27.a;

public final class BatteryDataAdapter$f extends ContentObserver	// class@000aa8
{
    public final BatteryDataAdapter a;

    public void BatteryDataAdapter$f(BatteryDataAdapter p0,Handler p1){
       this.a = p0;
       super(p1);
    }
    public void onChange(boolean p0,Uri p1){
       if (p1 != null) {
          String path = p1.getPath();
          if (path != null) {
             a.o(path, "it");
             path = path.substring((StringsKt__StringsKt.w3(path, "/", 0, false, 6, null) + 1));
             a.o(path, "\(this as java.lang.String\).substring\(startIndex\)");
             if (a.a.contains(path)) {
                boolean b = a.d();
                a.a.b("wpl_power_save_mode_content_change", Boolean.valueOf(b));
                this.a.l(b);
                this.a.a();
             }
          }
       }
       return;
    }
}
