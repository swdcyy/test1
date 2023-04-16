package com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV2;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.edit.decoration.text.c0;
import com.kuaishou.post.story.edit.decoration.text.f0;
import com.kuaishou.post.story.edit.decoration.text.h0;
import com.kuaishou.post.story.edit.decoration.text.b0;
import com.kuaishou.post.story.edit.decoration.text.j0;
import com.kuaishou.post.story.edit.decoration.text.x;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.post.story.edit.decoration.text.t;
import android.view.View;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;

public class StoryEditTextFragmentV2 extends StoryEditTextFragment	// class@000ad8
{

    public void StoryEditTextFragmentV2(){
       super();
    }
    public int getLayoutResId(){
       return 0x7f0d1574;
    }
    public void ki(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragmentV2.class, "2")) {
          return;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.Z0 = presenterV2;
       presenterV2.U7(new c0());
       this.Z0.U7(new f0());
       this.Z0.U7(new h0());
       this.Z0.U7(new b0());
       this.Z0.U7(new j0());
       this.Z0.U7(new x());
       if (this.li() && PostExperimentUtils.q()) {
          this.Z0.U7(new t());
       }
       this.Z0.f(this.Y0);
       Object[] objArray = new Object[]{this.a1};
       this.Z0.i(objArray);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryEditTextFragmentV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(false);
       return uDialog;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryEditTextFragmentV2.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, StoryEditTextFragmentV2.class, "4")) {
          View view = p0.findViewById(R.id.top_controller_container);
          boolean b = g.i(this.getActivity());
          if (!b) {
             int i = n.A(this.getContext());
             RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
             layoutParams.topMargin = i;
             p0.setLayoutParams(layoutParams);
             Object[] objArray = new Object[0];
             a.D().w("StoryEditTextFragmentV2", "adjustTopBar statusBarHeight:"+i, objArray);
          }
          Object[] objArray1 = new Object[0];
          a.D().w("StoryEditTextFragmentV2", "adjustTopBar hasNavigationBar:"+b, objArray1);
       }
       return;
    }
}
