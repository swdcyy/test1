package com.kwai.plugin.dva.util.c$a;
import com.kwai.plugin.dva.util.c$a$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class c$a	// class@001391
{
    public final String digest;
    public final String digestByFasterAlgorithm;
    public final long fileSize;
    public final long lastModify;
    public final byte[] specifiedByteArray;
    public final long[] specifiedBytePositionArray;
    public static final c$a$a a;

    static {
       c$a.a = new c$a$a(null);
    }
    public void c$a(String p0,long p1,long p2,long[] p3,byte[] p4,String p5){
       a.p(p0, "digest");
       a.p(p3, "specifiedBytePositionArray");
       a.p(p4, "specifiedByteArray");
       a.p(p5, "digestByFasterAlgorithm");
       super();
       this.digest = p0;
       this.lastModify = p1;
       this.fileSize = p2;
       this.specifiedBytePositionArray = p3;
       this.specifiedByteArray = p4;
       this.digestByFasterAlgorithm = p5;
    }
    public final String a(){
       return this.digest;
    }
    public final String b(){
       return this.digestByFasterAlgorithm;
    }
    public final long c(){
       return this.fileSize;
    }
    public final long d(){
       return this.lastModify;
    }
    public final byte[] e(){
       return this.specifiedByteArray;
    }
    public final long[] f(){
       return this.specifiedBytePositionArray;
    }
}
