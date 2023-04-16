package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectTimeAdjustAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import fqc.b;
import java.lang.Enum;
import gqc.b;
import java.util.Objects;
import java.lang.Double;
import java.lang.Integer;
import raa.c;
import haa.a;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import gqc.e;
import w46.b;
import com.kuaishou.edit.draft.TimeRange;
import usd.q;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import gqc.d;
import raa.a;
import raa.i;
import com.kuaishou.edit.draft.AEEffect;
import com.kuaishou.edit.draft.VisualEffect;
import com.kuaishou.edit.draft.AEEffect$b;
import com.kuaishou.edit.draft.VisualEffect$b;
import gqc.a;
import eqc.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gqc.c;
import raa.g;
import com.kuaishou.edit.draft.TimeEffect;
import com.kuaishou.edit.draft.TimeEffect$b;

public final class EffectTimeAdjustAction extends EditSdkAction	// class@000f3e
{
    public final double end;
    public final EffectGroupType groupType;
    public final int rangeIndex;
    public final double start;

    public void EffectTimeAdjustAction(EffectGroupType p0,double p1,double p2,int p3){
       a.p(p0, "groupType");
       super();
       this.groupType = p0;
       this.start = p1;
       this.end = p2;
       this.rangeIndex = p3;
    }
    public void EffectTimeAdjustAction(EffectGroupType p0,double p1,double p2,int p3,int p4,u p5){
       int i = (p4 & 0x08)? 0: p3;
       super(p0, p1, p2, i);
       return;
    }
    public final double getEnd(){
       return this.end;
    }
    public final EffectGroupType getGroupType(){
       return this.groupType;
    }
    public final int getRangeIndex(){
       return this.rangeIndex;
    }
    public final double getStart(){
       return this.start;
    }
    public void performAction(c p0,c p1){
       String str11;
       b a;
       String str14;
       String str15;
       EffectTimeAdjustAction start;
       String str17;
       EffectTimeAdjustAction end;
       EffectTimeAdjustAction uEffectTimeA;
       String str18;
       String str19;
       String str20;
       int i1;
       String str21;
       int i3;
       double start1;
       double start2;
       List obj5;
       Iterator iterator1;
       EffectTimeAdjustAction uEffectTimeA1;
       double d;
       FaceMagicEffect uFaceMagicEf;
       Iterator iterator2;
       double d2;
       double start3;
       TimeRange$b uob;
       GeneratedMessageLite$Builder uBuilder;
       EffectTimeAdjustAction uEffectTimeA2;
       EffectTimeAdjustAction end1;
       int i4;
       TimeRange timeRange;
       double start4;
       double d3;
       String obj6;
       TimeRange$b obj7;
       EffectTimeAdjustAction uEffectTimeA4;
       double start5;
       int i8;
       g obj8;
       TimeRange range;
       double d4;
       double d5;
       EffectTimeAdjustAction obj9;
       a uoa2;
       String str23;
       String str24;
       String str25;
       c obj10;
       TimeRange obj11;
       double d6;
       FaceMagicEffect$Type type;
       GeneratedMessageLite$Builder uBuilder1;
       EffectTimeAdjustAction rangeIndex;
       double d9;
       EffectTimeAdjustAction obj = this;
       EffectTimeAdjustAction obj1 = p0;
       EffectTimeAdjustAction obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, EffectTimeAdjustAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(obj1, str);
       a.p(obj2, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("EffectTimeAdjustAction", "performAction groupType:"+obj.groupType+", start:"+obj.start+", end:"+obj.end+", rangeIndex:"+obj.rangeIndex, objArray);
       int i = b.a[obj.groupType.ordinal()];
       String str1 = "timeRangeBuilder.setStart\(finalStart\)";
       if (i != 1) {
          String str2 = "EffectScreenEffectAdjustHandler";
          String str3 = ", finalEnd = ";
          String str4 = "finalStart = ";
          String str5 = ", ";
          String str6 = "face.range";
          String str7 = ", magicEmojiList.size = ";
          String str8 = "faceMagicDraft.messages[finalFaceMagicIndex].range";
          String str9 = "faceMagicDraft.messages[finalFaceMagicIndex]";
          String str10 = "rangeIndex = ";
          str11 = str1;
          str1 = "face";
          String str12 = "faceMagicDraft.getBuilder\(finalFaceMagicIndex\)";
          String str13 = "faceMagicDraft.messages";
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   a = b.a;
                   str14 = str6;
                   str15 = str7;
                   start = obj.start;
                   String str16 = str9;
                   str17 = str1;
                   end = obj.end;
                   obj2 = obj.rangeIndex;
                   Objects.requireNonNull(a);
                   if (PatchProxy.isSupport(b.class)) {
                      obj = obj2;
                      uEffectTimeA = end;
                      str9 = str10;
                      str18 = str4;
                      str19 = str3;
                      str20 = str5;
                      str1 = str2;
                      if (!PatchProxy.applyVoidFourRefs(p0, Double.valueOf(start), Double.valueOf(end), Integer.valueOf(obj2), a, b.class, "1")) {
                      }
                   }else {
                      obj = obj2;
                      str20 = str5;
                      str18 = str4;
                      str19 = str3;
                      uEffectTimeA = end;
                      str9 = str10;
                      str1 = str2;
                   }
                }
             }else {
                str8 = str11;
                d a1 = d.a;
                uEffectTimeA2 = this;
                end = uEffectTimeA2.start;
                end1 = uEffectTimeA2.end;
                obj = uEffectTimeA2.rangeIndex;
                Objects.requireNonNull(a1);
                if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(p0, Double.valueOf(end), Double.valueOf(end1), Integer.valueOf(obj), a1, d.class, "1")) {
                   a.p(obj1, str);
                   a uoa = a.b(p0);
                   i oi = a.v(p0);
                   i4 = uoa.z().size();
                   if (obj < i4) {
                      AEEffect uAEEffect = uoa.z().get(obj);
                      if (uAEEffect != null) {
                         timeRange = uAEEffect.getTimeRange();
                         if (timeRange == null) {
                         }
                      }else {
                      }
                   }else {
                      VisualEffect visualEffect = oi.z().get((obj - i4));
                      if (visualEffect != null) {
                         timeRange = visualEffect.getRange();
                         if (timeRange == null) {
                         }
                      }else {
                      }
                   }
                   start4 = timeRange.getStart();
                   start3 = timeRange.getStart() + timeRange.getDuration();
                   List list1 = uoa.z();
                   str = "aeEffectDraft.messages";
                   a.o(list1, str);
                   Iterator iterator3 = list1.iterator();
                   EffectTimeAdjustAction uEffectTimeA3 = obj;
                   a uoa1 = uoa;
                   str11 = str8;
                   d = 0;
                   d3 = Double.MAX_VALUE;
                   int i5 = 0;
                   int i6 = i4;
                   str5 = "effect";
                   while (iterator3.hasNext()) {
                      obj6 = iterator3.next();
                      int i7 = i5 + 1;
                      if (i5 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      Iterator iterator4 = iterator3;
                      obj7 = obj6;
                      a.o(obj7, str5);
                      TimeRange obj4 = obj7.getTimeRange();
                      str15 = str;
                      str = "effect.timeRange";
                      a.o(obj4, str);
                      if (obj4.getStart() - start3 >= 0) {
                         obj4 = obj7.getTimeRange();
                         a.o(obj4, str);
                         uEffectTimeA4 = end1;
                         d3 = q.s(d3, obj4.getStart());
                      }else {
                         uEffectTimeA4 = end1;
                      }
                      obj4 = obj7.getTimeRange();
                      a.o(obj4, str);
                      start5 = obj4.getStart();
                      obj4 = obj7.getTimeRange();
                      a.o(obj4, str);
                      start5 = start5 + obj4.getDuration();
                      if (start5 - start4 <= 0) {
                         obj4 = obj7.getTimeRange();
                         a.o(obj4, str);
                         start5 = obj4.getStart();
                         obj4 = obj7.getTimeRange();
                         a.o(obj4, str);
                         start5 = start5 + obj4.getDuration();
                         d = q.l(d, start5);
                      }
                      i4 = i6;
                      i5 = i7;
                      iterator3 = iterator4;
                      str = str15;
                      end1 = uEffectTimeA4;
                   }
                   str15 = str;
                   uEffectTimeA4 = end1;
                   list1 = oi.z();
                   a.o(list1, "visualEffectDraft.messages");
                   iterator3 = list1.iterator();
                   start5 = d;
                   i8 = 0;
                   while (iterator3.hasNext()) {
                      obj8 = iterator3.next();
                      i5 = i8 + 1;
                      if (i8 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      a.o(obj8, str5);
                      range = obj8.getRange();
                      obj6 = str5;
                      str5 = "effect.range";
                      a.o(range, str5);
                      if (range.getStart() - start3 >= 0) {
                         range = obj8.getRange();
                         a.o(range, str5);
                         d4 = start3;
                         d3 = q.s(d3, range.getStart());
                      }else {
                         d4 = start3;
                      }
                      range = obj8.getRange();
                      a.o(range, str5);
                      start3 = range.getStart();
                      range = obj8.getRange();
                      a.o(range, str5);
                      start3 = start3 + range.getDuration();
                      if (start3 - start4 <= 0) {
                         range = obj8.getRange();
                         a.o(range, str5);
                         start3 = range.getStart();
                         range = obj8.getRange();
                         a.o(range, str5);
                         start3 = start3 + range.getDuration();
                         start5 = q.l(start5, start3);
                      }
                      i8 = i5;
                      str5 = obj6;
                      start3 = d4;
                   }
                   if (end - start5 < 0) {
                      d5 = start5;
                   }
                   start5 = (uEffectTimeA4 - d3 > 0)? d3: uEffectTimeA4;
                   List list2 = uoa1.z();
                   a.o(list2, str15);
                   Iterator iterator5 = list2.iterator();
                   i = 0;
                   while (iterator5.hasNext()) {
                      obj9 = iterator5.next();
                      i1 = i + 1;
                      if (i < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      obj9 = uEffectTimeA3;
                      if (i == obj9) {
                         uoa2 = uoa1;
                         uBuilder = uoa2.n(i);
                         a.o(uBuilder, "aeEffectDraft.getBuilder\(i\)");
                         TimeRange$b uob1 = TimeRange.newBuilder();
                         uob1.b(d5);
                         str21 = str11;
                         a.o(uob1, str21);
                         d3 = start5 - d5;
                         uob1.a(d3);
                         uBuilder.e(uob1);
                      }else {
                         str21 = str11;
                         uoa2 = uoa1;
                      }
                      uEffectTimeA3 = obj9;
                      i = i1;
                      uoa1 = uoa2;
                      str11 = str21;
                   }
                   obj9 = uEffectTimeA3;
                   str21 = str11;
                   list2 = oi.z();
                   a.o(list2, "visualEffectDraft.messages");
                   iterator5 = list2.iterator();
                   i = 0;
                   while (iterator5.hasNext()) {
                      obj7 = iterator5.next();
                      int i9 = i + 1;
                      if (i < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      i1 = i + i6;
                      if (i1 == obj9) {
                         uBuilder = oi.n(i);
                         a.o(uBuilder, "visualEffectDraft.getBuilder\(i\)");
                         obj7 = TimeRange.newBuilder();
                         obj7.b(d5);
                         a.o(obj7, str21);
                         start2 = start5 - d5;
                         obj7.a(start2);
                         uBuilder.c(obj7);
                      }
                      i = i9;
                   }
                label_08c1 :
                   return;
                }
             }
          }else {
             str17 = str1;
             String str22 = str7;
             str21 = str12;
             str2 = str9;
             str3 = str5;
             str5 = str11;
             a a2 = a.a;
             EffectTimeAdjustAction uEffectTimeA5 = this;
             str19 = str3;
             str11 = str6;
             start = uEffectTimeA5.start;
             str12 = str10;
             str15 = str2;
             end = uEffectTimeA5.end;
             obj2 = uEffectTimeA5.rangeIndex;
             Objects.requireNonNull(a2);
             if (PatchProxy.isSupport(a.class)) {
                uEffectTimeA = end;
                end = obj2;
                str23 = str4;
                str24 = str3;
                str14 = str5;
                str1 = str2;
                str25 = str21;
                str6 = str17;
                uEffectTimeA4 = start;
                if (!PatchProxy.applyVoidFourRefs(p0, Double.valueOf(start), Double.valueOf(end), Integer.valueOf(obj2), a2, a.class, "1")) {
                label_0582 :
                   a.p(obj1, str);
                   c uoc = a.k(p0);
                   ArrayList uArrayList = new ArrayList();
                   List list = uoc.z();
                   a.o(list, str13);
                   Iterator iterator = list.iterator();
                   i1 = 0;
                   while (iterator.hasNext()) {
                      obj10 = iterator.next();
                      int i2 = i1 + 1;
                      if (i1 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      a.o(obj10, str6);
                      if (obj10.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
                         uArrayList.add(new e(i1, obj10));
                      }
                      i1 = i2;
                   }
                   if (end >= uArrayList.size()) {
                      Object[] objArray1 = new Object[0];
                      a.D().t("EffectEmojiEffectAdjustHandler", str12+end+str22+uArrayList.size(), objArray1);
                   }else {
                      str4 = str12;
                      i8 = uArrayList.get(end).a();
                      obj11 = uoc.z().get(i8);
                      a.o(obj11, str1);
                      obj11 = obj11.getRange();
                      a.o(obj11, str8);
                      double start6 = obj11.getStart();
                      obj10 = uoc.z().get(i8);
                      a.o(obj10, str1);
                      TimeRange obj3 = obj10.getRange();
                      a.o(obj3, str8);
                      TimeRange obj12 = uoc.z().get(i8);
                      a.o(obj12, str1);
                      obj12 = obj12.getRange();
                      a.o(obj12, str8);
                      start4 = obj3.getStart() + obj12.getDuration();
                      List list3 = uoc.z();
                      a.o(list3, str13);
                      Iterator iterator6 = list3.iterator();
                      start2 = Double.MAX_VALUE;
                      double d1 = 0;
                      while (iterator6.hasNext()) {
                         FaceMagicEffect uFaceMagicEf1 = iterator6.next();
                         a.o(uFaceMagicEf1, str6);
                         Iterator iterator7 = iterator6;
                         if (uFaceMagicEf1.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
                            obj12 = uFaceMagicEf1.getRange();
                            str7 = str11;
                            a.o(obj12, str7);
                            if (obj12.getStart() - start4 >= 0) {
                               obj12 = uFaceMagicEf1.getRange();
                               a.o(obj12, str7);
                               d6 = start4;
                               start2 = q.s(start2, obj12.getStart());
                            }else {
                               d6 = start4;
                            }
                            obj3 = uFaceMagicEf1.getRange();
                            a.o(obj3, str7);
                            obj12 = uFaceMagicEf1.getRange();
                            a.o(obj12, str7);
                            start4 = obj3.getStart() + obj12.getDuration();
                            if (start4 - start6 <= 0) {
                               obj3 = uFaceMagicEf1.getRange();
                               a.o(obj3, str7);
                               obj12 = uFaceMagicEf1.getRange();
                               a.o(obj12, str7);
                               start4 = obj3.getStart() + obj12.getDuration();
                               d1 = q.l(d1, start4);
                            }
                         }else {
                            str7 = str11;
                            d6 = start4;
                         }
                         iterator6 = iterator7;
                         start4 = d6;
                         str11 = str7;
                         type = 1;
                      }
                      double d7 = (uEffectTimeA4 - d1 < 0)? d1: uEffectTimeA4;
                      if (uEffectTimeA - start2 <= 0) {
                         obj1 = uEffectTimeA;
                      }
                      TimeRange$b uob2 = TimeRange.newBuilder();
                      uBuilder1 = uoc.n(i8);
                      a.o(uBuilder1, str25);
                      uob2.b(d7);
                      a.o(uob2, str14);
                      uob2.a((start2 - d7));
                      Object[] objArray2 = new Object[0];
                      a.D().w(str15, str4+end+str24+str23+d7+str19+start2, objArray2);
                      uBuilder1.d(uob2);
                   }
                }
             }else {
                str14 = str5;
                str23 = str4;
                str24 = str3;
                str25 = str21;
                uEffectTimeA = end;
                end = obj2;
                str1 = str2;
                str6 = str17;
                uEffectTimeA4 = start;
                type = 1;
                goto label_0582 ;
             }
             a a3 = a.a;
             Objects.requireNonNull(a3);
             if (PatchProxy.applyVoid(null, a3, a.class, "10")) {
                goto label_08c1 ;
             }else {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SIDE_MAGIC_FACE_SECTION";
                u1.u(1, uElementPack, null);
                goto label_08c1 ;
             }
          }
       }else {
          obj10 = c.a;
          obj = this;
          end1 = obj.start;
          uEffectTimeA2 = obj.end;
          rangeIndex = obj.rangeIndex;
          Objects.requireNonNull(obj10);
          if (PatchProxy.isSupport(c.class)) {
             end = rangeIndex;
             if (PatchProxy.applyVoidFourRefs(p0, Double.valueOf(end1), Double.valueOf(uEffectTimeA2), Integer.valueOf(rangeIndex), obj10, c.class, "1")) {
                goto label_08c1 ;
             }
          }else {
             end = rangeIndex;
          }
          a.p(obj1, str);
          obj8 = a.s(p0);
          if (obj8.z().isEmpty() || obj8.p() <= end) {
             goto label_08c1 ;
          }else {
             List obj13 = obj8.z().get(end);
             a.o(obj13, "baseDraft.messages[rangeIndex]");
             obj11 = obj13.getRange();
             a.o(obj11, "baseDraft.messages[rangeIndex].range");
             start4 = obj11.getStart();
             obj13 = obj8.z().get(end);
             a.o(obj13, "baseDraft.messages[rangeIndex]");
             obj11 = obj13.getRange();
             a.o(obj11, "baseDraft.messages[rangeIndex].range");
             start3 = obj11.getStart();
             obj13 = obj8.z().get(end);
             a.o(obj13, "baseDraft.messages[rangeIndex]");
             obj11 = obj13.getRange();
             a.o(obj11, "baseDraft.messages[rangeIndex].range");
             start3 = start3 + obj11.getDuration();
             obj13 = obj8.z();
             a.o(obj13, "baseDraft.messages");
             Iterator iterator8 = obj13.iterator();
             g og = obj8;
             EffectTimeAdjustAction uEffectTimeA6 = end;
             d = Double.MAX_VALUE;
             i4 = 0;
             double d8 = 0;
             while (iterator8.hasNext()) {
                Object obj14 = iterator8.next();
                int i10 = i4 + 1;
                if (i4 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                Object obj15 = obj14;
                Iterator iterator9 = iterator8;
                a.o(obj15, "time");
                obj11 = obj15.getRange();
                str11 = str1;
                str1 = "time.range";
                a.o(obj11, str1);
                if (obj11.getStart() - start3 >= 0) {
                   obj11 = obj15.getRange();
                   a.o(obj11, str1);
                   d9 = start3;
                   d = q.s(d, obj11.getStart());
                }else {
                   d9 = start3;
                }
                obj11 = obj15.getRange();
                a.o(obj11, str1);
                start3 = obj11.getStart();
                obj11 = obj15.getRange();
                a.o(obj11, str1);
                start3 = start3 + obj11.getDuration();
                if (start3 - start4 <= 0) {
                   obj11 = obj15.getRange();
                   a.o(obj11, str1);
                   start3 = obj11.getStart();
                   obj11 = obj15.getRange();
                   a.o(obj11, str1);
                   start3 = start3 + obj11.getDuration();
                   d8 = q.l(d8, start3);
                }
                iterator8 = iterator9;
                i4 = i10;
                start3 = d9;
                str1 = str11;
             }
             str11 = str1;
             if (end1 - d8 < 0) {
                start5 = d8;
             }
             if (uEffectTimeA2 - d > 0) {
                d3 = d;
             }
             uBuilder1 = og.n(uEffectTimeA6);
             a.o(uBuilder1, "baseDraft.getBuilder\(rangeIndex\)");
             TimeRange$b uob3 = TimeRange.newBuilder();
             uob3.b(start5);
             a.o(uob3, str11);
             uob3.a((d3 - start5));
             uBuilder1.b(uob3);
             goto label_08c1 ;
          }
       }
    }
}
