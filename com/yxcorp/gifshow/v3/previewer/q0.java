package com.yxcorp.gifshow.v3.previewer.q0;
import erd.g;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import t36.f;
import ooc.j0;
import lwc.c2;
import t36.f$a;
import java.lang.System;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import voc.o;
import android.content.Intent;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.lang.Exception;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.PreviewLoaderException;
import e17.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.vm.MusicIconViewModel;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import c26.c;
import com.yxcorp.gifshow.util.AdvEditUtil;
import java.lang.StringBuilder;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public final class q0 implements g	// class@001607
{
    public final VideoEditPreviewV3Fragment b;
    public final long c;

    public void q0(VideoEditPreviewV3Fragment p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       q0 tb = this.b;
       q0 tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       String str = "EditCostVideoEditPreviewV3Fragment";
       a.D().w(str, "loadWorkspace result", objArray);
       if (tb.getActivity() == null || tb.getActivity().isFinishing()) {
          Object[] objArray1 = new Object[0];
          a.D().A(str, "loadWorkspace: isFinishing return", objArray1);
       }else {
          tb.F1.o0().s0(new c2(tb));
          long l = System.currentTimeMillis();
          int b = (tb.L.f() != null)? true: false;
          tb.L.m(p0.getProject());
          if (!f.C(tb.Qh())) {
             f.m = p0.i() + 1;
             if (p0.j() > 0x2710) {
                f.n = p0.j() + 1;
             }
          }
          tb.y1 = p0.j;
          if (p0.h() != null) {
             i1.c(p0.h());
          }
          if (tb.L.f() == null) {
             b = 0x7f100dd9;
             if (p0.h() instanceof PreviewLoaderException && p0.h().mNetWorkFailed != null) {
                b = 0x7f1038e5;
             }
             i.a(R.style.arg_RES_7f110668, b);
             tb.Kh(0, 0);
          }else if(b){
             tb.G.sendChangeToPlayer(0);
          }else if(tb.Yh()){
             Size size = new Size(tb.L.f().projectOutputWidth(), tb.L.f().projectOutputHeight());
             Size[] sizeArray = new Size[]{size};
             Size[] sizeArray1 = new Size[]{size};
             tb.L.e().r0(4, sizeArray, sizeArray1);
          }else {
             tb.L.e().l0();
          }
          if (tb.G == null) {
             tb.Kh(0, 0);
          }else {
             Minecraft$Color uColor = EditorSdk2Utils.createRGBAColor(0.10f, 0.10f, 0x3def9db2, 0x3f800000);
             tb.L.f().setMarginColor(uColor);
             tb.L.f().setPaddingColor(uColor);
             ViewModelProviders.of(tb).get(MusicIconViewModel.class).o0(tb.M);
             AdvEditUtil.l(tb.G, p0);
             tb.Bh(true, 0, null, false, true);
             tb.G.setLoop(1);
             long l1 = System.currentTimeMillis();
             Object[] objArray2 = new Object[0];
             a.D().w("EditCost", "PreviewPlayer.updateProject耗时 "+(l1 - l), objArray2);
             long l2 = System.currentTimeMillis();
             objArray = new Object[0];
             a.D().w("EditCost", "Clone VideoEditorProject耗时 "+(l2 - l1), objArray);
             tb.Zh();
             l1 = System.currentTimeMillis();
             objArray2 = new Object[0];
             a.D().w("EditCost", "恢复K歌特有的草稿数据耗时 "+(l1 - l2), objArray2);
             objArray = new Object[0];
             a.D().w("EditCost", "菊花结束，总共耗时 "+(l1 - tc), objArray);
             tb.fi();
             tb.mi();
             tb.Z0.setValue(Boolean.TRUE);
          }
       }
       return;
    }
}
