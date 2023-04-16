package com.yxcorp.gifshow.ad.detail.presenter.log.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import y09.f;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;

public class b extends PresenterV2	// class@00165f
{
    public ViewGroup p;
    public QPhoto q;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4") && this.q.isAd()) {
          this.p.setOnTouchListener(new f(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0923);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       return;
    }
}
