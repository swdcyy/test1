package com.yxcorp.gifshow.camera.record.photo.f;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg9.p;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import hg9.o;
import erd.g;
import crd.b;
import eoc.f;

public class f extends d	// class@000eaa
{
    public View n;

    public void f(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.k(p0);
       p0 = p0.findViewById(R.id.camera_tab_scroll_container);
       this.n = p0;
       if (p0 != null) {
          p0.findViewById(R.id.tab_magic_profile).setSelected(true);
          f.G(this.n, new p(this));
          this.Y1(f.a(PanelShowEvent.class, new o(this)));
       }
       return;
    }
}
