package com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import ml8.d;
import android.app.Dialog;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import t02.a0;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import y8c.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import ek2.u;
import android.view.View$OnClickListener;
import ek2.v;
import ek2.w;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.os.Bundle;
import android.view.Window;

public class LiveAudienceStayInfoRecommendDialog extends Dialog implements d	// class@0010af
{
    public final BaseFragment b;
    public TextView c;
    public RecyclerView d;
    public SelectShapeTextView e;
    public TextView f;
    public View$OnClickListener g;
    public View$OnClickListener h;
    public final m i;
    public final a0 j;
    public final g k;
    public final StayInfo l;
    public final List m;

    public void LiveAudienceStayInfoRecommendDialog(Context p0,BaseFragment p1,a0 p2,StayInfo p3,g p4){
       super(p0, 0x7f110362);
       QPhoto[] qPhotoArray = new QPhoto[]{new QPhoto(),new QPhoto(),new QPhoto()};
       this.m = Arrays.asList(qPhotoArray);
       this.b = p1;
       this.j = p2;
       this.i = p2.Z2;
       this.l = p3;
       this.k = p4;
    }
    public StayInfo a(){
       return this.l;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceStayInfoRecommendDialog.class, "3")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a25d2);
       this.d = m1.f(p0, 0x7f0a25d1);
       this.e = m1.f(p0, 0x7f0a25d0);
       this.f = m1.f(p0, 0x7f0a1c3f);
       m1.a(p0, new u(this), R.id.close_btn);
       m1.a(p0, new v(this), R.id.live_square_notice_more_anchor_button);
       m1.a(p0, new w(this), R.id.live_exit_button);
       this.d.setLayoutManager(new LiveAudienceStayInfoRecommendDialog$1(this, this.getContext(), 0, 0));
       this.k.n1("LIVE_SQUARE_SLIDE_BAR_FRAGMENT", this.b);
       this.k.n1("BASIC_CONTEXT", this.i);
       this.k.n1("LIVE_PLAY_CALLER_CONTEXT", this.j);
       this.k.n1("LIVE_SQUARE_SLIDE_BAR_NOTICE_DIALOG", this);
       this.k.W0(this.m);
       this.d.setAdapter(this.k);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceStayInfoRecommendDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0de1);
       this.doBindView(this.getWindow().getDecorView());
       this.setCancelable(false);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceStayInfoRecommendDialog.class, "2")) {
          return;
       }
       super.onStop();
       return;
    }
}
