package com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$b;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;
import com.kwai.framework.model.user.UserProfile;
import android.app.Activity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import m4c.a;
import m4c.d;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity$a;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class KrnUserInfoEditBridgeV2$b implements ImageSelectSupplier$b	// class@001362
{
    public final UserProfile b;
    public final Activity c;
    public final KrnUserInfoEditBridgeV2 d;

    public void KrnUserInfoEditBridgeV2$b(KrnUserInfoEditBridgeV2 p0,UserProfile p1,Activity p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCancel(DialogInterface p0){
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(KrnUserInfoEditBridgeV2$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KrnUserInfoEditBridgeV2$b.class, "1")) {
          return;
       }
       if (p1 == 0x7f103fe9) {
          a uoa = d.b(this.b, 0);
          p1 = uoa.d();
          if (p1) {
             if (p1 == 3 && uoa.e() != null) {
                ProfileBackgroundPreviewActivity.z.b(this.c, uoa.e());
             }
          }else if(uoa.c() != null){
             ProfileBackgroundPreviewActivity.z.c(this.c, uoa.c().getAbsolutePath());
             return;
          }else if(uoa.e() != null && uoa.e().getCoverUrls() != null){
             ProfileBackgroundPreviewActivity.z.d(this.c, new ArrayList(uoa.e().getCoverUrls()));
             return;
          }else if(uoa.b() != null){
             ProfileBackgroundPreviewActivity.z.d(this.c, uoa.b());
          }
       }
       return;
    }
    public void show(){
    }
}
