package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$j;
import exb.b;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$f;
import e17.i;
import java.lang.Float;

public class DownloadPicDialog$j implements b	// class@000f37
{
    public DownloadPicDialog$g a;
    public DownloadPicDialog$h b;
    public final boolean c;

    public void DownloadPicDialog$j(DownloadPicDialog$g p0,DownloadPicDialog$h p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p0.h();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DownloadPicDialog$j.class, "7")) {
          return;
       }
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       ta = this.b;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       return;
    }
    public void b(DownloadPhotoInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicDialog$j.class, "6")) {
          return;
       }
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       ta = this.b;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicDialog$j.class, "8")) {
          return;
       }
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       ta = this.b;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       return;
    }
    public boolean d(){
       boolean b = (this.a == null)? true: false;
       return b;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, DownloadPicDialog$j.class, "5")) {
          return;
       }
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       ta = this.b;
       if (ta != null) {
          Objects.requireNonNull(ta);
       }
       this.a = null;
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicDialog$j.class, "4")) {
          return;
       }
       DownloadPicDialog$j oj = null;
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          ta.onError(p0);
          oj = this.a.h();
          this.a = null;
       }
       ta = this.b;
       if (ta != null) {
          ta.onError(p0);
       }else if(oj){
          i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
       }
       this.a = null;
       return;
    }
    public void onProgress(float p0){
       DownloadPicDialog$j oj = DownloadPicDialog$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oj, "2")) {
          return;
       }
       oj = this.a;
       if (oj != null) {
          oj.onProgress(p0);
       }
       oj = this.b;
       if (oj != null) {
          oj.onProgress(p0);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, DownloadPicDialog$j.class, "1")) {
          return;
       }
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          ta.onStart();
       }
       ta = this.b;
       if (ta != null) {
          ta.onStart();
       }
       return;
    }
    public void onSuccess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DownloadPicDialog$j.class, "3")) {
          return;
       }
       DownloadPicDialog$j oj = null;
       DownloadPicDialog$j ta = this.a;
       if (ta != null) {
          ta.onSuccess();
          oj = this.a.h();
          this.a = objArray;
       }
       DownloadPicDialog$j tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }else if(oj){
          i.a(R.style.arg_RES_7f11066a, 0x7f1043d3);
       }
       return;
    }
}
