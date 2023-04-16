package com.yxcorp.gifshow.camera.record.album.slideup.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.album.slideup.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import android.view.ViewStub;
import android.view.ViewParent;
import vb9.e;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout$a;
import com.yxcorp.gifshow.camera.record.album.slideup.AlbumSlideUpBehavior;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import android.widget.FrameLayout;
import lnc.a1;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import vb9.c;
import java.util.List;
import oc9.e0;
import java.util.Iterator;
import oc9.t;
import vb9.p;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;

public final class b implements Runnable	// class@001cce
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       Object[] obj = PatchProxy.apply(null, tb, uoc, "12");
       boolean b = true;
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray = new Object[i];
          String str = "AlbumSlideUpController";
          a.D().w(str, "initViews", objArray);
          if (tb.l == null) {
             obj = new Object[i];
             a.D().A(str, "mView is null.", obj);
          }else if(tb.s != null && tb.B != null){
             obj = new Object[i];
             a.D().w(str, "initViews already run", obj);
          }else {
             tb.s = tb.e.findViewById(0x7f0a369f);
             tb.t = tb.d.b().z7();
             tb.u = tb.e.findViewById(0x7f0a063e);
             View view = tb.e.findViewById(R.id.camera_scroll_snapshot_tab_container);
             if (view != null) {
                tb.v = view.findViewById(0x7f0a0640);
             }
             ViewStub viewStub = tb.l.findViewById(R.id.album_slide_up_layout_stub);
             if (viewStub != null && viewStub.getParent() != null) {
                viewStub.inflate();
             }else {
                objArray = new Object[i];
                a.D().w(str, "viewStub is already inflate", objArray);
             }
             tb.w = tb.l.findViewById(0x7f0a0086);
             tb.x = tb.l.findViewById(0x7f0a0635);
             tb.y = tb.l.findViewById(0x7f0a34a3);
             view = tb.l.findViewById(R.id.album_slide_up_layout);
             tb.z = view;
             if (view == null) {
                obj = new Object[i];
                a.D().A(str, "mAlbumSlideUpLayout is null", obj);
             }else {
                view = view.findViewById(R.id.bottom_sheet);
                tb.A = view.findViewById(0x7f0a01e2);
                tb.s.setTouchEventListener(new e(tb));
                AlbumSlideUpBehavior uAlbumSlideU = AlbumSlideUpBehavior.j(view);
                tb.B = uAlbumSlideU;
                uAlbumSlideU.R = tb;
                uAlbumSlideU.v = tb;
                uAlbumSlideU.setFitToContents(b);
                int i1 = ((tb.s.getHeight() - n.o(tb.y)[b]) + a1.d(0x7f070097)) + c.J;
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i1;
                view.setLayoutParams(layoutParams);
                tb.B.setPeekHeight((i1 - c.L));
                view.post(new c(tb));
                tb.B.setState(4);
                tb.B.m(i);
                c z = tb.z;
                if (!PatchProxy.applyVoidOneRefs(z, tb, uoc, "22")) {
                   Iterator iterator = tb.getChildren().iterator();
                   while (iterator.hasNext()) {
                      t ot = iterator.next();
                      if (ot instanceof p) {
                         ot.u(z, tb.B);
                      }
                   }
                }
             }
          }
          b = false;
       }
       if (!b && tb.d.b().V7() != null) {
          tb.d.b().V7().u(RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL);
       }
       return;
    }
}
