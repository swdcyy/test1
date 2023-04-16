package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$i;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;

public final class MapRolePresenter$i implements Animator$AnimatorListener	// class@001caf
{
    public final MapRolePresenter a;

    public void MapRolePresenter$i(MapRolePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$i.class, "1")) {
          return;
       }
       MapRolePresenter.P8(this.a).setAlpha(100.00f);
       View[] viewArray = new View[]{this.a.H};
       n.Z(4, viewArray);
       return;
    }
    public void onAnimationEnd(Animator p0){
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
