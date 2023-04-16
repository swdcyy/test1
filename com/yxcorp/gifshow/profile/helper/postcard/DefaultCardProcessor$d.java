package com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import n3c.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class DefaultCardProcessor$d implements View$OnClickListener	// class@001347
{
    public final DefaultCardProcessor b;
    public final ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo c;

    public void DefaultCardProcessor$d(DefaultCardProcessor p0,ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCardProcessor$d.class, "1")) {
          return;
       }
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo mGuideId = this.c.mGuideId;
       if (mGuideId == null) {
          mGuideId = "";
       }
       e.j(mGuideId, "backup");
       e.l(this.b.b().getActivity(), this.c.mScheme);
       return;
    }
}
