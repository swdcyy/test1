package com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView;
import nm3.a;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopRollUserView;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import yh3.a;
import rn3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import go3.e;
import kotlin.jvm.internal.a;
import go3.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.widget.TextView;
import xh3.g;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class RedPacketConditionRollUserView extends RedPacketPopRollUserView implements a	// class@000f31
{

    public void RedPacketConditionRollUserView(Context p0){
       super(p0);
    }
    public void RedPacketConditionRollUserView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionRollUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(LifecycleOwner p0,a p1){
       this.c(p0, p1);
    }
    public void c(LifecycleOwner p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionRollUserView.class, "1")) {
          return;
       }
       RedPacketPopRollUserView tb = this.b;
       b d = p1.d;
       if (!PatchProxy.applyVoidThreeRefs(tb, p0, d, null, e.class, "2")) {
          a.p(tb, "$this$bind");
          a.p(p0, "lifecycleOwner");
          a.p(d, "imageCDNArray");
          d.observe(p0, new d(tb));
       }
       g.a(this.c, p0, p1.e);
       g.a(this.d, p0, p1.f);
       this.b.setOnClickListener(new RedPacketConditionRollUserView$a(this, p1));
       return;
    }
}
