package com.yxcorp.gifshow.v3.editor.prettify.makeup.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vsc.g;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.d;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.editor.i;
import io.reactivex.subjects.PublishSubject;

public class e extends PresenterV2	// class@001198
{
    public i p;
    public PublishSubject q;
    public Handler r;
    public Runnable s;
    public i t;

    public void e(){
       super();
       this.r = new Handler(Looper.getMainLooper());
       this.s = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.X7(this.q.subscribe(new g(this), d.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_HELPER_CONTRACT");
       this.q = this.r8("MAKEUP_UPDATE");
       return;
    }
}
