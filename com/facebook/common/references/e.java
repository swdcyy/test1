package com.facebook.common.references.e;
import com.facebook.common.references.a;
import com.facebook.common.references.SharedReference;
import com.facebook.common.references.a$c;
import java.lang.Throwable;
import java.lang.Object;
import fb.c;
import ab.e;

public class e extends a	// class@00106c
{

    public void e(SharedReference p0,a$c p1,Throwable p2){
       super(p0, p1, p2);
    }
    public void e(Object p0,c p1,a$c p2,Throwable p3){
       super(p0, p1, p2, p3);
    }
    public a a(){
       e.f(this.k());
       return new e(this.c, this.d, this.e);
    }
    public Object clone(){
       return this.a();
    }
}
