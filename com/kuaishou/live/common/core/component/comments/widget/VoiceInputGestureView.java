package com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$VoiceInputEnableState;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import d61.l0;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$a;
import java.lang.Enum;
import android.content.res.Resources;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$b;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import android.view.MotionEvent;
import android.view.View;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$c;
import e17.i;

public class VoiceInputGestureView extends AppCompatImageView	// class@0010d9
{
    public final float d;
    public VoiceInputGestureView$c e;
    public boolean f;
    public boolean g;
    public VoiceInputGestureView$VoiceInputEnableState h;
    public int i;
    public VoiceInputGestureView$b j;

    public void VoiceInputGestureView(Context p0){
       super(p0);
       this.d = 80.00f;
       this.f = false;
       this.g = false;
       this.h = VoiceInputGestureView$VoiceInputEnableState.ENABLE;
       this.i = 0;
    }
    public void VoiceInputGestureView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 80.00f;
       this.f = false;
       this.g = false;
       this.h = VoiceInputGestureView$VoiceInputEnableState.ENABLE;
       this.i = 0;
    }
    public void VoiceInputGestureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 80.00f;
       this.f = false;
       this.g = false;
       this.h = VoiceInputGestureView$VoiceInputEnableState.ENABLE;
       this.i = 0;
    }
    public void a(VoiceInputGestureView$VoiceInputEnableState p0,int p1){
       if (PatchProxy.isSupport(VoiceInputGestureView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, VoiceInputGestureView.class, "5")) {
          return;
       }
       if (l0.d("disableForbidVoiceCommentInPkAndChat").b(Boolean.FALSE).booleanValue()) {
          return;
       }
       if (p0 != VoiceInputGestureView$VoiceInputEnableState.ENABLE) {
          this.i = p1 | this.i;
       }else {
          p1 = (~ p1) & this.i;
          this.i = p1;
          if (p1 & 0x01) {
             p0 = VoiceInputGestureView$VoiceInputEnableState.DISABLE_PKING;
          }else if(p1 & 0x1000){
             p0 = VoiceInputGestureView$VoiceInputEnableState.DISABLE_IN_LINE;
          }else if(p1 & 0x10){
             p0 = VoiceInputGestureView$VoiceInputEnableState.DISABLE_CHATING;
          }else if(p1 & 0x0100){
             p0 = VoiceInputGestureView$VoiceInputEnableState.DISABLE_PLAYING_MUSIC;
          }
       }
       this.h = p0;
       if (VoiceInputGestureView$a.a[p0.ordinal()] != 1) {
          if (!PatchProxy.applyVoid(null, this, VoiceInputGestureView.class, "6") && this.j != null) {
             this.setImageDrawable(this.getResources().getDrawable(this.j.a()));
          }
       }else {
          this.e();
       }
       return;
    }
    public boolean c(int p0){
       if (PatchProxy.isSupport(VoiceInputGestureView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VoiceInputGestureView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 <= (- n.c(this.getContext(), 80.00f)))? true: false;
       return b;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, VoiceInputGestureView.class, "2")) {
          return;
       }
       if (this.h == VoiceInputGestureView$VoiceInputEnableState.ENABLE) {
          this.e();
       }
       this.f = false;
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, VoiceInputGestureView.class, "3")) {
          return;
       }
       if (this.j == null) {
          return;
       }
       this.setImageDrawable(this.getResources().getDrawable(this.j.b()));
       return;
    }
    public VoiceInputGestureView$VoiceInputEnableState getVoiceInputEnableState(){
       return this.h;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoiceInputGestureView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g != null) {
          return super.onTouchEvent(p0);
       }
       int action = p0.getAction();
       int i = (int)p0.getY();
       VoiceInputGestureView te = this.e;
       if (te == null) {
          return false;
       }
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else if(this.f == null){
                return true;
             }else if(this.c(i)){
                this.e.d();
             }else {
                this.e.c();
             }
          }else if(this.f == null){
             return true;
          }else if(!this.c(i)){
             this.e.b();
          }else {
             this.e.onCancel();
          }
       }else {
          VoiceInputGestureView th = this.h;
          if (th == VoiceInputGestureView$VoiceInputEnableState.ENABLE) {
             this.f = true;
             te.a();
          }else if(th == VoiceInputGestureView$VoiceInputEnableState.DISABLE_PKING){
             i.a(R.style.arg_RES_7f11066a, 0x7f10291e);
          }else if(th == VoiceInputGestureView$VoiceInputEnableState.DISABLE_IN_LINE){
             i.a(R.style.arg_RES_7f11066a, 0x7f10259e);
          }else if(th == VoiceInputGestureView$VoiceInputEnableState.DISABLE_CHATING){
             i.a(R.style.arg_RES_7f11066a, 0x7f101f1a);
          }else if(th == VoiceInputGestureView$VoiceInputEnableState.DISABLE_PLAYING_MUSIC){
             i.a(R.style.arg_RES_7f11066a, 0x7f102a4f);
          }
       }
       return true;
    }
    public void setEnableUseNewStyle(boolean p0){
       this.g = p0;
    }
    public void setImageProvider(VoiceInputGestureView$b p0){
       this.j = p0;
    }
    public void setVoiceInputListener(VoiceInputGestureView$c p0){
       this.e = p0;
    }
}
