package com.meizu.cloud.pushsdk.c.g.g;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.g.l;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.h;
import java.lang.IllegalArgumentException;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.d;
import com.meizu.cloud.pushsdk.c.g.i;
import java.io.OutputStream;
import com.meizu.cloud.pushsdk.c.g.n;
import com.meizu.cloud.pushsdk.c.g.g$1;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.g.g$2;

public final class g	// class@0014f2
{
    public static final Logger a;

    static {
       g.a = Logger.getLogger(g.class.getName());
    }
    public void g(){
       super();
    }
    public static c a(l p0){
       if (p0 != null) {
          return new h(p0);
       }
       throw new IllegalArgumentException("sink == null");
    }
    public static d a(m p0){
       if (p0 != null) {
          return new i(p0);
       }
       throw new IllegalArgumentException("source == null");
    }
    public static l a(OutputStream p0){
       return g.a(p0, new n());
    }
    public static l a(OutputStream p0,n p1){
       if (p0 == null) {
          throw new IllegalArgumentException("out == null");
       }
       if (p1 != null) {
          return new g$1(p1, p0);
       }
       throw new IllegalArgumentException("timeout == null");
    }
    public static m a(File p0){
       if (p0 != null) {
          return g.a(new FileInputStream(p0));
       }
       throw new IllegalArgumentException("file == null");
    }
    public static m a(InputStream p0){
       return g.a(p0, new n());
    }
    public static m a(InputStream p0,n p1){
       if (p0 == null) {
          throw new IllegalArgumentException("in == null");
       }
       if (p1 != null) {
          return new g$2(p1, p0);
       }
       throw new IllegalArgumentException("timeout == null");
    }
}
