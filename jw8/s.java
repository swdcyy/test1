package jw8.s;
import c35.b;
import android.view.View;
import jw8.a;
import jw8.r$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.viewbinder.IViewBinder;
import ypc.a;
import huc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import q87.c;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import jw8.s$a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import jw8.s$b;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.TextDownloadPayload;
import java.lang.Throwable;
import w46.b;
import e17.i;
import java.lang.Boolean;
import jw8.s$c;
import java.lang.Runnable;

public final class s extends b	// class@0029ce
{
    public final r$a b;
    public static final int c;

    public void s(View p0,a p1,r$a p2){
       a.p(p0, "itemView");
       a.p(p1, "vb");
       super(p0, p1);
       this.b = p2;
    }
    public final void b(a p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextBubbleVH", "addDownloadListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.b(), objArray);
       a uoa = this.a();
       if (uoa != null) {
          ImageView imageView = uoa.a();
          if (imageView != null) {
             imageView.setVisibility(0);
          }
       }
       uoa = this.a();
       if (uoa != null) {
          MagicFaceDownloadProgressBar magicFaceDow = uoa.b();
          if (magicFaceDow != null) {
             magicFaceDow.setVisibility(8);
          }
       }
       uoa = this.a();
       if (uoa != null) {
          KwaiImageView kwaiImageVie = uoa.c();
          if (kwaiImageVie != null) {
             kwaiImageVie.setOnClickListener(new s$a(this, p1, p0));
          }
       }
       return;
    }
    public final void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextBubbleVH", "addSelectListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.b(), objArray);
       a uoa = this.a();
       if (uoa != null) {
          FrameLayout uFrameLayout = uoa.e();
          if (uFrameLayout != null) {
             uFrameLayout.setVisibility(8);
          }
       }
       uoa = this.a();
       if (uoa != null) {
          KwaiImageView kwaiImageVie = uoa.c();
          if (kwaiImageVie != null) {
             kwaiImageVie.setOnClickListener(new s$b(this, p0));
          }
       }
       return;
    }
    public final void d(int p0,a p1,List p2,b p3){
       Object[] obj;
       boolean b;
       boolean b1;
       FrameLayout uFrameLayout;
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, s.class, "1")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "payloads");
       a.p(p3, "vmDelegate");
       a uoa = this.a();
       View$OnClickListener onClickListe = null;
       if (uoa != null) {
          KwaiImageView kwaiImageVie = uoa.c();
          if (kwaiImageVie != null) {
             kwaiImageVie.setOnClickListener(onClickListe);
          }
       }
       if (p2.isEmpty() ^ 1) {
          TextDownloadPayload pROGRESS = TextDownloadPayload.PROGRESS;
          obj = p2.get((p2.size() - 1));
          if (obj instanceof TextDownloadPayload) {
             onClickListe = obj;
          }
          b = (pROGRESS == onClickListe)? true: false;
          b1 = (TextDownloadPayload.DOWNLOAD_SUCCESS_WITH_SELECT == p2.get((p2.size() - 1)))? true: false;
          Object[] objArray = new Object[0];
          a.D().s("TextBubbleVH", "onlyUpdateProgress: "+b+" isDownloadSelect: "+b1, objArray);
       }else {
          b1 = false;
          b = false;
       }
       if (b) {
          this.e(p1);
          return;
       }else {
          obj = new Object[0];
          a.D().s("TextBubbleVH", p0+" bind "+p1.b(), obj);
          uoa = this.a();
          if (uoa != null) {
             uoa.f(p0, p1, this.b);
          }
          if (p1.isAvailable()) {
             this.c(p1);
             if (b1) {
                this.f(p1, 1);
             }
          }else {
             a uoa1 = this.a();
             if (uoa1 != null) {
                uFrameLayout = uoa1.e();
                if (uFrameLayout != null) {
                   uFrameLayout.setVisibility(0);
                }
             }
             uFrameLayout = p1.g();
             if (uFrameLayout != -2) {
                if (uFrameLayout != -1) {
                   if (uFrameLayout != 200) {
                      this.e(p1);
                   }else {
                      this.c(p1);
                   }
                }else {
                   this.b(p1, p3);
                }
             }else {
                i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
                this.b(p1, p3);
             }
          }
          return;
       }
    }
    public final void e(a p0){
       MagicFaceDownloadProgressBar magicFaceDow;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       a uoa = this.a();
       if (uoa != null) {
          ImageView imageView = uoa.a();
          if (imageView != null) {
             imageView.setVisibility(8);
          }
       }
       uoa = this.a();
       if (uoa != null) {
          magicFaceDow = uoa.b();
          if (magicFaceDow != null) {
             magicFaceDow.setVisibility(0);
          }
       }
       uoa = this.a();
       if (uoa != null) {
          magicFaceDow = uoa.b();
          if (magicFaceDow != null) {
             magicFaceDow.setProgress(p0.g());
          }
       }
       return;
    }
    public final void f(a p0,boolean p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, os, "4")) {
          return;
       }
       if (p1) {
          this.itemView.post(new s$c(this, p0));
       }else {
          s tb = this.b;
          if (tb != null) {
             tb.a(this.itemView, p0, this.getAdapterPosition());
          }
       }
       return;
    }
}
