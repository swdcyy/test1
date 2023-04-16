package com.yxcorp.gifshow.camera.record.frame.o;
import tm6.b;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import tm6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import kd9.s0;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import sm6.b;
import gh9.d;
import ug9.c;
import hd9.n;
import wd9.a;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class o implements b	// class@000dee
{
    public final Activity a;
    public final b b;
    public boolean c;
    public int d;
    public static final int e;

    static {
       o.e = a1.e(8.00f);
    }
    public void o(Activity p0,b p1){
       super();
       this.c = true;
       this.d = 0;
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       this.c = true;
    }
    public void b(int p0,long p1){
       a.b(this, p0, p1);
    }
    public void c(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "1")) {
          return;
       }
       View view = this.a.findViewById(R.id.action_bar_layout);
       View view1 = this.a.findViewById(R.id.delete_segment_btn);
       View view2 = this.a.findViewById(R.id.arc_scaleview);
       View view3 = this.a.findViewById(R.id.check_multi_mode_container);
       int i = this.e();
       int i1 = (this.c != null)? i: i - this.d;
       this.d = i;
       boolean b = false;
       this.c = b;
       if (view != null) {
          Guideline guideline = view.findViewById(R.id.frame_bottom_guide_line);
          if (guideline != null && this.a instanceof CameraActivity) {
             f.G(view, new s0(this, view, guideline, i1));
          }else {
             b.a(view, i1);
          }
       }
       d a = this.b.d(d.c).a;
       if (view3 != null) {
          if (a == null) {
             b.a(view3, i1);
          }
       }else {
          view3 = this.a.findViewById(R.id.take_picture_multi_mode_stub);
          if (view3 != null && a == null) {
             b.a(view3, i1);
          }
       }
       view = this.a.findViewById(R.id.take_picture_btn);
       if (view != null) {
          b.a(view, i1);
       }
       if (this.b.d(c.c).a == null && (this.b.d(n.j).a == null && this.b.d(a.i).a == null)) {
          view = this.a.findViewById(R.id.time_mode_stub);
          view3 = this.a.findViewById(R.id.camera_time_tab_scroll_container);
          View view4 = this.a.findViewById(R.id.time_mode_group);
          if (view != null) {
             b.a(view, i1);
          }else if(view3 != null){
             b.a(view3, i1);
          }
          if (view4 != null) {
             b.a(view4, i1);
          }
          if (view != null) {
             b = b.o(view);
          }else if(view3 != null){
             b = b.o(view3);
          }
          view = this.a.findViewById(R.id.camera_scroll_snapshot_tab_stub);
          view3 = this.a.findViewById(R.id.camera_scroll_snapshot_tab_container);
          if (view != null) {
             b.v(view, b);
          }else if(view3 != null){
             b.v(view3, b);
          }
       }
    label_011c :
       RecordButton recordButton = this.a.findViewById(R.id.record_btn_layout);
       if (recordButton != null) {
          recordButton.setProgressTextMargin(a1.d(R.dimen.arg_RES_7f070d76));
       }
       view = this.a.findViewById(R.id.auto_download_panel_stub);
       view3 = this.a.findViewById(R.id.auto_download_panel_layout);
       if (view != null) {
          b.a(view, i1);
       }else if(view3 != null){
          b.a(view3, i1);
       }
       view = this.a.findViewById(R.id.platform_refresh_stub);
       view3 = this.a.findViewById(R.id.platform_refresh_layout);
       if (view != null) {
          b.a(view, i1);
       }else if(view3 != null){
          b.a(view3, i1);
       }
       view = this.a.findViewById(R.id.control_speed_stub);
       view3 = this.a.findViewById(R.id.control_speed_layout);
       if (view != null) {
          b.a(view, i1);
       }else if(view3 != null){
          b.a(view3, i1);
       }
       if (i > this.d() && view1 != null) {
          view1.setTranslationY((float)o.e);
       }
       if (view2 != null && view2.getTag(0x7f0a3718) == null) {
          b.w(view2, (view2.getHeight() + this.d()));
          view2.setTag(R.id.scale_view_frame_adjusted, Boolean.TRUE);
       }
       return;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.j(this.a);
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.q(this.a);
    }
}
