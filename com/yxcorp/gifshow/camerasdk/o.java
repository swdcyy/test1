package com.yxcorp.gifshow.camerasdk.o;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor$OnFacesArrayListener;
import com.yxcorp.gifshow.camerasdk.p;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.camerasdk.models.FaceData;
import com.kwai.camerasdk.models.Gender;
import qi9.l1;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.camerasdk.models.Rect;
import qi9.m1;
import java.lang.System;
import com.kwai.camerasdk.models.FaceLandmark;
import com.kwai.camerasdk.models.Point;
import java.lang.Math;
import qi9.n1;

public final class o implements WesterosFrameAttributesDumpProcessor$OnFacesArrayListener	// class@001039
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void onFacesArray(List p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, p.class, "4")) {
       }else if(q.f(p0)){
          FaceData uFaceData = null;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             FaceData uFaceData1 = iterator.next();
             if (uFaceData1.getGender() != Gender.kGenderMale) {
                k1.o(new l1(tb));
             }else if(uFaceData == null || tb.a(uFaceData1.getRect()) - tb.a(uFaceData.getRect()) > 0){
                uFaceData = uFaceData1;
             }
          }
          k1.o(new m1(tb));
          if (tb.c != null && (uFaceData != null && (System.currentTimeMillis() - p.f) - 32 >= 0)) {
             p.f = System.currentTimeMillis();
             iterator = uFaceData.getLandmark().getPointsList().iterator();
             float f = Float.MAX_VALUE;
             float f1 = Float.MAX_VALUE;
             float f2 = Float.MIN_VALUE;
             float f3 = Float.MIN_VALUE;
             while (iterator.hasNext()) {
                Point point = iterator.next();
                f = Math.min(f, point.getX());
                f1 = Math.min(f1, point.getY());
                f2 = Math.max(f2, point.getX());
                f3 = Math.max(f3, point.getY());
             }
             n1 on1 = new n1(tb, f, f1, f2, f3);
             k1.o(iterator);
          }
       }
       return;
    }
}
