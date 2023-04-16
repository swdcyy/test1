package com.kuaishou.live.playeradapter.statistics.a;
import java.lang.Object;
import java.util.HashSet;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import tj3.c;
import k2b.s1;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.UUID;

public class a	// class@000d5c
{
    public String a;
    public String b;
    public final HashSet c;
    public boolean d;

    public void a(){
       super();
       HashSet hashSet = new HashSet();
       this.c = hashSet;
       hashSet.add("LIVE_WATCH");
       hashSet.add("LIVE_PUSH_CLOSED");
       hashSet.add("LIVE_MORE_SQUARE");
       b.a(0x4b316083).T0(new c(this));
    }
    public String a(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.a)) {
          p0 = PatchProxy.applyOneRefs(p0, this, uoa, "3");
          if (p0 != patchProxyRe) {
             b = p0.booleanValue();
          }else if(this.d != null || !this.c.contains(this.b)){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
          label_0048 :
             return this.a;
          }
       }
       this.a = UUID.randomUUID().toString();
       this.d = false;
       goto label_0048 ;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.a = p0;
       }
       return;
    }
}
