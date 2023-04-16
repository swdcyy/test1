package com.kwai.tokenshare.localtoken.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import du7.f;
import com.kwai.robust.PatchProxyResult;
import com.kwai.tokenshare.localtoken.LocalTokenConfig;
import wkd.b;
import te6.b;
import android.net.Uri;
import java.io.File;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import du7.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.tokenshare.localtoken.LocalTokenModel;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.view.View;
import apd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import du7.c;
import android.view.View$OnClickListener;
import du7.d;
import du7.b;

public class a extends PresenterV2	// class@001926
{
    public KwaiImageView p;
    public LocalTokenModel q;
    public b r;

    public void a(){
       super();
    }
    public void E8(){
       String str = "3";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       LocalTokenConfig localTokenCo = PatchProxy.apply(null, null, f.class, str);
       if (localTokenCo != PatchProxyResult.class) {
       }else {
          f.a();
          localTokenCo = (f.a != null)? f.a.pictureUrl: null;
       }
       if (localTokenCo != null) {
          str = b.a(-1427269270).B(localTokenCo);
          Uri uri = (str == null)? Uri.parse(localTokenCo): Uri.fromFile(new File(str));
          this.p.A(uri, 0, 0);
       }
       a tq = this.q;
       if (!PatchProxy.applyVoidOneRefs(tq, null, e.class, "1")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 18;
          uElementPack.action2 = "LOCAL_TOKEN_DIALOG_SHOW";
          uElementPack.params = e.b(tq);
          showEvent.elementPackage = uElementPack;
          u1.z0(null, showEvent);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       KwaiImageView kwaiImageVie = j.b(p0, R.id.local_token_photo);
       this.p = kwaiImageVie;
       kwaiImageVie.setPlaceHolderImage(R.drawable.arg_RES_7f081059);
       j.a(p0, new c(this), R.id.local_token_close);
       j.a(p0, new d(this), R.id.local_token_photo);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(LocalTokenModel.class);
       this.r = this.q8(b.class);
       return;
    }
}
