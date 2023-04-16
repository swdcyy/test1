package com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import hp.a$a;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$a;
import nsd.u;
import hp.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import b1c.b;
import java.util.HashMap;
import c1c.a;
import c1c.c;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$providers$1;
import msd.l;
import c1c.d;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$providers$2;
import c1c.b;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$providers$3;
import c1c.e;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$providers$4;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xyb.a;
import q87.c;
import b1c.e;
import java.lang.StringBuilder;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$b;
import java.lang.Runnable;
import ekd.k1;
import b1c.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$c;
import java.util.Comparator;
import java.util.Objects;
import vsd.n;
import rsd.f;
import java.util.NoSuchElementException;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Math;
import b1c.b$a;
import java.lang.Integer;
import java.lang.Float;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$e;
import d1c.c;
import b1c.d;
import b1c.a$d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$a;
import java.util.Map;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$g;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$h;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$i;
import java.lang.Number;
import oe6.e;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.prettify.filter.repo.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$d;
import j16.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import hp.c;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import b1c.a$b;
import hp.d;
import k2b.u1;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import m16.a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import b1c.a$c;

public final class FilterStateManager extends a$a	// class@00114f
{
    public final List b;
    public b c;
    public e d;
    public boolean e;
    public c f;
    public c g;
    public boolean h;
    public final HashMap i;
    public final List j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final int n;
    public final a o;
    public static final FilterStateManager$a p;

    static {
       FilterStateManager.p = new FilterStateManager$a(null);
    }
    public void FilterStateManager(a p0){
       a.p(p0, "effectBus");
       super(p0);
       this.o = p0;
       this.b = new ArrayList();
       this.c = new b();
       this.i = new HashMap();
       a[] uoaArray = new a[]{new c(new FilterStateManager$providers$1(this)),new d(new FilterStateManager$providers$2(this)),new b(new FilterStateManager$providers$3(this)),new e(new FilterStateManager$providers$4(this))};
       this.j = CollectionsKt__CollectionsKt.P(uoaArray);
       this.k = true;
       this.n = 36;
    }
    public final boolean a(){
       Object[] objArray = null;
       FilterStateManager obj = PatchProxy.apply(objArray, this, FilterStateManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e == null) {
          objArray = new Object[0];
          a.D().w("EffectBus-Beauty", "尝试从内存里恢复上次的滤镜， fail", objArray);
          return 0;
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("EffectBus-Filter", "尝试从内存里恢复上次的滤镜", objArray1);
          if (this.c.b()) {
             objArray1 = new Object[0];
             a.D().w("EffectBus-Filter", "尝试从内存里恢复上次的滤镜， disable魔表内置滤镜", objArray1);
             obj = this.d;
             if (obj != null) {
                obj.b();
             }
          }
          a uoa = a.D();
          StringBuilder str = "尝试从内存里恢复上次的滤镜， 滤镜: ";
          FilterConfig uFilterConfi = this.c.a();
          if (uFilterConfi != null) {
             objArray = uFilterConfi.toSimpleString();
          }
          objArray1 = new Object[0];
          uoa.w("EffectBus-Filter", str+objArray+' '+this.c.c(), objArray1);
          obj = this.d;
          if (obj != null) {
             obj.a(this.c.a(), this.c.c(), 0);
          }
          if (this.c.a() != null) {
             k1.o(new FilterStateManager$b(this));
          }
          return true;
       }
    }
    public final b b(a p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, FilterStateManager.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j.iterator();
       while (obj.hasNext()) {
          obj.next().g(p0);
       }
       Iterator iterator = CollectionsKt___CollectionsKt.f5(CollectionsKt___CollectionsKt.G5(this.j), new FilterStateManager$c()).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new NoSuchElementException("Collection contains no element matching the predicate.");
          }
          a uoa = iterator.next();
          StringBuilder str = (uoa.f() && uoa.d() != null)? 1: null;
          if (str) {
             Object[] objArray = new Object[0];
             a.D().A("EffectBus-Filter", "滤镜输出更新 "+uoa, objArray);
             iterator = this.j.iterator();
             while (iterator.hasNext()) {
                a uoa1 = iterator.next();
                boolean b = a.g(uoa1, uoa);
                Objects.requireNonNull(uoa1);
                a uoa2 = a.class;
                if (PatchProxy.isSupport(uoa2) && (PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoa1, uoa2, "3") || (PatchProxy.isSupport(uoa2) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoa1, uoa2, "2")))) {
                   continue ;
                }
                uoa1.d.b(uoa1, a.h[0], Boolean.valueOf(b));
             }
             b uob = uoa.d();
             a.m(uob);
             return uob;
          }
       }
    }
    public final boolean c(){
       Object[] objArray1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FilterStateManager uFilterState = FilterStateManager.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uFilterState, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.m == null) {
          objArray1 = new Object[0];
          a.D().w("EffectBus-Filter", "使用自然滤镜？ false !canApplyNatureFilterExternally", objArray1);
          return 0;
       }else {
          obj = PatchProxy.apply(objArray, this, uFilterState, "20");
          boolean b = (obj != patchProxyRe)? obj.booleanValue(): FilterConfig.isEmptyOrNull(this.c.a());
          if (!b) {
             objArray1 = new Object[0];
             a.D().w("EffectBus-Filter", "使用自然滤镜？ false !hasNoCurrentFilter", objArray1);
             return 0;
          }else {
             BeautifyConfig obj1 = PatchProxy.apply(objArray, this, uFilterState, "21");
             String str = 1;
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                BeautifyConfig uBeautifyCon = this.o.b();
                if (uBeautifyCon != null) {
                   obj1 = this.o.c();
                   if (obj1 != null && Math.abs((BeautyFilterItem.getFilterValue(obj1, 0) - BeautyFilterItem.getFilterValue(uBeautifyCon, 0))) - 0x3c23d70a < 0) {
                      b1 = true;
                   }
                }
                b1 = false;
             }
             if (!b1) {
                objArray1 = new Object[0];
                a.D().w("EffectBus-Filter", "使用自然滤镜？ false !hasDefaultBright", objArray1);
                return 0;
             }else {
                return str;
             }
          }
       }
    }
    public final FilterConfig d(){
       Object obj = PatchProxy.apply(null, this, FilterStateManager.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a();
    }
    public final List e(){
       return this.b;
    }
    public final b f(){
       return this.c;
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, FilterStateManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.d();
    }
    public final void h(b p0){
       boolean b;
       Object[] objArray;
       FilterStateManager uFilterState = FilterStateManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFilterState, "6")) {
          return;
       }
       b$a e = b.e;
       FilterStateManager tc = this.c;
       Objects.requireNonNull(e);
       a0 obj = PatchProxy.applyTwoRefs(tc, p0, e, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = true;
          if (tc != null || p0 != null) {
             if (tc != null && p0 != null) {
                FilterConfig uFilterConfi1 = tc.a();
                FilterConfig uFilterConfi2 = null;
                Integer integer = (uFilterConfi1 != null)? Integer.valueOf(uFilterConfi1.mFeatureId): uFilterConfi2;
                FilterConfig uFilterConfi3 = p0.a();
                Integer integer1 = (uFilterConfi3 != null)? Integer.valueOf(uFilterConfi3.mFeatureId): uFilterConfi2;
                if (a.g(integer, integer1)) {
                   uFilterConfi1 = tc.a();
                   Float uFloat = (uFilterConfi1 != null)? Float.valueOf(uFilterConfi1.mIntensity): uFilterConfi2;
                   uFilterConfi3 = p0.a();
                   if (uFilterConfi3 != null) {
                      uFilterConfi2 = Float.valueOf(uFilterConfi3.mIntensity);
                   }
                   if (!a.f(uFloat, uFilterConfi2) || (!a.g(tc.c(), p0.c()) || (tc.b() != p0.b() || tc.d() != p0.d()))) {
                   label_0098 :
                      b = false;
                   }
                }else {
                   goto label_0098 ;
                }
             }else {
                goto label_0098 ;
             }
          }
       }
       if (!b) {
          objArray = new Object[0];
          a.D().E("EffectBus-Filter", "[filter][keypath] ", "滤镜当前 state 改变, "+"旧状态 "+this.c+" -> 新状态 "+p0, objArray);
          this.c = p0;
       }
       if (this.c.b()) {
          FilterStateManager td = this.d;
          if (td != null) {
             td.b();
          }
       }
       FilterConfig uFilterConfi = this.c.a();
       if (uFilterConfi != null) {
          obj = this.c.c();
          if (!PatchProxy.isSupport(uFilterState) || !PatchProxy.applyVoidThreeRefs(uFilterConfi, obj, Boolean.FALSE, this, FilterStateManager.class, "7")) {
             String str = ", source ";
             Object[] objArray1 = new Object[0];
             a.D().E("EffectBus-Filter", "[filter][keypath][willapply] ", "滤镜变化 "+uFilterConfi.toSimpleString()+str+obj, objArray1);
             if (!this.c.d()) {
                objArray = new Object[0];
                a.D().s("EffectBus-Filter", "数仓更新滤镜 "+uFilterConfi.toSimpleString()+str+obj, objArray);
                Objects.requireNonNull(obj);
                this.i(uFilterConfi, obj instanceof a0$e);
             }
             uFilterConfi.mChangeByExternal = obj.c();
             uFilterState = this.f;
             if (uFilterState != null) {
                uFilterState.o(uFilterConfi);
             }
             uFilterState = this.d;
             if (uFilterState != null) {
                uFilterState.a(uFilterConfi, obj, 0);
             }
             k1.o(new d(this, uFilterConfi, obj, 0));
             this.o.h(uFilterConfi);
          }
       }
       return;
    }
    public final void i(FilterConfig p0,boolean p1){
       FilterStateManager uFilterState = FilterStateManager.class;
       if (PatchProxy.isSupport(uFilterState) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uFilterState, "17")) {
          return;
       }
       uFilterState = this.f;
       FilterConfig uFilterConfi = (uFilterState != null)? uFilterState.m(p0.mFilterId): null;
       if (uFilterConfi == null || (!uFilterConfi.isEmptyFilter() && !p0.isReco())) {
          if (!uFilterConfi.mIntensity - p0.mIntensity && !p1) {
             return;
          }else {
             Object[] objArray = new Object[0];
             a.D().w("EffectBus-Filter", "change filter in DataManager "+uFilterConfi.toSimpleString()+" -> "+p0.mIntensity, objArray);
             if (p1) {
                uFilterConfi.mChangeIntensityByMagic = true;
                uFilterConfi.mIntensityBeforeMagic = p0.mIntensityBeforeMagic;
             }
             uFilterConfi.mIntensity = p0.mIntensity;
             FilterStateManager tf = this.f;
             if (tf != null) {
                tf.A();
             }
          }
       }
       return;
    }
    public final void j(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStateManager.class, "16")) {
          return;
       }
       a.p(p0, "userFilter");
       b uob = this.b(new a$d(p0, a0$a.c));
       uob.f(this.c.d());
       uob.g(this.c.b());
       this.h(uob);
       this.h = true;
       return;
    }
    public final void k(float p0){
       FilterStateManager uFilterState = FilterStateManager.class;
       if (PatchProxy.isSupport(uFilterState) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uFilterState, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EffectBus-Filter", "用户调节滤镜力度 "+p0, objArray);
       FilterConfig uFilterConfi = this.c.a();
       if (uFilterConfi == null || uFilterConfi.isEmptyFilter()) {
          Object[] objArray1 = new Object[i];
          a.D().w("EffectBus-Filter", "change intensity, while "+uFilterConfi, objArray1);
          return;
       }else {
          uFilterConfi.mIntensity = p0;
          this.i(uFilterConfi, i);
          this.i.put(Integer.valueOf(uFilterConfi.mFilterId), Float.valueOf(p0));
          b uob = this.b(new a$d(uFilterConfi, a0$g.c));
          this.c = uob;
          this.h(uob);
          return;
       }
    }
    public final void l(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStateManager.class, "10")) {
          return;
       }
       a.p(p0, "config");
       Object[] objArray = new Object[0];
       a.D().w("EffectBus-Filter", "用户手动选择滤镜 "+p0.toSimpleString(), objArray);
       b uob = this.b(new a$d(p0, a0$h.c));
       this.c = uob;
       this.h(uob);
       return;
    }
    public final void m(FilterConfig p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStateManager.class, "13")) {
          return;
       }
       boolean b = true;
       this.k = b;
       int i = 0;
       if (p0 != null) {
          objArray = new Object[i];
          a.D().w("EffectBus-Filter", "endTouch with new", objArray);
          this.l(p0);
       }else if(this.l != null){
          objArray = new Object[i];
          a.D().s("EffectBus-Filter", "滑动滤镜结束，魔表禁用滤镜失效", objArray);
          this.c.g(b);
          this.c.h(a0$i.c);
          this.h(this.c);
       }
       return;
    }
    public final FilterConfig n(FilterConfig p0){
       FilterConfig obj = PatchProxy.applyOneRefs(p0, this, FilterStateManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || this.i.get(Integer.valueOf(p0.mFilterId)) == null) {
          obj = null;
       }else {
          obj = new FilterConfig();
          p0 = p0.mFilterId;
          obj.mFilterId = p0;
          p0 = this.i.get(Integer.valueOf(p0));
          a.m(p0);
          obj.mIntensity = p0.floatValue();
       }
       return obj;
    }
    public final void o(c p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStateManager.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.init();
       }
       this.i.clear();
       if (p0 != null) {
          List filters = p0.getFilters();
          if (filters != null) {
             iterator = filters.iterator();
             while (iterator.hasNext()) {
                FilterConfig uFilterConfi = iterator.next();
                this.i.put(Integer.valueOf(uFilterConfi.mFilterId), Float.valueOf(uFilterConfi.mIntensity));
             }
          }
       }
       iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().f = p0;
       }
       this.f = p0;
       return;
    }
    public void onBeautyBusEvent(BeautifyConfig p0,int p1){
       SharedPreferences a;
       Object[] objArray1;
       FilterStateManager uFilterState = FilterStateManager.class;
       if (PatchProxy.isSupport(uFilterState) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uFilterState, "19")) {
          return;
       }
       int i = 1;
       if (p1 != i) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().E("EffectBus-Filter", "[filter][keypath] ", "收到美颜bus "+p1, objArray);
       a = e.a;
       String str = "judgement_of_nature_filter";
       if (a.getBoolean(str, 0)) {
          objArray1 = new Object[0];
          a.D().E("EffectBus-Filter", "[filter][keypath] ", "收到美颜bus skip AlreadyJudgementOfNatureFilter", objArray1);
          return;
       }else if(!this.c()){
          objArray1 = new Object[0];
          a.D().E("EffectBus-Filter", "[filter][keypath] ", "收到美颜bus skip 不满足应用条件", objArray1);
          return;
       }else {
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean(str, i);
          g.a(uEditor);
          FilterConfig uFilterConfi = b.a(this.f, this.n);
          Object[] objArray2 = new Object[0];
          a.D().E("EffectBus-Filter", "[filter][keypath] ", "收到美颜bus 使用自然滤镜！", objArray2);
          if (uFilterConfi != null && !n.l(uFilterConfi)) {
             n.e(uFilterConfi, new FilterStateManager$d(this, uFilterConfi));
          }else if(uFilterConfi != null){
             this.l(uFilterConfi);
          }
          objArray1 = new Object[0];
          a.D().w("EffectBus-Filter", "使用自然滤镜", objArray1);
          return;
       }
    }
    public void onMagicEffectBusEvent(MagicEmoji$MagicFace p0,c p1){
       Object[] objArray1;
       FilterStateManager uFilterState = FilterStateManager.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uFilterState, "8")) {
          return;
       }
       int i = 0;
       boolean b = (p1 != null)? p1.b(): false;
       a uoa = a.D();
       StringBuilder str = "收到魔表bus ";
       FilterConfig uFilterConfi = null;
       SimpleMagicFace mName = (p0 != null)? p0.mName: uFilterConfi;
       Object[] objArray = new Object[i];
       uoa.w("EffectBus-Filter", str+mName+"  -- 是否禁用拍前滤镜: "+b, objArray);
       if (this.h == null) {
          uoa = a.D();
          StringBuilder str1 = "在滤镜恢复之前收到魔表 Bus 事件 magicface= ";
          String magicMusicNa = (p0 != null)? p0.getMagicMusicName(): uFilterConfi;
          uoa.v("EffectBus-Filter", "onMagicEffectBusEvent", new IllegalStateException(str1+magicMusicNa));
       }
       if (a.g(p1, this.g)) {
          objArray1 = new Object[i];
          a.D().w("EffectBus-Filter", "魔表效果与之前相同，忽略", objArray1);
          return;
       }else {
          this.g = p1;
          MagicEmoji$MagicFace magicFace = this.o.f();
          d uod = (p1 != null)? p1.e(): uFilterConfi;
          FilterConfig obj = PatchProxy.applyTwoRefs(p0, uod, this, uFilterState, "9");
          if (obj != PatchProxyResult.class) {
             uFilterConfi = obj;
          }else if(uod == null){
             objArray1 = new Object[i];
             a.D().s("EffectBus-Filter", "查找关联滤镜：lookupConfig为null", objArray1);
          }else {
             obj = b.a(this.f, uod.a());
             Object[] objArray2 = new Object[i];
             a.D().s("EffectBus-Filter", "查找关联滤镜：id: "+uod.a()+", -> "+obj, objArray2);
             if (FilterConfig.isEmptyOrNull(obj)) {
                Object[] objArray3 = new Object[i];
                a.D().s("EffectBus-Filter", "查找关联滤镜：为空，返回Empty", objArray3);
                StringBuilder str2 = "魔表 ";
                if (p0 != null) {
                   uFilterConfi = p0.mName;
                }
                u1.Q("FilterCollect", str2+uFilterConfi+" 关联滤镜 id "+uod.a()+" 为空，返回 Empty 滤镜");
                uFilterConfi = FilterConfig.getEmpty();
                if (uod.a() == -2) {
                   uFilterConfi.mFilterId = uod.a();
                }
             }else {
                a.m(obj);
                uFilterConfi = obj.clone();
                a.o(uFilterConfi, "filterConfig!!.clone\(\)");
                uFilterConfi.mIntensity = uod.b();
             }
          }
          this.h(this.b(new a$b(magicFace, b, uFilterConfi)));
          return;
       }
    }
    public void onMakeupBusEvent(a p0,MakeupSuite p1,int p2){
       if (PatchProxy.isSupport(FilterStateManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, FilterStateManager.class, "5")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "收到美妆bus ";
       FilterConfig uFilterConfi = null;
       SimpleMagicFace mName = (p1 != null)? p1.mName: uFilterConfi;
       int i = 0;
       Object[] objArray = new Object[i];
       uoa.w("EffectBus-Filter", str+mName+"  -- "+p0+' '+a.a(p2), objArray);
       if (p2 != 2) {
          return;
       }else {
          FilterConfig empty = FilterConfig.getEmpty();
          if (p1 != null && (!TextUtils.x(p1.mPassThroughParams.mFilterIdForMakeup) && !TextUtils.x(p1.mPassThroughParams.mFilterIntensityForMakeup))) {
             Object[] objArray1 = new Object[i];
             a.D().w("EffectBus-Filter", "美妆带滤镜 id： "+p1.mPassThroughParams.mFilterIdForMakeup, objArray1);
             PassThroughParams mFilterIdFor = p1.mPassThroughParams.mFilterIdForMakeup;
             a.o(mFilterIdFor, "suite.mPassThroughParams.mFilterIdForMakeup");
             empty.mFilterId = Integer.parseInt(mFilterIdFor);
             mFilterIdFor = p1.mPassThroughParams.mFilterIntensityForMakeup;
             a.o(mFilterIdFor, "suite.mPassThroughParams.mFilterIntensityForMakeup");
             empty.mIntensity = Float.parseFloat(mFilterIdFor);
          }
       label_00ac :
          FilterStateManager tf = this.f;
          if (tf != null) {
             uFilterConfi = tf.m(empty.mFilterId);
          }
          FilterConfig empty1 = FilterConfig.getEmpty();
          if (!FilterConfig.isEmptyOrNull(uFilterConfi)) {
             a.m(uFilterConfi);
             empty1 = uFilterConfi.clone();
             empty1.mIntensity = empty.mIntensity;
          }
          this.h(this.b(new a$c(p1, empty1)));
          return;
       }
    }
    public final void p(e p0){
       this.d = p0;
    }
}
