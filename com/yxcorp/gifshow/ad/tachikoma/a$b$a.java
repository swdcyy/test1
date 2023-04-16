package com.yxcorp.gifshow.ad.tachikoma.a$b$a;
import y49.g;
import com.yxcorp.gifshow.ad.tachikoma.a$b;
import java.lang.String;
import kotlin.jvm.internal.Ref$ObjectRef;
import tx4.h;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.tachikoma.a;
import kotlin.jvm.internal.a;

public final class a$b$a extends g	// class@001802
{
    public final a$b d;
    public final String e;
    public final Ref$ObjectRef f;
    public final h g;

    public void a$b$a(a$b p0,String p1,Ref$ObjectRef p2,h p3,h p4,String p5){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       super(p4, p5);
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(a$b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a$b$a.class, "1")) {
          return;
       }
       this.d.b.j("bridge : "+this.e+"  error :"+p1);
       p2.element = a.C(p1, Integer.valueOf(p0));
       return;
    }
    public void onSuccess(Object p0){
       this.f.element = p0;
    }
}
