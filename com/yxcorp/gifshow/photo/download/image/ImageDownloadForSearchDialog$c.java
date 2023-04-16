package com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog$c;
import com.yxcorp.gifshow.photo.download.image.c$a;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.photo.download.widget.ImageDownloadButton;
import o56.a;
import android.app.Application;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.Button;
import dxb.o;

public class ImageDownloadForSearchDialog$c implements c$a	// class@000ed1
{
    public final ImageDownloadForSearchDialog a;

    public void ImageDownloadForSearchDialog$c(ImageDownloadForSearchDialog p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       ImageDownloadForSearchDialog$c uoc = ImageDownloadForSearchDialog$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.t.setStatus(p0);
       if (p0 != -2) {
          if (p0 != -1) {
             if (p0 != 100) {
                this.a.t.setText((a.B.getString(R.string.arg_RES_7f100aa1)).replace("%1$s", p0+""));
             }else {
                this.a.t.setText(R.string.arg_RES_7f100a9e);
             }
          }else if(this.a.q.b()){
             this.a.t.setText(R.string.arg_RES_7f100aaa);
          }else {
             this.a.t.setText(R.string.arg_RES_7f100aa4);
          }
       }else {
          this.a.t.setText(R.string.arg_RES_7f100aa3);
       }
       return;
    }
}
