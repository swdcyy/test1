package com.yxcorp.gifshow.share.widget.KwaiUploadShareDialog;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import djc.j1;
import android.view.View$OnClickListener;
import djc.i1;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.app.Dialog;
import com.yxcorp.gifshow.share.widget.o;
import lnc.c3$a;
import lnc.c3;
import java.lang.Integer;
import djc.h1;
import android.content.DialogInterface$OnDismissListener;

public class KwaiUploadShareDialog extends BaseDialogFragment implements d	// class@001d0c
{
    public TextView p;
    public View q;
    public TextView r;
    public int s;
    public e0 t;
    public boolean u;
    public static final int v;

    public void KwaiUploadShareDialog(){
       super();
       this.u = false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiUploadShareDialog.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3e0b);
       this.q = m1.f(p0, 0x7f0a433c);
       this.r = m1.f(p0, 0x7f0a4343);
       m1.a(p0, new j1(this), R.id.upload);
       m1.a(p0, new i1(this), R.id.close_btn);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiUploadShareDialog.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f110362);
       if (this.getArguments() != null) {
          this.s = this.getArguments().getInt("DOWNLOAD_SHARE_TYPE");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiUploadShareDialog.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d14d5, p1, false);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, KwaiUploadShareDialog.class, "7")) {
          return;
       }
       super.onStart();
       c3.c(this.getDialog(), o.a);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiUploadShareDialog.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       KwaiUploadShareDialog ts = this.s;
       if (!PatchProxy.isSupport(KwaiUploadShareDialog.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ts), this, KwaiUploadShareDialog.class, "10")) {
          int i = 0x7f0802bd;
          int i1 = 0x7f0802e2;
          if (ts != -1) {
             if (ts != true) {
                if (ts != 2) {
                   if (ts != 3 && ts != 4) {
                      if (ts == 5) {
                         this.th(R.string.arg_RES_7f100aba, 0x7f101293, 0, R.drawable.arg_RES_7f0801c8);
                      }
                   }else {
                      this.th(R.string.arg_RES_7f100ab8, 0x7f101293, R.drawable.arg_RES_7f0802dc, 0x7f0801c8);
                   }
                }
             }else {
                this.th(R.string.arg_RES_7f100abb, 0x7f100ab0, i1, i);
             }
          }
          this.th(R.string.arg_RES_7f104b77, 0x7f100824, i1, i);
       }
       this.getDialog().setCanceledOnTouchOutside(true);
       this.k0(new h1(this));
       return;
    }
    public final void th(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiUploadShareDialog.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiUploadShareDialog.class, "11")) {
          return;
       }
       this.p.setText(p0);
       this.r.setText(p1);
       this.r.setCompoundDrawablesWithIntrinsicBounds(p2, 0, 0, 0);
       this.q.setBackgroundResource(p3);
       return;
    }
}
