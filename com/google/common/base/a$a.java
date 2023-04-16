package com.google.common.base.a$a;
import com.google.common.base.a;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.lang.Object;
import java.lang.CharSequence;

public class a$a extends a	// class@001732
{
    public final String b;
    public final a c;

    public void a$a(a p0,a p1,String p2){
       this.c = p0;
       this.b = p2;
       super(p1, null);
    }
    public a h(){
       throw new UnsupportedOperationException("already specified useForNull");
    }
    public CharSequence i(Object p0){
       p0 = (p0 == null)? this.b: this.c.i(p0);
       return p0;
    }
    public a j(String p0){
       throw new UnsupportedOperationException("already specified useForNull");
    }
}
