package com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical$a;
import x80.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import x80.b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import r90.o;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.gifshow.kuaishan.ui.preview.a;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import android.content.Context;
import u80.i;
import ekd.p0;
import e17.i;
import q87.c;
import android.widget.ProgressBar;
import java.util.Objects;
import h90.d;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;

public class KSPreviewFragmentVertical$a implements c	// class@001add
{
    public final KSPreviewFragmentVertical a;

    public void KSPreviewFragmentVertical$a(KSPreviewFragmentVertical p0){
       this.a = p0;
       super();
    }
    public void R(KSTemplateDetailInfo p0,int p1){
       b.i(this, p0, p1);
    }
    public void S(){
       b.j(this);
    }
    public void T(List p0,int p1){
       b.b(this, p0, p1);
    }
    public void U(List p0,List p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public void V(KSTemplateDetailInfo p0,int p1){
       KSPreviewFragmentVertical$a uoa = KSPreviewFragmentVertical$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().t("KSPreviewFragmentVertical", "onKuaiShanProjectPrepareFailed: error="+p1, objArray);
       this.a.kh();
       this.a.S.y0(null);
       if (2 == p1) {
          o oo = new o(this);
          KSPreviewFragmentVertical$a ta = this.a;
          if (ta.H == null) {
             e.D(ta.getActivity(), oo, a.b);
          }else {
             PostWorkErrorTips.b(R.string.arg_RES_7f1043cd);
          }
       }else if(!p0.C(i.a())){
          i.a(R.style.arg_RES_7f11066a, 0x7f101be4);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f101be3);
       }
       return;
    }
    public void W(){
       b.h(this);
    }
    public void X(KSTemplateDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onStartDownloadKuaiShanResource: "+p0.getId(), objArray);
       e.w("Download resource for template starts: "+p0.mTemplateId);
       this.a.u.setProgress(0);
       return;
    }
    public void Y(o1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onKuaiShanProjectPrepareSuccess: ", objArray);
       this.a.S.y0(p0);
       Objects.requireNonNull(p0);
       p0.F0(p0.C0().a);
       KSPreviewFragmentVertical$a ta = this.a;
       if (ta.O != null) {
          ta.kh();
          p0.O = false;
       }else {
          ta.th(p0);
       }
       return;
    }
    public void Z(KSTemplateDetailInfo p0,int p1){
       KSPreviewFragmentVertical$a uoa = KSPreviewFragmentVertical$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.a.u.setProgress(p1);
       this.a.t.setText(a1.r(R.string.arg_RES_7f101be2, String.valueOf(p1)));
       return;
    }
    public void a0(){
       b.f(this);
    }
}
