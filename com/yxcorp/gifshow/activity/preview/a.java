package com.yxcorp.gifshow.activity.preview.a;
import im8.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.preview.f$b;
import java.lang.String;
import im8.e;
import eba.a;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.HashSet;

public final class a implements b	// class@00135f
{
    public Set a;
    public Set b;

    public void a(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.e(p1, "STICKER")) {
          p1 = e.c(p1, "STICKER");
          if (p1 != null) {
             p0.c = p1;
          }else {
             throw new IllegalArgumentException("mStickerDraft ²»ÄÜÎª¿Õ");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          HashSet hashSet = new HashSet();
          this.a = hashSet;
          hashSet.add("STICKER");
       }
       return this.a;
    }
    public void c(Object p0){
       p0.c = null;
    }
    public final Set d(){
       if (this.b == null) {
          this.b = new HashSet();
       }
       return this.b;
    }
}
