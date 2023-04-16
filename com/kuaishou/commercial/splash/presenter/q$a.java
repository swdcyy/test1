package com.kuaishou.commercial.splash.presenter.q$a;
import gz.h2;
import com.kuaishou.commercial.splash.presenter.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import l66.c;
import ujc.b;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import java.lang.Integer;
import ujc.f;

public class q$a implements h2	// class@001601
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, q$a.class, "1")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(this.a.q);
       if (photoAdverti != null && photoAdverti.mHasFeedActionItemShown == null) {
          c.a().b(new b(this.a.q.mEntity, 1, 4));
          photoAdverti.mHasFeedActionItemShown = true;
       }
       return;
    }
    public void b(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "2")) {
          return;
       }
       int i = (p0 != null)? p0.intValue(): 0;
       c.a().b(new f(this.a.q.mEntity, 1, 18, Integer.valueOf(i).intValue()));
       return;
    }
}
