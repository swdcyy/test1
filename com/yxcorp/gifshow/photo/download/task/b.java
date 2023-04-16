package com.yxcorp.gifshow.photo.download.task.b;
import ixb.z;
import fxb.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import jxb.i;
import wkd.b;
import zwb.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import com.yxcorp.gifshow.photo.download.utils.e;
import e17.i;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.photo.download.task.a;
import erd.g;
import crd.b;

public abstract class b implements z	// class@000eef
{
    public QPhoto b;
    public GifshowActivity c;
    public b d;
    public StatModel e;
    public DownloadPhotoInfoResponse f;
    public static final String g = "b";
    public static d h;

    static {
       b.h = new d();
    }
    public void b(GifshowActivity p0,QPhoto p1,StatModel p2,b p3){
       super();
       this.c = p0;
       this.b = p1;
       this.d = p3;
       this.e = p2;
       p3.c(this);
    }
    public GifshowActivity a(){
       return this.c;
    }
    public t b(){
       t obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e.mStartTime = System.currentTimeMillis();
       obj = i.d(this.b);
       if (obj != null) {
          return obj;
       }
       return b.a(-258426948).d(this.b.getPhotoId(), QCurrentUser.ME.getId(), this.b.getSource(), null, 0);
    }
    public QPhoto c(){
       return this.b;
    }
    public StatModel d(){
       return this.e;
    }
    public abstract void e();
    public void start(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (!this.b.isAllowPhotoDownload() && !e.d(this.b)) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100ecc);
          return;
       }else {
          a.j(new g(this.c), this.c, "android.permission.WRITE_EXTERNAL_STORAGE", false).observeOn(d.a).subscribe(new a(this));
          return;
       }
    }
}
