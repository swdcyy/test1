package com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView;
import android.widget.FrameLayout;
import android.content.Context;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$c;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$g;
import java.lang.Boolean;

public class RedPacketPopupPrepareSharePolicyAreaView extends FrameLayout	// class@000f23
{
    public View b;
    public TextView c;
    public TextView d;
    public TextView e;
    public RecyclerView f;
    public TextView g;
    public final RedPacketPopupPrepareSharePolicyAreaView$c h;
    public RedPacketPopupPrepareSharePolicyAreaView$g i;

    public void RedPacketPopupPrepareSharePolicyAreaView(Context p0){
       super(p0);
       this.h = new RedPacketPopupPrepareSharePolicyAreaView$c(this, null);
       this.a(p0);
    }
    public void RedPacketPopupPrepareSharePolicyAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = new RedPacketPopupPrepareSharePolicyAreaView$c(this, null);
       this.a(p0);
    }
    public void RedPacketPopupPrepareSharePolicyAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = new RedPacketPopupPrepareSharePolicyAreaView$c(this, null);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPopupPrepareSharePolicyAreaView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0da4, this);
       this.b = this.findViewById(0x7f0a3f1d);
       this.d = this.findViewById(0x7f0a0ebe);
       this.e = this.findViewById(0x7f0a37ee);
       this.g = this.findViewById(0x7f0a036a);
       this.c = this.findViewById(0x7f0a353c);
       RecyclerView recyclerView = this.findViewById(R.id.user_info_recycler_view);
       this.f = recyclerView;
       recyclerView.setLayoutManager(new LinearLayoutManager(p0, 0, 0));
       this.f.addItemDecoration(new RedPacketPopupPrepareSharePolicyAreaView$e(a1.d(R.dimen.arg_RES_7f070d8a)));
       this.f.setAdapter(this.h);
       return;
    }
    public TextView getAvatarRightTipTextView(){
       return this.g;
    }
    public TextView getFirstLineTextView(){
       return this.d;
    }
    public TextView getRefreshView(){
       return this.c;
    }
    public TextView getSecondLineTextView(){
       return this.e;
    }
    public void setOnItemClickedListener(RedPacketPopupPrepareSharePolicyAreaView$g p0){
       this.i = p0;
    }
    public void setRefreshViewVisibility(boolean p0){
       if (PatchProxy.isSupport(RedPacketPopupPrepareSharePolicyAreaView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RedPacketPopupPrepareSharePolicyAreaView.class, "2")) {
          return;
       }
       if (p0) {
          this.c.setVisibility(0);
          this.b.setVisibility(8);
       }else {
          this.b.setVisibility(0);
          this.c.setVisibility(8);
       }
       return;
    }
}
