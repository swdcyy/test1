package com.swmansion.reanimated.ReanimatedModule$l;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.String;
import java.lang.Object;
import hn8.b;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Map;

public class ReanimatedModule$l implements ReanimatedModule$m	// class@000c9b
{
    public final int a;
    public final String b;
    public final int c;
    public final ReanimatedModule d;

    public void ReanimatedModule$l(ReanimatedModule p0,int p1,String p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(b p0){
       Objects.requireNonNull(p0);
       p0.b.remove(this.a+this.b);
    }
}
