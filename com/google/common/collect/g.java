package com.google.common.collect.g;
import java.lang.Object;
import java.lang.String;
import ok.j$b;
import ok.j;
import java.lang.Enum;
import ok.a;

public final class g	// class@0018b8
{
    public boolean a;
    public int b;
    public int c;
    public MapMakerInternalMap$Strength d;
    public MapMakerInternalMap$Strength e;
    public Equivalence f;

    public void g(){
       super();
       this.b = -1;
       this.c = -1;
    }
    public String toString(){
       j$b uob = j.b(this);
       g tb = this.b;
       String str = -1;
       if (tb != str) {
          uob.a("initialCapacity", tb);
       }
       tb = this.c;
       if (tb != str) {
          uob.a("concurrencyLevel", tb);
       }
       tb = this.d;
       if (tb != null) {
          uob.c("keyStrength", a.c(tb.toString()));
       }
       tb = this.e;
       if (tb != null) {
          uob.c("valueStrength", a.c(tb.toString()));
       }
       if (this.f != null) {
          uob.i("keyEquivalence");
       }
       return uob.toString();
    }
}
