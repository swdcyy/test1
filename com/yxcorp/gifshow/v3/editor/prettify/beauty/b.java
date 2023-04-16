package com.yxcorp.gifshow.v3.editor.prettify.beauty.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ssc.f;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.editor.i;
import io.reactivex.subjects.PublishSubject;

public class b extends PresenterV2	// class@001150
{
    public i p;
    public PublishSubject q;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.X7(this.q.debounce(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(this), a.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_HELPER_CONTRACT");
       this.q = this.r8("BEAUTY_UPDATE_PUBLISHER");
       return;
    }
}
