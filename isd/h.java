package isd.h;
import wsd.m;
import java.io.File;
import kotlin.io.FileWalkDirection;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import msd.p;
import nsd.u;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Iterator;
import isd.h$b;

public final class h implements m	// class@00150d
{
    public final File a;
    public final FileWalkDirection b;
    public final l c;
    public final l d;
    public final p e;
    public final int f;

    public void h(File p0,FileWalkDirection p1){
       a.p(p0, "start");
       a.p(p1, "direction");
       super(p0, p1, null, null, null, 0, 32, null);
    }
    public void h(File p0,FileWalkDirection p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = FileWalkDirection.TOP_DOWN;
       }
       super(p0, p1);
       return;
    }
    public void h(File p0,FileWalkDirection p1,l p2,l p3,p p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void h(File p0,FileWalkDirection p1,l p2,l p3,p p4,int p5,int p6,u p7){
       if (p6 & 0x02) {
          p1 = FileWalkDirection.TOP_DOWN;
       }
       FileWalkDirection uFileWalkDir = p1;
       int i = (p6 & 0x20)? Integer.MAX_VALUE: p5;
       super(p0, uFileWalkDir, p2, p3, p4, i);
       return;
    }
    public final h c(int p0){
       if (p0 <= 0) {
          throw new IllegalArgumentException("depth must be positive, but was "+p0+'.');
       }
       h oh = new h(this.a, this.b, this.c, this.d, this.e, p0);
       return v7;
    }
    public final h d(l p0){
       a.p(p0, "function");
       h oh = new h(this.a, this.b, p0, this.d, this.e, this.f);
       return v0;
    }
    public final h e(p p0){
       a.p(p0, "function");
       h oh = new h(this.a, this.b, this.c, this.d, p0, this.f);
       return v0;
    }
    public final h f(l p0){
       a.p(p0, "function");
       h oh = new h(this.a, this.b, this.c, p0, this.e, this.f);
       return v0;
    }
    public Iterator iterator(){
       return new h$b(this);
    }
}
