package com.yxcorp.gifshow.photo.download.widget.r;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$b;
import com.yxcorp.gifshow.photo.download.widget.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.lang.Integer;
import java.util.Map;
import java.lang.Math;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicButton;
import o56.a;
import android.app.Application;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.Button;

public class r extends DownloadPicDialog$h	// class@000f50
{
    public final DownloadPicDialog$b a;

    public void r(DownloadPicDialog$b p0){
       this.a = p0;
       super(null);
    }
    public void onProgress(float p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, or, "2")) {
          return;
       }
       int i = (int)(p0 * 100.00f);
       int i1 = 2;
       if (i >= this.a.a.L.get(Integer.valueOf(i1)).intValue() && i != 100) {
          DownloadPicDialog$b a = this.a.a;
          if (a.D == i1) {
             i = (float)i;
             a.u.setDownloadPicProgress(Math.round(i));
             this.a.a.u.setText((a.B.getString(R.string.arg_RES_7f100aa1)).replace("%1$s", Math.round(i)+""));
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       DownloadPicDialog$b a = this.a.a;
       if (a.D == 2) {
          a.u.setDownloadPicProgress(1);
          this.a.a.u.setText((a.B.getString(R.string.arg_RES_7f100aa1)).replace("%1$s", "1"));
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       DownloadPicDialog$b a = this.a.a;
       DownloadPicDialog d = a.D;
       if (d == 2) {
          a.Dh(d);
       }
       return;
    }
}
