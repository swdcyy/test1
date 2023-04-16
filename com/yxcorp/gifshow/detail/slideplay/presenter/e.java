package com.yxcorp.gifshow.detail.slideplay.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import h46.q;
import brd.t;
import t45.d;
import brd.z;
import e7a.q;
import erd.g;
import crd.b;
import java.util.List;
import h46.t;
import java.util.Iterator;
import h46.u;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.detail.slideplay.presenter.e$a;
import h46.r;
import com.yxcorp.gifshow.entity.QPreInfo;
import jkd.c;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;

public class e extends PresenterV2	// class@00185f
{
    public QPhoto p;
    public QPreInfo q;
    public a r;
    public GifshowActivity s;
    public static long t;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.s = this.getActivity();
       this.X7(RxBus.f.f(q.class).observeOn(d.a).subscribe(new q(this)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       Iterator iterator = t.c().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void P8(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SourcePhotoDownload", "开始触发下载 "+p0, objArray);
       e$a uoa = new e$a(this);
       Iterator iterator = t.a().iterator();
       do {
       } while (!iterator.hasNext() || iterator.next().a(this.s, p0, this.q, uoa));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.s8(QPreInfo.class);
       this.r = this.s8(a.class);
       return;
    }
}
