package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$a;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class ProfilePreviewSelectImagePresenter$a implements View$OnLongClickListener	// class@00127c
{
    public final ProfilePreviewSelectImagePresenter b;

    public void ProfilePreviewSelectImagePresenter$a(ProfilePreviewSelectImagePresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ProfilePreviewSelectImagePresenter$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.X8();
       return true;
    }
}
