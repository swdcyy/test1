package com.yxcorp.gifshow.v3.constructor.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import com.yxcorp.gifshow.v3.constructor.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.constructor.b;
import com.yxcorp.gifshow.v3.constructor.c;
import com.yxcorp.gifshow.v3.constructor.d;
import com.yxcorp.gifshow.v3.constructor.e;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.v3.constructor.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@000d45
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("CONSTRUCTOR_VIDEO_COMPUTED_SIZE", new a(this, p1));
       p0.i("CONSTRUCTOR_INTENT", new b(this, p1));
       p0.i("LOADER_CONFIG", new c(this, p1));
       p0.i("POST_CONSTRUCT_PUBLISHER", new d(this, p1));
       p0.i("WORKSPACE", new e(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       try{
          p0.h(WorkspaceConstructor$b.class, new f(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
