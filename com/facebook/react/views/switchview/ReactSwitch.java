package com.facebook.react.views.switchview.ReactSwitch;
import androidx.appcompat.widget.SwitchCompat;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PorterDuff$Mode;
import java.lang.Boolean;
import android.widget.CompoundButton;

public class ReactSwitch extends SwitchCompat	// class@0013fc
{
    public boolean Q;
    public Integer R;
    public Integer S;

    public void ReactSwitch(Context p0){
       super(p0);
       this.Q = true;
       this.R = null;
       this.S = null;
    }
    public void m(Drawable p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitch.class, "2")) {
          return;
       }
       if (p1 == null) {
          p0.clearColorFilter();
       }else {
          p0.setColorFilter(p1.intValue(), PorterDuff$Mode.MULTIPLY);
       }
       return;
    }
    public void setChecked(boolean p0){
       if (PatchProxy.isSupport(ReactSwitch.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactSwitch.class, "1")) {
          return;
       }
       if (this.Q != null && this.isChecked() != p0) {
          this.Q = false;
          super.setChecked(p0);
          this.setTrackColor(p0);
       }else {
          super.setChecked(this.isChecked());
       }
       return;
    }
    public void setOn(boolean p0){
       if (PatchProxy.isSupport(ReactSwitch.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactSwitch.class, "5")) {
          return;
       }
       if (this.isChecked() != p0) {
          super.setChecked(p0);
          this.setTrackColor(p0);
       }
       this.Q = true;
       return;
    }
    public void setThumbColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactSwitch.class, "4")) {
          return;
       }
       this.m(super.getThumbDrawable(), p0);
       return;
    }
    public void setTrackColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactSwitch.class, "3")) {
          return;
       }
       this.m(super.getTrackDrawable(), p0);
       return;
    }
    public final void setTrackColor(boolean p0){
       if (PatchProxy.isSupport(ReactSwitch.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactSwitch.class, "8")) {
          return;
       }
       ReactSwitch tS = this.S;
       if (tS != null || this.R != null) {
          if (!p0) {
             tS = this.R;
          }
          this.setTrackColor(tS);
       }
       return;
    }
    public void setTrackColorForFalse(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactSwitch.class, "7")) {
          return;
       }
       if (p0 == this.R) {
          return;
       }
       this.R = p0;
       if (!this.isChecked()) {
          this.setTrackColor(this.R);
       }
       return;
    }
    public void setTrackColorForTrue(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactSwitch.class, "6")) {
          return;
       }
       if (p0 == this.S) {
          return;
       }
       this.S = p0;
       if (this.isChecked()) {
          this.setTrackColor(this.S);
       }
       return;
    }
}
