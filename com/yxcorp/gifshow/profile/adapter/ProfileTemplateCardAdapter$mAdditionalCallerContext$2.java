package com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter$mAdditionalCallerContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import ekd.j;

public final class ProfileTemplateCardAdapter$mAdditionalCallerContext$2 extends Lambda implements a	// class@001204
{
    public final ProfileTemplateCardAdapter this$0;

    public void ProfileTemplateCardAdapter$mAdditionalCallerContext$2(ProfileTemplateCardAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ArrayList invoke(){
       ProfileTemplateCardAdapter$mAdditionalCallerContext$2 tthis$0;
       ProfileTemplateCardAdapter$mAdditionalCallerContext$2 tthis$01;
       Object[] obj = PatchProxy.apply(null, this, ProfileTemplateCardAdapter$mAdditionalCallerContext$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{tthis$0,new c("PROFILE_TEMPLATE_CARD_USER_ID", tthis$0.y),new c("PROFILE_TEMPLATE_CARD_SESSION_ID", Long.valueOf(tthis$0.z)),new c("PROFILE_TEMPLATE_CARD_FRAGMENT", tthis$01.A),new c("PROFILE_TEMPLATE_CARD_ENABLE_FUN_MAMAGER", Boolean.valueOf(tthis$01.C)),new c("PROFILE_STYLE", Integer.valueOf(this.this$0.B))};
       tthis$0 = this.this$0;
       tthis$01 = this.this$0;
       return j.a(obj);
    }
}
