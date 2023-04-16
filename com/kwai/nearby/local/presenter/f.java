package com.kwai.nearby.local.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import jb5.a;
import cda.i;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import dd7.o;
import java.lang.Runnable;

public class f extends PresenterV2	// class@000fb1
{
    public a p;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("PAGE_LIST");
       return;
    }
    public void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       if (p0.g != null) {
          return;
       }
       List items = this.p.getItems();
       Iterator iterator = items.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if ((p0.a).equals(qPhoto.getPhotoId())) {
             if (!items.indexOf(qPhoto) || qPhoto.isLiveStream()) {
                this.m8().postDelayed(new o(this, qPhoto), 500);
                break ;
             }else {
                break ;
             }
          }
       }
       return;
    }
}
