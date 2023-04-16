package com.kuaishou.live.core.show.comments.voicecomment.widget.b;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$c;
import t52.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Objects;
import java.lang.Integer;
import android.content.Context;
import android.widget.ImageView;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kuaishou.live.core.show.comments.voicecomment.widget.VoiceInputStatusDialogFrament;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import t52.g;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import t52.h;
import t52.d;
import android.view.View;
import android.app.Activity;
import d61.h;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.kuaishou.live.core.show.comments.voicecomment.widget.a;
import erd.o;
import crd.b;
import androidx.fragment.app.Fragment;
import android.widget.TextView;

public class b implements VoiceInputGestureView$c	// class@000a6a
{
    public final i a;

    public void b(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       int i;
       VoiceInputStatusDialogFrament voiceInputSt;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       if ((System.currentTimeMillis() - ta.h) - 500 < 0) {
          ta.a.d();
          this.a.h = System.currentTimeMillis();
          i.a(R.style.arg_RES_7f110668, 0x7f1050bd);
          return;
       }else if(!QCurrentUser.me().isLogined()){
          ta = this.a;
          i = 0x7f103076;
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta, oi, "3")) {
             y.a(ta.a.getContext(), "live_play", "live_play_voice_comment", 38, ta.a.getContext().getString(i), null, null, null, null);
             ta.a.d();
             ta.h = System.currentTimeMillis();
          }
          return;
       }else {
          i a = this.a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, VoiceInputGestureView.class, "4")) {
             a.setImageDrawable(a.getResources().getDrawable(R.drawable.arg_RES_7f08113b));
          }
          String str = "android.permission.RECORD_AUDIO";
          if (PermissionUtils.a(a.a().a(), str)) {
             b ta1 = this.a;
             if (PatchProxy.isSupport(VoiceInputStatusDialogFrament.class)) {
                voiceInputSt = PatchProxy.applyTwoRefs(Long.valueOf(0x3a98), Long.valueOf(5000), objArray, VoiceInputStatusDialogFrament.class, "2");
                if (voiceInputSt != PatchProxyResult.class) {
                label_00e2 :
                   ta1.b = voiceInputSt;
                   ta1 = this.a;
                   ta1.b.Cb(ta1.e, "tst");
                   this.a.b.wh();
                   this.a.b.k0(new g(this));
                   ta1 = this.a;
                   ta1.b.C = new h(this);
                   ta1.c.onStart();
                   this.a.g = System.currentTimeMillis();
                }
             }
             voiceInputSt = new VoiceInputStatusDialogFrament();
             voiceInputSt.x = 0x3a98;
             voiceInputSt.y = 5000;
             goto label_00e2 ;
          }else {
             this.b();
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(objArray, ta, oi, "5")) {
                Activity uActivity = h.d(ta.a);
                if (uActivity != null) {
                   a.e(uActivity, R.string.arg_RES_7f102b42, 0x7f102b41, str).map(a.b).subscribe();
                }
             }
          }
          return;
       }
    }
    public void b(){
       i b;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       i a = this.a.a;
       if (a != null) {
          a.d();
       }
       b ta = this.a;
       if (ta.a != null) {
          b = ta.b;
          if (b != null) {
             ta.a(b);
             b ta1 = this.a;
             if ((System.currentTimeMillis() - ta1.g) - 1000 > 0) {
                ta1.c.onStop(false);
             }else {
                ta1.c.onCancel();
                i.a(R.style.arg_RES_7f110668, 0x7f1034ef);
             }
             this.a.h = System.currentTimeMillis();
          }
       }
       return;
    }
    public void c(){
       i b;
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b = this.a.b;
       if (b != null) {
          b.wh();
       }
       return;
    }
    public void d(){
       i b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b = this.a.b;
       if (b != null) {
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, VoiceInputStatusDialogFrament.class, "5") && b.isAdded()) {
             b.t.setText(R.string.arg_RES_7f102e87);
             b.u.setVisibility(8);
             b.v.setVisibility(8);
             b.s.setVisibility(0);
          }
       }
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       i a = this.a.a;
       if (a != null) {
          a.d();
       }
       b ta = this.a;
       ta.a(ta.b);
       this.a.c.onCancel();
       this.a.h = System.currentTimeMillis();
       return;
    }
}
