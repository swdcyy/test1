package com.yxcorp.gifshow.photo.download.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import e17.i;
import java.util.Collection;
import ekd.q;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import lxb.s;
import com.yxcorp.gifshow.photo.download.presenter.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.presenter.a;
import gxb.q;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.photo.download.presenter.b$a;
import android.view.View$OnClickListener;
import androidx.fragment.app.DialogFragment;

public class b extends PresenterV2	// class@000ede
{
    public int p;
    public TextView q;
    public ObservableList r;
    public DownloadPhotoInfoResponse s;
    public String t;
    public QPhoto u;
    public DialogFragment v;

    public void b(){
       super();
       this.p = 1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       int i = (this.s.mNotNeedWaterMark == null)? 1: 3;
       this.p = i;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (!p0.C(a.b())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          return;
       }else if(q.f(this.r)){
          return;
       }else if(this.r.size() == 1 && this.r.get(0).d == null){
          f uof = new f(this.t, this.r, this.u, this.getActivity(), this.s);
       }else {
          a uoa = new a(this.t, this.r, this.u, this.getActivity(), this.s);
       }
       v0.a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.tv_save_download_pic_dialog);
       this.q = textView;
       textView.setOnClickListener(new b$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.r8("DOWNLOAD_PHOTO");
       this.t = this.r8("DOWNLOAD_SOURCE");
       this.r = this.r8("SELECTED_PIC_TARGETS");
       this.s = this.r8("DOWNLOAD_PHOTO_INFO_RESPONSE");
       this.v = this.r8("DOWNLOAD_DIALOG_FRAGMENT");
       return;
    }
}
