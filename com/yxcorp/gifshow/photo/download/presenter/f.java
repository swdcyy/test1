package com.yxcorp.gifshow.photo.download.presenter.f;
import gxb.q;
import java.lang.String;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.lang.Object;
import gaa.y;
import com.yxcorp.gifshow.photo.download.presenter.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import lxb.s;
import java.lang.Integer;
import java.io.File;
import com.yxcorp.gifshow.photo.download.utils.e;
import k2b.e0;
import kxb.e;
import com.yxcorp.gifshow.photo.download.presenter.e;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import gxb.v;
import crd.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Float;
import com.yxcorp.gifshow.photo.download.utils.c;
import fxb.a;
import e17.i;
import java.lang.Math;

public class f implements q	// class@000ee5
{
    public final String a;
    public final ObservableList b;
    public final QPhoto c;
    public final GifshowActivity d;
    public final DownloadPhotoInfoResponse e;
    public ProgressFragment f;
    public b g;
    public final y h;
    public StatModel i;
    public final b j;

    public void f(String p0,ObservableList p1,QPhoto p2,GifshowActivity p3,DownloadPhotoInfoResponse p4){
       super();
       this.h = y.b;
       this.j = new f$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(){
       StatModel statModel = this;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, statModel, uof, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, statModel, uof, "2")) {
          uof = statModel.a;
          if (uof == null) {
             String str = "downloadSinglePicFromDialog";
          }
          f uof1 = uof;
          StatModel statModel1 = new StatModel(uof1);
          statModel.i = statModel1;
          statModel1.mDownloadIndex = Integer.toString(statModel.b.get(0).a);
          File uFile = e.b(statModel.c);
          statModel.i.mLocalFile = uFile;
          e.o(statModel.c, 0, 0, 1, 0, 0, 1, 0, uof1, Integer.toString(statModel.b.get(0).a), statModel.d, "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON", false);
          statModel.g = t.fromCallable(new e(statModel, uFile)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), new v(statModel));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tf = this.f;
       if (tf != null && tf.isAdded()) {
          this.f.dismiss();
       }
       return;
    }
    public void c(ProgressFragment p0,float p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uof, "5")) {
          return;
       }
       if (p0 != null && p0.isAdded()) {
          f uof1 = 0x42c80000;
          if (!p1 - uof1) {
             f ti = this.i;
             if (ti != null) {
                c.f(this.c, 7, null, ti, this.d, "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON");
             }
             a.h(this.c, true, this.b.size(), false, 7);
             p0.Nh(100);
             p0.dismiss();
             i.a(R.style.arg_RES_7f11066a, 0x7f100aa9);
             return;
          }else if(p1 - (float)p0.uh() < 0){
             return;
          }else {
             p0.Fh((int)Math.min(p1, uof1), 100, true);
          }
       }
       return;
    }
}
