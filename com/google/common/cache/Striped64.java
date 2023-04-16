package com.google.common.cache.Striped64;
import java.lang.Number;
import java.lang.ThreadLocal;
import java.util.Random;
import java.lang.Runtime;
import ym.a;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Error;
import java.lang.Throwable;
import java.lang.Object;
import com.google.common.cache.Striped64$a;

public abstract class Striped64 extends Number	// class@001783
{
    public long base;
    public int busy;
    public Striped64$a[] cells;
    public static final int NCPU;
    public static final a b;
    public static final long c;
    public static final long d;
    public static final Random rng;
    public static final ThreadLocal threadHashCode;

    static {
       Striped64.threadHashCode = new ThreadLocal();
       Striped64.rng = new Random();
       int i = Runtime.getRuntime().availableProcessors();
       try{
          Striped64.NCPU = i;
          a unsafe = Striped64.getUnsafe();
          Striped64.b = unsafe;
          Striped64.c = unsafe.d(Striped64.class.getDeclaredField("base"));
          Striped64.d = unsafe.d(Striped64.class.getDeclaredField("busy"));
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void Striped64(){
       super();
    }
    public static a getUnsafe(){
       return new a();
    }
    public final boolean casBase(long p0,long p1){
       return Striped64.b.b(this, Striped64.c, p0, p1);
    }
    public final boolean casBusy(){
       return Striped64.b.a(this, Striped64.d, 0, 1);
    }
    public abstract long fn(long p0,long p1);
    public final void internalReset(long p0){
       Striped64 tcells = this.cells;
       this.base = p0;
       if (tcells != null) {
          int len = tcells.length;
          int i = 0;
          while (i < len) {
             object oobject = tcells[i];
             if (oobject != null) {
                oobject.h = p0;
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void retryUpdate(long p0,int[] p1,boolean p2){
       int[] ointArray;
       int i;
       Striped64 striped64 = this;
       long l = p0;
       if (p1 == null) {
          ointArray = new int[1];
          Striped64.threadHashCode.set(ointArray);
          i = Striped64.rng.nextInt();
          if (!i) {
             i = 1;
          }
          ointArray[0] = i;
       }else {
          i = p1[0];
          ointArray = p1;
       }
       int i1 = i;
       Striped64 striped641 = null;
       i = p2;
       do {
          Striped64 cells = striped64.cells;
          if (cells != null) {
             int len = cells.length;
             if (len > 0) {
                int i2 = len - 1;
                i2 = i2 & i1;
                object oobject = cells[i2];
                if (oobject == null) {
                   if (striped64.busy == null) {
                      Striped64$a uoa = new Striped64$a(l);
                      if (striped64.busy == null && this.casBusy()) {
                         Striped64 cells1 = striped64.cells;
                         if (cells1 != null) {
                            i2 = cells1.length;
                            if (i2 > 0) {
                               i2 = i2 - 1;
                               i2 = i2 & i1;
                               if (cells1[i2] == null) {
                                  cells1[i2] = uoa;
                                  cells = 1;
                               }
                            }
                         }
                         cells = null;
                      }else {
                      label_0061 :
                         striped641 = null;
                      }
                   }else {
                      goto label_0061 ;
                   }
                }else if(!i){
                   i = 1;
                }else {
                   Striped64$a h = oobject.h;
                   if (!oobject.a(h, striped64.fn(h, l))) {
                      if (len >= Striped64.NCPU || striped64.cells != cells) {
                         goto label_0061 ;
                      }else if(striped641 == null){
                         striped641 = 1;
                      }else if(striped64.busy == null && this.casBusy()){
                         if (striped64.cells == cells) {
                            int i4 = len << 1;
                            Striped64$a[] uoaArray = new Striped64$a[i4];
                            for (i2 = 0; i2 < len; i2 = i2 + 1) {
                               uoaArray[i2] = cells[i2];
                            }
                            striped64.cells = uoaArray;
                         }
                         striped64.busy = 0;
                         striped641 = null;
                      }
                   }
                }
                int i3 = i1 << 13;
                i1 = i1 ^ i3;
                i3 = i1 >> 17;
                i1 = i1 ^ i3;
                i3 = i1 << 5;
                i1 = i1 ^ i3;
                ointArray[0] = i1;
             }else if(striped64.busy == null && (striped64.cells == cells && this.casBusy())){
                if (striped64.cells == cells) {
                   Striped64$a[] uoaArray1 = new Striped64$a[2];
                   len = i1 & 0x01;
                   uoaArray1[len] = new Striped64$a(l);
                   striped64.cells = uoaArray1;
                   cells = 1;
                }else {
                   cells = null;
                }
                striped64.busy = 0;
                if (!cells) {
                }
             }else {
                cells = striped64.base;
                if (!striped64.casBase(cells, striped64.fn(cells, l))) {
                }
             }
          }else {
             goto label_00b6 ;
          }
          break ;
          striped64.busy = 0;
       } while (cells);
       return;
    }
}
