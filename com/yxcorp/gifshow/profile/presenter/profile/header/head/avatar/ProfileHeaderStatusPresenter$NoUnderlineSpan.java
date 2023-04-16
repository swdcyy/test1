package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$NoUnderlineSpan;
import android.text.style.UnderlineSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ProfileHeaderStatusPresenter$NoUnderlineSpan extends UnderlineSpan	// class@0014d1
{

    public void ProfileHeaderStatusPresenter$NoUnderlineSpan(){
       super();
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter$NoUnderlineSpan.class, "1")) {
          return;
       }
       a.p(p0, "ds");
       p0.setColor(p0.linkColor);
       p0.setUnderlineText(false);
       return;
    }
}
