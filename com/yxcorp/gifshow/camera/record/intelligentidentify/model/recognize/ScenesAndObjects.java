package com.yxcorp.gifshow.camera.record.intelligentidentify.model.recognize.ScenesAndObjects;
import java.lang.Object;
import java.util.List;
import zr4.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import td9.b;
import zr4.c;

public class ScenesAndObjects	// class@000e02
{
    public List mObjects;
    public List mQuality;
    public List mScenes;
    public boolean mValid;

    public void ScenesAndObjects(){
       super();
    }
    public final a[] a(List p0){
       a[] obj = PatchProxy.applyOneRefs(p0, this, ScenesAndObjects.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.size()) {
          return null;
       }
       obj = new a[p0.size()];
       for (int i = 0; i < p0.size(); i = i + 1) {
          b uob = p0.get(i);
          a uoa = new a();
          if (p0.get(i).mType != null) {
             c uoc = new c();
             uoa.a = uoc;
             uoc.a = uob.mType;
             uoc.b = uob.mConfidence;
             b mSubInfo = uob.mSubInfo;
             if (mSubInfo != null && mSubInfo.size()) {
                c[] uocArray = new c[uob.mSubInfo.size()];
                uoa.b = uocArray;
                for (int i1 = 0; i1 < uob.mSubInfo.size(); i1 = i1 + 1) {
                   uoa.b[i1] = new c();
                   uoa.b[i1].a = uob.mSubInfo.get(i1).mType;
                   uoa.b[i1].b = uob.mSubInfo.get(i1).mConfidence;
                }
             }
          }
          obj[i] = uoa;
       }
       return obj;
    }
}
