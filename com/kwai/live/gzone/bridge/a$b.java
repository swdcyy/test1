package com.kwai.live.gzone.bridge.a$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.bridge.a;
import android.app.Activity;
import f55.g;
import com.kwai.live.gzone.bridge.function.GzoneJsObtainOpenIdParams;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f37.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class a$b implements View$OnClickListener	// class@000c75
{
    public final Activity b;
    public final g c;
    public final GzoneJsObtainOpenIdParams d;
    public final a e;

    public void a$b(a p0,Activity p1,g p2,GzoneJsObtainOpenIdParams p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.e.Na(this.b, this.c, this.d);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("isShowPersonalInfoAuthorizationPopup", false);
       g.a(uEditor);
       return;
    }
}
