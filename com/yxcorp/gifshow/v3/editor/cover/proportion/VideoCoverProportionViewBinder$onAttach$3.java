package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$onAttach$3;
import tyc.d0;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tpc.e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1;
import java.io.File;
import msd.a;

public final class VideoCoverProportionViewBinder$onAttach$3 implements d0	// class@000eb1
{
    public final VideoCoverProportionViewBinder a;

    public void VideoCoverProportionViewBinder$onAttach$3(VideoCoverProportionViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       VideoCoverProportionViewBinder$onAttach$3 oonAttach$3 = VideoCoverProportionViewBinder$onAttach$3.class;
       if (PatchProxy.isSupport(oonAttach$3) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oonAttach$3, "1")) {
          return;
       }
       if (this.a.G().y0() != p0) {
          this.a.G().C0(p0, true);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$onAttach$3.class, "2")) {
          return;
       }
       FragmentActivity activity = this.a.J().getActivity();
       if (activity != null) {
          VideoCoverProportionViewBinder$onAttach$3 ta = this.a;
          ta.Q(ta.p, new VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1(activity, this));
       }
       return;
    }
}
