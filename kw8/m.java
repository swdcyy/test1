package kw8.m;
import g46.a;
import kw8.m$a;
import nsd.u;
import java.lang.Object;
import z36.d;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.j0;
import android.app.Activity;
import tkd.b;
import tkd.d;
import hn5.n;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import lq.i;

public final class m implements a	// class@002c34
{
    public static String a;
    public static final m$a b;

    static {
       m.b = new m$a(null);
       m.a = "PUBLISH_GO_HOME";
    }
    public void m(){
       super();
    }
    public void a(d p0,Context p1,int p2,Intent p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, m.class, "1")) {
          return;
       }
       a.p(p1, "context");
       if (p3 == null) {
          return;
       }
       Intent intent = new Intent();
       intent.putExtra("video_file_upload_id", j0.b(p3, "video_file_upload_id", -1));
       intent.putExtra("conversionTaskList", j0.f(p3, "conversionTaskList"));
       if (j0.a(p3, m.a, true)) {
          Activity uActivity = p1;
          uActivity.finishAffinity();
          d.a(-1883158055).r30(p1, b.c);
          uActivity.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       }else if(i.h()){
          i.m().t(-1, intent);
       }
       p1.setResult(-1, intent);
       p1.finish();
       return;
    }
}
