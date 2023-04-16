package com.kwai.live.gzone.accompanyplay.edit.n0;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.o0;
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
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import n37.b2;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import n37.x1;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import n37.w1;
import android.content.DialogInterface$OnDismissListener;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class n0 implements View$OnClickListener	// class@000c0d
{
    public final o0 b;

    public void n0(o0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n0 tb = this.b;
       tb.P8();
       o0 w = tb.w;
       o0 oo0 = o0.class;
       if (PatchProxy.applyVoidOneRefs(w, tb, oo0, "9")) {
       }else {
          BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(false).setEnableEmoji(false).setMonitorTextChange(true).setMonitorId(tb.hashCode()).setForceDayNightMode(32).setFinishButtonText(a1.p(R.string.arg_RES_7f1043c4)).setHintText(tb.p.mHint).setTextLimit(100).setKeyboardType(2).setCancelWhileKeyboardHidden(true);
          if (!TextUtils.x(w.getText())) {
             uArguments.setText(w.getText());
          }
          tb.y = new FloatEditorFragment();
          tb.y.setArguments(uArguments.build());
          tb.y.ai(new b2(tb, w));
          if (PatchProxy.applyVoid(null, tb, oo0, "10") || (tb.z > null && tb.A > null)) {
             tb.y.ph(new x1(tb));
          }
       label_009e :
          tb.y.k0(new w1(tb));
          tb.y.Cb(tb.getActivity().getSupportFragmentManager(), "LiveGzoneAnchorAccompanyFleetSettingTicketItemPresenter");
       }
       return;
    }
}
