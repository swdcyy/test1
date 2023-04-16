package com.facebook.jni.a;
import com.facebook.jni.a$d;
import com.facebook.jni.a$a;
import java.lang.ref.ReferenceQueue;
import com.facebook.jni.a$c;
import java.lang.String;
import java.lang.Thread;

public class a	// class@001166
{
    public static final a$c a;
    public static final a$d b;
    public static final ReferenceQueue c;
    public static final Thread d;

    static {
       a.b = new a$d(null);
       a.c = new ReferenceQueue();
       a.a = new a$c();
       a$a uoa = new a$a("HybridData DestructorThread");
       a.d = uoa;
       uoa.start();
    }
}
