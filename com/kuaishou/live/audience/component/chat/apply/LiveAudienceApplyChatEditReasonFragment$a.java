package com.kuaishou.live.audience.component.chat.apply.LiveAudienceApplyChatEditReasonFragment$a;
import android.text.TextWatcher;
import com.kuaishou.live.audience.component.chat.apply.LiveAudienceApplyChatEditReasonFragment;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.TextView;
import java.util.Objects;
import px0.m;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.chat.apply.f;

public class LiveAudienceApplyChatEditReasonFragment$a implements TextWatcher	// class@000a60
{
    public final LiveAudienceApplyChatEditReasonFragment b;

    public void LiveAudienceApplyChatEditReasonFragment$a(LiveAudienceApplyChatEditReasonFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAudienceApplyChatEditReasonFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAudienceApplyChatEditReasonFragment$a.class, "1")) {
          return;
       }
       String str = p0.toString();
       p2 = 18;
       if (str.length() > p2) {
          str = str.substring(0, p2);
       }
       this.b.g2.setText(String.valueOf(str.length()));
       LiveAudienceApplyChatEditReasonFragment$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(str, tb, LiveAudienceApplyChatEditReasonFragment.class, "3")) {
          if (str.length() >= 5) {
             if (!PatchProxy.applyVoidOneRefs(str, tb, LiveAudienceApplyChatEditReasonFragment.class, "5")) {
                tb.f2.setAlpha(0x3f800000);
                tb.f2.setOnClickListener(new m(tb, str));
             }
          }else if(PatchProxy.applyVoid(null, tb, LiveAudienceApplyChatEditReasonFragment.class, "4")){
             tb.f2.setAlpha(0x3f000000);
             tb.f2.setOnClickListener(f.b);
          }
       }
       return;
    }
}
