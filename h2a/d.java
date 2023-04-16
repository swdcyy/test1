package h2a.d;
import android.view.View$OnClickListener;
import h2a.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import h2a.f;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.utility.n;

public final class d implements View$OnClickListener	// class@002544
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       g og = g.class;
       if (PatchProxy.applyVoid(null, tb, og, "4")) {
       }else {
          FloatEditorFragment uFloatEditor = new FloatEditorFragment();
          uFloatEditor.setArguments(new BaseEditorFragment$Arguments().setEnableAtFriends(false).setEnableInputAt(false).setMonitorTextChange(true).setCancelWhileKeyboardHidden(true).setShowLeftBtn(false).setEnableEmoji(false).setOnlyShowKwaiEmoji(false).setEnableNewGifEmotions(false).setSendBtnPermanent(false).setShowEmojiFirst(false).setShowUserAlias(false).setInterceptEvent(true).setText(tb.q.getText()).setTextLimit(100).setFinishButtonLayoutGravityOnBottom(true).setFinishButtonBackgroundResId(R.drawable.arg_RES_7f0801c8).setFinishButtonText(a1.p(R.string.arg_RES_7f1007e2)).setHintText(a1.p(R.string.arg_RES_7f105044)).build());
          uFloatEditor.ai(new f(tb));
          uFloatEditor.show(tb.s, og.getName());
          g r = tb.r;
          if (r != null) {
             n.Y(r, 8, true);
          }
       }
       return;
    }
}
