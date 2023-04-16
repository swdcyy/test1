package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import android.os.Parcelable;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$a;
import nsd.u;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$b;
import android.net.Uri;
import java.util.Map;
import java.lang.Object;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$isValid$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$bundleId$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$componentName$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$pageKey$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$needPortraitScreen$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$panelStyle$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$scriptType$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$newPage$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$placeType$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$radiusDp$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$bgColor$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$transparent$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$enableCloseBtnOnErrorInHalf$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$widthRatio$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$heightRatio$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$interceptBackKey$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$dismissOnTouchMask$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$themeType$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$dimAmount$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$bundleDialogLimitation$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$supportOrientation$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$launchOptions$2;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$normalizedParams$2;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.lang.Integer;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import java.lang.Number;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Set;
import ekd.x0;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.HashMap;

public final class LiveKrnDialogData implements Parcelable	// class@001d42
{
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public final p m;
    public final p n;
    public final p o;
    public final p p;
    public final p q;
    public final p r;
    public final p s;
    public final p t;
    public final p u;
    public final p v;
    public final p w;
    public final p x;
    public final Uri y;
    public final Map z;
    public static final LiveKrnDialogData$a A;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveKrnDialogData.A = new LiveKrnDialogData$a(null);
       LiveKrnDialogData.CREATOR = new LiveKrnDialogData$b();
    }
    public void LiveKrnDialogData(){
       super(null, null, 3, null);
    }
    public void LiveKrnDialogData(Uri p0){
       super(p0, null, 2, null);
    }
    public void LiveKrnDialogData(Uri p0,Map p1){
       super();
       this.y = p0;
       this.z = p1;
       LazyThreadSafetyMode lazyThreadSa = (p0 != null || p1 != null)? 1: null;
       if (lazyThreadSa) {
          lazyThreadSa = LazyThreadSafetyMode.PUBLICATION;
          this.b = s.b(lazyThreadSa, new LiveKrnDialogData$isValid$2(this));
          this.c = s.b(lazyThreadSa, new LiveKrnDialogData$bundleId$2(this));
          this.d = s.b(lazyThreadSa, new LiveKrnDialogData$componentName$2(this));
          this.e = s.b(lazyThreadSa, new LiveKrnDialogData$pageKey$2(this));
          this.f = s.b(lazyThreadSa, new LiveKrnDialogData$needPortraitScreen$2(this));
          this.g = s.b(lazyThreadSa, new LiveKrnDialogData$panelStyle$2(this));
          this.h = s.b(lazyThreadSa, new LiveKrnDialogData$scriptType$2(this));
          this.i = s.b(lazyThreadSa, new LiveKrnDialogData$newPage$2(this));
          this.j = s.b(lazyThreadSa, new LiveKrnDialogData$placeType$2(this));
          this.k = s.b(lazyThreadSa, new LiveKrnDialogData$radiusDp$2(this));
          this.l = s.b(lazyThreadSa, new LiveKrnDialogData$bgColor$2(this));
          this.m = s.b(lazyThreadSa, new LiveKrnDialogData$transparent$2(this));
          this.n = s.b(lazyThreadSa, new LiveKrnDialogData$enableCloseBtnOnErrorInHalf$2(this));
          this.o = s.b(lazyThreadSa, new LiveKrnDialogData$widthRatio$2(this));
          this.p = s.b(lazyThreadSa, new LiveKrnDialogData$heightRatio$2(this));
          this.q = s.b(lazyThreadSa, new LiveKrnDialogData$interceptBackKey$2(this));
          this.r = s.b(lazyThreadSa, new LiveKrnDialogData$dismissOnTouchMask$2(this));
          this.s = s.b(lazyThreadSa, new LiveKrnDialogData$themeType$2(this));
          this.t = s.b(lazyThreadSa, new LiveKrnDialogData$dimAmount$2(this));
          this.u = s.b(lazyThreadSa, new LiveKrnDialogData$bundleDialogLimitation$2(this));
          this.v = s.b(lazyThreadSa, new LiveKrnDialogData$supportOrientation$2(this));
          this.w = s.b(lazyThreadSa, new LiveKrnDialogData$launchOptions$2(this));
          this.x = s.b(lazyThreadSa, new LiveKrnDialogData$normalizedParams$2(this));
          return;
       }else {
          throw new IllegalStateException("uri 和 params 不可同时为空！".toString());
       }
    }
    public void LiveKrnDialogData(Uri p0,Map p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static final LiveKrnDialogData w(String p0,String p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveKrnDialogData.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnDialogData.A.c(p0, p1, p2);
    }
    public final Integer a(Activity p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogData.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x(LiveKrnContainerParams.HEIGHT);
       Integer integer = (obj != null)? Integer.valueOf(LiveKrnDialogData.A.b(obj, p0)): null;
       return integer;
    }
    public final Integer b(Activity p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogData.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x(LiveKrnContainerParams.WIDTH);
       Integer integer = (obj != null)? Integer.valueOf(LiveKrnDialogData.A.b(obj, p0)): null;
       return integer;
    }
    public final String c(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final int d(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "20");
       if (obj == PatchProxyResult.class) {
          obj = this.u.getValue();
       }
       return obj.intValue();
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogData.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveKrnDialogData && (a.g(this.y, p0.y) && a.g(this.z, p0.z)))) {
          return true;
       }
       return false;
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = this.r.getValue();
       }
       return obj.booleanValue();
    }
    public final float h(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = this.p.getValue();
       }
       return obj.floatValue();
    }
    public int hashCode(){
       LiveKrnDialogData obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveKrnDialogData tz = this.z;
       if (tz != null) {
          i = tz.hashCode();
       }
       return (i1 + i);
    }
    public final boolean i(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "16");
       if (obj == PatchProxyResult.class) {
          obj = this.q.getValue();
       }
       return obj.booleanValue();
    }
    public final Map j(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public final Set k(){
       Object[] objArray = null;
       LiveKrnDialogData obj = PatchProxy.apply(objArray, this, LiveKrnDialogData.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          objArray = x0.c(obj);
       }else {
          obj = this.z;
          if (obj != null) {
             objArray = obj.keySet();
          }
       }
       return objArray;
    }
    public final String l(String p0){
       LiveKrnDialogData obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogData.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          p0 = x0.a(obj, p0);
       }else {
          obj = this.z;
          p0 = (obj != null)? obj.get(p0): null;
       }
       return p0;
    }
    public final float m(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "10");
       if (obj == PatchProxyResult.class) {
          obj = this.k.getValue();
       }
       return obj.floatValue();
    }
    public final int n(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "12");
       if (obj == PatchProxyResult.class) {
          obj = this.m.getValue();
       }
       return obj.intValue();
    }
    public final Uri o(){
       return this.y;
    }
    public final float q(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "14");
       if (obj == PatchProxyResult.class) {
          obj = this.o.getValue();
       }
       return obj.floatValue();
    }
    public final boolean t(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.b.getValue();
       }
       return obj.booleanValue();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveKrnDialogData\(uri="+this.y+", params="+this.z+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(LiveKrnDialogData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveKrnDialogData.class, "33")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeParcelable(this.y, p1);
       LiveKrnDialogData tz = this.z;
       if (tz != null) {
          p0.writeInt(1);
          p0.writeInt(tz.size());
          Iterator iterator = tz.entrySet().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             p0.writeString(obj.getKey());
             p0.writeString(obj.getValue());
          }
       }else {
          p0.writeInt(0);
       }
       return;
    }
    public final String x(LiveKrnContainerParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogData.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, LiveKrnDialogData.class, "26");
       if (obj != patchProxyRe) {
       }else {
          obj = this.x.getValue();
       }
       return obj.get(p0.getParamName());
    }
}
