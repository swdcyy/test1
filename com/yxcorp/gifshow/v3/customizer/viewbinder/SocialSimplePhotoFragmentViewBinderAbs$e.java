package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import androidx.fragment.app.FragmentActivity;
import brd.t;
import com.kwai.moved.components.util.d;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e$a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e$b;
import erd.g;
import crd.b;

public final class SocialSimplePhotoFragmentViewBinderAbs$e extends m	// class@000d7b
{
    public final SocialSimplePhotoFragmentViewBinderAbs c;

    public void SocialSimplePhotoFragmentViewBinderAbs$e(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$e.class, "1")) {
          return;
       }
       SocialSimplePhotoFragmentViewBinderAbs$a j1 = SocialSimplePhotoFragmentViewBinderAbs.J1;
       Objects.requireNonNull(j1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, j1, SocialSimplePhotoFragmentViewBinderAbs$a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SAVE_ALBUM";
          u1.B(new ClickMetaData().setElementPackage(uElementPack).setType(1));
       }
       EditDecorationContainerViewV2 uEditDecorat = this.c.E();
       if (uEditDecorat != null) {
          uEditDecorat.R();
       }
       String str = "android.permission.WRITE_EXTERNAL_STORAGE";
       if (!PermissionUtils.a(SocialSimplePhotoFragmentViewBinderAbs.t0(this.c), str)) {
          d.a(SocialSimplePhotoFragmentViewBinderAbs.t0(this.c), R.string.arg_RES_7f100178, str).subscribe(new SocialSimplePhotoFragmentViewBinderAbs$e$a(this), SocialSimplePhotoFragmentViewBinderAbs$e$b.b);
       }else {
          SocialSimplePhotoFragmentViewBinderAbs.I0(this.c, false, false, 3, objArray);
       }
       return;
    }
}
