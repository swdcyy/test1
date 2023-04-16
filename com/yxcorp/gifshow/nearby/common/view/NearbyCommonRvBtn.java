package com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$c;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$f;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$a;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$d;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$e;
import java.util.List;
import y8c.g;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g9c.a;

public final class NearbyCommonRvBtn extends FrameLayout	// class@00213d
{
    public RecyclerView b;
    public List c;
    public NearbyCommonRvBtn$a d;
    public NearbyCommonRvBtn$d e;
    public NearbyCommonRvBtn$d f;
    public NearbyCommonRvBtn$e g;
    public final NearbyCommonRvBtn$g h;
    public static final NearbyCommonRvBtn$c i;

    static {
       NearbyCommonRvBtn.i = new NearbyCommonRvBtn$c(null);
    }
    public void NearbyCommonRvBtn(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NearbyCommonRvBtn(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NearbyCommonRvBtn(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d1088, this);
       this.b = this.findViewById(0x7f0a36c3);
       this.f = new NearbyCommonRvBtn$f(this);
       this.h = new NearbyCommonRvBtn$g(this);
    }
    public void NearbyCommonRvBtn(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, NearbyCommonRvBtn.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       NearbyCommonRvBtn tb = this.b;
       if (tb != null) {
          tb.addOnChildAttachStateChangeListener(this.h);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, NearbyCommonRvBtn.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       NearbyCommonRvBtn td = this.d;
       if (td != null) {
          td.onDestroy();
       }
       td = this.b;
       if (td != null) {
          td.removeOnChildAttachStateChangeListener(this.h);
       }
       return;
    }
    public final void setBtnClickedListener(NearbyCommonRvBtn$d p0){
       this.e = p0;
    }
    public final void setBtnVisibilityChangedListener(NearbyCommonRvBtn$e p0){
       this.g = p0;
    }
    public final void setData(List p0){
       NearbyCommonRvBtn td;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCommonRvBtn.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.c = p0;
          if (!PatchProxy.applyVoid(null, this, NearbyCommonRvBtn.class, "2")) {
             if (this.d == null) {
                NearbyCommonRvBtn$a uoa = new NearbyCommonRvBtn$a();
                uoa.n1("ON_BTN_CLICK", this.f);
                this.d = uoa;
             }
             td = this.b;
             if (td != null) {
                td.setAdapter(this.d);
             }
             td = this.b;
             if (td != null) {
                td.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
             }
          }
          td = this.d;
          if (td != null) {
             td.W0(p0);
          }
          NearbyCommonRvBtn td1 = this.d;
          if (td1 != null) {
             td1.k0();
          }
       }
       return;
    }
}
