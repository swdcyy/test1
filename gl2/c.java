package gl2.c;
import ft5.e;
import gl2.f;
import fl2.a;
import ft5.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import gl2.a;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonArray;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Iterator;
import gl2.b;

public final class c extends f implements e	// class@002b3f
{
    public int b;
    public final a c;
    public final b d;
    public final boolean e;
    public String f;
    public final String g;
    public final int h;
    public final int i;

    public void c(a p0,b p1,boolean p2,String p3,String p4,int p5,int p6){
       a.p(p0, "tipService");
       a.p(p1, "sendCommentsService");
       a.p(p3, "liveAnchorId");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
    }
    public void a(String p0){
       this.b = this.b + 1;
    }
    public void c(){
       Iterator iterator;
       JsonElement jsonElement;
       c uoc1;
       SharedPreferences a;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       this.d.An(this);
       if (!TextUtils.isEmpty(this.g)) {
          int i = 0;
          if (this.e != null) {
             if (!PatchProxy.applyVoid(objArray, this, uoc, "3")) {
                b uob = t.timer((long)Math.max(this.h, i), TimeUnit.SECONDS).observeOn(d.a).subscribe(new a(this));
                a.o(uob, "Observable.timer\(max\(noC¡­OMMENT\)\n        }\n      }");
                this.b(uob);
             }
          }else if(PatchProxy.applyVoid(objArray, this, uoc, "4")){
             JsonArray jsonArray = PatchProxy.apply(objArray, this, uoc, "5");
             if (jsonArray != PatchProxyResult.class) {
             }else {
                jsonArray = new JsonArray();
                a = a.a;
                String str = "user";
                String str1 = "systemFeedbackNoCommentTipCheckDayTimeMs";
                if (DateUtils.H(a.getLong(b.d(str)+str1, 0))) {
                   String str2 = a.getString(b.d(str)+"systemFeedbackNoCommentTipShowAnchorIdJsonArray", "");
                   String str3 = "DefaultPreferenceHelper.¡­ipShowAnchorIdJsonArray\(\)";
                   try{
                      a.o(str2, str3);
                      JsonElement jsonElement1 = c.d(str2);
                      a.o(jsonElement1, "JsonParser.parseString\(showAnchorId\)");
                      JsonArray jsonArray1 = jsonElement1.q();
                      a.o(jsonArray1, "JsonParser.parseString\(showAnchorId\).asJsonArray");
                      jsonArray = jsonArray1;
                   }catch(java.lang.Exception e1){
                      b.I(LiveLogTag.LIVE_AUDIENCE_SYSTEM_FEEDBACK, "checkShowNoCommentTip error", e1);
                   }
                }else {
                   SharedPreferences$Editor uEditor = a.edit();
                   uEditor.putLong(b.d(str)+str1, System.currentTimeMillis());
                   g.a(uEditor);
                   a.X1(jsonArray.toString());
                }
             }
          }
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.d();
       this.d.Ea(this);
       this.b = 0;
       return;
    }
}
