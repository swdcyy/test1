package com.yxcorp.gifshow.detail.presenter.e$a;
import qw6.b;
import com.yxcorp.gifshow.detail.presenter.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import tkd.b;
import tkd.d;
import ayb.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class e$a extends b	// class@0016d4
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       PhotoDetailLogger photoDetailL = this.b.v.get();
       if (photoDetailL != null) {
          if (this.b.p != null && TextUtils.n(d.a(-908290672).Iy(), this.b.p.getPhotoId())) {
             photoDetailL.putBizParam("from_auto_play", String.valueOf(1));
          }else {
             photoDetailL.putBizParam("from_auto_play", String.valueOf(0));
          }
       }
       return;
    }
}
