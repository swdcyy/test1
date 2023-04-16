package com.kwai.component.photo.detail.slide.presenter.c$a;
import qvb.q;
import com.kwai.component.photo.detail.slide.presenter.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import qvb.p;
import java.util.List;
import qvb.i;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Runnable;

public class c$a implements q	// class@000a94
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       int i = 0;
       if (p0) {
          c$a tb = this.b;
          tb.r = true;
          c p = tb.p;
          if (p != null) {
             p.setVisibility(i);
          }
          this.b.q.setVisibility(8);
       }else {
          p0.r = i;
       }
       ExceptionHandler.handleException(a.B, p1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, c$a.class, "2")) {
          return;
       }
       if (p0) {
          this.b.q.setVisibility(0);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c p;
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       c$a tb = this.b;
       c c = tb.C;
       if (c != null && (tb.r != null && !q.f(c.getItems()))) {
          tb = this.b;
          tb.u.mPhoto = tb.C.getItem(0);
          this.b.v.run();
       }
    label_0043 :
       if (p0) {
          p = this.b.p;
          if (p != null) {
             p.setVisibility(8);
          }
          this.b.q.setVisibility(8);
       }
       p.r = false;
       return;
    }
}
