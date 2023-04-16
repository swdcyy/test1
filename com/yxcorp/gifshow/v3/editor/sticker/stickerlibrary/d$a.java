package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.d$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.d;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ProgressBar;
import x59.e$d;
import java.lang.Integer;
import java.lang.Throwable;
import e17.i;

public class d$a implements PostBaseResourceDownloadHelper$a	// class@00129d
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(PostBaseResourceDownloadHelper$InfoWithResource p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "3")) {
       }else {
          this.a.x.setVisibility(8);
          d$a ta = this.a;
          d v = ta.v;
          if (v != null && ta.t == v.a()) {
             this.a.R8();
          }
       }
       return;
    }
    public void b(PostBaseResourceDownloadHelper$InfoWithResource p0,int p1,int p2){
       Object obj = p0;
       if (!PatchProxy.isSupport(d$a.class) || !PatchProxy.applyVoidThreeRefs(obj, Integer.valueOf(p1), Integer.valueOf(p2), this, d$a.class, "1")) {
          if (p2 <= 0) {
             this.a.x.setProgress(0);
          }else {
             this.a.x.setProgress(((p1 / p2) * this.a.x.getMax()));
          }
       }
       return;
    }
    public void c(PostBaseResourceDownloadHelper$InfoWithResource p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "2")) {
       }else {
          this.a.x.setVisibility(8);
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e7);
       }
       return;
    }
}
