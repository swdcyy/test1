package com.yxcorp.gifshow.reminder.widget.a$d;
import com.yxcorp.gifshow.widget.m;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.qrcode.model.ScanParam$a;
import androidx.fragment.app.FragmentActivity;
import n3d.a;
import lu5.c;
import sec.b;

public class a$d extends m	// class@001b00
{
    public final a$c c;
    public final Activity d;

    public void a$d(a$c p0,Activity p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       this.c.h0().o();
       ScanParam$a uoa = new ScanParam$a();
       uoa.b("SEARCH_ENTRANCE_MESSAGE");
       c.c(this.d, uoa, null);
       if (!PatchProxy.applyVoid(null, null, b.class, "5")) {
          b.b("scan");
       }
       return;
    }
}
