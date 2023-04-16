package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import jp2.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$h;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import jp2.v;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import jp2.c;
import jp2.w;
import hp2.o;

public class KtvManager$b implements a	// class@001415
{
    public c a;
    public final KtvManager$h b;
    public KtvManager$c c;

    public void KtvManager$b(){
       super();
       this.b = new KtvManager$h();
    }
    public KtvMusicOrderInfo A(){
       Object[] objArray = null;
       KtvManager$b obj = PatchProxy.apply(objArray, this, KtvManager$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
    public v a(){
       return this.b;
    }
    public boolean b(){
       KtvManager$b obj = PatchProxy.apply(null, this, KtvManager$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = true;
       if (obj == null || obj.d != b) {
          b = false;
       }
       return b;
    }
    public Integer c(){
       Object[] objArray = null;
       KtvManager$b obj = PatchProxy.apply(objArray, this, KtvManager$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = Integer.valueOf(obj.d());
       }
       return objArray;
    }
    public String d(){
       KtvManager$b obj = PatchProxy.apply(null, this, KtvManager$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("ktvInfo");
       }
       return obj.a();
    }
    public w e(){
       Object[] objArray = null;
       KtvManager$b obj = PatchProxy.apply(objArray, this, KtvManager$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public String g(){
       Object[] objArray = null;
       KtvManager$b obj = PatchProxy.apply(objArray, this, KtvManager$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.e();
       }
       return objArray;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, KtvManager$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.g(), this.m());
    }
    public boolean j(){
       return false;
    }
    public final c k(){
       KtvManager$b obj = PatchProxy.apply(null, this, KtvManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("ktvInfo");
       }
       return obj;
    }
    public final String l(){
       KtvManager$b obj = PatchProxy.apply(null, this, KtvManager$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("ktvInfo");
       }
       return obj.b();
    }
    public final String m(){
       KtvManager$b obj = PatchProxy.apply(null, this, KtvManager$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("ktvInfo");
       }
       return obj.c().a();
    }
    public final KtvManager$h n(){
       return this.b;
    }
    public final String o(){
       KtvManager$b obj = PatchProxy.apply(null, this, KtvManager$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("ktvInfo");
       }
       return obj.d();
    }
    public final void p(KtvManager$c p0){
       this.c = p0;
    }
}
