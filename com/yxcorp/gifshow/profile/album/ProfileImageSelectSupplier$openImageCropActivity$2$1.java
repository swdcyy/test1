package com.yxcorp.gifshow.profile.album.ProfileImageSelectSupplier$openImageCropActivity$2$1;
import msd.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.profile.album.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import android.content.Intent;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.CallableReference;

public final class ProfileImageSelectSupplier$openImageCropActivity$2$1 extends FunctionReferenceImpl implements q	// class@001210
{

    public void ProfileImageSelectSupplier$openImageCropActivity$2$1(a p0){
       super(3, p0, a.class, "onActivityCallback", "onActivityCallback\(IILandroid/content/Intent;\)V", 0);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0.intValue(), p1.intValue(), p2);
       return l1.a;
    }
    public final void invoke(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ProfileImageSelectSupplier$openImageCropActivity$2$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ProfileImageSelectSupplier$openImageCropActivity$2$1.class, "1")) {
          return;
       }
       this.receiver.d(p0, p1, p2);
       return;
    }
}
