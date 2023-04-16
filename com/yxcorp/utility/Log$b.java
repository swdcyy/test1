package com.yxcorp.utility.Log$b;
import com.yxcorp.utility.Log$b$a;
import com.yxcorp.utility.Log$LEVEL;
import java.lang.String;
import java.lang.Throwable;

public interface abstract Log$b	// class@0013f9
{
    public static final Log$b a;

    static {
       Log$b.a = new Log$b$a();
    }
    void a(Log$LEVEL p0,String p1,String p2,Throwable p3);
}
