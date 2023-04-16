package com.google.common.collect.Lists$a;
import java.util.AbstractList;
import java.util.List;
import java.lang.Object;
import ok.n;
import java.lang.Math;
import java.math.RoundingMode;
import tk.c$a;
import java.lang.AssertionError;
import tk.d;
import java.lang.ArithmeticException;
import java.lang.String;

public class Lists$a extends AbstractList	// class@001821
{
    public final List b;
    public final int c;

    public void Lists$a(List p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object get(int p0){
       n.i(p0, this.size());
       Lists$a tc = this.c;
       p0 = p0 * tc;
       return this.b.subList(p0, Math.min((tc + p0), this.b.size()));
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public int size(){
       int i = this.b.size();
       Lists$a tc = this.c;
       RoundingMode cEILING = RoundingMode.CEILING;
       n.j(cEILING);
       if (tc == null) {
          throw new ArithmeticException("/ by zero");
       }
       int i1 = i / tc;
       int i2 = i - (tc * i1);
       if (i2) {
          int i3 = 1;
          i = ((i ^ tc) >> 31) | i3;
          switch (c$a.a[cEILING.ordinal()]){
              case 1:
                if (i2) {
                   i3 = false;
                }
                d.a(i3);
              case 2:
             label_0061 :
                i3 = 0;
                break;
              case 3:
                if (i < 0) {
                }else {
                   goto label_0061 ;
                }
              case 4:
             label_0062 :
                if (!i3) {
                label_0065 :
                   return i1;
                }
                break;
              case 5:
                if (i > 0) {
                   goto label_0062 ;
                }else {
                   goto label_0061 ;
                }
                break;
              case 6:
              case 8:
              case 7:
                i2 = Math.abs(i2);
                i2 = i2 - (Math.abs(tc) - i2);
                if (!i2) {
                   if (cEILING != RoundingMode.HALF_UP) {
                      int i4 = (cEILING == RoundingMode.HALF_EVEN)? 1: 0;
                      int i5 = (i1 & 0x01)? 1: 0;
                      if (i4 & i5) {
                         goto label_0062 ;
                      }else {
                         goto label_0061 ;
                      }
                   }else {
                      goto label_0062 ;
                   }
                }else if(i2 > 0){
                   goto label_0062 ;
                }else {
                   goto label_0061 ;
                }
                break;
              default:
                throw new AssertionError();
          }
          i1 = i1 + i;
          goto label_0065 ;
       }
    }
}
