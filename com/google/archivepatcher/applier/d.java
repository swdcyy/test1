package com.google.archivepatcher.applier.d;
import java.io.FilterOutputStream;
import java.util.List;
import java.io.OutputStream;
import java.util.Iterator;
import java.lang.Object;
import nk.b;
import com.google.archivepatcher.shared.JreDeflateParameters;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.lang.Math;

public class d extends FilterOutputStream	// class@0016fb
{
    public final OutputStream b;
    public Deflater c;
    public DeflaterOutputStream d;
    public final byte[] e;
    public final int f;
    public long g;
    public final Iterator h;
    public b i;
    public JreDeflateParameters j;

    public void d(List p0,OutputStream p1,int p2){
       super(p1);
       this.c = null;
       this.d = null;
       byte[] uobyteArray = new byte[1];
       this.e = uobyteArray;
       this.i = null;
       this.j = null;
       this.b = p1;
       this.f = p2;
       Iterator iterator = p0.iterator();
       this.h = iterator;
       this.i = (iterator.hasNext())? iterator.next(): null;
       return;
    }
    public final long a(){
       d ti = this.i;
       if (ti == null) {
          return -1;
       }
       return ((ti.c() + this.i.a()) - this.g);
    }
    public final long c(){
       d ti = this.i;
       if (ti == null) {
          return -1;
       }
       return (ti.c() - this.g);
    }
    public final boolean e(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public void write(int p0){
       d te = this.e;
       te[0] = (byte)p0;
       this.write(te, 0, 1);
    }
    public void write(byte[] p0){
       this.write(p0, 0, p0.length);
    }
    public void write(byte[] p0,int p1,int p2){
       d td;
       int i = 0;
       while (i < p2) {
          int i1 = p1 + i;
          int i2 = p2 - i;
          if (!this.c() && !this.e()) {
             JreDeflateParameters jreDeflatePa = this.i.b();
             d tc = this.c;
             if (tc == null) {
                this.c = new Deflater(jreDeflatePa.level, jreDeflatePa.nowrap);
             }else if(this.j.nowrap != jreDeflatePa.nowrap){
                tc.end();
                this.c = new Deflater(jreDeflatePa.level, jreDeflatePa.nowrap);
             }
             this.c.setLevel(jreDeflatePa.level);
             this.c.setStrategy(jreDeflatePa.strategy);
             this.d = new DeflaterOutputStream(this.b, this.c, this.f);
          }
          if (this.e()) {
             i2 = (int)Math.min((long)i2, this.a());
             td = this.d;
          }else {
             td = this.b;
             if (this.i != null) {
                i2 = (int)Math.min((long)i2, this.c());
             }
          }
          td.write(p0, i1, i2);
          long l = this.g + (long)i2;
          this.g = l;
          if (this.e() && !this.a()) {
             this.d.finish();
             this.d.flush();
             DeflaterOutputStream uDeflaterOut = null;
             this.d = uDeflaterOut;
             this.c.reset();
             this.j = this.i.b();
             if (this.h.hasNext()) {
                this.i = this.h.next();
             }else {
                this.i = uDeflaterOut;
                this.c.end();
                this.c = uDeflaterOut;
             }
          }
          i = i + i2;
       }
       return;
    }
}
