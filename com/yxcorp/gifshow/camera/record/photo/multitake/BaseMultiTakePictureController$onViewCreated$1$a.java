package com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$onViewCreated$1$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$onViewCreated$1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import lnc.s6;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import brd.t;
import com.kwai.moved.components.util.d;
import jg9.c;
import jg9.d;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.util.PostPermission;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import jg9.a;
import jg9.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class BaseMultiTakePictureController$onViewCreated$1$a implements View$OnClickListener	// class@000ebb
{
    public final BaseMultiTakePictureController$onViewCreated$1 b;

    public void BaseMultiTakePictureController$onViewCreated$1$a(BaseMultiTakePictureController$onViewCreated$1 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseMultiTakePictureController$onViewCreated$1$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       BaseMultiTakePictureController$onViewCreated$1 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       BaseMultiTakePictureController uBaseMultiTa = BaseMultiTakePictureController.class;
       if (!PatchProxy.isSupport(uBaseMultiTa) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this$0, uBaseMultiTa, "7")) {
          int i = 1;
          int i1 = this$0.c1() ^ i;
          Object[] objArray = new Object[0];
          a.D().w("BaseMultiTakePictureController", "onClickMultiTake "+i1, objArray);
          if (i1 && !PermissionUtils.a(this$0.e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
             if (!s6.x()) {
                if (!PatchProxy.applyVoid(null, this$0, uBaseMultiTa, "8")) {
                   this$0.Y1(d.b(new g(this$0.e), this$0.e, "android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new c(this$0), d.b));
                }
             }else if(PatchProxy.applyVoid(null, this$0, uBaseMultiTa, "9")){
                this$0.Y1(PostPermissionUtils.d(this$0.e, PostPermission.ALBUM).subscribe(new a(this$0), b.b));
             }
          }else {
             this$0.p2(i1, i, 0);
             CameraLogger uCameraLogge = CameraLogger.class;
             if (!PatchProxy.isSupport(uCameraLogge) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i1), null, uCameraLogge, "33")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 406;
                uElementPack.name = "enable_quick_shoot";
                int i2 = (i1)? 1: 2;
                uElementPack.status = i2;
                u1.u(i, uElementPack, null);
             }
          }
       }
       return;
    }
}
