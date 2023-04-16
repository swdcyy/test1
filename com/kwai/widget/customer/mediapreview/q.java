package com.kwai.widget.customer.mediapreview.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ix7.h;
import erd.g;
import crd.b;
import brd.t;
import ix7.g;
import android.view.View;
import ekd.m1;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import ix7.a0;

public abstract class q extends PresenterV2	// class@001140
{
    public View p;
    public int q;
    public PublishSubject r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;
    public a0 v;

    public void q(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       this.X7(this.r.subscribe(new h(this)));
       this.X7(this.s.subscribe(new g(this)));
       return;
    }
    public void P8(){
    }
    public void R8(){
    }
    public void S8(){
    }
    public void V8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2abd);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.q = this.r8("ADAPTER_POSITION").intValue();
       this.r = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION");
       this.s = this.r8("PREVIEW_MEDIA_PREVIEW_DRAG_STATE");
       this.t = this.r8("PREVIEW_MEDIA_PREVIEW_CONTAINERECT");
       this.u = this.r8("PREVIEW_MEDIA_OPTION_VIEW_CLICK");
       this.v = this.r8("PREVIEW_MEDIA_PAGE_INDEX");
       return;
    }
}
