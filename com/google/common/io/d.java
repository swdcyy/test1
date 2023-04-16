package com.google.common.io.d;
import com.google.common.io.a;
import java.io.File;
import com.google.common.io.FileWriteMode;
import sk.c;
import java.lang.Object;
import ok.n;
import com.google.common.collect.ImmutableSet;
import java.io.OutputStream;
import java.io.FileOutputStream;
import com.google.common.collect.ImmutableCollection;
import java.lang.String;
import java.lang.StringBuilder;

public final class d extends a	// class@0018eb
{
    public final File a;
    public final ImmutableSet b;

    public void d(File p0,FileWriteMode[] p1,c p2){
       super();
       n.j(p0);
       this.a = p0;
       this.b = ImmutableSet.copyOf(p1);
    }
    public OutputStream a(){
       return new FileOutputStream(this.a, this.b.contains(FileWriteMode.APPEND));
    }
    public String toString(){
       return "Files.asByteSink\("+this.a+", "+this.b+"\)";
    }
}
