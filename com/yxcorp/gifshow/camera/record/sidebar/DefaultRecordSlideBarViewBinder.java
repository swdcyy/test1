package com.yxcorp.gifshow.camera.record.sidebar.DefaultRecordSlideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.viewbinder.BaseViewBinder;
import android.view.View;
import c35.p;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;

public class DefaultRecordSlideBarViewBinder extends AbsRecordSideBarViewBinder	// class@000f0a
{

    public void DefaultRecordSlideBarViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public TextImageView B(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a124b, 0x7f0a124c);
    }
    public View D(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a4320, 0x7f0a431f);
    }
    public PressedImageView H(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a0f8b, 0x7f0a0f89);
    }
    public View I(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a0f8b, 0x7f0a0f8a);
    }
    public ImageView J(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a0f8b, 0x7f0a0f8c);
    }
    public TextView K(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a0f8b, 0x7f0a0f8d);
    }
    public View M(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a29e2, 0x7f0a29e1);
    }
    public View N(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a36eb, 0x7f0a36ea);
    }
    public TextImageView O(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.findViewById(0x7f0a05d5);
    }
    public ImageView P(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, DefaultRecordSlideBarViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q();
       if (obj != null) {
          objArray = obj.findViewById(0x7f0a3c1e);
       }
       return objArray;
    }
    public View Q(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordSlideBarViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a3b1c, 0x7f0a3c1d);
    }
    public TextView R(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, DefaultRecordSlideBarViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q();
       if (obj != null) {
          objArray = obj.findViewById(0x7f0a3c1f);
       }
       return objArray;
    }
    public boolean onInterceptUserEvent(View p0,ViewModel p1,boolean p2){
       if (PatchProxy.isSupport(DefaultRecordSlideBarViewBinder.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, DefaultRecordSlideBarViewBinder.class, "3");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return false;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultRecordSlideBarViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.G(p0.findViewById(R.id.camera_sidebar_layout));
       this.i = p0.findViewById(0x7f0a0510);
       this.E(p0.findViewById(R.id.count_down_combinant));
       return;
    }
    public int z(){
       return 0x7f0d018f;
    }
}
