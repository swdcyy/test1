package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$i;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import kotlin.jvm.internal.a;

public final class SocialSimplePhotoFragmentViewBinderAbs$i extends DecorationContainerView$e	// class@000d7f
{
    public final SocialSimplePhotoFragmentViewBinderAbs a;

    public void SocialSimplePhotoFragmentViewBinderAbs$i(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.a = p0;
       super();
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$i.class, "1")) {
       }else {
          super.p(p0);
          EditDecorationContainerViewV2 uEditDecorat = this.a.E();
          a.m(uEditDecorat);
          if (!uEditDecorat.K0()) {
             this.a.L0(false);
          }
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$i.class, "2")) {
       }else {
          super.y(p0);
          EditDecorationContainerViewV2 uEditDecorat = this.a.E();
          a.m(uEditDecorat);
          if (!uEditDecorat.K0()) {
             this.a.L0(true);
          }
       }
       return;
    }
}
