package com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import k2b.e0;
import t3c.g;
import java.lang.Integer;
import java.util.Objects;
import kotlin.jvm.internal.a;
import k2b.f3;

public class KrnUserInfoEditBridgeV2$a implements ImageSelectSupplier$b	// class@001361
{
    public final UserProfile b;
    public final KrnUserInfoEditBridgeV2 c;

    public void KrnUserInfoEditBridgeV2$a(KrnUserInfoEditBridgeV2 p0,UserProfile p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$a.class, "2")) {
          return;
       }
       KrnUserInfoEditBridgeV2$a tc = this.c;
       tc.mUserInfoEditLogger.d(tc.getCurrentActivity(), 3);
       return;
    }
    public void onClick(DialogInterface p0,int p1){
       KrnUserInfoEditBridgeV2$a tc;
       if (PatchProxy.isSupport(KrnUserInfoEditBridgeV2$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KrnUserInfoEditBridgeV2$a.class, "3")) {
          return;
       }
       if (p1 == 0x7f1010fe) {
          tc = this.c;
          tc.mUserInfoEditLogger.d(tc.getCurrentActivity(), 1);
       }else if(p1 == 0x7f1010ff){
          tc = this.c;
          tc.mUserInfoEditLogger.d(tc.getCurrentActivity(), 4);
       }else if(p1 == 0x7f103fb8){
          tc = this.c;
          tc.mUserInfoEditLogger.d(tc.getCurrentActivity(), 2);
          this.c.changeAvatar(this.b);
       }
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, KrnUserInfoEditBridgeV2$a.class, "1")) {
          return;
       }
       KrnUserInfoEditBridgeV2$a tc = this.c;
       KrnUserInfoEditBridgeV2 mUserInfoEdi = tc.mUserInfoEditLogger;
       e0 currentActiv = tc.getCurrentActivity();
       Objects.requireNonNull(mUserInfoEdi);
       if (!PatchProxy.applyVoidOneRefs(currentActiv, mUserInfoEdi, g.class, "9")) {
          a.p(currentActiv, "logPage");
          f3.l("3070116", "ADD_PICTURE_POPUP").h(currentActiv);
       }
       return;
    }
}
