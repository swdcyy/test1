package com.kwai.live.gzone.accompanyplay.edit.e0;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.f0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import n37.o0;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import n37.m0;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class e0 implements View$OnClickListener	// class@000be1
{
    public final f0 b;

    public void e0(f0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e0 tb = this.b;
       f0 t = tb.t;
       if (PatchProxy.applyVoidOneRefs(t, tb, f0.class, "5")) {
       }else {
          BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(false).setEnableEmoji(false).setMonitorTextChange(true).setMonitorId(tb.hashCode()).setFinishButtonText(a1.p(R.string.arg_RES_7f1043c4)).setForceDayNightMode(32).setHintText(tb.p.mHint).setEnableSingleLine(true).setTextLimit(255).setCancelWhileKeyboardHidden(true);
          if (!TextUtils.isEmpty(t.getText())) {
             uArguments.setText(t.getText());
          }
          tb.v = new FloatEditorFragment();
          tb.v.setArguments(uArguments.build());
          tb.v.ai(new o0(tb, t));
          tb.v.k0(new m0(tb));
          tb.v.Cb(tb.getActivity().getSupportFragmentManager(), "LiveGzoneAnchorAccompanyFleetSettingInputItemPresenter");
       }
       return;
    }
}
