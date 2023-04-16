package clc.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import xl8.b;
import clc.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends PresenterV2	// class@0005c9
{
    public b p;
    public QPhoto q;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(this.p.c().subscribe(new b(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("MORE_TRENDING_LIST_SHOW_EVENT");
       this.q = this.q8(QPhoto.class);
       return;
    }
}
