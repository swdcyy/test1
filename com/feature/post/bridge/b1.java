package com.feature.post.bridge.b1;
import mg.r1;
import java.lang.String;
import p55.a;
import java.lang.Object;
import f55.g;
import com.feature.post.bridge.jsmodel.JsSaveImageParams;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Boolean;
import brd.t;
import com.feature.post.bridge.a1;
import erd.o;
import mg.p4;
import erd.r;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import com.feature.post.bridge.z0;
import mg.n4;
import mg.m4;
import erd.g;
import crd.b;

public class b1 extends r1	// class@00146d
{

    public void b1(){
       super();
    }
    public String d(){
       return "saveImage";
    }
    public void e(a p0,Object p1,g p2){
       Activity uActivity = this.c(p0);
       if (!this.f(uActivity)) {
          this.b(p2, 0x1e84a, "current page is finished");
       }else if(p1 == null || TextUtils.x(p1.base64String)){
          this.b(p2, 412, "");
       }else {
          Object[] objArray = new Object[0];
          l.D().w("SaveImageBridge", "SaveImage isRequestPermissionsWithCancelEvent: "+p1.isRequestPermissionsWithCancelEvent, objArray);
          t.just(Boolean.valueOf(PermissionUtils.a(uActivity, "android.permission.WRITE_EXTERNAL_STORAGE"))).flatMap(new a1("android.permission.WRITE_EXTERNAL_STORAGE", p1, uActivity)).filter(new p4(this, p2)).subscribeOn(a.c()).observeOn(b.c()).flatMap(new z0(p1, uActivity)).observeOn(a.c()).subscribe(new n4(this, p2), new m4(this, p2));
       }
       return;
    }
}
