package com.kuaishou.live.audience.component.comments.editor.LiveCommentFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import zx0.k0;
import t02.a0;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public class LiveCommentFloatEditorFragment extends FloatEditorFragment	// class@000a98
{
    public a0 w1;
    public PresenterV2 x1;
    public int y1;
    public static final int z1;

    public void LiveCommentFloatEditorFragment(){
       super();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveCommentFloatEditorFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       LiveCommentFloatEditorFragment tx1 = this.x1;
       if (tx1 != null) {
          tx1.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommentFloatEditorFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new k0().a(this.w1, this, this.y1);
       this.x1 = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this.w1};
       this.x1.i(objArray);
       return;
    }
}
