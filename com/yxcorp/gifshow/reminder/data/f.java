package com.yxcorp.gifshow.reminder.data.f;
import qvb.n0;
import kcc.j;
import kcc.k;
import ucc.a;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$a;
import rcc.o$a;
import com.yxcorp.gifshow.reminder.data.f$a;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.reminder.data.model.ReminderItem;
import java.lang.Object;
import kcc.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.reminder.data.model.ReminderContentInfo;
import sec.q0;
import w30.g;
import w30.f;
import com.kwai.framework.model.user.QCurrentUser;
import com.google.gson.JsonObject;
import java.lang.System;
import ekd.k0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.reminder.data.ReminderMixResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import com.yxcorp.gifshow.reminder.data.a;
import ok.h;
import com.yxcorp.gifshow.reminder.data.b;
import com.yxcorp.gifshow.reminder.data.c;
import wkd.b;
import pcc.a;
import com.yxcorp.gifshow.reminder.data.d;
import t45.d;
import brd.z;
import pcc.e;
import erd.o;
import pcc.c;
import erd.g;
import pcc.d;
import qvb.n0$a;
import java.util.List;
import nfc.b;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Collection;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import rcc.o;
import java.lang.Number;
import java.lang.Long;
import lnc.a1;
import pcc.f;
import java.util.Objects;
import ncc.g;
import java.lang.CharSequence;

public class f extends n0	// class@001a6f
{
    public final j m;
    public final k n;
    public final a o;
    public final o$a p;
    public final ListReqLifecycle$a q;
    public int r;
    public String s;
    public static final int t;

    public void f(j p0,k p1,a p2,ListReqLifecycle$a p3){
       super();
       this.s = "";
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.q = p3;
       this.p = new o$a();
       this.h(new f$a(this));
    }
    public static void W1(ReminderItem p0,Object p1,f p2,String p3,String p4,String p5,int p6){
       f f;
       long[] olongArray;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uof, "7")) {
             return;
          }
       }
       oobject.mData = oobject1;
       oobject.mCategory = oobject5;
       oobject.mId = oobject2.j(oobject1);
       oobject.mIsUnRead = oobject2.n(oobject1);
       oobject.mTimestamp = oobject2.i(oobject1);
       oobject.mContentInfo = oobject2.h(oobject1);
       ReminderItem mClientLog = oobject.mClientLog;
       ReminderItem mClientLogIn = oobject.mClientLogInfo;
       if (!PatchProxy.isSupport(q0.class) || !PatchProxy.applyVoidFourRefs(mClientLog, mClientLogIn, p4, Integer.valueOf(p6), null, q0.class, "1")) {
          mClientLog.f = new g();
          mClientLog.a = oobject4;
          mClientLog.b = QCurrentUser.me().getId();
          if (mClientLogIn instanceof JsonObject) {
             mClientLog.c = System.currentTimeMillis();
             f = mClientLog.f;
             f.a = k0.h(mClientLogIn, "messageId", "");
             f.b = k0.f(mClientLogIn, "messageType", i);
             f.c = k0.f(mClientLogIn, "messageDetailTypeId", i);
             f.d = k0.f(mClientLogIn, "index", i) + p6;
             f.e = k0.f(mClientLogIn, "recoCnt", i);
             f.j = k0.g(mClientLogIn, "photoId", 0);
             f.k = k0.g(mClientLogIn, "commentId", 0);
             f.o = k0.g(mClientLogIn, "messageTimestamp", 0);
             f.p = k0.h(mClientLogIn, "expInfo", "");
             f.m = k0.c(mClientLogIn, "isRead", i);
             JsonArray jsonArray = mClientLogIn.g0("recoUserIdList");
             if (jsonArray != null) {
                olongArray = new long[jsonArray.size()];
                f.f = olongArray;
                int i1 = jsonArray.size();
                i1 = i1 - 1;
                while (i1 >= 0) {
                   f.f[i1] = jsonArray.e0(i1).t();
                }
             }
             jsonArray = mClientLogIn.g0("subRecoUserIds");
             if (jsonArray != null && jsonArray.size() > 0) {
                olongArray = new long[jsonArray.size()];
                f.q = olongArray;
                while (i < jsonArray.size()) {
                   f.q[i] = jsonArray.e0(i).t();
                   i = i + 1;
                }
             }
          }
       }
       oobject2.l(oobject1, oobject.mClientLog, oobject3, oobject4);
       ReminderItem mContentInfo = oobject.mContentInfo;
       if (mContentInfo != null) {
          mContentInfo.c = oobject.mClientLog;
       }
       return;
    }
    public boolean B1(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.hasMore();
       return b;
    }
    public t I1(){
       String obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K()) {
          this.r = 0;
       }
       this.q.c();
       obj = this.V1(a.b);
       return b.a(0x428e0eda).b(this.o.c(), this.V1(d.b), obj, this.V1(b.b), 0, this.V1(c.b)).observeOn(d.c).map(new e(this, obj)).observeOn(d.a).doOnNext(new c(this)).doOnError(new d(this));
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       super.K1(p0);
       this.q.a();
       return;
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "5")) {
       }else if(this.K()){
          p1.clear();
          f tp = this.p;
          if (!PatchProxy.applyVoidOneRefs(tp, null, b.class, "1")) {
             tp.a = System.currentTimeMillis();
             Calendar instance = Calendar.getInstance();
             instance.setTimeInMillis(tp.a);
             o$a a = tp.a;
             tp.b = a - (((long)instance.getTimeZone().getRawOffset() + a) % 0x5265c00);
             tp.c = tp.b - ((long)(((((instance.get(7) + 6) % 7) - 1) + 7) % 7) * 0x5265c00);
             tp.d = tp.b - ((long)(instance.get(5) - 1) * 0x5265c00);
          }
          this.s = p0.mUnreadNewsFallBackText;
       }
       p1.addAll(p0.getItems());
       this.X1(p1, this.p);
       return;
    }
    public final String V1(h p0){
       ReminderMixResponse obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L0();
       String str = (this.K() || obj == null)? null: p0.apply(obj);
       return TextUtils.I(str);
    }
    public void X1(List p0,o$a p1){
       long l;
       o obj5;
       ReminderItem reminderItem2;
       f uof;
       o obj6;
       int i1;
       ReminderItem reminderItem3;
       int i2;
       o$a b;
       Object obj = this;
       Object obj1 = p0;
       Iterator obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, f.class, "8")) {
          return;
       }
       ArrayList uArrayList = Lists.f(5);
       Iterator iterator = p0.iterator();
       Object obj3 = null;
       ReminderItem reminderItem = obj3;
       o oo = reminderItem;
       o oo1 = null;
       int i = 1;
       while (iterator.hasNext()) {
          ReminderItem reminderItem1 = iterator.next();
          if (b.d(reminderItem1)) {
             oo = b.a(reminderItem);
             if (reminderItem && (oo != null && !oo.g.isEmpty())) {
                uArrayList.add(reminderItem);
             }
          label_0048 :
             oo = b.a(reminderItem1);
             if (oo != null) {
                oo.g.clear();
             }
             reminderItem = reminderItem1;
             i = 5;
          }else {
             Object obj4 = PatchProxy.applyTwoRefs(reminderItem1, obj2, obj3, b.class, "2");
             if (obj4 != patchProxyRe) {
                l = obj4.longValue();
             }else if(reminderItem1.mIsUnRead != null){
                l = obj2.a;
             }else {
                reminderItem3 = reminderItem1.mTimestamp;
                l = obj2.b;
                if (reminderItem3 - l < 0) {
                   l = obj2.c;
                   if (reminderItem3 - l < 0) {
                      l = obj2.d;
                      if (reminderItem3 - l < 0) {
                         l = 0;
                      }
                   }
                }
             }
             if (reminderItem && oo != null) {
                o c = oo.c;
                if (l - c < 0) {
                   if (!l - c) {
                      oo1 = 1;
                   }
                   if (oo1) {
                   label_009a :
                      reminderItem2 = reminderItem1;
                   label_015e :
                      if (b.b(reminderItem2)) {
                         reminderItem3 = reminderItem2;
                         obj.m.k(reminderItem3.mData, oo.a);
                      }else {
                         reminderItem3 = reminderItem2;
                      }
                      uof = reminderItem3.mClientLog.f;
                      if (uof != null) {
                         if (!l - obj2.a) {
                            i2 = 1;
                         }else if(!l - obj2.b){
                            i2 = 2;
                         }else if(!l - obj2.c){
                            i2 = 3;
                         }else if(!l - obj2.d){
                            i2 = 4;
                         }else {
                            i2 = 5;
                         }
                         uof.n = i2;
                      }
                      oo.g.add(reminderItem3);
                      obj3 = null;
                   }
                }else {
                   goto label_009a ;
                }
             }
          label_009e :
             if (reminderItem && (oo != null && !oo.g.isEmpty())) {
                uArrayList.add(reminderItem);
             }
          label_00ad :
             if (PatchProxy.isSupport(b.class)) {
                obj5 = PatchProxy.applyTwoRefs(Long.valueOf(l), obj2, null, b.class, "3");
                if (obj5 != patchProxyRe) {
                   oo = obj5;
                   reminderItem2 = reminderItem1;
                }else {
                label_00c7 :
                   o$a a = obj2.a;
                   if (!l - a) {
                      reminderItem2 = reminderItem1;
                      obj5 = new o(p1, a, a1.p(0x7f104264), 1);
                      oo = v17;
                   }else {
                      reminderItem2 = reminderItem1;
                      b = obj2.b;
                      if (!l - b) {
                         obj6 = new o(obj2, b, a1.p(0x7f104265));
                      }else {
                         b = obj2.c;
                         if (!l - b) {
                            obj6 = new o(obj2, b, a1.p(0x7f104262));
                         }else {
                            b = obj2.d;
                            if (!l - b) {
                               obj6 = new o(obj2, b, a1.p(0x7f104261));
                            }else {
                               oo = new o(obj2, 0, a1.p(0x7f104263));
                            }
                         }
                      }
                      oo = obj6;
                   }
                }
             }else {
                goto label_00c7 ;
             }
             reminderItem = new ReminderItem();
             reminderItem.mData = oo;
             uof = f.class;
             if (PatchProxy.isSupport(uof)) {
                obj6 = PatchProxy.applyOneRefs(Integer.valueOf(i), null, uof, "1");
                if (obj6 != patchProxyRe) {
                   i1 = obj6.intValue();
                label_015c :
                   reminderItem.mViewType = i1;
                   goto label_015e ;
                }
             }
             i1 = f.c(i, 8);
             goto label_015c ;
          }
       }
       if (reminderItem && (oo != null && !oo.g.isEmpty())) {
          uArrayList.add(reminderItem);
       }
    label_01b3 :
       p0.clear();
       reminderItem3 = (uArrayList.size() > 0)? uArrayList.get(oo1): null;
       obj5 = b.a(reminderItem3);
       reminderItem3 = (uArrayList.size() > i)? uArrayList.get(i): null;
       oo = b.a(reminderItem3);
       if (uArrayList.size() == 2 && (obj5 != null && (oo != null && (!obj5.c - obj2.a && !oo.c)))) {
          oo.a = a1.p(0x7f1034d8);
          oo.d = oo1;
       }
    label_0202 :
       if (uArrayList.size() == i) {
          if (obj5 != null) {
             Objects.requireNonNull(p1);
             if (!obj5.c) {
             }
          }else {
          }
       }
       b = 1;
    label_0219 :
       Iterator iterator1 = uArrayList.iterator();
       i1 = 0;
       while (iterator1.hasNext()) {
          reminderItem3 = iterator1.next();
          if (b) {
             reminderItem3.mPosition = oo1;
             int i3 = i1 + 1;
             reminderItem3.mListPosition = i1;
             obj1.add(reminderItem3);
             i1 = i3;
          }
          o oo2 = b.a(reminderItem3);
          if (oo2 == null) {
          }else {
             obj2 = oo2.g.iterator();
             while (obj2.hasNext()) {
                ReminderItem reminderItem4 = obj2.next();
                reminderItem4.mSection = reminderItem3;
                int i4 = oo1 + 1;
                reminderItem4.mPosition = oo1;
                int i5 = i1 + 1;
                reminderItem4.mListPosition = i1;
                i1 = i5;
                i5 = i4;
             }
             obj1.addAll(oo2.g);
             if (oo2.d != null && this.K()) {
                f s = obj.s;
                if (PatchProxy.applyVoidTwoRefs(oo2, s, null, b.class, "6")) {
                   continue ;
                }else {
                   String str = "";
                   if (!b.a(-83154551).e()) {
                      oo2.e = str;
                   }else {
                      int i6 = oo2.g.size();
                      if (i6 < i) {
                         oo2.e = str;
                      }else if(i6 < 20){
                         oo2.e = a1.q(0x7f104f7b, i6);
                      }else if(TextUtils.x(s)){
                         s = a1.r(R.string.arg_RES_7f104f7b, "20+");
                         oo2.e = s;
                      }
                      oo2.e = s;
                   }
                }
             }else {
                boolean b1 = false;
             }
          }
       }
       return;
    }
}
