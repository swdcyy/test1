package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextItemVH;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextItemVH$progressBar$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import android.widget.ProgressBar;
import nn9.b;
import mn9.a;
import java.util.Objects;
import ypc.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import nuc.a;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;

public final class CoverTextItemVH extends a	// class@000e4d
{
    public final int f;
    public final RelativeLayout g;
    public final KwaiImageView h;
    public final p i;
    public final int j;

    public void CoverTextItemVH(View p0,int p1){
       a.p(p0, "itemView");
       super(p0);
       this.j = p1;
       this.f = a1.e(35.00f);
       this.g = p0.findViewById(0x7f0a0a01);
       this.h = p0.findViewById(0x7f0a0a02);
       this.i = s.c(new CoverTextItemVH$progressBar$2(p0));
    }
    public int c(){
       return 0x7f0a0c1a;
    }
    public void e(View p0,int p1){
       DownloadProgressBar uDownloadPro;
       CoverTextItemVH uCoverTextIt = CoverTextItemVH.class;
       if (PatchProxy.isSupport(uCoverTextIt) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uCoverTextIt, "3")) {
          return;
       }
       if (p1 == 200 || p1 == -2) {
          uDownloadPro = this.h();
          a.o(uDownloadPro, "progressBar");
          uDownloadPro.setVisibility(8);
       }else {
          uDownloadPro = this.h();
          a.o(uDownloadPro, "progressBar");
          uDownloadPro.setProgress(p1);
          uDownloadPro = this.h();
          a.o(uDownloadPro, "progressBar");
          uDownloadPro.setVisibility(0);
       }
       return;
    }
    public void f(b p0,b p1){
       CoverTextItemVH uCoverTextIt = CoverTextItemVH.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uCoverTextIt, "2")) {
          return;
       }
       a.p(p1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.model.EditTextTemplateData");
       if (!PatchProxy.applyVoid(null, this, uCoverTextIt, "4")) {
          CoverTextItemVH tg = this.g;
          a.o(tg, "containerView");
          ViewGroup$LayoutParams layoutParams = tg.getLayoutParams();
          a.o(layoutParams, "containerView.layoutParams");
          CoverTextItemVH tj = this.j;
          layoutParams.width = tj;
          layoutParams.height = tj;
          tj = this.g;
          a.o(tj, "containerView");
          tj.setLayoutParams(layoutParams);
          CoverTextItemVH th1 = this.h;
          a.o(th1, "coverView");
          ViewGroup$LayoutParams layoutParams1 = th1.getLayoutParams();
          a.o(layoutParams1, "coverView.layoutParams");
          tj = this.j;
          layoutParams.width = tj;
          layoutParams.height = tj;
          tg = this.h;
          a.o(tg, "coverView");
          tg.setLayoutParams(layoutParams1);
       }
       this.h.setPlaceHolderImage(R.drawable.arg_RES_7f080671);
       a uoa1 = uoa.l();
       if (uoa1 != null) {
          uoa1 = uoa1.w;
          if (uoa1 != null) {
          label_0079 :
             if (!q.f(uoa1)) {
                this.h.P(uoa1);
             }else if(uoa.s()){
                List list = uoa.n();
                a.o(list, "model.iconUrl");
                CDNUrl[] uCDNUrlArray = new CDNUrl[0];
                Object[] objArray = list.toArray(uCDNUrlArray);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                this.h.V(objArray, this.f, this.f);
             }else {
                this.h.setImageResource(uoa.d);
             }
             CoverTextItemVH th = this.h;
             a.o(th, "coverView");
             th.setVisibility(0);
             this.h().setProgressArcColor(a1.a(R.color.arg_RES_7f0609ce));
             return;
          }
       }
       ArrayList uArrayList = new ArrayList();
       goto label_0079 ;
    }
    public final DownloadProgressBar h(){
       Object obj = PatchProxy.apply(null, this, CoverTextItemVH.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
}
