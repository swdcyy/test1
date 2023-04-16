package com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$a;
import xs5.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.BitSet;
import xp5.a;
import com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$Scene;
import com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import u31.b;
import java.util.List;
import wj3.b;
import java.lang.Boolean;

public class LiveGzonePresenterFactory$a	// class@000c11
{
    public final BitSet a;
    public a b;
    public BitSet c;
    public List d;

    public void LiveGzonePresenterFactory$a(a p0){
       super();
       this.d = new ArrayList();
       this.b = p0;
       this.c = new BitSet();
       this.a = new BitSet();
       boolean b = p0.e.g();
       boolean b1 = p0.e.c();
       this.c(LiveGzonePresenterFactory$Scene.BASIC);
       if (p0.d != null) {
          if (b) {
             this.c(LiveGzonePresenterFactory$Scene.SHOW_MULTI_TAB);
          }else {
             this.c(LiveGzonePresenterFactory$Scene.GAME_MULTI_TAB);
          }
       }else if(b1){
          this.c(LiveGzonePresenterFactory$Scene.GAME_NORMAL);
       }
       return;
    }
    public LiveGzonePresenterFactory$a a(int p0,LiveGzonePresenterFactory$Scene[] p1){
       LiveGzonePresenterFactory$a uoa = LiveGzonePresenterFactory$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d(p1)) {
          this.d.add(new b(p0));
       }
       return this;
    }
    public LiveGzonePresenterFactory$a b(b p0,LiveGzonePresenterFactory$Scene[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGzonePresenterFactory$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d(p1)) {
          this.d.add(p0);
       }
       return this;
    }
    public final void c(LiveGzonePresenterFactory$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzonePresenterFactory$a.class, "1")) {
          return;
       }
       this.c.or(p0.getBitSet());
       return;
    }
    public boolean d(LiveGzonePresenterFactory$Scene[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzonePresenterFactory$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || !p0.length) {
          return true;
       }
       this.a.clear();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a.or(p0[i].getBitSet());
       }
       return this.c.intersects(this.a);
    }
}
