package com.facebook.common.references.a$b;
import com.facebook.common.references.a$c;
import java.lang.Object;
import com.facebook.common.references.SharedReference;
import java.lang.Throwable;
import com.facebook.common.references.a;
import java.lang.System;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import cb.a;

public final class a$b implements a$c	// class@00044b
{

    public void a$b(){
       super();
    }
    public boolean a(){
       return false;
    }
    public void b(SharedReference p0,Throwable p1){
       p1 = p0.c();
       Class f = a.f;
       Object[] objArray = new Object[3];
       objArray[0] = Integer.valueOf(System.identityHashCode(this));
       objArray[1] = Integer.valueOf(System.identityHashCode(p0));
       object oobject = (p1 == null)? null: p1.getClass().getName();
       objArray[2] = oobject;
       a.v(f, "Finalized without closing: %x %x \(type = %s\)", objArray);
       return;
    }
}
