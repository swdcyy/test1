package com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.content.DialogInterface;
import com.yxcorp.gifshow.util.rx.RxBus;
import bxb.a;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.presenter.c;
import com.yxcorp.gifshow.photo.download.presenter.b;

public class DownloadPicOptDialog extends BaseDialogFragment	// class@000f3b
{
    public DownloadPicOptDialog$a p;
    public PresenterV2 q;
    public QPhoto r;
    public String s;
    public int t;
    public DownloadPhotoInfoResponse u;
    public static final int v;

    public void DownloadPicOptDialog(){
       super();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicOptDialog.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       Window window = this.getDialog().getWindow();
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.gravity = 80;
       attributes.width = -1;
       attributes.height = -2;
       window.setAttributes(attributes);
       window.setWindowAnimations(R.style.arg_RES_7f1103bf);
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicOptDialog.class, "9")) {
          return;
       }
       super.onCancel(p0);
       RxBus.f.b(new a(3));
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadPicOptDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f110362);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(1);
       uDialog.setCancelable(1);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DownloadPicOptDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0320, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, DownloadPicOptDialog.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.q.destroy();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicOptDialog.class, "8")) {
          return;
       }
       super.onDismiss(p0);
       RxBus.f.b(new a(2));
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, DownloadPicOptDialog.class, "7")) {
          return;
       }
       super.onStart();
       RxBus.f.b(new a(1));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadPicOptDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       DownloadPicOptDialog$a uoa = PatchProxy.apply(objArray, this, DownloadPicOptDialog.class, "11");
       if (uoa != patchProxyRe) {
       }else {
          this.r = b.a(this.getArguments().getParcelable("DOWNLOAD_PHOTO"));
          this.u = b.a(this.getArguments().getParcelable("DOWNLOAD_PHOTO_INFO_RESPONSE"));
          this.s = this.getArguments().getString("DOWNLOAD_SOURCE");
          this.t = this.getArguments().getInt("DOWNLOAD_PIC_INDEX", -1);
          uoa = new DownloadPicOptDialog$a();
          uoa.b = this.r;
          uoa.c = this;
          uoa.e = this.u;
          uoa.f = this.s;
          uoa.g = this.t;
       }
       this.p = uoa;
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, DownloadPicOptDialog.class, "10");
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new c());
          presenterV2.U7(new b());
          PatchProxy.onMethodExit(DownloadPicOptDialog.class, "10");
       }
       this.q = presenterV2;
       presenterV2.f(p0);
       Object[] objArray1 = new Object[]{this.p};
       this.q.i(objArray1);
       return;
    }
}
