package com.kuaishou.live.audience.component.gift.gift.b$b;
import ik1.i0;
import com.kuaishou.live.audience.component.gift.gift.b;
import java.lang.Object;
import f92.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import ug1.a1;
import java.util.Objects;
import java.util.HashSet;
import f92.a;
import lp3.e;
import lp3.c;
import lp3.b;

public class b$b implements i0	// class@000b6d
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void G4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "4")) {
          return;
       }
       b a1 = this.b.a1;
       if (a1 != null && !a1.isEmpty()) {
          Iterator iterator = this.b.a1.iterator();
          while (iterator.hasNext()) {
             iterator.next().G4(p0);
          }
       }
       return;
    }
    public void J8(a1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "7")) {
          b a1 = tb.a1;
          if (a1 != null) {
             a1.remove(p0);
          }
       }
       return;
    }
    public void Nk(a1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "6") && p0 != null) {
          if (tb.a1 == null) {
             tb.a1 = new HashSet();
          }
          tb.a1.add(p0);
       }
       return;
    }
    public void S1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "3")) {
          return;
       }
       b a1 = this.b.a1;
       if (a1 != null && !a1.isEmpty()) {
          Iterator iterator = this.b.a1.iterator();
          while (iterator.hasNext()) {
             iterator.next().S1(p0);
          }
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void o4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "5")) {
          return;
       }
       b a1 = this.b.a1;
       if (a1 != null && !a1.isEmpty()) {
          Iterator iterator = this.b.a1.iterator();
          while (iterator.hasNext()) {
             iterator.next().o4(p0);
          }
       }
       return;
    }
    public void t2(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "6")) {
          return;
       }
       b a1 = this.b.a1;
       if (a1 != null && !a1.isEmpty()) {
          Iterator iterator = this.b.a1.iterator();
          while (iterator.hasNext()) {
             iterator.next().t2(p0);
          }
       }
       return;
    }
}
