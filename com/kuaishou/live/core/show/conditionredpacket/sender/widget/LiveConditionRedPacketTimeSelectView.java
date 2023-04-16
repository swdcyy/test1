package com.kuaishou.live.core.show.conditionredpacket.sender.widget.LiveConditionRedPacketTimeSelectView;
import androidx.constraintlayout.widget.ConstraintLayout;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.kuaishou.live.core.show.conditionredpacket.sender.widget.LiveConditionRedPacketTimeSelectView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.view.View;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import android.view.ViewGroup;
import i2b.a;
import android.util.AttributeSet;
import msd.p;
import android.widget.TextView;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public final class LiveConditionRedPacketTimeSelectView extends ConstraintLayout	// class@000ac8
{
    public final ArrayList B;
    public final e C;
    public final ArrayList D;
    public p E;
    public Object F;
    public HashMap G;
    public static final n[] H;
    public static final LiveConditionRedPacketTimeSelectView$a I;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(LiveConditionRedPacketTimeSelectView.class, "mTitleTextView", "getMTitleTextView\(\)Landroid/widget/TextView;", 0))};
       LiveConditionRedPacketTimeSelectView.H = onArray;
       LiveConditionRedPacketTimeSelectView.I = new LiveConditionRedPacketTimeSelectView$a(null);
    }
    public void LiveConditionRedPacketTimeSelectView(Context p0){
       a.p(p0, "context");
       super(p0);
       ArrayList uArrayList = new ArrayList(3);
       this.B = uArrayList;
       this.C = KotterKnifeKt.a(this, 0x7f0a1c7f);
       this.D = new ArrayList();
       a.d(this.getContext(), R.layout.arg_RES_7f0d0acd, this, true);
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_left));
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_mid));
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_right));
    }
    public void LiveConditionRedPacketTimeSelectView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       ArrayList uArrayList = new ArrayList(3);
       this.B = uArrayList;
       this.C = KotterKnifeKt.a(this, 0x7f0a1c7f);
       this.D = new ArrayList();
       a.d(this.getContext(), R.layout.arg_RES_7f0d0acd, this, true);
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_left));
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_mid));
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_right));
    }
    public void LiveConditionRedPacketTimeSelectView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList(3);
       this.B = uArrayList;
       this.C = KotterKnifeKt.a(this, 0x7f0a1c7f);
       this.D = new ArrayList();
       a.d(this.getContext(), R.layout.arg_RES_7f0d0acd, this, true);
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_left));
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_mid));
       uArrayList.add(this.findViewById(R.id.live_condition_send_time_text_right));
    }
    public final Object getMCurrentData(){
       return this.F;
    }
    public final p getMOnItemSelectedListener(){
       return this.E;
    }
    public final TextView getMTitleTextView(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketTimeSelectView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.a(this, LiveConditionRedPacketTimeSelectView.H[0]);
    }
    public final void setMCurrentData(Object p0){
       this.F = p0;
    }
    public final void setMOnItemSelectedListener(p p0){
       this.E = p0;
    }
    public final void setTitleText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketTimeSelectView.class, "3")) {
          return;
       }
       a.p(p0, "titleText");
       this.getMTitleTextView().setText(p0);
       return;
    }
}
