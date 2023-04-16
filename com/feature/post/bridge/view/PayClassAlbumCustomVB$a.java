package com.feature.post.bridge.view.PayClassAlbumCustomVB$a;
import android.view.View$OnClickListener;
import com.feature.post.bridge.view.PayClassAlbumCustomVB;
import androidx.lifecycle.ViewModel;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import q79.d;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;

public final class PayClassAlbumCustomVB$a implements View$OnClickListener	// class@0014d8
{
    public final PayClassAlbumCustomVB b;
    public final ViewModel c;

    public void PayClassAlbumCustomVB$a(PayClassAlbumCustomVB p0,ViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CARD_QUES_PHOTO_SEND";
       ClientContent$ContentPackage uContentPack = null;
       u1.u(1, uElementPack, uContentPack);
       PayClassAlbumCustomVB$a tc = this.c;
       if (!tc instanceof d) {
       }else {
          uContentPack = tc;
       }
       if (uContentPack != null) {
          uContentPack.p0(this.b.j());
       }
       return;
    }
}
