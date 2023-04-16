package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$13;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Object;

public final class AdAvatarElement$onBind$13 extends Lambda implements a	// class@00171d
{
    public final AdAvatarElement this$0;

    public void AdAvatarElement$onBind$13(AdAvatarElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final QPhoto invoke(){
       AdAvatarElement j = this.this$0.J;
       AvatarInfoResponse mPhoto = (j != null)? j.mPhoto: null;
       return mPhoto;
    }
    public Object invoke(){
       return this.invoke();
    }
}
