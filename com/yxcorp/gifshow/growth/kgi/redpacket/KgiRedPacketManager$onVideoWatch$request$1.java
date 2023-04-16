package com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketManager$onVideoWatch$request$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketConfigItem;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import loa.b;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import java.lang.StringBuilder;
import y76.b;
import java.util.Date;
import yb6.d;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class KgiRedPacketManager$onVideoWatch$request$1 extends Lambda implements l	// class@0013df
{
    public static final KgiRedPacketManager$onVideoWatch$request$1 INSTANCE;

    static {
       KgiRedPacketManager$onVideoWatch$request$1.INSTANCE = new KgiRedPacketManager$onVideoWatch$request$1();
    }
    public void KgiRedPacketManager$onVideoWatch$request$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(KgiRedPacketConfigItem p0){
       int b1;
       int i4;
       Integer obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, KgiRedPacketManager$onVideoWatch$request$1.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = true;
       if (obj != null) {
          b i = b.i;
          Objects.requireNonNull(i);
          b uob = b.class;
          KgiRedPacketConfigItem obj2 = PatchProxy.applyOneRefs(obj, i, uob, "10");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             KgiRedPacketConfigItem start = obj.start;
             if (start != null) {
                KgiRedPacketConfigItem end = obj.end;
                if (end != null) {
                   obj = Integer.valueOf(obj.videoIndex);
                   obj2 = (obj.intValue() > 0)? 1: null;
                   if (!obj2) {
                      obj = null;
                   }
                   if (obj != null) {
                      b1 = obj.intValue();
                      if (PatchProxy.isSupport(uob)) {
                         SimpleDateFormat obj3 = PatchProxy.applyThreeRefs(start, end, Integer.valueOf(b1), i, b.class, "11");
                         if (obj3 != patchProxyRe) {
                            b1 = obj3.booleanValue();
                         }else {
                         label_0073 :
                            b.e("KgiRPS#isHit : start = "+start+", end = "+end+", videoIndex = "+b1, false, 2, null);
                            long l = 5;
                            if (start.length() == l && end.length() == l) {
                               Date uDate = new Date(d.a());
                               obj3 = new SimpleDateFormat("HH:mm");
                               Date uDate1 = obj3.parse(start);
                               if (uDate1 != null) {
                                  uDate1.setYear(uDate.getYear());
                                  uDate1.setMonth(uDate.getMonth());
                                  uDate1.setDate(uDate.getDate());
                                  Date uDate2 = obj3.parse(end);
                                  if (uDate2 != null) {
                                     uDate2.setYear(uDate.getYear());
                                     uDate2.setMonth(uDate.getMonth());
                                     uDate2.setDate(uDate.getDate());
                                     long time = uDate1.getTime();
                                     long time1 = uDate2.getTime();
                                     if (time - time1 < 0) {
                                        Iterator iterator = b.f.iterator();
                                        int i1 = 0;
                                        while (true) {
                                           int i2 = -1;
                                           if (iterator.hasNext()) {
                                              boolean b2 = (iterator.next().longValue() - time >= 0)? true: false;
                                              if (b2) {
                                              label_011f :
                                                 Integer integer = Integer.valueOf(i1);
                                                 ArrayList uArrayList = (integer.intValue() >= 0)? 1: null;
                                                 if (!uArrayList) {
                                                    integer = null;
                                                 }
                                                 if (integer != null) {
                                                    int i3 = integer.intValue();
                                                    uArrayList = b.f;
                                                    ListIterator listIterator = uArrayList.listIterator(uArrayList.size());
                                                    while (listIterator.hasPrevious()) {
                                                       i4 = (listIterator.previous().longValue() - time1 <= 0)? 1: 0;
                                                       if (i4) {
                                                          i2 = listIterator.nextIndex();
                                                       }else {
                                                          continue ;
                                                       }
                                                    }
                                                    Integer integer1 = Integer.valueOf(i2);
                                                    i4 = (integer1.intValue() >= 0)? 1: 0;
                                                    if (!i4) {
                                                       integer1 = null;
                                                    }
                                                    if (integer1 != null) {
                                                       i1 = integer1.intValue();
                                                       i4 = (i1 - i3) + b;
                                                       b.e("KgiRPS#isHit : watchCount = "+i1+" - "+i3+" + 1 = "+i4, false, 2, null);
                                                       if (i4 == b1 && i1 == CollectionsKt__CollectionsKt.G(b.f)) {
                                                          b1 = true;
                                                       }
                                                    }
                                                 }
                                              }else {
                                                 i1 = i1 + 1;
                                              }
                                           }else {
                                              i1 = -1;
                                              goto label_011f ;
                                           }
                                        }
                                        return b;
                                     }
                                  }
                               }
                            }
                         label_00f6 :
                            b1 = false;
                         }
                      }else {
                         goto label_0073 ;
                      }
                      b.e("KgiRPS#isHit : isHit = "+b1, false, 2, null);
                   }
                }
             }
             b1 = false;
          }
          if (b1 == b) {
             goto label_01c0 ;
          }
       }
       b = false;
       goto label_01c0 ;
    }
}
