package com.yxcorp.gifshow.photo.download.presenter.a;
import gxb.q;
import java.lang.String;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.lang.Object;
import gaa.y;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fxb.b;
import java.lang.StringBuilder;
import lxb.s;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import lnc.a1;
import java.lang.CharSequence;
import gxb.h;
import android.view.View$OnClickListener;
import gxb.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import kxb.b;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.photo.download.utils.e;
import gxb.i;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import k2b.e0;
import crd.b;
import com.yxcorp.gifshow.photo.download.task.a0;
import java.util.List;
import java.lang.Integer;
import brd.t;
import gxb.f;
import erd.o;
import t45.d;
import brd.z;
import androidx.fragment.app.Fragment;
import gxb.e;
import java.lang.Iterable;
import gaa.g0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import gxb.c;
import gxb.d;
import gxb.b;
import erd.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.photo.download.presenter.a$a;
import kxb.e;
import java.lang.Number;
import java.lang.Float;
import fxb.a;
import e17.i;
import java.lang.Math;

public class a implements q	// class@000edc
{
    public final String a;
    public final ObservableList b;
    public final QPhoto c;
    public final GifshowActivity d;
    public final DownloadPhotoInfoResponse e;
    public ProgressFragment f;
    public int g;
    public final y h;
    public b i;
    public b j;
    public final List k;
    public final List l;

    public void a(String p0,ObservableList p1,QPhoto p2,GifshowActivity p3,DownloadPhotoInfoResponse p4){
       super();
       this.h = y.b;
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "download_pic";
       b.C().w(str, "图集批量下载"+this.b.size()+"第一张图片是不是长图"+this.b.get(i).d, objArray);
       if (!PatchProxy.applyVoid(null, this, uoa, "2")) {
          ProgressFragment progressFrag = PatchProxy.apply(null, this, uoa, "10");
          if (progressFrag != PatchProxyResult.class) {
          }else {
             progressFrag = new ProgressFragment();
             progressFrag.Eh(i, 100);
             progressFrag.setCancelable(i);
             progressFrag.Jh(a1.p(R.string.arg_RES_7f1001c7));
             progressFrag.Kh(true);
             progressFrag.Ch(R.drawable.arg_RES_7f08234f);
             progressFrag.Bh(new h(this));
             progressFrag.k0(new a(this));
             progressFrag.show(this.d.getSupportFragmentManager(), "runner");
          }
          this.f = progressFrag;
          String str1 = "downloadSingleLongPicFromDialog";
          if (b.a(this.c) && this.b.get(i).d != null) {
             Object[] objArray1 = new Object[i];
             b.C().w(str, "downloadPic: 长图下载", objArray1);
             if (!PatchProxy.applyVoid(null, this, uoa, "12")) {
                if (this.b.get(i).e != null) {
                   a ta = (!TextUtils.x(this.a))? this.a: str1;
                   this.g(ta);
                   if (!PatchProxy.applyVoid(null, this, uoa, "14")) {
                      if (!TextUtils.x(this.a)) {
                         str1 = this.a;
                      }
                      this.j = a0.h(this.c, e.b(this.c), (this.e.mNotNeedWaterMark ^ 0x01), new StatModel(str1), new i(this), this.d, false);
                   }
                }else {
                   this.g(str1);
                   this.e(this.b());
                }
             }
          }else if(this.b.size() == 1 && this.b.get(i).d != null){
             this.f(i);
          }else if(this.b.get(i).d != null){
             this.g = i;
             this.f(true);
          }else {
             this.g(str1);
             this.g = i;
             this.d();
          }
       }
    label_014e :
       return;
    }
    public List b(){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       while (i < this.b.size()) {
          s os = this.b.get(i);
          if (os.e == null) {
             a tl = this.l;
             if (PatchProxy.isSupport(a.class)) {
                ot = PatchProxy.applyTwoRefs(Integer.valueOf(i), os, this, a.class, "16");
                if (ot != patchProxyRe) {
                label_005a :
                   tl.add(ot);
                }
             }
             ot = t.just(Integer.valueOf(i)).map(new f(this, os)).subscribeOn(d.c).observeOn(d.a);
             goto label_005a ;
          }
          i = i + 1;
       }
       return this.l;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       a tf = this.f;
       if (tf != null && tf.isAdded()) {
          this.f.dismiss();
       }
       return;
    }
    public void d(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       uoa = PatchProxy.apply(objArray, this, uoa, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          for (s d = this.b.get(0).d; d < this.b.size(); d = d + 1) {
             this.k.add(t.just(Integer.valueOf(d)).map(new e(this)).subscribeOn(d.c).observeOn(d.a));
          }
          uoa = this.k;
       }
       this.i = t.fromIterable(uoa).concatMap(g0.b).subscribe(Functions.d(), new c(this));
       return;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       this.i = t.fromIterable(p0).concatMap(g0.b).subscribe(Functions.d(), new d(this), new b(this));
       return;
    }
    public final void f(boolean p0){
       String str;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = (!TextUtils.x(this.a))? this.a: "downloadSingleLongPicFromDialog";
       this.g(uoa);
       this.j = a0.h(this.c, e.b(this.c), (this.e.mNotNeedWaterMark ^ 0x01), new StatModel(uoa), new a$a(this, p0), this.d, false);
       return;
    }
    public final void g(String p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, a.class, "5")) {
          return;
       }
       e.k(obj.c, null, 0, 1, false, null, 1, null, p0, "", obj.d, "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON", obj.b.size());
       Object[] objArray = new Object[0];
       b.C().w("download_pic", "startDownloadTask: "+obj.b.size(), objArray);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       e.k(this.c, null, 0, 7, false, null, 1, null, "downloadSingleLongPicFromDialog", "", this.d, "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON", this.b.size());
       Object[] objArray = new Object[0];
       b.C().w("download_pic", "markTaskSuccess: "+this.b.size(), objArray);
       return;
    }
    public float i(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)this.g / (float)this.b.size());
    }
    public void j(ProgressFragment p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "9")) {
          return;
       }
       if (p0 != null && p0.isAdded()) {
          a uoa1 = 0x42c80000;
          if (p1 - uoa1 >= 0) {
             a.h(this.c, true, this.b.size(), false, 7);
             p0.Nh(100);
             p0.dismiss();
             i.a(R.style.arg_RES_7f11066a, 0x7f100aa9);
             return;
          }else if(p1 - (float)p0.uh() < 0){
             return;
          }else {
             p0.Fh((int)Math.min(p1, uoa1), 100, true);
          }
       }
       return;
    }
}
