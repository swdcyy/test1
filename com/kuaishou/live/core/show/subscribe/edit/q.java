package com.kuaishou.live.core.show.subscribe.edit.q;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import androidx.fragment.app.Fragment;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$b;
import com.kuaishou.live.core.show.subscribe.helper.LiveAnchorSubscribeFloatEditorFragment;
import android.os.Bundle;
import sk2.v;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$n;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import sk2.d0;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Integer;
import wk2.s;

public final class q implements View$OnClickListener	// class@001124
{
    public final LiveSubscribeEditFragment b;

    public void q(LiveSubscribeEditFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q tb = this.b;
       LiveSubscribeEditFragment r = tb.r;
       if (PatchProxy.applyVoidOneRefs(r, tb, LiveSubscribeEditFragment.class, "25")) {
       }else {
          LiveAnchorSubscribeFloatEditorFragment liveAnchorSu = new LiveAnchorSubscribeFloatEditorFragment();
          liveAnchorSu.setArguments(new BaseEditorFragment$Arguments().setEnableAtFriends(false).setEnableEmoji(false).setMonitorTextChange(true).setInterceptEvent(true).setMonitorId(tb.hashCode()).setFinishButtonText(a1.p(R.string.arg_RES_7f1043c4)).setHintText(String.valueOf(r.getHint())).setText(r.getText()).setTextLimit(tb.j.c).setCancelWhileKeyboardHidden(true).build());
          liveAnchorSu.ei(new v(tb));
          liveAnchorSu.ai(new d0(tb, r));
          liveAnchorSu.Cb(tb.getChildFragmentManager(), "LiveSubscribeEditTitleFragment");
       }
       s.r(2, null, tb.j.e.get(), tb.j.f.get());
       return;
    }
}
