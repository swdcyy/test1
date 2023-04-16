package com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import n3c.b;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;

public final class DefaultCardProcessor$f implements ViewTreeObserver$OnGlobalLayoutListener	// class@001349
{
    public final DefaultCardProcessor b;
    public final ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo c;

    public void DefaultCardProcessor$f(DefaultCardProcessor p0,ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DefaultCardProcessor$f.class, "1")) {
          return;
       }
       DefaultCardProcessor$f tb = this.b;
       tb.j(tb.h, this);
       tb = this.b;
       tb.j = objArray;
       if (tb.i != null) {
          return;
       }
       tb.i = true;
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo mGuideId = this.c.mGuideId;
       if (mGuideId == null) {
          mGuideId = "";
       }
       e.k(mGuideId, "backup");
       return;
    }
}
