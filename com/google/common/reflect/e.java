package com.google.common.reflect.e;
import com.google.common.reflect.c$e;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class e extends c$e	// class@00191f
{
    public final TypeVariable b;
    public final c$e c;

    public void e(c$e p0,AtomicInteger p1,TypeVariable p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public TypeVariable b(Type[] p0){
       LinkedHashSet linkedHashSe = new LinkedHashSet(Arrays.asList(p0));
       linkedHashSe.addAll(Arrays.asList(this.b.getBounds()));
       if (linkedHashSe.size() > 1) {
          linkedHashSe.remove(Object.class);
       }
       p0 = new Type[0];
       return super.b(linkedHashSe.toArray(p0));
    }
}
