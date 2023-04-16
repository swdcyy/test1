package com.tachikoma.core.component.switchview.TKSwitch;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.widget.Switch;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import iq8.p;
import java.lang.Integer;
import android.graphics.PorterDuff$Mode;
import android.widget.CompoundButton;
import gp8.a;
import sp8.b$a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.core.component.switchview.TKSwitch$a;
import java.lang.Runnable;
import iq8.x;

public class TKSwitch extends e implements CompoundButton$OnCheckedChangeListener	// class@000d89
{
    public boolean checked;
    public String v;
    public String w;

    public void TKSwitch(f p0){
       super(p0);
       this.getView().setOnCheckedChangeListener(this);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public Switch createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKSwitch.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Switch(p0);
    }
    public void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKSwitch.class, "2")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().setOnCheckedChangeListener(null);
       }
       return;
    }
    public void doChecked(boolean p0){
       if (PatchProxy.isSupport(TKSwitch.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKSwitch.class, "9")) {
          return;
       }
       if (this.getView().isChecked() != p0) {
          this.getView().setChecked(p0);
          this.o(p0);
       }
       return;
    }
    public boolean getChecked(){
       return this.checked;
    }
    public final void m(Drawable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSwitch.class, "10")) {
          return;
       }
       Integer integer = Integer.valueOf(p.c(p1, this.getJSContext()));
       if (p1 == null) {
          p0.clearColorFilter();
       }else {
          p0.setColorFilter(integer.intValue(), PorterDuff$Mode.MULTIPLY);
       }
       return;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSwitch.class, "12")) {
          return;
       }
       this.m(this.getView().getTrackDrawable(), p0);
       return;
    }
    public final void o(boolean p0){
       if (PatchProxy.isSupport(TKSwitch.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKSwitch.class, "11")) {
          return;
       }
       TKSwitch tv = (p0)? this.v: this.w;
       this.n(tv);
       return;
    }
    public void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(TKSwitch.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKSwitch.class, "8")) {
          return;
       }
       this.checked = p1;
       this.o(p1);
       this.dispatchEvent("switch", new a(p1));
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKSwitch.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKSwitch.class, "1")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKSwitch$a(this));
       }
       return;
    }
    public void setChecked(boolean p0){
       if (PatchProxy.isSupport(TKSwitch.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKSwitch.class, "4")) {
          return;
       }
       this.checked = p0;
       this.doChecked(p0);
       return;
    }
    public void setOffColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSwitch.class, "6")) {
          return;
       }
       this.w = p0;
       if (!this.getView().isChecked()) {
          this.n(p0);
       }
       return;
    }
    public void setOnColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSwitch.class, "5")) {
          return;
       }
       this.v = p0;
       if (this.getView().isChecked()) {
          this.n(p0);
       }
       return;
    }
    public void setThumbColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSwitch.class, "7")) {
          return;
       }
       this.m(this.getView().getThumbDrawable(), p0);
       return;
    }
    public boolean supportAsyncPrepareView(){
       return true;
    }
}
