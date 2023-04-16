package com.kwai.live.gzone.accompanyplay.edit.o;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import n37.o;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import n37.l;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class o implements View$OnClickListener	// class@000c12
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       p q = tb.q;
       if (PatchProxy.applyVoidOneRefs(q, tb, p.class, "4")) {
       }else {
          BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(false).setEnableEmoji(false).setMonitorTextChange(true).setMonitorId(tb.hashCode()).setEnableSingleLine(true).setFinishButtonText(a1.p(R.string.arg_RES_7f1043c4)).setHintText(a1.p(R.string.arg_RES_7f102351)).setForceDayNightMode(32).setTextLimit(5).setCancelWhileKeyboardHidden(true);
          if (!TextUtils.isEmpty(q.getText())) {
             uArguments.setText(q.getText());
          }
          tb.s = new FloatEditorFragment();
          tb.s.setArguments(uArguments.build());
          tb.s.ai(new o(tb, q));
          tb.s.k0(new l(tb));
          tb.s.Cb(tb.getActivity().getSupportFragmentManager(), "LiveGzoneAccompanyFleetRenamePopupPresenter");
       }
       return;
    }
}
