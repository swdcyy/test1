package com.yxcorp.gifshow.reminder.widget.d;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.reminder.widget.b;
import erd.r;
import com.yxcorp.gifshow.reminder.widget.c;
import ofc.e;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewParent;
import com.yxcorp.gifshow.reminder.widget.ReminderSlideView;

public final class d	// class@001b07
{
    public ReminderSlideView a;

    public void d(){
       super();
    }
    public void d(BaseFragment p0){
       super();
       p0.m().takeUntil(b.b).filter(c.b).subscribe(new e(this), e.b);
    }
    public void a(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "3")) {
          return;
       }
       d ta = this.a;
       this.a = null;
       if (ta != null && ta.b()) {
          boolean b = true;
          if (p0) {
             d obj = PatchProxy.applyOneRefs(ta, null, uod, "4");
             if (obj != PatchProxyResult.class) {
                obj = obj.booleanValue();
             }else {
                obj = ta;
                while (true) {
                   if (obj.getVisibility()) {
                   label_003e :
                      obj = false;
                      break ;
                   }else if(obj instanceof RecyclerView){
                      obj = true;
                      break ;
                   }else {
                      ViewParent parent = obj.getParent();
                      if (!parent instanceof View) {
                         goto label_003e ;
                      }else {
                      }
                   }
                }
             }
             if (obj) {
             label_0056 :
                ta.c(b);
             }
          }
          b = false;
          goto label_0056 ;
       }
       return;
    }
    public final void b(ReminderSlideView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (this.a == p0) {
          return;
       }
       this.a(true);
       this.a = p0;
       return;
    }
    public void c(ReminderSlideView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (p0 != this.a) {
          this.a(true);
       }
       return;
    }
}
