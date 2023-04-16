package com.yxcorp.gifshow.v3.editor.prettify.beauty.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.f;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.v3.editor.i;
import io.reactivex.subjects.PublishSubject;

public class h extends PresenterV2	// class@00115a
{
    public i p;
    public PublishSubject q;
    public BeautifyConfig r;
    public b s;
    public Handler t;
    public Runnable u;

    public void h(){
       super();
       this.t = new Handler(Looper.getMainLooper());
       this.u = new h$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.s = b9.c(this.s, new f(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.t.removeCallbacksAndMessages(null);
       h ts = this.s;
       if (ts != null && !ts.isDisposed()) {
          this.s.dispose();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_HELPER_CONTRACT");
       this.q = this.r8("BEAUTY_UPDATE_PUBLISHER");
       return;
    }
}
