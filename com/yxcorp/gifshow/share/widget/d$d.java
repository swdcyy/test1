package com.yxcorp.gifshow.share.widget.d$d;
import y8c.g;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import com.yxcorp.gifshow.share.widget.d$c;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.widget.d$b;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import ekd.p1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ric.o;
import ml8.c;

public class d$d extends g	// class@001d21
{
    public final String A;
    public final List w;
    public final PublishSubject x;
    public final QPhoto y;
    public final String z;

    public void d$d(List p0,QPhoto p1,PublishSubject p2,String p3,String p4){
       super();
       this.w = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.w.add(new d$c(iterator.next()));
       }
       this.y = p1;
       this.x = p2;
       this.z = p3;
       this.A = p4;
       return;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d$b uob = new d$b(p0, this.w, this.y, this.x, this.z, this.A);
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       d$d uod = d$d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new o());
       return new f(p1.h(p0, 0x7f0d0322), obj);
    }
}
