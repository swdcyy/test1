package com.kuaishou.live.core.show.comments.voicecomment.widget.VoiceInputStatusDialogFrament;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.os.Handler;
import android.os.Looper;
import t52.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.live.core.show.comments.voicecomment.widget.VoiceRecordingVolumeView;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.lang.Runnable;
import android.content.DialogInterface;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import o56.c;
import o56.a;
import android.app.Application;
import cw9.c;

public class VoiceInputStatusDialogFrament extends LiveSafeDialogFragment implements d	// class@000a67
{
    public Handler A;
    public boolean B;
    public VoiceInputStatusDialogFrament$a C;
    public Runnable D;
    public ImageView s;
    public TextView t;
    public TextView u;
    public VoiceRecordingVolumeView v;
    public Dialog w;
    public long x;
    public long y;
    public long z;
    public static final int E;

    public void VoiceInputStatusDialogFrament(){
       super();
       this.A = new Handler(Looper.getMainLooper());
       this.B = false;
       this.D = new j(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoiceInputStatusDialogFrament.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a449c);
       this.v = m1.f(p0, 0x7f0a4535);
       this.u = m1.f(p0, 0x7f0a449b);
       this.t = m1.f(p0, 0x7f0a449d);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       b obj = PatchProxy.applyOneRefs(p0, this, VoiceInputStatusDialogFrament.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       this.w = uDialog;
       uDialog.getWindow().setDimAmount(0);
       this.w.getWindow().requestFeature(1);
       this.w.setCanceledOnTouchOutside(false);
       obj = new b();
       obj.g(KwaiRadiusStyles.R8);
       obj.v(this.getContext().getResources().getColor(R.color.arg_RES_7f062046));
       this.w.getWindow().setBackgroundDrawable(obj.a());
       return this.w;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoiceInputStatusDialogFrament.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d169e, p1, false);
       this.doBindView(view);
       this.A.postDelayed(this.D, (this.x - this.y));
       this.z = this.y;
       return view;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoiceInputStatusDialogFrament.class, "7")) {
          return;
       }
       super.onDismiss(p0);
       this.A.removeCallbacks(this.D);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, VoiceInputStatusDialogFrament.class, "10")) {
          return;
       }
       super.onResume();
       this.w.getWindow().setLayout(c.b(a.a().a().getResources(), R.dimen.arg_RES_7f0709f0), c.b(a.a().a().getResources(), R.dimen.arg_RES_7f0709ef));
       return;
    }
    public void wh(){
       if (PatchProxy.applyVoid(null, this, VoiceInputStatusDialogFrament.class, "4")) {
          return;
       }
       if (this.isAdded()) {
          int i = 0;
          if (this.B != null) {
             this.u.setVisibility(i);
             this.s.setVisibility(8);
             this.v.setVisibility(8);
          }else {
             this.u.setVisibility(8);
             this.s.setVisibility(8);
             this.v.setVisibility(i);
          }
          this.t.setText(R.string.arg_RES_7f102e85);
       }
       return;
    }
}
