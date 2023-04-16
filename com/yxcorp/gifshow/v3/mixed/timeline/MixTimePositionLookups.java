package com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.model.b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import hwc.b;
import java.lang.Math;
import com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import java.lang.Double;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups$b;
import android.widget.FrameLayout;
import hwc.a;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups$a;
import com.yxcorp.gifshow.v3.mixed.timeline.a;
import java.util.Comparator;
import java.util.Collections;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import java.util.Iterator;
import faa.a;
import q87.c;
import yl8.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class MixTimePositionLookups extends DefaultObservableAndSyncable	// class@00155e
{
    public List mLookups;
    public static final int b;

    public void MixTimePositionLookups(){
       super();
       this.mLookups = Lists.b();
    }
    public void refresh(MixTimeline p0){
       boolean b;
       int i2;
       double d2;
       int this;
       int i3;
       MixTimePositionLookups$b uob2;
       Object obj = this;
       MixTimePositionLookups$b obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MixTimePositionLookups.class, "1")) {
          return;
       }
       obj.mLookups.clear();
       MixTimeline i = obj1.i;
       double mCostTime = obj1.b.c.getMCostTime();
       double d = (double)Math.max(1, b.b(mCostTime));
       int i1 = 0;
       double d1 = 0;
       while (i1 < i.size()) {
          b = (!i1)? true: false;
          i2 = i.size() - 1;
          boolean b1 = (i1 == i2)? true: false;
          Object obj2 = i.get(i1);
          if (!PatchProxy.isSupport(MixTimePositionLookups.class) || !PatchProxy.applyVoidFourRefs(obj2, Double.valueOf(d), Boolean.valueOf(b), Boolean.valueOf(b1), this, MixTimePositionLookups.class, "2")) {
             d2 = (b)? d1: d;
             if (!b1) {
                d1 = d;
             }
             this = a.h;
             i3 = obj2.getLeft() + this;
             double d3 = (double)i3 + d2;
             i2 = obj2.getRight() - this;
             double d4 = (double)i2 - d1;
             MixTimePositionLookups$b uob = new MixTimePositionLookups$b(d3, d4, null);
             obj.mLookups.add(v2);
          }
          i1 = i1 + 1;
       }
       i2 = obj.mLookups.size();
       int i4 = 0;
       int i5 = i2 - 1;
       while (i4 < i5) {
          MixTimePositionLookups$b uob1 = obj.mLookups.get(i4);
          i4 = i4 + 1;
          uob2 = obj.mLookups.get(i4);
          if (PatchProxy.applyVoidTwoRefs(uob1, uob2, obj, MixTimePositionLookups.class, "3")) {
             continue ;
          }
          MixTimePositionLookups$b uob3 = new MixTimePositionLookups$b(uob1.d, uob2.c, null);
          obj.mLookups.add(v4);
       }
       Collections.sort(obj.mLookups, a.b);
       d2 = d1;
       i5 = 0;
       i3 = 0;
       while (i5 < i.size()) {
          int i6 = i3 + 1;
          uob2 = obj.mLookups.get(i3);
          MixVideoTrack data = i.get(i5).getData();
          if (i5) {
             int i7 = i.size() - 1;
             if (i5 != i7) {
                d = 2.00f * mCostTime;
             label_0112 :
                d = data.getDurationIgnoreSpeed() - d;
                uob2.b(d2, d);
                obj1 = uob2.b;
                i3 = i.size() - 1;
                if (i5 < i3) {
                   this = i6 + 1;
                   uob2 = obj.mLookups.get(i6);
                   uob2.b(obj1, mCostTime);
                   obj1 = uob2.b;
                   i3 = this;
                }else {
                   i3 = i6;
                }
                i5 = i5 + 1;
             }
          }
          d = mCostTime;
          goto label_0112 ;
       }
       Iterator iterator = obj.mLookups.iterator();
       while (iterator.hasNext()) {
          Object[] objArray = new Object[0];
          a.D().w("MixImport", iterator.next().toString(), objArray);
       }
       this.notifyChanged();
       return;
    }
    public void sync(MixTimePositionLookups p0){
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public double timeToX(double p0){
       Iterator obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(MixTimePositionLookups.class)) {
          obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, MixTimePositionLookups.class, "4");
          if (obj != patchProxyRe) {
             return obj.doubleValue();
          }
       }
       obj = this.mLookups.iterator();
       while (true) {
          boolean b = true;
          if (obj.hasNext()) {
             MixTimePositionLookups$b uob = obj.next();
             if (uob.a - p0 > 0 || uob.b - p0 <= 0) {
                b = false;
             }
             if (b) {
                MixTimePositionLookups$b uob1 = MixTimePositionLookups$b.class;
                if (PatchProxy.isSupport(uob1)) {
                   Object obj1 = PatchProxy.applyOneRefs(Double.valueOf(p0), uob, uob1, "2");
                   if (obj1 != patchProxyRe) {
                      p0 = obj1.doubleValue();
                      break ;
                   }
                }
                p0 = MixTimePositionLookups$b.a(uob.a, uob.c, uob.b, uob.d, p0);
                break ;
             }
          }else if(this.mLookups.size() >= b){
             MixTimePositionLookups tmLookups = this.mLookups;
             if (p0 - tmLookups.get((tmLookups.size() - b)).b >= 0) {
                MixTimePositionLookups tmLookups1 = this.mLookups;
                return tmLookups1.get((tmLookups1.size() - b)).d;
             }
          }
          return 0;
       }
       return p0;
    }
    public double xToTime(double p0){
       Iterator obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(MixTimePositionLookups.class)) {
          obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, MixTimePositionLookups.class, "5");
          if (obj != patchProxyRe) {
             return obj.doubleValue();
          }
       }
       obj = this.mLookups.iterator();
       while (true) {
          boolean b = true;
          if (obj.hasNext()) {
             MixTimePositionLookups$b uob = obj.next();
             if (uob.c - p0 > 0 || uob.d - p0 <= 0) {
                b = false;
             }
             if (b) {
                MixTimePositionLookups$b uob1 = MixTimePositionLookups$b.class;
                if (PatchProxy.isSupport(uob1)) {
                   Object obj1 = PatchProxy.applyOneRefs(Double.valueOf(p0), uob, uob1, "1");
                   if (obj1 != patchProxyRe) {
                      p0 = obj1.doubleValue();
                      break ;
                   }
                }
                p0 = MixTimePositionLookups$b.a(uob.c, uob.a, uob.d, uob.b, p0);
                break ;
             }
          }else if(this.mLookups.size() >= b){
             MixTimePositionLookups tmLookups = this.mLookups;
             if (p0 - tmLookups.get((tmLookups.size() - b)).d >= 0) {
                MixTimePositionLookups tmLookups1 = this.mLookups;
                return tmLookups1.get((tmLookups1.size() - b)).b;
             }
          }
          return 0;
       }
       return p0;
    }
}
