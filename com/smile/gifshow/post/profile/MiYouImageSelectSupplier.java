package com.smile.gifshow.post.profile.MiYouImageSelectSupplier;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import com.smile.gifshow.post.profile.MiYouImageSelectSupplier$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.tbruyelle.rxpermissions2.g;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import n3d.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.smile.gifshow.post.profile.ProfileUpdatePostImageCropActivity;
import android.content.Context;
import java.lang.Class;
import com.smile.gifshow.post.profile.MiYouImageSelectSupplier$openImageCropActivity$3;
import xm8.e;
import msd.q;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import w69.i;
import brd.t;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import com.smile.gifshow.post.profile.MiYouImageSelectSupplier$b;
import erd.o;

public final class MiYouImageSelectSupplier extends ImageSelectSupplier	// class@000c59
{
    public String r;
    public String s;
    public RectInfo t;
    public RectInfo u;
    public int v;
    public static final MiYouImageSelectSupplier$a w;

    static {
       MiYouImageSelectSupplier.w = new MiYouImageSelectSupplier$a(null);
    }
    public void MiYouImageSelectSupplier(GifshowActivity p0,g p1,File p2){
       a.p(p0, "activity");
       a.p(p1, "rxPermissions");
       super(p0, p1, p2);
       this.v = -1;
    }
    public void d(int p0,int p1,Intent p2){
       switch (p0){
           case 768:
             super.d(p0, p1, p2);
             break;
           case 769:
             if (!p1) {
                MiYouImageSelectSupplier tv = this.v;
                if (tv == 1) {
                   this.m.finish();
                   return;
                }else if(tv == null){
                   return;
                }
             }
             super.d(p0, p1, p2);
             break;
           case 770:
             super.d(p0, p1, p2);
             break;
           default:
             super.d(p0, p1, p2);
       }
       return;
    }
    public void e(GifshowActivity p0,Uri p1,Bundle p2,int p3,a p4){
       a.p(p0, "activity");
       a.p(p4, "callback");
       ImageSelectSupplier te = this.e;
       int value = (te != null)? te.getValue(): 0;
       p2.putInt("selectType", value);
       p2.putString("taskid", this.r);
       p2.putString("subbiz", this.s);
       MiYouImageSelectSupplier tt = this.t;
       if (tt == null) {
          a.S("mBigRectInfo");
       }
       SerializableHook.putSerializable(p2, "big_rectinfo", tt);
       SerializableHook.putSerializable(p2, "small_rectinfo", this.u);
       p2.putBoolean("out_crop_rect", true);
       Intent intent = new Intent(p0, ProfileUpdatePostImageCropActivity.class);
       intent.setData(p1);
       intent.putExtras(p2);
       p0.t1(intent, p3, new e(new MiYouImageSelectSupplier$openImageCropActivity$3(this)));
       if (this.v == true) {
          p0.finish();
       }
       return;
    }
    public t f(i p0,ImageSelectSupplier$ImageSelectType p1){
       t ot = t.just(ImageSelectSupplier$Type.GALLERY).flatMap(new MiYouImageSelectSupplier$b(this, p0, p1));
       a.o(ot, "Observable.just\(Type.GAL¡­          }\n            }");
       return ot;
    }
}
