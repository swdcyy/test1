package com.kuaishou.merchant.home2.basic.model.a;
import com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory$a;
import com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory;
import java.lang.String;
import java.lang.reflect.Field;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import com.google.gson.stream.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a extends MerchantHomeTypeAdapterFactory$a	// class@0016eb
{
    public final Field d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final boolean g;
    public final MerchantHomeTypeAdapterFactory h;

    public void a(MerchantHomeTypeAdapterFactory p0,String p1,boolean p2,boolean p3,Field p4,TypeAdapter p5,TypeAdapter p6,boolean p7){
       this.h = p0;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super(p1, p2, p3);
    }
    public void a(a p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       p0 = this.f.read(p0);
       if (p0 != null || this.g == null) {
          if (p0 instanceof List) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                if (iterator.next() == null) {
                   iterator.remove();
                }
             }
          }
          this.d.set(p1, p0);
       }
       return;
    }
    public void b(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.e.write(p0, this.d.get(p1));
       return;
    }
    public boolean c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.b == null) {
          return b;
       }
       if (this.d.get(p0) != p0) {
          b = true;
       }
       return b;
    }
}
