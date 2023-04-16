package com.kuaishou.live.gzone.v2.activity.LiveGzoneActivityIconTab;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$c;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import tyc.s1;
import java.lang.CharSequence;
import java.lang.Number;
import android.widget.ImageView;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import com.yxcorp.gifshow.model.CDNUrl;
import f37.c0;
import java.lang.Boolean;

public class LiveGzoneActivityIconTab extends FrameLayout implements GzonePagerSlidingTabStrip$c	// class@001cad
{
    public TextView b;
    public KwaiImageView c;
    public TextView d;
    public View e;
    public KwaiImageView f;
    public boolean g;
    public View h;

    public void LiveGzoneActivityIconTab(Context p0){
       super(p0, null);
    }
    public void LiveGzoneActivityIconTab(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneActivityIconTab(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveGzoneActivityIconTab.class, "2")) {
       }else {
          this.setClipChildren(false);
          this.setClipToPadding(false);
          a.c(this.getContext(), this.getLayoutRes(), this);
          this.b = this.findViewById(0x7f0a3caa);
          this.h = this.findViewById(0x7f0a3cab);
          this.d = this.findViewById(0x7f0a1f86);
          this.c = this.findViewById(0x7f0a1f84);
          this.e = this.findViewById(0x7f0a1f85);
          this.f = this.findViewById(0x7f0a1f91);
       }
       return;
    }
    public static LiveGzoneActivityIconTab b(Context p0,String p1){
       LiveGzoneActivityIconTab obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveGzoneActivityIconTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveGzoneActivityIconTab(p0);
       obj.setName(p1);
       return obj;
    }
    public int a(){
       return s1.b(this);
    }
    public int getLayoutRes(){
       return 0x7f0d0b74;
    }
    public CharSequence getText(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneActivityIconTab.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getText();
    }
    public int getTextLeftMargin(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneActivityIconTab.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.f.getVisibility()) {
          return (this.h.getLeft() + ((this.getPaddingLeft() - this.getPaddingRight()) / 2));
       }
       return 0;
    }
    public void setEnableAlphaOnSelected(boolean p0){
       this.g = p0;
    }
    public void setIcon(int p0){
       if (PatchProxy.isSupport(LiveGzoneActivityIconTab.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGzoneActivityIconTab.class, "4")) {
          return;
       }
       if (p0) {
          this.f.setVisibility(0);
          this.f.setPlaceHolderImage(p0);
       }else {
          this.f.setVisibility(8);
       }
       return;
    }
    public void setIconUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityIconTab.class, "6")) {
          return;
       }
       if (p0 != null) {
          d0.b(this.f, p0);
          this.f.setVisibility(0);
       }else {
          this.f.setVisibility(8);
       }
       return;
    }
    public void setIconUrl(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityIconTab.class, "5")) {
          return;
       }
       if (p0 != null) {
          this.f.U(p0);
          this.f.setVisibility(0);
       }else {
          this.f.setVisibility(8);
       }
       return;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityIconTab.class, "3")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
    public void setRedDot(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityIconTab.class, "8")) {
          return;
       }
       if (p0 == null || !p0.e()) {
          this.d.setVisibility(8);
          this.c.setVisibility(8);
          this.e.setVisibility(8);
          this.d.setText(null);
          return;
       }else if(p0.d() != null && p0.d().length > 0){
          this.c.U(p0.d());
          this.c.setVisibility(0);
       }else if(p0.b() > 0){
          this.d.setVisibility(0);
          this.d.setText(String.valueOf(p0.b()));
       }else if(p0.d != null){
          this.e.setVisibility(0);
       }
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneActivityIconTab.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneActivityIconTab.class, "7")) {
          return;
       }
       super.setSelected(p0);
       if (this.g != null) {
          if (p0) {
             this.b.setAlpha(0x3f800000);
             this.f.setAlpha(0x3f800000);
             this.c.setAlpha(0x3f800000);
             this.e.setAlpha(0x3f800000);
             this.d.setAlpha(0x3f800000);
          }else {
             this.b.setAlpha(0x3f000000);
             this.f.setAlpha(0x3f000000);
             this.c.setAlpha(0x3f000000);
             this.e.setAlpha(0x3f000000);
             this.d.setAlpha(0x3f000000);
          }
       }
       return;
    }
}
