package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSlidePlayRecordPresenter$mAttachChangedListener$2$a;
import qw6.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSlidePlayRecordPresenter$mAttachChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSlidePlayRecordPresenter;
import sy6.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class NasaSlidePlayRecordPresenter$mAttachChangedListener$2$a implements a	// class@0018bc
{
    public final NasaSlidePlayRecordPresenter$mAttachChangedListener$2 b;

    public void NasaSlidePlayRecordPresenter$mAttachChangedListener$2$a(NasaSlidePlayRecordPresenter$mAttachChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public void H2(){
       NasaSlidePlayRecordPresenter$mAttachChangedListener$2 this$02;
       if (PatchProxy.applyVoid(null, this, NasaSlidePlayRecordPresenter$mAttachChangedListener$2$a.class, "1")) {
          return;
       }
       int i = NasaSlidePlayRecordPresenter.P8(this.b.this$0).j();
       NasaSlidePlayRecordPresenter$mAttachChangedListener$2 this$0 = this.b.this$0;
       if (this$0.u == i) {
          return;
       }
       this$0.u = i;
       i = NasaSlidePlayRecordPresenter.P8(this$0).z();
       if (i) {
          if (i != 2) {
             NasaSlidePlayRecordPresenter$mAttachChangedListener$2 this$01 = this.b.this$0;
             this$01.r = this$01.r + 1;
             Log.b("NasaSlidePlayRecordPresenter", "didAppear: up "+i);
          }else {
             this$02 = this.b.this$0;
             this$02.s = this$02.s + 1;
             Log.b("NasaSlidePlayRecordPresenter", "didAppear: down");
          }
       }else {
          this$02 = this.b.this$0;
          this$02.t = this$02.t + 1;
          Log.b("NasaSlidePlayRecordPresenter", "didAppear: click");
       }
       Log.b("NasaSlidePlayRecordPresenter", "didAppear:  down: "+this.b.this$0.s+" up:"+this.b.this$0.r+"  click:"+this.b.this$0.t);
       return;
    }
    public void N2(){
    }
    public void Q0(){
    }
    public void Q1(){
    }
}
