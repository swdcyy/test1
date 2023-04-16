package gl2.e;
import gl2.f;
import fl2.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import gl2.d;
import erd.g;
import crd.b;

public final class e extends f	// class@002b41
{
    public int b;
    public final a c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;

    public void e(a p0,boolean p1,boolean p2,String p3,int p4,int p5,int p6){
       a.p(p0, "tipService");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
    }
    public void c(){
       e tf;
       SharedPreferences a;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.f)) {
          if (this.d != null) {
             tf = this.f;
             a.m(tf);
             if (!PatchProxy.applyVoidOneRefs(tf, this, uoe, "3")) {
                this.c.a(tf, "SYS_ENTER");
             }
          }else {
             tf = this.f;
             a.m(tf);
             if (!PatchProxy.applyVoidOneRefs(tf, this, uoe, "4")) {
                a = a.a;
                String str = "user";
                if (DateUtils.H(a.getLong(b.d(str)+"systemFeedbackEnterRoomTipCheckDayTimeMs", 0))) {
                   this.b = a.getInt(b.d(str)+"systemFeedbackEnterRoomTipShowCount", 0);
                }else {
                   SharedPreferences$Editor uEditor = a.edit();
                   uEditor.putLong(b.d(str)+"systemFeedbackEnterRoomTipCheckDayTimeMs", System.currentTimeMillis());
                   g.a(uEditor);
                   a.W1(0);
                   this.b = 0;
                }
                if (this.b < this.i) {
                   uoe = (this.e != null)? this.h: this.g;
                   b uob = t.timer((long)Math.max(uoe, 0), TimeUnit.SECONDS).observeOn(d.a).subscribe(new d(this, tf));
                   a.o(uob, "Observable.timer\(max\(if ¡­displayCount\)\n          }");
                   this.b(uob);
                }
             }
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       super.d();
       this.b = 0;
       return;
    }
}
