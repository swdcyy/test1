package com.yxcorp.gifshow.v3.mixed.b;
import n26.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.FragmentActivity;
import m26.a;
import z36.d;
import g46.a;
import qvb.s;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import awc.a;
import brd.a0;
import java.lang.System;
import zvc.b;
import java.util.concurrent.Callable;

public class b implements a	// class@001547
{

    public void b(){
       super();
    }
    public String K6(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = j0.e(p0, "mix_video_tracks");
       if (list == null || list.size() != 1) {
          return "";
       }
       MixVideoTrack mixVideoTrac = list.get(0);
       if (mixVideoTrac.mType != 1) {
          return "";
       }
       return mixVideoTrac.mPath;
    }
    public boolean Uj(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return q.f(j0.e(p0, "mix_video_tracks"));
    }
    public Intent Uy(FragmentActivity p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.mIPageCallBack == null) {
          p1.mIPageCallBack = this.eD();
       }
       s.b().d(4, p1);
       return new Intent(p0, MixImporterActivity.class);
    }
    public List a4(Intent p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = j0.e(p0, "mix_video_tracks");
       obj = new ArrayList();
       if (list == null) {
          return obj;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().mMedia);
       }
       return obj;
    }
    public a eD(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public boolean isAvailable(){
       return true;
    }
    public a0 lY(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.y(new b(j0.e(p0, "mix_video_tracks"), System.currentTimeMillis()));
    }
}
