package com.kuaishou.live.rt.scene.a;
import com.kuaishou.live.rt.scene.a$a;
import java.lang.Object;
import java.util.HashSet;
import java.util.BitSet;
import java.util.HashMap;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.RuntimeException;
import ep3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import java.util.Set;
import java.util.ArrayList;
import gp3.a;
import java.lang.Runnable;

public class a	// class@000f7d
{
    public final a$a a;
    public final Set b;
    public boolean c;
    public final BitSet d;
    public final HashMap e;
    public final Handler f;

    public void a(a$a p0){
       super();
       this.b = new HashSet();
       this.c = false;
       this.d = new BitSet();
       this.e = new HashMap();
       this.f = new Handler(Looper.getMainLooper());
       this.a = p0;
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, a.class, "12")) {
          return;
       }
       if (Looper.getMainLooper() == Looper.myLooper()) {
          return;
       }
       throw new RuntimeException("Must use BizManager in main thread!");
    }
    public final boolean b(a p0){
       a uoa = a.class;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, uoa, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "11") && !this.e.containsKey(p0)) {
          BitSet uBitSet = new BitSet();
          obj = p0.f().iterator();
          while (obj.hasNext()) {
             uBitSet.set(obj.next().intValue());
          }
          this.e.put(p0, uBitSet);
       }
       return (this.d.intersects(this.e.get(p0)) ^ 0x01);
    }
    public final void c(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "8")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          a uoa1 = iterator.next();
          if (uoa1.e()) {
             ArrayList uArrayList = PatchProxy.applyOneRefs(uoa1, this, uoa, "9");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = new ArrayList();
                if (!this.b(uoa1)) {
                   BitSet uBitSet = this.e.get(uoa1);
                   if (uBitSet != null) {
                      int i = 0;
                      i = uBitSet.nextSetBit(i);
                      while (i >= 0) {
                         if (this.d.get(i)) {
                            uArrayList.add(Integer.valueOf(i));
                         }
                         if (i != Integer.MAX_VALUE) {
                            i = i + 1;
                         }
                      }
                   }
                }
             }
             if (uArrayList.size() > 0) {
                uoa1.b(uArrayList);
             }
          }
          if (!uoa1.e() && this.b(uoa1)) {
             uoa1.a();
          }
       }
       this.a.a();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.f.post(new a(this));
       return;
    }
}
