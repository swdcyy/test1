package com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$b;
import erd.a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Objects;
import com.yxcorp.utility.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;

public final class ReEditTextFragment$b implements a	// class@000b53
{
    public final ReEditTextFragment b;

    public void ReEditTextFragment$b(ReEditTextFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReEditTextFragment$b.class, "1")) {
          return;
       }
       this.b.t.r();
       ReEditTextFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ReEditTextFragment.class, "13")) {
          Log.b("ReEditTextFragment", "successFinishActivity");
          FragmentActivity activity = tb.getActivity();
          if (activity != null) {
             activity.setResult(-1, new Intent());
             activity.finish();
             activity.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
          }
       }
       ReEditTextFragment i = this.b.I;
       if (i != null && i.isAdded() == true) {
          i = this.b.I;
          if (i != null) {
             i.dismiss();
          }
       }
       Log.g("ReEditTextFragment", "save ok");
       return;
    }
}
