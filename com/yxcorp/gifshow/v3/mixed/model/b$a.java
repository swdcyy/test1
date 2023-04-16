package com.yxcorp.gifshow.v3.mixed.model.b$a;
import fwc.b;
import com.yxcorp.gifshow.v3.mixed.model.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustInfo;
import io.reactivex.subjects.PublishSubject;
import w46.b;
import java.lang.Double;
import java.lang.Boolean;

public class b$a implements b	// class@001557
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("MixedViewModel", "onTrackRotate\(\) called with: index = ["+p0+"], rotationDeg = ["+p1+"]", objArray);
       MixVideoTrack mixVideoTrac = this.a.a.get(p0);
       mixVideoTrac.mRotate = p1;
       this.a.k.setValue(mixVideoTrac);
       this.a.k.setValue(null);
       return;
    }
    public void b(MixFrameAdjustInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.a.t.setValue(p0);
       Object[] objArray = new Object[0];
       a.D().s("MixedViewModel", "onFrameRatioChanged\(\) called with: ratio = ["+p0.mVideoRatioPreset+"]", objArray);
       return;
    }
    public void c(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       String str = "MixedViewModel";
       int i = 0;
       if (p0 < 0 || p0 >= this.a.a.size()) {
          Object[] objArray = new Object[i];
          a.D().t(str, "onRemoveTrack: wrong index="+p0+" mTracks.size\(\)="+this.a.a.size(), objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().s(str, "onRemoveTrack\(\) index = ["+p0+"]", objArray1);
          MixVideoTrack mixVideoTrac = this.a.a.remove(p0);
          for (; i < this.a.a.size(); i = i + 1) {
             this.a.a.get(i).mIndex = i;
          }
          this.a.C0();
          this.a.s.onNext(new Object());
          this.a.j.setValue(mixVideoTrac);
          this.a.j.setValue(null);
          if (p0 >= this.a.a.size()) {
             p0 = this.a.a.size() - 1;
          }
          uoa = this.a;
          uoa.l.setValue(uoa.a.get(p0));
          return;
       }
    }
    public void d(int p0,double p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Double.valueOf(p1), this, uoa, "4")) {
          return;
       }
       p0.mSpeed = p1;
       this.a.m.setValue(Double.valueOf(p1));
       this.a.C0();
       this.a.i.setValue(Boolean.FALSE);
       this.a.r0();
       return;
    }
}
