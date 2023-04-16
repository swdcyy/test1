package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class ProfilePreviewVideoStatusPresenter$d extends m	// class@00126c
{
    public final ProfilePreviewVideoStatusPresenter c;

    public void ProfilePreviewVideoStatusPresenter$d(ProfilePreviewVideoStatusPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewVideoStatusPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ProfilePreviewVideoStatusPresenter$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, ProfilePreviewVideoStatusPresenter.class, "8")) {
          tc.h9();
       }
       return;
    }
}
