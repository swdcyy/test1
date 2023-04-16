package com.kuaishou.utils.SnowAudioMuteManager;
import java.lang.Object;
import com.kuaishou.utils.SnowAudioMuteManager$bizKeyList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.utils.SnowAudioMuteManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import jw4.c;
import java.util.Iterator;
import java.lang.Iterable;

public final class SnowAudioMuteManager	// class@001192
{
    public final String a;
    public final p b;

    public void SnowAudioMuteManager(){
       super();
       this.a = "SnowAudioMuteManager";
       this.b = s.c(SnowAudioMuteManager$bizKeyList$2.INSTANCE);
    }
    public final boolean a(SnowAudioMuteManager$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SnowAudioMuteManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "params");
       boolean b = this.b().addIfAbsent(p0);
       c.c(this.a, "addBizKey", "params", p0, "result", Boolean.valueOf(b));
       return b;
    }
    public final CopyOnWriteArrayList b(){
       Object obj = PatchProxy.apply(null, this, SnowAudioMuteManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final SnowAudioMuteManager$a c(String p0){
       String str;
       String str1;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, SnowAudioMuteManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b().iterator();
       while (true) {
          str = null;
          if (obj.hasNext()) {
             str1 = obj.next();
             if (!(str1.a).equals(p0)) {
                continue ;
             }
          }else {
             str1 = str;
          }
          if (str1 != null) {
             c.b(this.a, "removeBizKey", "params", str1);
             this.b().remove(str1);
             str = str1;
             break ;
          }
          break ;
       }
       return str;
    }
}
