package com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import kotlin.jvm.internal.a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class MockViewPresenter$a implements Runnable	// class@0011d1
{
    public final MockViewPresenter b;

    public void MockViewPresenter$a(MockViewPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MockViewPresenter$a.class, "1")) {
          return;
       }
       MockViewPresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, MockViewPresenter.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UPLOAD_PHOTO_LOADING";
          MockViewPresenter p = tb.p;
          if (p == null) {
             a.S("mFragment");
          }
          Object[] objArray = (!p instanceof e0)? null: p;
          u1.D0(null, objArray, 7, uElementPack, null, null);
       }
       return;
    }
}
