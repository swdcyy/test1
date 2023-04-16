package com.yxcorp.gifshow.share.post.j;
import uf5.q$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import uf5.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import java.lang.Throwable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public class j implements q$a	// class@001c3e
{
    public final boolean a;
    public final GifshowActivity b;
    public final QPhoto c;

    public void j(boolean p0,GifshowActivity p1,QPhoto p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
       p.b(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       if (this.a != null) {
          ReEditAfterDeleteOperator.d.p(this.b, this.c);
       }
       return;
    }
    public void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (!TextUtils.x(p0.getMessage())) {
          i.d(R.style.arg_RES_7f11066a, p0.getMessage());
       }
       return;
    }
}
