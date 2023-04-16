package com.yxcorp.gifshow.detail.common.information.subscribeauthor.f$a;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class f$a extends y0	// class@00145b
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       f$a ta = this.a;
       if (ta.m != null) {
          ta.t.setManualHideSubscribeAuthor(true);
          this.a.b0();
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       if (!this.a.t.isLongPhotos() && (this.a.t.isAtlasPhotos() || this.a.t.isSinglePhoto())) {
          this.a.o0();
       }
       return;
    }
}
