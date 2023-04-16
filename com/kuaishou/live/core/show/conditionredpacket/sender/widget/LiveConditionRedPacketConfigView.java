package com.kuaishou.live.core.show.conditionredpacket.sender.widget.LiveConditionRedPacketConfigView;
import androidx.constraintlayout.widget.ConstraintLayout;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import android.util.AttributeSet;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import java.lang.CharSequence;

public final class LiveConditionRedPacketConfigView extends ConstraintLayout	// class@000ac6
{
    public final e B;
    public final e C;
    public final e D;
    public String E;
    public HashMap F;
    public static final n[] G;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(LiveConditionRedPacketConfigView.class, "mTitleTextView", "getMTitleTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(LiveConditionRedPacketConfigView.class, "mUnitTextView", "getMUnitTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(LiveConditionRedPacketConfigView.class, "mContentTextView", "getMContentTextView\(\)Landroid/widget/TextView;", 0))};
       LiveConditionRedPacketConfigView.G = onArray;
    }
    public void LiveConditionRedPacketConfigView(Context p0){
       a.p(p0, "context");
       super(p0);
       a.d(this.getContext(), R.layout.arg_RES_7f0d0ac0, this, true);
       this.B = KotterKnifeKt.a(this, 0x7f0a1c7f);
       this.C = KotterKnifeKt.a(this, 0x7f0a1c80);
       this.D = KotterKnifeKt.a(this, 0x7f0a1c7e);
    }
    public void LiveConditionRedPacketConfigView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       a.d(this.getContext(), R.layout.arg_RES_7f0d0ac0, this, true);
       this.B = KotterKnifeKt.a(this, 0x7f0a1c7f);
       this.C = KotterKnifeKt.a(this, 0x7f0a1c80);
       this.D = KotterKnifeKt.a(this, 0x7f0a1c7e);
    }
    public void LiveConditionRedPacketConfigView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.d(this.getContext(), R.layout.arg_RES_7f0d0ac0, this, true);
       this.B = KotterKnifeKt.a(this, 0x7f0a1c7f);
       this.C = KotterKnifeKt.a(this, 0x7f0a1c80);
       this.D = KotterKnifeKt.a(this, 0x7f0a1c7e);
    }
    public final String getDataText(){
       String obj = PatchProxy.apply(null, this, LiveConditionRedPacketConfigView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = TextUtils.k(this.E);
       a.o(obj, "TextUtils.emptyIfNull\(mDataText\)");
       return obj;
    }
    public final TextView getMContentTextView(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketConfigView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.a(this, LiveConditionRedPacketConfigView.G[2]);
    }
    public final TextView getMTitleTextView(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketConfigView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.a(this, LiveConditionRedPacketConfigView.G[0]);
    }
    public final TextView getMUnitTextView(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketConfigView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.a(this, LiveConditionRedPacketConfigView.G[1]);
    }
    public final void setContentHint(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketConfigView.class, "7")) {
          return;
       }
       a.p(p0, "text");
       this.getMContentTextView().setHint(p0);
       return;
    }
    public final void setTitleTest(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketConfigView.class, "4")) {
          return;
       }
       a.p(p0, "text");
       this.getMTitleTextView().setText(p0);
       return;
    }
    public final void setUnitText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketConfigView.class, "5")) {
          return;
       }
       a.p(p0, "text");
       this.getMUnitTextView().setText(p0);
       return;
    }
}
