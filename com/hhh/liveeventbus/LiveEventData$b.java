package com.hhh.liveeventbus.LiveEventData$b;
import com.hhh.liveeventbus.LiveEventData;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;

public abstract class LiveEventData$b	// class@00055c
{
    public final Observer b;
    public boolean c;
    public int d;
    public final LiveEventData e;

    public void LiveEventData$b(LiveEventData p0,Observer p1){
       this.e = p0;
       super();
       this.d = -1;
       this.b = p1;
    }
    public void a(boolean p0){
       if (p0 == this.c) {
          return;
       }
       this.c = p0;
       LiveEventData$b te = this.e;
       LiveEventData d = te.d;
       int i = 1;
       int i1 = (d == null)? 1: 0;
       if (!p0) {
          i = -1;
       }
       te.d = d + i;
       if (i1 && p0) {
          Objects.requireNonNull(te);
       }
       LiveEventData$b te1 = this.e;
       if (te1.d == null && this.c == null) {
          Objects.requireNonNull(te1);
       }
       if (this.c != null) {
          this.e.c(this);
       }
       return;
    }
    public void b(){
    }
    public boolean c(LifecycleOwner p0){
       return false;
    }
    public abstract boolean d();
}
