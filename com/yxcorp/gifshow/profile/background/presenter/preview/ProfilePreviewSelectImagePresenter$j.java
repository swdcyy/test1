package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$j;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ProfilePreviewSelectImagePresenter$j implements DialogInterface$OnClickListener	// class@001287
{
    public final ProfilePreviewSelectImagePresenter b;

    public void ProfilePreviewSelectImagePresenter$j(ProfilePreviewSelectImagePresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(ProfilePreviewSelectImagePresenter$j.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ProfilePreviewSelectImagePresenter$j.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       if (p1 == 0x7f1043c7) {
          this.b.W8();
       }
       return;
    }
}
