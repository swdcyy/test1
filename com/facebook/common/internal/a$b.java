package com.facebook.common.internal.a$b;
import java.io.ByteArrayOutputStream;
import com.facebook.common.internal.a$a;
import java.lang.Object;
import java.lang.System;

public final class a$b extends ByteArrayOutputStream	// class@001059
{

    public void a$b(){
       super();
    }
    public void a$b(a$a p0){
       super();
    }
    public void a(byte[] p0,int p1){
       System.arraycopy(this.buf, 0, p0, p1, this.count);
    }
}
