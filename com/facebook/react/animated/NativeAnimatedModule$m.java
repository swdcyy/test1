package com.facebook.react.animated.NativeAnimatedModule$m;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.String;
import java.lang.Object;
import sd.l;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.List;
import java.util.ListIterator;
import com.facebook.react.animated.EventAnimationDriver;
import sd.b;

public class NativeAnimatedModule$m implements NativeAnimatedModule$v	// class@00118c
{
    public final int a;
    public final String b;
    public final int c;
    public final NativeAnimatedModule d;

    public void NativeAnimatedModule$m(NativeAnimatedModule p0,int p1,String p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$m ta = this.a;
       NativeAnimatedModule$m tb = this.b;
       NativeAnimatedModule$m tc = this.c;
       Objects.requireNonNull(p0);
       String str = ta+tb;
       if (p0.d.containsKey(str)) {
          List list = p0.d.get(str);
          if (list.size() == 1) {
             p0.d.remove(ta+tb);
          }else {
             ListIterator listIterator = list.listIterator();
             while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.d == tc) {
                   listIterator.remove();
                   break ;
                }
             }
          }
       }
       return;
    }
}
