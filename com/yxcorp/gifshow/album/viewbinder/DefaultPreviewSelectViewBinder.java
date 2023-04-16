package com.yxcorp.gifshow.album.viewbinder.DefaultPreviewSelectViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;

public final class DefaultPreviewSelectViewBinder extends AbsPreviewSelectViewBinder	// class@001ae4
{

    public void DefaultPreviewSelectViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super(p0);
    }
    public boolean b(l0 p0){
       return false;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPreviewSelectViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       ViewStub viewStub = p0.findViewById(R.id.bottom_container_stub);
       a.h(viewStub, "viewStub");
       viewStub.setVisibility(0);
       this.a = p0.findViewById(0x7f0a308c);
       this.b = p0.findViewById(0x7f0a0495);
       this.c = p0.findViewById(0x7f0a0a37);
       this.d = p0.findViewById(0x7f0a2dc6);
       p0 = p0.findViewById(R.id.picked_recycler_view);
       a.h(p0, "rootView.findViewById\(R.id.picked_recycler_view\)");
       if (!PatchProxy.applyVoidOneRefs(p0, this, AbsPreviewSelectViewBinder.class, "2")) {
          a.q(p0, "<set-?>");
          this.e = p0;
       }
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultPreviewSelectViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d06fa, p1, false);
       a.h(view, "inflater.inflate\(R.layou¡­agment, container, false\)");
       return view;
    }
    public void onDestroy(){
    }
}
