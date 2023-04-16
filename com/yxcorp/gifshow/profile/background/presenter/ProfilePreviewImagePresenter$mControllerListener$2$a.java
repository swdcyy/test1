package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$mControllerListener$2$a;
import ub.a;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$mControllerListener$2;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class ProfilePreviewImagePresenter$mControllerListener$2$a extends a	// class@001265
{
    public final ProfilePreviewImagePresenter$mControllerListener$2 b;

    public void ProfilePreviewImagePresenter$mControllerListener$2$a(ProfilePreviewImagePresenter$mControllerListener$2 p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ProfilePreviewImagePresenter$mControllerListener$2$a.class, "1")) {
       }else if(p1 != null){
          Integer integer = Integer.valueOf(p1.getWidth());
          int i = (integer.intValue() > 0)? 1: 0;
          Object[] objArray = null;
          if (!i) {
             integer = objArray;
          }
          if (integer != null) {
             integer.intValue();
             ViewGroup$LayoutParams layoutParams = ProfilePreviewImagePresenter.P8(this.b.this$0).getLayoutParams();
             if (layoutParams != null) {
                float f = (float)p1.getHeight() / (float)p1.getWidth();
                p1 = this.b.this$0;
                Objects.requireNonNull(p1);
                Number number = PatchProxy.apply(objArray, p1, ProfilePreviewImagePresenter.class, "1");
                if (number == PatchProxyResult.class) {
                   number = p1.t.getValue();
                }
                int i1 = number.intValue();
                layoutParams.width = i1;
                layoutParams.height = (int)((float)i1 * f);
                ProfilePreviewImagePresenter.P8(this.b.this$0).setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
