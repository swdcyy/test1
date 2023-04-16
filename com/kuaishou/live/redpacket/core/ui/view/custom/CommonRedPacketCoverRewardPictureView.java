package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardPictureView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ko3.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;

public class CommonRedPacketCoverRewardPictureView extends FrameLayout	// class@000ef4
{
    public CommonRedPacketScrollView b;
    public a c;

    public void CommonRedPacketCoverRewardPictureView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketCoverRewardPictureView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketCoverRewardPictureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketCoverRewardPictureView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d020f, this);
          CommonRedPacketScrollView uCommonRedPa = this.findViewById(R.id.red_packet_reward_picture_scroll_view);
          this.b = uCommonRedPa;
          uCommonRedPa.getRecyclerView().setHorizontalFadingEdgeEnabled(true);
          this.b.getRecyclerView().setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          this.c = new a();
          this.b.getRecyclerView().setAdapter(this.c);
          this.b.getRecyclerView().addItemDecoration(new b(0, 0, a1.e(8.00f)));
       }
       return;
    }
}
