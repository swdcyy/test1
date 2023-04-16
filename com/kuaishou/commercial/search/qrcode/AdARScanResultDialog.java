package com.kuaishou.commercial.search.qrcode.AdARScanResultDialog;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$a;
import nsd.u;
import com.kuaishou.commercial.search.qrcode.AdARScanResultModel;
import nl9.a;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$c;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.y0;
import androidx.fragment.app.DialogFragment;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Dialog;
import android.view.Window;
import i2b.a;
import java.util.HashMap;
import androidx.fragment.app.c;
import androidx.fragment.app.c$b;
import nc6.d;
import wy.d;
import ai7.e;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import android.view.TextureView;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$onViewCreated$2;
import msd.l;
import yx.j0;
import nc6.a;
import kotlin.collections.ArraysKt___ArraysKt;
import android.net.Uri;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import wy.a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import wy.b;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import wy.c;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import com.google.gson.JsonObject;
import wkd.b;
import u49.c;
import com.google.gson.JsonElement;
import brd.t;
import cjd.e;
import erd.o;
import wy.e;
import wy.f;
import erd.g;
import crd.b;

public final class AdARScanResultDialog extends BaseFragment	// class@001570
{
    public TextureView j;
    public TextView k;
    public ImageView l;
    public Surface m;
    public b n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final TextureView$SurfaceTextureListener s;
    public final c$b t;
    public final AdARScanResultModel u;
    public final a v;
    public HashMap w;
    public static final AdARScanResultDialog$a x;

    static {
       AdARScanResultDialog.x = new AdARScanResultDialog$a(null);
    }
    public void AdARScanResultDialog(){
       super(null, null);
    }
    public void AdARScanResultDialog(AdARScanResultModel p0,a p1){
       super(null, null, null, null, 15, null);
       this.u = p0;
       this.v = p1;
       this.s = new AdARScanResultDialog$c(this);
       this.t = new AdARScanResultDialog$b(this);
    }
    public final void ch(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdARScanResultDialog.class, "8")) {
          return;
       }
       if (!y0.o(this.getActivity())) {
          Fragment parentFragme = this.getParentFragment();
          if (parentFragme instanceof DialogFragment) {
             objArray = parentFragme;
          }
          if (objArray != null) {
             objArray.dismissAllowingStateLoss();
          }
       }
       return;
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, AdARScanResultDialog.class, "7")) {
          return;
       }
       AdARScanResultDialog tn = this.n;
       if (tn != null) {
          tn.setSurface(null);
          tn = this.m;
          if (tn != null) {
             tn.release();
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdARScanResultDialog.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       Fragment parentFragme = this.getParentFragment();
       if (!parentFragme instanceof DialogFragment) {
          parentFragme = null;
       }
       if (parentFragme != null) {
          Dialog dialog = parentFragme.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setGravity(48);
                window.clearFlags(1024);
             }
          }
       }
       return a.g(p0, 0x7f0d1358, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, AdARScanResultDialog.class, "14")) {
       }else {
          AdARScanResultDialog tw = this.w;
          if (tw != null) {
             tw.clear();
          }
       }
       return;
    }
    public void onDetach(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdARScanResultDialog.class, "9")) {
          return;
       }
       super.onDetach();
       this.r = false;
       c fragmentMana = this.getFragmentManager();
       if (fragmentMana != null) {
          fragmentMana.unregisterFragmentLifecycleCallbacks(this.t);
       }
       if (!PatchProxy.applyVoid(objArray, this, AdARScanResultDialog.class, "12") && this.q == null) {
          this.q = true;
          AdARScanResultDialog tn = this.n;
          if (tn != null) {
             tn.x().f();
             tn.releaseAsync(new d(this));
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       Object[] objArray2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdARScanResultDialog.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       AdARScanResultDialog tu = this.u;
       Object[] objArray = null;
       CDNUrl[] mVideoUrls = (tu != null)? tu.getMVideoUrls(): objArray;
       if (mVideoUrls != null) {
          mVideoUrls = (!mVideoUrls.length)? 1: 0;
          if (!mVideoUrls) {
             tu = null;
          label_002e :
             if (tu) {
                this.ch();
                return;
             }else {
                tu = this.u;
                String mButtonLabel = (tu != null)? tu.getMButtonLabel(): objArray;
                if (TextUtils.isEmpty(mButtonLabel)) {
                   tu = this.u;
                   if (tu != null) {
                      tu.setMButtonLabel(a1.p(R.string.arg_RES_7f100837));
                   }
                }
                TextureView textureView = p0.findViewById(R.id.popup_show_texture);
                this.j = textureView;
                if (textureView != null) {
                   ViewGroup$LayoutParams layoutParams = textureView.getLayoutParams();
                   Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                   Context context = this.getContext();
                   Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                   int i = n.k(context);
                   layoutParams.width = i;
                   layoutParams.height = i;
                   if (this.getContext() != null) {
                      context = this.getContext();
                      Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                      layoutParams.topMargin = (int)((double)n.j(context) * 0x3fc3f7ced916872b);
                   }
                   textureView.setLayoutParams(layoutParams);
                }
                this.k = p0.findViewById(0x7f0a0a13);
                this.l = p0.findViewById(0x7f0a0782);
                AdARScanResultDialog tk = this.k;
                if (tk != null) {
                   tu = this.u;
                   mButtonLabel = (tu != null)? tu.getMButtonLabel(): objArray;
                   tk.setText(mButtonLabel);
                }
                tk = this.l;
                if (tk != null) {
                   y0.a(tk, new AdARScanResultDialog$onViewCreated$2(this));
                }
                c fragmentMana = this.getFragmentManager();
                if (fragmentMana != null) {
                   fragmentMana.registerFragmentLifecycleCallbacks(this.t, false);
                }
                if (!PatchProxy.applyVoid(objArray, this, AdARScanResultDialog.class, "4")) {
                   Object[] objArray1 = new Object[false];
                   j0.f("AdARScanResultDialog", "initPlayer", objArray1);
                   this.o = a.a();
                   tk = this.u;
                   if (tk != null) {
                      CDNUrl[] mVideoUrls1 = tk.getMVideoUrls();
                      if (mVideoUrls1 != null) {
                         CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(mVideoUrls1);
                         if (uCDNUrl != null) {
                            uCDNUrl = uCDNUrl.mUrl;
                         label_010d :
                            if (uCDNUrl != null) {
                               Uri uri = Uri.parse(uCDNUrl);
                               a.o(uri, "Uri.parse\(videoUrl\)");
                               b uob = PatchProxy.applyOneRefs(uri, this, AdARScanResultDialog.class, "5");
                               if (uob != PatchProxyResult.class) {
                               }else {
                                  d uod = new d("CommercialPopShowVideo");
                                  WayneBuildData wayneBuildDa = uod.setBizFt(":ks-features:ft-commercial:commercial-search");
                                  String str = uri.toString();
                                  try{
                                     wayneBuildDa.setNormalUrl(str, 1);
                                     uob = c.a(uod);
                                  }catch(java.lang.Exception e9){
                                     j0.b("AdARScanResultDialog", "KpMidVodHlsBuilder, createPlayer failed ", e9);
                                     uob = objArray;
                                  }
                               }
                            }
                         }
                      }
                   }
                   objArray1 = objArray;
                   goto label_010d ;
                }
             label_0187 :
                if (!PatchProxy.applyVoid(objArray, this, AdARScanResultDialog.class, "3")) {
                   JsonObject jsonObject = new JsonObject();
                   tu = this.u;
                   if (tu != null) {
                      mButtonLabel = tu.getMActivityId();
                      if (mButtonLabel != null) {
                         jsonObject.c0("activityId", mButtonLabel);
                      }
                   }
                   b.a(0x3a268c29).s(jsonObject.toString()).map(new e()).subscribe(new e(this), f.b);
                }
                return;
             }
          }
       }
       tu = 1;
       goto label_002e ;
    }
}
