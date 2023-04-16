package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$l;
import tyc.u5;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.widget.RelativeLayout;

public final class VideoCoverProportionViewBinder$l implements u5	// class@000eac
{
    public final VideoCoverProportionViewBinder a;

    public void VideoCoverProportionViewBinder$l(VideoCoverProportionViewBinder p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, VideoCoverProportionViewBinder$l.class, "1")) {
          return;
       }
       RelativeLayout relativeLayo = this.a.I().v();
       if (relativeLayo != null) {
          relativeLayo.getVisibility();
       }
       PatchProxy.onMethodExit(VideoCoverProportionViewBinder$l.class, "1");
       return;
    }
}
