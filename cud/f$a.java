package cud.f$a;
import java.lang.Object;
import nsd.u;
import okio.b;
import java.util.List;
import okio.ByteString;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Number;
import okio.n;
import java.lang.Math;
import java.lang.IllegalStateException;
import cud.f;
import kotlin.jvm.internal.a;
import kotlin.collections.ArraysKt___ArraysKt;
import trd.x;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collection;
import java.util.Arrays;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Comparable;
import java.lang.StringBuilder;
import kotlin.TypeCastException;

public final class f$a	// class@000c87
{

    public void f$a(){
       super();
    }
    public void f$a(u p0){
       super();
    }
    public final void a(long p0,b p1,int p2,List p3,int p4,int p5,List p6){
       ByteString uByteString;
       int i4;
       int i8;
       int i9;
       b uob2;
       int i10;
       f$a uoa = this;
       b uob = p1;
       int i = p2;
       List list = p3;
       int i1 = p4;
       int i2 = p5;
       List list1 = p6;
       int i3 = (i1 < i2)? 1: 0;
       String str = "Failed requirement.";
       if (i3) {
          i3 = i1;
          while (true) {
             if (i3 < i2) {
                uByteString = (list.get(i3).size() >= i)? 1: null;
                if (uByteString) {
                   i3 = i3 + 1;
                }else {
                   throw new IllegalArgumentException(str.toString());
                }
             }else {
                ByteString uByteString1 = p3.get(p4);
                ByteString uByteString2 = list.get((i2 - 1));
                if (i == uByteString1.size()) {
                   i1 = i1 + 1;
                   uByteString = list.get(i1);
                   i4 = i1;
                   i1 = list1.get(i1).intValue();
                   uByteString1 = uByteString;
                }else {
                   i4 = i1;
                   i1 = -1;
                }
                int i5 = 2;
                if (uByteString1.getByte(i) != uByteString2.getByte(i)) {
                   int i6 = i4 + 1;
                   int i7 = 1;
                   while (i6 < i2) {
                      i3 = i6 - 1;
                      if (list.get(i3).getByte(i) != list.get(i6).getByte(i)) {
                         i7 = i7 + 1;
                      }
                      i6 = i6 + 1;
                   }
                   long l = ((p0 + uoa.b(uob)) + (long)i5) + (long)(i7 * 2);
                   uob.C(i7);
                   uob.C(i1);
                   i1 = i4;
                   while (i1 < i2) {
                      i6 = list.get(i1).getByte(i);
                      if (i1 != i4) {
                         i7 = i1 - 1;
                         if (i6 == list.get(i7).getByte(i)) {
                         label_00c7 :
                            i1 = i1 + 1;
                         }
                      }
                      i6 = i6 & 0x00ff;
                      uob.C(i6);
                      goto label_00c7 ;
                   }
                   b uob1 = new b();
                   while (i4 < i2) {
                      i1 = list.get(i4).getByte(i);
                      i6 = i4 + 1;
                      i7 = i6;
                      while (true) {
                         if (i7 < i2) {
                            if (i1 != list.get(i7).getByte(i)) {
                               i8 = i7;
                            label_00f2 :
                               if (i6 == i8) {
                                  i1 = i + 1;
                                  if (i1 == list.get(i4).size()) {
                                     uob.C(list1.get(i4).intValue());
                                     i9 = i8;
                                     uob2 = uob1;
                                  label_0130 :
                                     uob1 = uob2;
                                     i4 = i9;
                                     uob2 = -1;
                                  }
                               }
                               long l1 = l + uoa.b(uob1);
                               i6 = (int)l1 * -1;
                               uob.C(i6);
                               i10 = i + 1;
                               i9 = i8;
                               uob2 = uob1;
                               this.a(l, uob1, i10, p3, i4, i8, p6);
                               goto label_0130 ;
                            }else {
                               i7 = i7 + 1;
                            }
                         }else {
                            i8 = i2;
                            goto label_00f2 ;
                         }
                      }
                   }
                   uob.x1(uob1);
                }else {
                   int i11 = Math.min(uByteString1.size(), uByteString2.size());
                   int i12 = 0;
                   for (i8 = i; i8 < i11 && uByteString1.getByte(i8) == uByteString2.getByte(i8); i8 = i8 + 1) {
                      i12 = i12 + 1;
                   }
                   long l2 = (((p0 + uoa.b(uob)) + (long)i5) + (long)i12) + 1;
                   uob.C((- i12));
                   uob.C(i1);
                   i10 = i + i12;
                   for (; i < i10; i = i + 1) {
                      i1 = uByteString1.getByte(i) & 0x00ff;
                      uob.C(i1);
                   }
                   if ((i4 + 1) == i2) {
                      String str1 = (i10 == list.get(i4).size())? 1: null;
                      if (str1) {
                         uob.C(list1.get(i4).intValue());
                      }else {
                         throw new IllegalStateException("Check failed.".toString());
                      }
                   }else {
                      b uob3 = new b();
                      uob.C(((int)(uoa.b(uob3) + l2) * -1));
                      this.a(l2, uob3, i10, p3, i4, p5, p6);
                      uob.x1(uob3);
                   }
                }
                break ;
             }
          }
          return;
       }else {
          throw new IllegalArgumentException(str.toString());
       }
    }
    public final long b(b p0){
       return (p0.p() / (long)4);
    }
    public final f c(ByteString[] p0){
       ByteString uByteString1;
       Number number;
       int[] ointArray;
       Object obj = p0;
       a.q(obj, "byteStrings");
       int i = 0;
       ByteString[] uByteStringA = (!obj.length)? 1: null;
       if (uByteStringA) {
          uByteStringA = new ByteString[i];
          return new f(uByteStringA, new int[2]{0,-1}, null);
       }else {
          List list = ArraysKt___ArraysKt.Ey(p0);
          x.m0(list);
          ArrayList uArrayList = new ArrayList(obj.length);
          int len = obj.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             uArrayList.add(Integer.valueOf(-1));
          }
          Integer[] integerArray = new Integer[i];
          Object[] objArray = uArrayList.toArray(integerArray);
          if (objArray != null) {
             List list1 = CollectionsKt__CollectionsKt.P(Arrays.copyOf(objArray, objArray.length));
             int len1 = obj.length;
             int i2 = 0;
             int i3 = 0;
             while (i2 < len1) {
                int i4 = i3 + 1;
                list1.set(CollectionsKt__CollectionsKt.x(list, obj[i2], 0, 0, 6, null), Integer.valueOf(i3));
                i2 = i2 + 1;
                i3 = i4;
             }
             objArray = (list.get(i).size() > 0)? 1: 0;
             if (objArray) {
                int i5 = 0;
                while (true) {
                   if (i5 < list.size()) {
                      ByteString uByteString = list.get(i5);
                      i1 = i5 + 1;
                      int i6 = i1;
                      while (true) {
                         if (i6 < list.size()) {
                            uByteString1 = list.get(i6);
                            if (!uByteString1.startsWith(uByteString)) {
                            label_00ee :
                               i5 = i1;
                            }else if(uByteString1.size() != uByteString.size()){
                               number = 1;
                            }else {
                               number = null;
                            }
                            if (number) {
                               if (list1.get(i6).intValue() > list1.get(i5).intValue()) {
                                  list.remove(i6);
                                  list1.remove(i6);
                               }else {
                                  i6 = i6 + 1;
                               }
                            }else {
                            }
                         }else {
                            goto label_00ee ;
                         }
                      }
                      return new f(p0.clone(), ointArray, null);
                   }else {
                      b uob = new b();
                      this.a(0, uob, 0, list, 0, list.size(), list1);
                      ointArray = new int[(int)this.b(uob)];
                      while (!uob.exhausted()) {
                         len = i + 1;
                         ointArray[i] = uob.readInt();
                         i = len;
                      }
                   }
                }
                throw new IllegalArgumentException("duplicate option: "+uByteString1.toString());
             }else {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
          }
       }
    }
}
