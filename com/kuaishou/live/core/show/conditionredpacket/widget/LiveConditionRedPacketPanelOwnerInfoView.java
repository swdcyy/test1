package com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.KwaiImageView;
import z12.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView$b;

public class LiveConditionRedPacketPanelOwnerInfoView extends LinearLayout implements d	// class@000acd
{
    public LiveUserView b;
    public TextView c;
    public LiveConditionRedPacketPanelOwnerInfoView$b d;

    public void LiveConditionRedPacketPanelOwnerInfoView(Context p0){
       super(p0, null);
    }
    public void LiveConditionRedPacketPanelOwnerInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveConditionRedPacketPanelOwnerInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPanelOwnerInfoView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0ac4, this);
          this.setOrientation(1);
          this.doBindView(this);
       }
       return;
    }
    public void a(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPanelOwnerInfoView.class, "3")) {
          return;
       }
       x.c(this.b, p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPanelOwnerInfoView.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.c.setVisibility(0);
          this.c.setText(p0);
       }else {
          this.c.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPanelOwnerInfoView.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1b86);
       this.c = m1.f(p0, 0x7f0a1b87);
       this.b.setOnClickListener(new LiveConditionRedPacketPanelOwnerInfoView$a(this));
       return;
    }
    public void setLiveConditionRedPacketPanelOwnerInfoClickListener(LiveConditionRedPacketPanelOwnerInfoView$b p0){
       this.d = p0;
    }
}
