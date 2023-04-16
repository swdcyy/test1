package com.yxcorp.gifshow.camera.record.sidebar.DefaultPictureSideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsPictureSideBarViewBinder;
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
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;

public final class DefaultPictureSideBarViewBinder extends AbsPictureSideBarViewBinder	// class@000f09
{

    public void DefaultPictureSideBarViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public TextImageView B(){
       Object obj = PatchProxy.apply(null, this, DefaultPictureSideBarViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a124b, 0x7f0a124c);
    }
    public View D(){
       Object obj = PatchProxy.apply(null, this, DefaultPictureSideBarViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a4320, 0x7f0a431f);
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPictureSideBarViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.G(p0.findViewById(R.id.camera_sidebar_layout));
       this.E(p0.findViewById(R.id.count_down_combinant));
       return;
    }
    public int z(){
       return 0x7f0d15b6;
    }
}
