package awc.a;
import g46.a;
import java.lang.Object;
import z36.d;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import q16.a;
import android.app.Activity;
import tkd.b;
import tkd.d;
import r16.a;
import r16.d;
import xnc.a;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a implements a	// class@0002d8
{

    public void a(){
       super();
    }
    public void a(d p0,Context p1,int p2,Intent p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "1")) {
          return;
       }
       a.p(p1, "context");
       int i = (p0 instanceof a && p1 instanceof Activity)? 1: 0;
       if (!i) {
          return;
       }else {
          Activity uActivity = d.a(0x14d6f666).NX(p1, p0);
          i = p1.getIntent();
          if (a.b(i, uActivity, "fromClipToEdit")) {
             String str = "SOURCE";
             String str1 = j0.f(i, str);
             if (TextUtils.x(str1)) {
                str1 = "import";
             }
             uActivity.putExtra(str, str1);
             uActivity.putExtra("photo_task_id", j0.f(i, "photo_task_id"));
             a.a(i, uActivity, false);
          }
          p1.startActivityForResult(uActivity, p2);
          return;
       }
    }
}
