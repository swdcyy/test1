package com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$b;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok2.j;
import java.util.Collection;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import ekd.q;
import android.view.View;
import java.lang.Iterable;
import java.util.Map;
import qk.m;
import com.kuaishou.live.core.show.subscribe.edit.r;
import ok.o;
import java.util.Iterator;
import lnc.a1;
import e17.i;
import uk2.d;
import java.util.Calendar;
import java.lang.Number;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import sk2.b0;
import java.lang.Float;
import com.contrarywind.view.WheelView;
import zf6.j;
import ekd.k1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import wk2.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import com.kuaishou.live.core.show.subscribe.edit.q;
import android.view.View$OnClickListener;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.live.core.show.subscribe.edit.s;
import sk2.u;
import android.widget.ImageView;
import sk2.y;
import com.google.common.collect.ImmutableList;
import sk2.w;
import sk2.z;
import sk2.x;
import sk2.a0;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$AutoFillInfo;

public class LiveSubscribeEditFragment extends BaseFragment	// class@0010f2
{
    public LiveSubscribeEditFragment$b j;
    public LiveSubscribeEditFragment$a k;
    public View l;
    public TextView m;
    public TextView n;
    public List o;
    public List p;
    public final Map q;
    public TextView r;
    public d s;
    public View t;
    public final boolean u;
    public static final int v = 2131766471;
    public static final int w = 2131766470;
    public static final List x;

    static {
       Integer[] integerArray = new Integer[]{Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(6),Integer.valueOf(7)};
       LiveSubscribeEditFragment.x = Arrays.asList(integerArray);
    }
    public void LiveSubscribeEditFragment(){
       super();
       this.o = Collections.emptyList();
       this.p = Collections.emptyList();
       this.q = new HashMap();
       this.u = false;
    }
    public void LiveSubscribeEditFragment(LiveSubscribeEditFragment$b p0,LiveSubscribeEditFragment$a p1){
       super();
       this.o = Collections.emptyList();
       this.p = Collections.emptyList();
       this.q = new HashMap();
       this.j = p0;
       this.k = p1;
       this.u = true;
    }
    public boolean ch(){
       LiveSubscribeEditFragment obj = PatchProxy.apply(null, this, LiveSubscribeEditFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.u == null) {
          return b;
       }
       obj = this.j;
       if (obj.a == 24 || (obj.h != null && j.x.size() > this.j.g.size())) {
          b = true;
       }
       return b;
    }
    public String dh(){
       CharSequence obj = PatchProxy.apply(null, this, LiveSubscribeEditFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r.getText();
       if (TextUtils.x(obj)) {
          return null;
       }
       return obj.toString();
    }
    public final boolean eh(){
       LiveSubscribeEditFragment$b obj = PatchProxy.apply(null, this, LiveSubscribeEditFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.b;
       boolean b = (obj != null && !q.f(obj.mSubscribeInfoList))? true: false;
       return b;
    }
    public final void fh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeEditFragment.class, "20")) {
          return;
       }
       if (p0 == this.m) {
          this.lh(1);
          p0.setSelected(1);
          this.ih(this.o);
       }else {
          int i = 2;
          if (p0 == this.n) {
             this.lh(i);
             p0.setSelected(1);
             this.ih(this.p);
             this.hh(this.m);
          }else if(this.q.get(p0) == null){
             return;
          }else {
             this.lh(i);
             int i1 = p0.isSelected() ^ 1;
             if (m.s(this.p).p(r.b).size() != 1 || i1) {
                p0.setSelected(i1);
             }
             this.hh(this.m);
             this.hh(this.n);
          }
       }
       return;
    }
    public final void gh(TextView p0,boolean p1){
       if (PatchProxy.isSupport(LiveSubscribeEditFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveSubscribeEditFragment.class, "19")) {
          return;
       }
       float f = (p1)? 0x3f800000: 0x3f000000;
       p0.setAlpha(f);
       return;
    }
    public final void hh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeEditFragment.class, "23")) {
          return;
       }
       p0.setSelected(false);
       return;
    }
    public final void ih(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeEditFragment.class, "21")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.hh(iterator.next());
       }
       return;
    }
    public final void jh(int p0){
       if (PatchProxy.isSupport(LiveSubscribeEditFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSubscribeEditFragment.class, "24")) {
          return;
       }
       i.e(R.style.arg_RES_7f11066a, a1.p(p0), 0);
       return;
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeEditFragment.class, "22")) {
          return;
       }
       this.t.setEnabled((TextUtils.x(this.dh()) ^ 0x01));
       return;
    }
    public final void lh(int p0){
       d uod = this;
       d uod1 = d.class;
       String str = "16";
       if (PatchProxy.isSupport(LiveSubscribeEditFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uod, LiveSubscribeEditFragment.class, str)) {
          return;
       }
       float f = 16.00f;
       int i = 17;
       int i1 = 6;
       uod.s = (p0 != 1)? new d(uod.l, new boolean[i1]{0x00,0x00,0x00,0x01,0x01,0x00}, i, a1.e(f)): new d(uod.l, new boolean[i1]{0x00,0x01,0x01,0x01,0x01,0x00}, i, a1.e(f));
       Calendar instance = Calendar.getInstance();
       Object[] objArray = null;
       Calendar obj = PatchProxy.apply(objArray, uod, LiveSubscribeEditFragment.class, "17");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5);
       instance.setTimeInMillis(l);
       obj = Calendar.getInstance();
       obj.setTimeInMillis((instance.getTimeInMillis() + TimeUnit.DAYS.toMillis(90)));
       LiveSubscribeEditFragment s = uod.s;
       Objects.requireNonNull(s);
       if (!PatchProxy.applyVoidTwoRefs(instance, obj, s, uod1, "22")) {
          s.i = instance.get(1);
          s.j = obj.get(1);
          s.k = instance.get(2);
          s.l = obj.get(2);
          s.m = instance.get(5);
          s.n = obj.get(5);
       }
       LiveSubscribeEditFragment s1 = uod.s;
       s1.u = new b0(uod);
       s1.c(instance.get(1), instance.get(2), instance.get(5), instance.get(11), instance.get(12), instance.get(13));
       LiveSubscribeEditFragment s2 = uod.s;
       float f1 = 2.60f;
       Objects.requireNonNull(s2);
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f1), s2, uod1, "23")) {
          s2.s = f1;
          if (!PatchProxy.applyVoid(objArray, s2, uod1, str)) {
             s2.c.setLineSpacingMultiplier(s2.s);
             s2.b.setLineSpacingMultiplier(s2.s);
             s2.d.setLineSpacingMultiplier(s2.s);
             s2.e.setLineSpacingMultiplier(s2.s);
          }
       }
       s2 = uod.s;
       i = 0;
       int i2 = j.a(R.color.arg_RES_7f0607c5, i);
       Objects.requireNonNull(s2);
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), s2, uod1, "26")) {
          s2.q = i2;
          if (!PatchProxy.applyVoid(objArray, s2, uod1, "13")) {
             s2.c.setTextColorCenter(s2.q);
             s2.b.setTextColorCenter(s2.q);
             s2.d.setTextColorCenter(s2.q);
             s2.e.setTextColorCenter(s2.q);
          }
       }
       s2 = uod.s;
       i2 = j.a(R.color.arg_RES_7f0607cf, i);
       Objects.requireNonNull(s2);
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), s2, uod1, "27")) {
          s2.p = i2;
          if (!PatchProxy.applyVoid(objArray, s2, uod1, "12")) {
             s2.c.setTextColorOut(s2.p);
             s2.b.setTextColorOut(s2.p);
             s2.d.setTextColorOut(s2.p);
             s2.e.setTextColorOut(s2.p);
          }
       }
       s2 = uod.s;
       Objects.requireNonNull(s2);
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), s2, uod1, "24")) {
          s2.r = i;
          if (!PatchProxy.applyVoid(objArray, s2, uod1, "14")) {
             s2.c.setDividerColor(s2.r);
             s2.b.setDividerColor(s2.r);
             s2.d.setDividerColor(s2.r);
             s2.e.setDividerColor(s2.r);
          }
       }
       s2 = uod.s;
       Objects.requireNonNull(s2);
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, s2, uod1, "19")) {
          s2.b.setCyclic(i);
          s2.c.setCyclic(i);
          s2.d.setCyclic(i);
          s2.e.setCyclic(i);
       }
       s2 = uod.s;
       Objects.requireNonNull(s2);
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, s2, uod1, "28")) {
          s2.c.e(i);
          s2.b.e(i);
          s2.d.e(i);
          s2.e.e(i);
       }
       s2 = uod.s;
       Objects.requireNonNull(s2);
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray1 = new Object[i1];
          objArray1[i] = Integer.valueOf(i);
          objArray1[1] = Integer.valueOf(i);
          objArray1[2] = Integer.valueOf(i);
          objArray1[3] = Integer.valueOf(i);
          objArray1[4] = Integer.valueOf(i);
          objArray1[5] = Integer.valueOf(i);
          if (PatchProxy.applyVoid(objArray1, s2, uod1, "18")) {
          label_0294 :
             s2 = uod.s;
             str = a1.p(R.string.arg_RES_7f104fd5);
             String str1 = a1.p(R.string.arg_RES_7f104fd3);
             String str2 = a1.p(R.string.arg_RES_7f104fd2);
             String str3 = "";
             String str4 = (k1.h())? a1.p(R.string.arg_RES_7f101562): str3;
             if (k1.h()) {
                str3 = a1.p(R.string.arg_RES_7f103631);
             }
             String str5 = str3;
             Objects.requireNonNull(s2);
             if (PatchProxy.isSupport(uod1)) {
                Object[] objArray2 = new Object[i1];
                objArray2[i] = str;
                objArray2[1] = str1;
                objArray2[2] = str2;
                objArray2[3] = str4;
                objArray2[4] = str5;
                objArray2[5] = null;
                if (!PatchProxy.applyVoid(objArray2, s2, uod1, "17")) {
                label_02eb :
                   if (str1 != null) {
                      s2.b.setLabel(str1);
                   }else {
                      s2.b.setLabel(s2.a.getContext().getString(R.string.arg_RES_7f103c73));
                   }
                   if (str2 != null) {
                      s2.c.setLabel(str2);
                   }else {
                      s2.c.setLabel(s2.a.getContext().getString(R.string.arg_RES_7f103c70));
                   }
                   if (str4 != null) {
                      s2.d.setLabel(str4);
                   }else {
                      s2.d.setLabel(s2.a.getContext().getString(R.string.arg_RES_7f103c71));
                   }
                   if (str5 != null) {
                      s2.e.setLabel(str5);
                   }else {
                      s2.e.setLabel(s2.a.getContext().getString(R.string.arg_RES_7f103c72));
                   }
                }
             }else {
                goto label_02eb ;
             }
             return;
          }
       }
       s2.c.setTextXOffset(i);
       s2.b.setTextXOffset(i);
       s2.d.setTextXOffset(i);
       s2.e.setTextXOffset(i);
       goto label_0294 ;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSubscribeEditFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (this.u != null && this.j.i != null)? 2: 0;
       return a.h(p0, 0x7f0d0df9, p1, false, i);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSubscribeEditFragment.class, "4")) {
          return;
       }
       super.onStart();
       if (this.u == null) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.j.e.get();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.j.f.get();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, liveVoicePar, objArray, s.class, "24")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          showEvent.elementPackage = uElementPack;
          uElementPack.action2 = "LIVE_PREVIEW_CREATE_CARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          if (liveVoicePar != null) {
             uContentPack.liveVoicePartyPackage = liveVoicePar;
          }
          showEvent.contentPackage = uContentPack;
          u1.g0(showEvent);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       boolean b;
       Iterator iterator1;
       TextView textView;
       TextView textView1;
       LiveSubscribeEditFragment$b uob;
       View view = this;
       LiveSubscribeEditFragment$b obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, view, LiveSubscribeEditFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (view.u == null) {
          return;
       }
       String str = 5;
       LiveSubscribeEditFragment liveSubscrib = null;
       if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "5")) {
          view.l = m1.f(obj, 0x7f0a2661);
          if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "13")) {
             textView1 = m1.f(obj, R.id.live_subscribe_content_text_view);
             view.r = textView1;
             textView1.setText(view.j.d);
             view.r.setHint(a1.r(R.string.arg_RES_7f102ced, String.valueOf(view.j.c)));
             view.r.setOnClickListener(new q(view));
          }
          if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "8")) {
             b = this.eh();
             ClientContent$LiveStreamPackage liveStreamPa = view.j.e.get();
             Object obj1 = view.j.f.get();
             LiveSubscribeEditFragment$b a = view.j.a;
             if (PatchProxy.isSupport(s.class)) {
                uob = a;
                if (PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), liveStreamPa, obj1, Integer.valueOf(a), null, s.class, "25")) {
                label_00f2 :
                   view.t = m1.f(obj, 0x7f0a2622);
                   this.kh();
                   view.t.setOnClickListener(new s(view));
                }
             }else {
                uob = a;
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CREATE_LIVE_PREVIEW_BUTTON";
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("if_created", Integer.valueOf(b));
             jsonObject.a0("source", Integer.valueOf(uob));
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (liveStreamPa != null) {
                uContentPack.liveStreamPackage = liveStreamPa;
             }
             if (obj1 != null) {
                uContentPack.liveVoicePartyPackage = obj1;
             }
             u1.u0(9, uElementPack, uContentPack);
             goto label_00f2 ;
          }
          if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "7")) {
             m1.f(obj, R.id.live_subscribe_rule_view).setOnClickListener(new u(view));
          }
          if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "6")) {
             ImageView imageView = m1.f(obj, R.id.live_subscribe_setting_cancel);
             int i3 = (this.ch())? 0: 8;
             imageView.setVisibility(i3);
             imageView.setOnClickListener(new y(view));
          }
          if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "15")) {
             view.m = m1.f(obj, 0x7f0a2658);
             view.n = m1.f(obj, 0x7f0a2659);
             textView1 = m1.f(obj, R.id.live_subscribe_type_repeat_monday);
             TextView textView2 = m1.f(obj, R.id.live_subscribe_type_repeat_tuesday);
             TextView textView3 = m1.f(obj, R.id.live_subscribe_type_repeat_wednesday);
             TextView textView4 = m1.f(obj, R.id.live_subscribe_type_repeat_thursday);
             TextView textView5 = m1.f(obj, R.id.live_subscribe_type_repeat_friday);
             TextView textView6 = m1.f(obj, R.id.live_subscribe_type_repeat_saturday);
             TextView textView7 = m1.f(obj, R.id.live_subscribe_type_repeat_sunday);
             view.q.put(textView1, Integer.valueOf(1));
             view.q.put(textView2, Integer.valueOf(2));
             int i1 = 3;
             view.q.put(textView3, Integer.valueOf(i1));
             view.q.put(textView4, Integer.valueOf(4));
             view.q.put(textView5, Integer.valueOf(str));
             view.q.put(textView6, Integer.valueOf(6));
             int i2 = 7;
             view.q.put(textView7, Integer.valueOf(i2));
             TextView[] textViewArra = new TextView[i2];
             textViewArra[liveSubscrib] = textView1;
             textViewArra[1] = textView2;
             textViewArra[2] = textView3;
             textViewArra[i1] = textView4;
             textViewArra[4] = textView5;
             textViewArra[5] = textView6;
             textViewArra[6] = textView7;
             List list = Arrays.asList(textViewArra);
             view.p = list;
             TextView[] textViewArra1 = new TextView[]{view.n};
             view.o = m.s(list).l(textViewArra1).B();
          }
       }
       obj = view.j.g;
       if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "18")) {
          b = obj.contains(Integer.valueOf(1));
          boolean b1 = obj.contains(Integer.valueOf(2));
          if (!b) {
             view.gh(view.m, liveSubscrib);
             view.m.setOnClickListener(new w(view));
          }else {
             view.gh(view.m, 1);
             view.m.setOnClickListener(new z(view));
          }
          if (!b1) {
             iterator1 = view.o.iterator();
             while (iterator1.hasNext()) {
                textView = iterator1.next();
                view.gh(textView, liveSubscrib);
                textView.setOnClickListener(new x(view));
             }
          }else {
             iterator1 = view.o.iterator();
             while (iterator1.hasNext()) {
                textView = iterator1.next();
                view.gh(textView, 1);
                textView.setOnClickListener(new a0(view));
             }
          }
          if (b) {
             view.fh(view.m);
          }else {
             view.fh(view.n);
          }
       }
       obj = view.j.j;
       if (!PatchProxy.applyVoidOneRefs(obj, view, LiveSubscribeEditFragment.class, "14") && obj != null) {
          view.r.setText(obj.mTitle);
          if (obj.mDayOfWeek.containsAll(LiveSubscribeEditFragment.x)) {
             view.fh(view.n);
          }else {
             Iterator iterator = obj.mDayOfWeek.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == null) {
                   continue ;
                }else {
                   i = integer.intValue() - 1;
                   if (i < 0 || i >= view.p.size()) {
                      continue ;
                   }
                }
                view.fh(view.p.get(i));
             }
          }
          Calendar instance = Calendar.getInstance();
          instance.set(11, obj.mHour);
          instance.set(12, obj.mMinute);
          view.s.c(instance.get(1), instance.get(2), instance.get(5), instance.get(11), instance.get(12), instance.get(13));
          this.kh();
       }
       return;
    }
}
