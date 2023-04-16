package com.kuaishou.android.security.internal.plugin.i;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.android.security.internal.plugin.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.internal.crypto.j;
import com.kuaishou.android.security.internal.init.d;
import com.kuaishou.android.security.internal.plugin.bundle.d;
import com.kuaishou.android.security.internal.crypto.g;
import com.kuaishou.android.security.internal.plugin.bundle.b;
import com.kuaishou.android.security.internal.crypto.i;
import com.kuaishou.android.security.internal.plugin.bundle.c;
import com.kuaishou.android.security.internal.crypto.h;
import com.kuaishou.android.security.internal.plugin.bundle.f;
import com.kuaishou.android.security.internal.crypto.a;
import com.kuaishou.android.security.internal.plugin.bundle.a;
import com.kuaishou.android.security.internal.crypto.k;
import com.kuaishou.android.security.internal.plugin.bundle.e;

public class i	// class@0006fa
{

    public void i(){
       super();
    }
    public void a(HashMap p0,m p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       p0.put(d.class, new j(p1));
       p0.put(b.class, new g(p1));
       p0.put(c.class, new i(p1));
       p0.put(f.class, new h(p1));
       p0.put(a.class, new a(p1));
       p0.put(e.class, new k(p1));
       return;
    }
}
