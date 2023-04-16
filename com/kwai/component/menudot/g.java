package com.kwai.component.menudot.g;
import com.kwai.component.menudot.b$b;
import java.lang.Object;
import wkd.b;
import com.kwai.component.menudot.b;
import nc5.a;
import java.lang.String;
import android.content.SharedPreferences;
import nc5.s;
import com.yxcorp.gifshow.reddot.model.RedDot;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nc5.d;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import com.kwai.component.menudot.d;
import ekd.q$b;
import java.util.Set;
import oc5.b;
import oc5.a;
import brd.t;
import cjd.e;
import erd.o;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.util.LinkedList;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.utility.Log;
import com.kwai.component.menudot.f;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;
import nc5.t;
import ok.x;

public class g implements b$b	// class@0009bd
{
    public final b a;
    public int b;
    public final int c;
    public final s d;

    public void g(){
       super();
       this.a = b.a(0x34c80eb4);
       this.c = a.a.getInt("AutoEliminateRedDotLevel", 3);
       this.d = new s();
    }
    public static boolean h(RedDot p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.g(p0);
    }
    public static boolean j(RedDot p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.n(p0);
    }
    public void a(RedDot p0){
       s os = s.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       RedDot mRoot = p0.mRoot;
       if (p0 == mRoot) {
          this.d.d(mRoot);
          return;
       }else {
          g tc = this.c;
          if (!PatchProxy.isSupport(os) || (PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(tc), null, os, "8") || (p0.mLevel == (tc - 1) && !q.f(p0.mChildren)))) {
             HashSet hashSet = new HashSet();
             Iterator iterator = p0.mChildren.iterator();
             while (iterator.hasNext()) {
                RedDot redDot = iterator.next();
                if (!d.g(redDot) || q.f(redDot.mChildren)) {
                   continue ;
                }
                hashSet.addAll(s.a(redDot, d.a));
             }
             if (!q.f(hashSet)) {
                a.a().b(d.a(hashSet, ',')).map(new e()).subscribe();
                hashSet.clear();
             }
          }
          if (!this.d(p0)) {
             return;
          }else if(d.h(p0)){
             this.d.d(p0.mRoot);
          }
          if (q.f(p0.mChildren)) {
             s.f(p0, false);
             this.f(p0);
             return;
          }else if(d.h(p0)){
             if (!PatchProxy.applyVoidOneRefs(p0, null, os, "7")) {
                String str = d.a(s.b(p0), ',');
                if (!TextUtils.x(str)) {
                   a.a().c(p0.mTypeValue, str).map(new e()).subscribe();
                }
             }
             this.f(p0);
          }
          return;
       }
    }
    public void b(RedDot p0,RedDot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       d.j("receive start:\n");
       int i = 0;
       boolean b = (p0.mShownInMenuBar != p1.mShownInMenuBar)? true: false;
       int i1 = d.f(p0);
       int i2 = d.f(p1);
       i1 = (!i1 && (i2 > 0 || (!i2 && i1 > 0)))? 1: 0;
       if (p1.mLevel != 1) {
          this.a.a(p0.mTypeValue);
       }
       if (i1) {
          this.m(p0);
       }
       RedDot mMenuBarShow = p0.mMenuBarShownCount;
       if (this.b != mMenuBarShow) {
          i = 1;
       }
       this.b = mMenuBarShow;
       if (p1.mLevel == 1 && p1.mSpecial != null) {
          b = i1;
       }
       if (b || i) {
          this.k(p0, b);
       }
       d.j("receive end:\n");
       return;
    }
    public void c(RedDot p0,RedDot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "9")) {
          return;
       }
       RedDot mParent = p1.mParent;
       if (mParent == p0) {
          p1.mRealShow = true;
          return;
       }else if(mParent == null){
          this.i(p1, p0);
          return;
       }else if(q.f(p1.mChildren)){
          if (!g.h(p1)) {
             this.i(p1, p0);
             return;
          }else if(p1.mLevel == true){
             if (p1.mShownInMenuBar != null) {
                this.i(p1, p0);
                this.a.a(p1.mTypeValue);
                this.k(p1, true);
             }else {
                this.i(p1, p0);
                this.a.a(p1.mTypeValue);
             }
             return;
          }else if(p1.mShownInMenuBar != null){
             mParent = p1.mParent;
             this.i(p1, p0);
             d.b(mParent);
             if (!g.h(mParent)) {
                mParent.reset();
                this.a.a(mParent.mTypeValue);
             }else {
                this.l(mParent);
             }
             this.k(p1, true);
          }else {
             this.i(p1, p0);
             p1.mMenuShow = p1.isSpecial();
             this.a.a(p1.mTypeValue);
          }
          return;
       }else if(p1.mLevel == true){
          boolean b = g.j(p1);
          this.i(p1, p0);
          int i = 0;
          Iterator iterator = p1.mChildren.iterator();
          while (iterator.hasNext()) {
             if (g.h(iterator.next())) {
                i++;
             }
          }
          p1.mTotal = p1.mWaterline + (long)i;
          this.a.a(p1.mTypeValue);
          if (b) {
             this.k(p1, true);
          }
          return;
       }else {
          Set set = s.b(p1);
          if (!g.h(p1) || q.f(set)) {
             p1.reset();
             this.i(p1, p0);
             this.a.a(p1.mTypeValue);
             return;
          }else {
             p1.mTotal = p1.mWaterline + (long)set.size();
             p1.mShownInMenuBar = true;
             this.l(p1);
             RedDot mParent1 = p1.mParent;
             this.i(p1, p0);
             d.c(mParent1, set.size());
             if (!g.h(mParent1)) {
                mParent1.reset();
                this.a.a(mParent1.mTypeValue);
             }else {
                this.l(mParent1);
             }
             this.k(p1, true);
             return;
          }
       }
    }
    public boolean d(RedDot p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (g.h(p0) && (!d.h(p0) || p0.mMenuShow != null))? true: false;
       return b;
    }
    public void e(RedDot p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       if (!d.f(p0) || p0.mParent == null) {
          p0.hide();
          return;
       }else {
          boolean b = true;
          if (q.f(p0.mChildren)) {
             if (d.h(p0)) {
                if (p0.mMenuShow != null) {
                   p0.reset();
                   this.k(p0, b);
                }else {
                   p0.reset();
                }
                p0.hide();
                return;
             }else {
                p0.reset();
                this.m(p0);
                if (p0.mShownInMenuBar != null) {
                   this.k(p0, b);
                }
                p0.hide();
                return;
             }
          }else if(d.h(p0)){
             RedDot mMenuShow = p0.mMenuShow;
             if (mMenuShow != null) {
                d.k(p0);
             }
             if (mMenuShow != null) {
                this.k(p0, b);
             }
             p0.hide();
             return;
          }else {
             Set set = s.b(p0);
             if (q.f(set)) {
                d.k(p0);
                this.m(p0);
                p0.hide();
                return;
             }else {
                RedDot redDot = d.e(p0);
                if (redDot == null) {
                   d.k(p0);
                   this.m(p0);
                   p0.hide();
                   return;
                }else {
                   d.c(redDot, set.size());
                   d.k(p0);
                   this.m(p0);
                   this.l(redDot);
                   this.a.a(redDot.mTypeValue);
                   p0.hide();
                   return;
                }
             }
          }
       }
    }
    public final void f(RedDot p0){
       s os = s.class;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "6")) {
          return;
       }
       String str = 1;
       if (p0.mLevel > str && !q.f(p0.mChildren)) {
          return;
       }
       d.j("consumeRedDot "+p0.mTypeValue+" start:\n");
       boolean b = false;
       if (d.h(p0)) {
          if (p0.mMenuShow == null) {
             d.j("consumeRedDot not "+p0.mTypeValue+" end:");
             return;
          }else if(!q.f(p0.mChildren)){
             HashSet hashSet = PatchProxy.applyOneRefs(p0, this, og, "7");
             if (hashSet != PatchProxyResult.class) {
             }else {
                LinkedList linkedList = new LinkedList(p0.mChildren);
                HashSet hashSet1 = new HashSet();
                while (!linkedList.isEmpty()) {
                   RedDot redDot = linkedList.poll();
                   if (!q.f(redDot.mChildren)) {
                      linkedList.addAll(redDot.mChildren);
                   }else if(g.j(redDot)){
                      hashSet1.add(Integer.valueOf(redDot.mTypeValue));
                      redDot.mShownInMenuBar = b;
                   }
                }
                hashSet = hashSet1;
             }
             g td = this.d;
             Objects.requireNonNull(td);
             if (!PatchProxy.applyVoidOneRefs(hashSet, td, os, "4")) {
                td.b.removeAll(hashSet);
                td.c.removeAll(hashSet);
             }
          }else {
             og = this.d;
             RedDot mTypeValue = p0.mTypeValue;
             Objects.requireNonNull(og);
             if (!PatchProxy.isSupport(os) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mTypeValue), og, os, "5")) {
                og.a.remove(Integer.valueOf(mTypeValue));
                og.c.remove(Integer.valueOf(mTypeValue));
             }
          }
          p0.reset();
          this.a.a(p0.mTypeValue);
          d.b(p0.mParent);
          this.a.a(p0.mParent.mTypeValue);
          d.j("consumeRedDot "+p0.mTypeValue+" end:\n");
          return;
       }else {
          p0.mWaterline = p0.mTotal;
          RedDot mShownInMenu = p0.mShownInMenuBar;
          p0.mShownInMenuBar = b;
          this.a.a(p0.mTypeValue);
          this.m(p0);
          if (mShownInMenu == null) {
             d.j("consumeRedDot "+p0.mTypeValue+" end:\n");
             return;
          }else {
             this.k(p0, str);
             d.j("consumeRedDot "+p0.mTypeValue+" end:\n");
             return;
          }
       }
    }
    public s g(){
       return this.d;
    }
    public final void i(RedDot p0,RedDot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "11")) {
          return;
       }
       RedDot mParent = p0.mParent;
       if (mParent != null) {
          mParent = mParent.mChildren;
          if (mParent != null) {
             mParent.remove(p0);
          }
       }
       p0.mRealShow = true;
       p0.mParent = p1;
       if (p1.mChildren == null) {
          p1.mChildren = new ArrayList();
       }
       p1.mChildren.add(p0);
       d.l(p0, (p1.mLevel + true));
       return;
    }
    public final void k(RedDot p0,boolean p1){
       int i2;
       g og1;
       RedDot redDot2;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "3")) {
          return;
       }
       boolean b = true;
       if (p0.mLevel < b) {
          return;
       }
       String str = "MenuRedDotManager";
       Log.g(str, "开始更新侧边栏红点 type = "+p0.mTypeValue);
       RedDot redDot = null;
       if (p0.mLevel == b) {
          if (p1) {
             redDot = p0;
          }
       }else if(p1){
          redDot = d.e(p0);
          if (redDot == null) {
             return;
          }else {
             this.l(redDot);
          }
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.mRoot.mChildren.iterator();
       while (iterator.hasNext()) {
          RedDot redDot1 = iterator.next();
          if (redDot1.isSpecial() && g.h(redDot1)) {
             uArrayList1.add(redDot1);
          }else if(!redDot1.isSpecial() && g.j(redDot1)){
             uArrayList.add(redDot1);
          }
       }
       int i = d.f(p0.mRoot);
       int i1 = uArrayList.size();
       if (i1 > this.b) {
          Collections.sort(uArrayList, f.b);
          i2 = 0;
          og1 = null;
          int i3 = i1 - this.b;
          while (i2 < i3) {
             i3 = i1 - 1;
             i3 = i3 - i2;
             redDot2 = uArrayList.get(i3);
             redDot2.mMenuShow = false;
             Log.g(str, "想要展示红点数量大于了能展示的红点数量，隐藏该红点 type = "+redDot2.mTypeValue);
             this.a.a(redDot2.mTypeValue);
             if (redDot2 == redDot) {
                og1 = 1;
             }
             i2 = i2 + 1;
          }
       }else {
          og1 = null;
       }
       i1 = Math.min(this.b, i1);
       i2 = 0;
       while (i2 < i1) {
          redDot2 = uArrayList.get(i2);
          if (redDot2 == redDot) {
             redDot2.mMenuShow = b;
             this.a.a(redDot2.mTypeValue);
             Log.g(str, "normal redDot show type = "+redDot.mTypeValue);
             og1 = 1;
          }else if(redDot2.mMenuShow == null){
             redDot2.mMenuShow = b;
             this.a.a(redDot2.mTypeValue);
             Log.g(str, "virtual redDot show type = "+redDot2.mTypeValue);
          }
          i2 = i2 + 1;
       }
       if (uArrayList1.contains(redDot) && redDot != null) {
          redDot.mMenuShow = b;
          this.a.a(redDot.mTypeValue);
          Log.g(str, "special redDot show type = "+redDot.mTypeValue);
       }else {
          b = og1;
       }
       if (b == null && redDot) {
          redDot.mMenuShow = false;
          Log.g(str, "如果menuRedDot未被更新意味着menuRedDot侧边栏不可见 type = "+redDot.mTypeValue);
          this.a.a(redDot.mTypeValue);
       }
       String str1 = "hamburger_red_dot";
       if (t.a.get().booleanValue()) {
          Log.g(str1, "updateHanBurgerRedDot by new way");
       }else {
          Log.g(str1, "updateHanBurgerRedDot by old way");
          if (i != (uArrayList1.size() + i1)) {
             RedDot mRoot = p0.mRoot;
             mRoot.mTotal = (mRoot.mWaterline + (long)i1) + (long)uArrayList1.size();
             this.a.a(p0.mRoot.mTypeValue);
          }
       }
       return;
    }
    public final void l(RedDot p0){
       RedDot mUpdateTime;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       if (p0 != null && !q.f(p0.mChildren)) {
          long l = 0;
          p0.mUpdateTime = l;
          p0.mPriority = Integer.MAX_VALUE;
          LinkedList linkedList = new LinkedList(p0.mChildren);
          int i = 0;
          int i1 = 0;
          while (!linkedList.isEmpty()) {
             RedDot redDot = linkedList.poll();
             if (!q.f(redDot.mChildren)) {
                linkedList.addAll(redDot.mChildren);
             }else if(!g.j(redDot)){
                continue ;
             }else {
                i1 = i1 + 1;
                if (redDot.isSpecial()) {
                   if (p0.isSpecial()) {
                      mUpdateTime = redDot.mUpdateTime;
                      if (p0.mUpdateTime - mUpdateTime > 0) {
                         p0.mUpdateTime = mUpdateTime;
                      }
                   }
                   p0.mPriority = i;
                   p0.mUpdateTime = redDot.mUpdateTime;
                }else if(p0.isSpecial()){
                   continue ;
                }else {
                   RedDot mUpdateTime1 = p0.mUpdateTime;
                   if (mUpdateTime1 - l) {
                      mUpdateTime = redDot.mUpdateTime;
                      if (mUpdateTime1 - mUpdateTime <= 0) {
                         if (!mUpdateTime1 - mUpdateTime) {
                            redDot = redDot.mPriority;
                            if (p0.mPriority > redDot) {
                               p0.mPriority = redDot;
                            }
                         }
                      }
                   }
                   p0.mPriority = redDot.mPriority;
                   p0.mUpdateTime = redDot.mUpdateTime;
                }
             }
          }
          p0.mTotal = p0.mWaterline + (long)i1;
          if (i1 > 0) {
             i = true;
          }
          p0.mShownInMenuBar = i;
       }
       return;
    }
    public final void m(RedDot p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       if (p0.mLevel <= 2) {
          return;
       }
       if (d.f(p0) > 0) {
          RedDot mParent = p0.mParent;
          Object obj = PatchProxy.applyOneRefs(mParent, null, d.class, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             RedDot mWaterline = mParent.mWaterline;
             if (mParent.mTotal - mWaterline < 0) {
                mParent.mTotal = mWaterline;
             }
             mParent.mTotal = mParent.mTotal + 1;
             if (d.f(mParent) == 1) {
                b = true;
             }else {
                b = false;
             }
          }
       }else {
          b = d.b(p0.mParent);
       }
       this.a.a(p0.mParent.mTypeValue);
       if (b) {
          this.m(p0.mParent);
       }
       return;
    }
}
