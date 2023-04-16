package com.kuaishou.live.audience.component.chat.apply.i;
import com.kwai.live.gzone.widget.e;
import android.app.Activity;
import com.kuaishou.live.audience.component.chat.apply.i$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import lnc.a1;
import java.lang.CharSequence;
import px0.w;
import android.view.View$OnClickListener;
import px0.x;

public class i extends e	// class@000a72
{
    public final i$a x;
    public final int y;

    public void i(Activity p0,int p1,i$a p2){
       super(p0);
       this.y = p1;
       this.x = p2;
    }
    public int d0(){
       return 0x7f0d09ee;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       TextView textView = p0.findViewById(R.id.live_audience_apply_chat_popup_subtitle);
       TextView textView1 = p0.findViewById(R.id.live_audience_apply_chat_popup_description);
       SelectShapeTextView selectShapeT = p0.findViewById(R.id.live_audience_apply_chat_popup_apply_button);
       SelectShapeTextView selectShapeT1 = p0.findViewById(R.id.live_audience_apply_chat_popup_give_up_button);
       i ty = this.y;
       if (ty == 0x138cd) {
          textView.setText(a1.p(R.string.arg_RES_7f102127));
          textView1.setText(a1.p(R.string.arg_RES_7f102d44));
          selectShapeT.setText(a1.p(R.string.arg_RES_7f102206));
       }else if(ty == 0x138ce){
          textView.setText(a1.p(R.string.arg_RES_7f10212a));
          textView1.setText(a1.p(R.string.arg_RES_7f102850));
          selectShapeT.setText(a1.p(R.string.arg_RES_7f102516));
       }
       selectShapeT1.setOnClickListener(new w(this));
       selectShapeT.setOnClickListener(new x(this));
       return;
    }
}
