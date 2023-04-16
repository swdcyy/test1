package com.kuaishou.live.audience.gzone.v2.pendant.b;
import lv1.d;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.audience.gzone.v2.pendant.b$a;
import com.kuaishou.live.audience.gzone.v2.pendant.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c63.a$a;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import lv1.g;
import c63.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z31.d;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import h3.a;
import lv1.f;
import z31.e;
import androidx.viewpager.widget.ViewPager$i;
import android.view.ViewGroup;
import com.kuaishou.live.audience.gzone.v2.pendant.b$c;
import java.lang.Number;
import java.lang.Integer;
import com.google.common.collect.Lists;
import com.kuaishou.live.core.basic.utils.LivePreferenceObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import ow0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Runnable;

public class b extends d	// class@000c3f
{
    public HashMap g;
    public HashMap h;
    public Handler i;
    public f j;
    public b$c k;
    public boolean l;
    public boolean m;
    public Runnable n;
    public Runnable o;

    public void b(Context p0,ViewPager p1,LinearLayout p2,View p3,boolean p4,boolean p5){
       super(p0, p1, p2, new ArrayList(), p3);
       this.i = new Handler(Looper.getMainLooper());
       this.n = new b$a(this);
       this.o = new b$b(this);
       this.l = p4;
       this.m = p5;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       super.b();
       this.j(this.d);
       this.n();
       return;
    }
    public final void e(View p0,a$a p1,long p2,long p3,long p4,boolean p5,boolean p6){
       String str1;
       a uoa;
       d c;
       g c1;
       f uof = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = 1;
       boolean i1 = 0;
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, uof, b.class, "11")) {
             return;
          }
       }
       String str = "pendantViewId";
       if (oobject == null) {
          b.a0(LiveLogTag.VIEW_PAGER_PENDANT, "addPendantFailed contentView is null", c.j(str, oobject1.a));
          return;
       }else if(uof.l != null || uof.m != null){
          str1 = str;
          uoa = new a(uof.a, p0, p1, p2, p3, p4, p5, uof.m);
       }else {
          str1 = str;
          c1 = new g(uof.a, p0, oobject1.a, p2, p3, p4, p5);
       }
       if (p5 || uoa.g()) {
          a$a a = oobject1.a;
          Iterator obj = PatchProxy.applyOneRefs(a, uof, b.class, "20");
          if (obj != PatchProxyResult.class) {
             i1 = obj.booleanValue();
          }else if(q.f(uof.d)){
             obj = uof.d.iterator();
             while (true) {
                if (obj.hasNext()) {
                   if (TextUtils.n(obj.next().i(), a)) {
                      i1 = true;
                      break ;
                   }
                }
             }
          }
          i1 = false;
          if (!i1) {
             if (p6) {
                uof.d.add(0, uoa);
             }else {
                uof.d.add(uoa);
             }
             d uod = new d(uof, oobject1, p0);
             if (!PatchProxy.applyVoidOneRefs(uod, uoa, g.class, "1")) {
                c1 = uoa.c;
                if (c1 != null) {
                   c1.setOnClickListener(uod);
                }
             }
             if (!PatchProxy.applyVoid(null, uof, b.class, "12")) {
                b j = uof.j;
                if (j != null) {
                   j.q();
                }else {
                   f uof1 = new f(uof.d);
                   uof.j = uof1;
                   uof.c.setAdapter(uof1);
                   uof.c.addOnPageChangeListener(new e(uof));
                   c = uof.c;
                   if (uof.d.size()) {
                      i = uof.d.size();
                   }
                   c.setCurrentItem((i * 100));
                }
             }
             uof.j.q();
             this.c();
             this.l();
             return;
          }
       }
       b.a0(LiveLogTag.VIEW_PAGER_PENDANT, "addPendantFailed", c.k(str1, oobject1.a, "shouldShowPermanently", Boolean.valueOf(p5)));
       return;
    }
    public boolean f(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.h(p0) >= 0) {
          return this.d.get(this.h(p0)).g();
       }
       return false;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.n();
       this.c.setVisibility(8);
       this.e.setVisibility(8);
       this.b.setVisibility(8);
       b tk = this.k;
       if (tk != null) {
          tk.c();
       }
       return;
    }
    public int h(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       int i = 0;
       while (true) {
          if (i >= this.d.size()) {
             return -1;
          }
          if (this.d.get(i).h() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public void i(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "4")) {
          return;
       }
       int i = this.h(p0);
       if (!PatchProxy.isSupport(uob) || (PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uob, "16") || (i >= 0 && i < this.d.size()))) {
          g og = this.d.get(i);
          if (og != null) {
             this.n();
             ViewGroup viewGroup = og.f();
             this.c.removeView(viewGroup);
             viewGroup.removeAllViews();
             this.d.remove(i);
             this.j.q();
             if (this.d.isEmpty()) {
                this.g();
             }else {
                this.c();
                this.m();
             }
             g[] ogArray = new g[]{og};
             this.j(Lists.e(ogArray));
          }
       }
       return;
    }
    public final void j(List p0){
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       Type m = LivePreferenceObject.M;
       HashMap hashMap = a.m(m);
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       HashMap hashMap1 = a.l(m);
       if (hashMap1 == null) {
          hashMap1 = new HashMap();
       }
       int i = 0;
       while (i < p0.size()) {
          g og = p0.get(i);
          if (!og.m()) {
             hashMap.put(og.i(), Long.valueOf(og.j()));
             hashMap1.put(og.i(), Long.valueOf(og.i));
          }
          i = i + 1;
       }
       a = a.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putString("livePendantViewsShowedDuration", b.e(hashMap));
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putString("livePendantViewsLastHideTime", b.e(hashMap1));
       g.a(uEditor1);
       Object[] objArray = new Object[0];
       a.C().s("ViewPagerController", "LivePendantViewsShowedDurationMap: "+hashMap.toString(), objArray);
       Object[] objArray1 = new Object[0];
       a.C().s("ViewPagerController", "LivePendantViewLastHideTimeMap: "+hashMap1.toString(), objArray1);
       return;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d.isEmpty()) {
          return true;
       }
       int i = 0;
       while (true) {
          if (i >= this.d.size()) {
             return true;
          }
          if (!this.d.get(i).m()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tk = this.k;
       if (tk != null && !tk.a()) {
          return;
       }
       if (this.d.isEmpty()) {
          return;
       }
       this.c.setVisibility(0);
       this.e.setVisibility(0);
       this.b.setVisibility(0);
       this.m();
       tk = this.k;
       if (tk != null) {
          tk.b();
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       this.n();
       if (this.d.size() > 1) {
          this.i.postDelayed(this.n, 3000);
       }
       if (!this.k()) {
          this.i.postDelayed(this.o, 1000);
       }
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       this.i.removeCallbacksAndMessages(null);
       return;
    }
}
