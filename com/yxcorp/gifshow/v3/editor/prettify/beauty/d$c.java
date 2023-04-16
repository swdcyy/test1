package com.yxcorp.gifshow.v3.editor.prettify.beauty.d$c;
import s0c.d;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import ooc.g1;
import s0c.c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import k2b.e0;
import com.yxcorp.gifshow.prettify.beauty.h;

public class d$c implements d	// class@001154
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void B0(BeautifyConfig p0,BeautyFilterItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$c.class, "4")) {
          return;
       }
       this.b.y = p0;
       if (p1.getItemId() == -1 || p1.getItemId() == -2) {
          d$c tb = this.b;
          tb.R8(tb.y);
          tb = this.b;
          tb.q.onNext(tb.y);
       }
       g1.k(16, "", "", "", p1.getLoggerName(), 1);
       return;
    }
    public void F(BeautifyConfig p0,BeautyFilterItem p1){
       c.e(this, p0, p1);
    }
    public void J(){
       c.i(this);
    }
    public void Z0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditBeautyPresenterV3", "beauty category selected, config: "+p0+" config:"+p0.toString(), objArray);
       d$c tb = this.b;
       tb.y = p0;
       tb.R8(p0);
       this.b.q.onNext(p0);
       p0 = p0.mId;
       if (p0 != -1) {
          i = p0;
       }
       g1.k(16, "", "", "", "preset_"+i, 1);
       return;
    }
    public void b1(BeautifyConfig p0,boolean p1){
       c.g(this, p0, p1);
    }
    public void p0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditBeautyPresenterV3", "beauty item list onSeekBarProgressChanged  config:"+p0.toString(), objArray);
       d$c tb = this.b;
       tb.y = p0;
       tb.R8(p0);
       d$c tb1 = this.b;
       tb1.q.onNext(tb1.y);
       return;
    }
    public void q0(BeautifyConfig p0,BeautifyConfig p1,BeautyFilterItem p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$c.class, "6")) {
          return;
       }
       d$c tb = this.b;
       tb.y = p0;
       tb.R8(p0);
       tb = this.b;
       tb.q.onNext(tb.y);
       if (p2 != null) {
          h.r(p0, p1, p2, this.b.x);
       }
       return;
    }
    public void w0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "2")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "beauty category onItemReSelect config:";
       d y = this.b.y;
       String str1 = (y != null)? y.toString(): "null";
       int i = 0;
       Object[] objArray = new Object[i];
       uoa.w("EditBeautyPresenterV3", str+str1, objArray);
       d y1 = this.b.y;
       if (y1 != null && y1.mId > null) {
          p0 = p0.mId;
          if (p0 != -1) {
             i = p0;
          }
          g1.k(16, "", "", "", "preset_"+i, 2);
       }
       return;
    }
    public void x1(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "3")) {
          return;
       }
       g1.k(16, "", "", "", "go_back", 1);
       return;
    }
}
