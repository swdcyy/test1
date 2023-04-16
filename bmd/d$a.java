package bmd.d$a;
import ooc.r0;
import bmd.d;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.o$b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Map;
import xsc.c;
import t36.f;
import wpc.y;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import faa.a;
import q87.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import uxb.k;
import uxb.l;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Objects;
import smd.d;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import qsc.c;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import com.kwai.feature.post.api.feature.sticker.IStickerDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import w46.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import oq.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Source;

public final class d$a implements r0	// class@00027d
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       q0.o(this, p0);
       if (p0 == null) {
          return;
       }
       a uoa = this.b.c();
       String str = "currentPreviewViewModel";
       a.o(uoa, str);
       if (!PostExperimentUtils.x(uoa.w0())) {
          return;
       }
       f.t0(this.b.g, p0.t0(), c.class);
       if (this.b.i()) {
          d$a tb = this.b;
          tb = tb.c();
          a.o(tb, str);
          f.t0(tb.f, tb.t0(), y.class);
       }
       return;
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       q0.a(this, p0);
       a uoa1 = this.b.c();
       a.o(uoa1, "currentPreviewViewModel");
       PostExperimentUtils.x(uoa1.w0());
       return;
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       c uoc;
       o$b d;
       h oh;
       EditReduxViewModel uEditReduxVi;
       d$a tb;
       boolean b;
       d$a uoa = d$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.p(p0, "inflater");
       a.p(p3, "rootView");
       a.p(p4, "currentEditorFragment");
       q0.n(this, p0, p1, p2, p3, p4);
       a uoa1 = this.b.c();
       String str = "currentPreviewViewModel";
       a.o(uoa1, str);
       if (!PostExperimentUtils.x(uoa1.w0())) {
          return;
       }else {
          Object[] objArray1 = new Object[0];
          String str1 = "StickerEditorV2Factory";
          a.D().w(str1, "onFragmentCreateView: ", objArray1);
          String str2 = "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.vm.StickerViewModelV2";
          String str3 = "EditUtils.getEditorPrevi¡­ewModel\(mCurrentFragment\)";
          String str4 = "mCurrentFragment";
          if (this.b.i()) {
             Object[] objArray2 = new Object[0];
             a.D().w(str1, "isNewSinglePicMode: ", objArray2);
             uoa1 = this.b.c();
             a.o(uoa1, str);
             uoc = uoa1.w0();
             a.o(uoc, "currentPreviewViewModel.workspaceDraft");
             if (f.E(uoc.a1())) {
                d = this.b.d;
                a.o(d, str4);
                oh = f.l(this.b.d);
                a.o(oh, str3);
                uEditReduxVi = this.b.h();
                Objects.requireNonNull(uEditReduxVi, str2);
                l.l().eQ(d, new NewStickerPicTemplateProcessor(oh, uEditReduxVi, p4));
             }
             tb = this.b;
             uoa1 = tb.c();
             a.o(uoa1, str);
             f.o0(tb.f, uoa1.t0(), y.class);
          }else {
             uoa1 = this.b.c();
             a.o(uoa1, str);
             uoc = uoa1.w0();
             a.o(uoc, "currentPreviewViewModel.workspaceDraft");
             if (f.E(uoc.a1())) {
                d = this.b.d;
                a.o(d, str4);
                oh = f.l(this.b.d);
                a.o(oh, str3);
                uEditReduxVi = this.b.h();
                Objects.requireNonNull(uEditReduxVi, str2);
                l.l().eQ(d, new NewStickerPicTemplateProcessor(oh, uEditReduxVi, p4));
             }
          }
          if (f.F(p4)) {
             tb = this.b;
             uoa1 = tb.c();
             a.o(uoa1, str);
             f.o0(tb.g, uoa1.t0(), c.class);
          }
          IStickerDetailInfo iStickerDeta = i.g().getStickerParam().get();
          if (i.h() && iStickerDeta != null) {
             if (!iStickerDeta instanceof StickerDetailInfo) {
                Object[] objArray3 = new Object[0];
                a.D().t(str1, "onFragmentCreateView: stickerDetailInfo is not StickerDetailInfo instance", objArray3);
                return;
             }else if(TextUtils.x(iStickerDeta.mStickerId)){
                i.a(R.style.arg_RES_7f11066a, 0x7f103df1);
                return;
             }else if(e.d()){
                tb = this.b;
                Objects.requireNonNull(tb);
                str1 = PatchProxy.apply(null, tb, d.class, "6");
                if (str1 != PatchProxyResult.class) {
                   b = str1.booleanValue();
                }else {
                   a uoa2 = tb.c();
                   a.o(uoa2, str);
                   c uoc1 = uoa2.w0();
                   a.o(uoc1, "currentPreviewViewModel.workspaceDraft");
                   if (f.B(uoc1.a1())) {
                      uoa1 = tb.c();
                      a.o(uoa1, str);
                      uoc = uoa1.w0();
                      a.o(uoc, "currentPreviewViewModel.workspaceDraft");
                      if (uoc.T0() != Workspace$Source.REEDIT) {
                      label_01b7 :
                         b = i;
                      }
                   }
                   i = 0;
                   goto label_01b7 ;
                }
                if (b) {
                   i.a(R.style.arg_RES_7f11066a, 0x7f103df2);
                }
             }
          }
          return;
       }
    }
    public void onActivityDestroy(){
       q0.f(this);
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       q0.k(this, p0);
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
