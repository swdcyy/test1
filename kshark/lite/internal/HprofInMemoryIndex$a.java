package kshark.lite.internal.HprofInMemoryIndex$a;
import rtd.v;
import java.lang.Object;
import kshark.lite.internal.HprofInMemoryIndex;
import kshark.lite.internal.HprofInMemoryIndex$b;
import utd.f;
import utd.d;
import std.p;
import nsd.u;
import java.util.ArrayList;
import kshark.lite.HprofRecordTag;
import rtd.m;
import java.lang.String;
import kotlin.jvm.internal.a;
import std.f;
import java.lang.Enum;
import kshark.lite.PrimitiveType;
import java.util.Objects;
import java.lang.Integer;
import java.util.Map;
import trd.t0;
import std.p$a;
import qrd.l1;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import kshark.lite.PrimitiveType$a;
import java.lang.Number;
import rtd.e$o;
import java.util.Collection;
import rtd.e$g;
import rtd.e$p;
import rtd.e$j;
import rtd.e$a;
import rtd.e$b;
import rtd.e$c;
import rtd.e$m;
import rtd.e$h;
import rtd.e$l;
import rtd.e$k;
import rtd.e$i;
import rtd.e$d;
import rtd.e$f;
import rtd.e$e;
import rtd.e$n;
import utd.a;
import okio.d;

public final class HprofInMemoryIndex$a implements v	// class@001bc6
{
    public final int b;
    public final int c;
    public final int d;
    public final f e;
    public final d f;
    public final byte[] g;
    public int h;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;

    public void HprofInMemoryIndex$a(boolean p0,long p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9,int p10){
       int i = this;
       int i1 = p6;
       int i2 = p7;
       int i3 = p8;
       int i4 = p9;
       int i5 = p10;
       super();
       i.n = i1;
       i.o = i2;
       i.p = i3;
       i.q = i4;
       i.r = i5;
       int i6 = 4;
       int i7 = (p0)? 8: 4;
       i.b = i7;
       HprofInMemoryIndex$b p = HprofInMemoryIndex.p;
       int i8 = p.a(p1);
       i.c = i8;
       int i9 = p.a((long)i5);
       i.d = i9;
       i.e = new f();
       int i10 = p2;
       i.f = new d(i10);
       byte[] uobyteArray = new byte[i5];
       i.g = uobyteArray;
       int i11 = (((i8 + i7) + i6) + i1) + i9;
       boolean b = p0;
       i6 = i8;
       p op = new p(i11, b, i10, 0, 8, null);
       i.i = uobyteArray;
       op = new p(((i6 + i7) + i2), b, p3, 0, 8, null);
       i.j = i1;
       op = new p(((i6 + i7) + i3), b, p4, 0, 8, null);
       i.k = i1;
       op = new p(((i6 + 1) + i4), b, p5, 0, 8, null);
       i.l = i1;
       i.m = new ArrayList();
       return;
    }
    public void a(HprofRecordTag p0,long p1,m p2){
       long l;
       long l1;
       f b1;
       int i;
       f a;
       long l3;
       d b2;
       int i3;
       long l4;
       l1 a3;
       long l5;
       int i7;
       p$a uoa3;
       long l6;
       HprofInMemoryIndex$a uoa = this;
       String obj = p2;
       a.p(p0, "tag");
       a.p(obj, "reader");
       boolean b = true;
       f uof = null;
       switch (f.a[p0.ordinal()]){
           case 1:
             HprofInMemoryIndex$a e = uoa.e;
             l = p2.g();
             l1 = p1 - (long)uoa.b;
             obj.a = obj.a + l1;
             obj = obj.d.readUtf8(l1);
             a.o(obj, "source.readUtf8\(byteCount\)");
             f d = e.d;
             if (!l - uof) {
                e.f = b;
                b1 = e.b;
                i = d + b;
                b1[i] = obj;
             }else {
                a = e.a;
                int i1 = e.c(l) & d;
                long l2 = a[i1];
                while (true) {
                   if (l2 - uof) {
                      if (!l2 - l) {
                         b1 = e.b;
                         b1[i1] = obj;
                         break ;
                      }else {
                         i1 = i1 + 1;
                         i1 = i1 & d;
                         l2 = a[i1];
                      }
                   }else if(e.c == e.e){
                      d = e.a;
                      uof = e.b;
                      e.a(a.a.d((e.d + b), e.b(), e.g));
                      d[i1] = l;
                      uof[i1] = obj;
                      e.d(d, uof);
                   }else {
                      a[i1] = l;
                      e.b[i1] = obj;
                   }
                   e.c = e.c + b;
                   break ;
                }
             }
             break;
           case 2:
             PrimitiveType iNT = PrimitiveType.INT;
             obj.n(iNT.getByteSize());
             l = p2.g();
             obj.n(iNT.getByteSize());
             l3 = p2.g();
             HprofInMemoryIndex$a f = uoa.f;
             d d1 = f.d;
             if (!l - uof) {
                f.f = b;
                b2 = f.b;
                int i2 = d1 + b;
                b2[i2] = l3;
             }else {
                d a1 = f.a;
                i3 = f.c(l) & d1;
                l4 = a1[i3];
                while (true) {
                   if (l4 - uof) {
                      if (!l4 - l) {
                         b2 = f.b;
                         b2[i3] = l3;
                         break ;
                      }else {
                         i3 = i3 + 1;
                         i3 = i3 & d1;
                         l4 = a1[i3];
                      }
                   }else if(f.c == f.e){
                      d a2 = f.a;
                      d b3 = f.b;
                      f.a(a.a.d((f.d + b), f.b(), f.g));
                      a2[i3] = l;
                      b3[i3] = l3;
                      f.d(a2, b3);
                   }else {
                      a1[i3] = l;
                      f.b[i3] = l3;
                   }
                   f.c = f.c + b;
                   break ;
                }
             }
             break;
           case 3:
             e$n on = new e$n(p2.g());
             if (on.a() - uof) {
                uoa.m.add(on);
             }
             a3 = l1.a;
             break;
           case 4:
             e$e uoe = new e$e(p2.g(), p2.g());
             if (uoe.a() - uof) {
                uoa.m.add(uoe);
             }
             a3 = l1.a;
             break;
           case 5:
             e$f uof1 = new e$f(p2.g(), p2.h(), p2.h());
             if (uof1.a() - uof) {
                uoa.m.add(uof1);
             }
             a3 = l1.a;
             break;
           case 6:
             e$d uod = new e$d(p2.g(), p2.h(), p2.h());
             if (uod.a() - uof) {
                uoa.m.add(uod);
             }
             a3 = l1.a;
             break;
           case 7:
             e$i oi = new e$i(p2.g(), p2.h());
             if (oi.a() - uof) {
                uoa.m.add(oi);
             }
             a3 = l1.a;
             break;
           case 8:
             e$k ok = new e$k(p2.g());
             if (ok.a() - uof) {
                uoa.m.add(ok);
             }
             a3 = l1.a;
             break;
           case 9:
             e$l ol = new e$l(p2.g(), p2.h());
             if (ol.a() - uof) {
                uoa.m.add(ol);
             }
             a3 = l1.a;
             break;
           case 10:
             e$h oh = new e$h(p2.g());
             if (oh.a() - uof) {
                uoa.m.add(oh);
             }
             a3 = l1.a;
             break;
           case 11:
             e$m om = new e$m(p2.g(), p2.h(), p2.h());
             if (om.a() - uof) {
                uoa.m.add(om);
             }
             a3 = l1.a;
             break;
           case 12:
             e$c uoc = new e$c(p2.g());
             if (uoc.a() - uof) {
                uoa.m.add(uoc);
             }
             a3 = l1.a;
             break;
           case 13:
             e$b uob = new e$b(p2.g());
             if (uob.a() - uof) {
                uoa.m.add(uob);
             }
             a3 = l1.a;
             break;
           case 14:
             e$a uoa1 = new e$a(p2.g());
             if (uoa1.a() - uof) {
                uoa.m.add(uoa1);
             }
             a3 = l1.a;
             break;
           case 15:
             e$j oj = new e$j(p2.g());
             if (oj.a() - uof) {
                uoa.m.add(oj);
             }
             a3 = l1.a;
             break;
           case 16:
             e$p op = new e$p(p2.g());
             if (op.a() - uof) {
                uoa.m.add(op);
             }
             a3 = l1.a;
             break;
           case 17:
             e$g og = new e$g(p2.g(), p2.h(), p2.h());
             if (og.a() - uof) {
                uoa.m.add(og);
             }
             a3 = l1.a;
             break;
           case 18:
             e$o oo = new e$o(p2.g());
             if (oo.a() - uof) {
                uoa.m.add(oo);
             }
             a3 = l1.a;
             break;
           case 19:
             l5 = p2.a();
             l = p2.g();
             obj.n(PrimitiveType.INT.getByteSize());
             l1 = p2.g();
             obj.n((uoa.b * 5));
             int i4 = p2.h();
             p2.p();
             HprofInMemoryIndex$a h = uoa.h;
             l4 = p2.a();
             uoa.b(obj, 2);
             int i5 = this.c() & 0xffff;
             i = 0;
             while (i < i5) {
                uoa.b(obj, uoa.b);
                uoa.b(obj, b);
                int i6 = i5;
                i5 = uoa.h - b;
                i7 = uoa.g[i5] & 0x00ff;
                if (i7 == 2) {
                   uoa.b(obj, uoa.b);
                }else {
                   uoa.b(obj, t0.K(PrimitiveType.Companion.a(), Integer.valueOf(i7)).intValue());
                }
                i = i + 1;
                i5 = i6;
                HprofInMemoryIndex$a uoa2 = 2;
             }
             uoa.b(obj, 2);
             i = this.c() & 0xffff;
             for (i7 = 0; i7 < i; i7 = i7 + 1) {
                uoa.b(obj, uoa.b);
                uoa.b(obj, b);
             }
             i = (int)(p2.a() - l4);
             uoa3 = uoa.i.a(l);
             uoa3.c(l5, uoa.c);
             uoa3.a(l1);
             uoa3.b(i4);
             uoa3.c((p2.a() - l5), uoa.n);
             uoa3.c((long)h, uoa.d);
             i3 = h + i;
             if (i3 != uoa.h) {
                b = false;
             }
             if (!b) {
                throw new IllegalArgumentException("Expected "+uoa.h+" to have moved by "+i+" and be equal to "+i3.toString());
             }
             break;
           case 20:
             l6 = p2.a();
             obj.n(PrimitiveType.INT.getByteSize());
             obj.n(p2.h());
             long l7 = p2.a() - l6;
             uoa3 = uoa.j.a(p2.g());
             uoa3.c(l6, uoa.c);
             uoa3.a(p2.g());
             uoa3.c(l7, uoa.o);
             a3 = l1.a;
             break;
           case 21:
             l6 = p2.a();
             obj.n(PrimitiveType.INT.getByteSize());
             obj.n((uoa.b * p2.h()));
             l1 = p2.a() - l6;
             uoa3 = uoa.k.a(p2.g());
             uoa3.c(l6, uoa.c);
             uoa3.a(p2.g());
             uoa3.c(l1, uoa.p);
             a3 = l1.a;
             break;
           case 22:
             l5 = p2.a();
             obj.n(PrimitiveType.INT.getByteSize());
             Objects.requireNonNull(PrimitiveType.Companion);
             PrimitiveType primitiveTyp = t0.K(PrimitiveType.primitiveTypeByHprofType, Integer.valueOf(p2.k()));
             obj.n((p2.h() * primitiveTyp.getByteSize()));
             l3 = p2.a() - l5;
             p$a uoa4 = uoa.l.a(p2.g());
             uoa4.c(l5, uoa.c);
             byte b4 = (byte)primitiveTyp.ordinal();
             p$a a4 = uoa4.a;
             p d2 = a4.d;
             a4.d = d2 + 1;
             p a5 = a4.a;
             p op1 = (d2 >= null && a5 >= d2)? 1: null;
             if (op1) {
                p b5 = a4.b;
                a.m(b5);
                b5[(((a4.e - b) * a5) + d2)] = b4;
                uoa4.c(l3, uoa.q);
                a3 = l1.a;
             }else {
                throw new IllegalArgumentException("Index "+d2+" should be between 0 and "+uoa4.a.a.toString());
             }
             break;
           default:
       }
       return;
    }
    public final void b(m p0,int p1){
       int i = 1;
       if (i <= p1) {
          HprofInMemoryIndex$a th = this.h;
          int i1 = th + 1;
          this.h = i1;
          this.g[th] = p0.b();
          while (i != p1) {
             i = i + 1;
          }
       }
       return;
    }
    public final short c(){
       HprofInMemoryIndex$a tg = this.g;
       HprofInMemoryIndex$a th = this.h;
       return (short)((tg[(th - 1)] & 0x00ff) | ((tg[(th - 2)] & 0x00ff) << 8));
    }
}
