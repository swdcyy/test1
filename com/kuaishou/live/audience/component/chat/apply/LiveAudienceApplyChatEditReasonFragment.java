package com.kuaishou.live.audience.component.chat.apply.LiveAudienceApplyChatEditReasonFragment;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import com.kuaishou.live.audience.component.chat.apply.LiveAudienceApplyChatEditReasonFragment$a;
import android.text.TextWatcher;
import crd.b;
import lnc.b9;

public class LiveAudienceApplyChatEditReasonFragment extends EmotionFloatEditorFragment	// class@000a62
{
    public TextView f2;
    public TextView g2;
    public LiveAudienceApplyChatEditReasonFragment$b h2;
    public String i2;
    public b j2;
    public EditText k2;
    public static final int l2;

    public void LiveAudienceApplyChatEditReasonFragment(){
       super();
    }
    public void Li(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceApplyChatEditReasonFragment.class, "6")) {
          return;
       }
       super.Li();
       this.f2 = this.W0.findViewById(0x7f0a08fe);
       this.g2 = this.W0.findViewById(0x7f0a0d59);
       EditText uEditText = this.W0.findViewById(R.id.editor);
       this.k2 = uEditText;
       uEditText.addTextChangedListener(new LiveAudienceApplyChatEditReasonFragment$a(this));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0aac;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceApplyChatEditReasonFragment.class, "1")) {
          return;
       }
       super.onDestroy();
       b9.a(this.j2);
       return;
    }
}
