package com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import android.content.Context;
import java.io.File;
import z79.h;
import com.kwai.robust.PatchProxyResult;
import ekd.w0;
import android.os.Parcelable;
import android.graphics.Bitmap$CompressFormat;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment$Type;
import gp.a;
import q87.c;
import com.yxcorp.gifshow.util.j;
import w69.k$a;
import android.content.res.Resources;
import w69.k;
import rkd.b;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivityTablet;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import java.lang.Integer;
import g79.a;
import w69.l;
import java.lang.NullPointerException;
import java.lang.Throwable;
import c79.a;
import io.reactivex.subjects.PublishSubject;

public class RxImageSupplierFragment extends Fragment	// class@001b62
{
    public PublishSubject b;
    public h c;
    public RxImageSupplierFragment$Type d;

    public void RxImageSupplierFragment(){
       super();
    }
    public final void a(Uri p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RxImageSupplierFragment.class, "3")) {
          return;
       }
       Intent intent = new Intent(this.getActivity(), ImageCropGifshowActivity.class);
       intent.setData(p0);
       if (p1 == null) {
          File uFile = this.c.c();
          p1 = PatchProxy.applyOneRefs(uFile, this, RxImageSupplierFragment.class, "4");
          if (p1 != PatchProxyResult.class) {
          }else {
             p1 = new Bundle();
             p1.putString("crop", "true");
             p1.putInt("aspectX", 1);
             p1.putInt("aspectY", 1);
             p1.putParcelable("output", w0.c(uFile));
             p1.putString("outputFormat", Bitmap$CompressFormat.PNG.toString());
             p1.putBoolean("return-data", false);
          }
       }
       intent.putExtras(p1);
       this.startActivityForResult(intent, 770);
       return;
    }
    public void b(h p0,RxImageSupplierFragment$Type p1){
       Intent intent;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RxImageSupplierFragment.class, "1")) {
          return;
       }
       this.c = p0;
       if (!p0.c().delete()) {
          Object[] objArray = new Object[0];
          a.C().t("RxImageSupplierFragment", "Delete original file failed.", objArray);
       }
       this.d = p1;
       if (p1 == RxImageSupplierFragment$Type.CAMERA) {
          intent = new Intent("android.media.action.IMAGE_CAPTURE");
          intent.putExtra("output", j.b(p0.c()));
          this.startActivityForResult(intent, 768);
       }else {
          k$a uoa = new k$a();
          if (p0.b() > 0) {
             uoa.c(this.getResources().getString(p0.b()));
          }
          k ok = uoa.b();
          Activity activity = this.getActivity();
          AlbumGifshowActivityTablet uAlbumGifsho = (b.g())? AlbumGifshowActivityTablet.class: AlbumGifshowActivity.class;
          intent = new Intent(activity, uAlbumGifsho);
          b$a uoa1 = new b$a();
          uoa1.c(true);
          f$a uoa2 = new f$a();
          uoa2.g(a.c);
          AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
          uBuilder.p(true);
          intent.putExtras(new i$a().a(uoa1.a()).d(uoa2.a()).f(uBuilder.d()).m(ok).b().d());
          this.startActivityForResult(intent, 769);
       }
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       Uri data;
       if (PatchProxy.isSupport(RxImageSupplierFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, RxImageSupplierFragment.class, "2")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       RxImageSupplierFragment tc = this.c;
       if (tc == null) {
          a.c.c().onException(new NullPointerException("RxImageSupplierFragment mConfig is null"));
          return;
       }else {
          File uFile = tc.c();
          switch (p0){
              case 768:
                if (p1 == -1 && (uFile != null && uFile.exists())) {
                   a.a(w0.c(uFile));
                   this.a(w0.c(uFile), this.c.a());
                }
                break;
              case 769:
                if (p1 == -1) {
                   data = p2.getData();
                   if (data != null) {
                      a.a(data);
                   }
                   this.a(p2.getData(), this.c.a());
                }
                break;
              case 770:
                if (p1 == -1) {
                   if (uFile != null && uFile.exists()) {
                      data = w0.c(uFile);
                      if (data != null) {
                         a.a(data);
                      }
                   }
                   this.b.onNext(p2);
                   this.b.onComplete();
                }else if(!p1){
                   this.b(this.c, this.d);
                }
                break;
              default:
          }
       label_009d :
          return;
       }
    }
}
