package com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import un1.k;
import ln1.c;

public final class LiveHotSpotDetailBaseInfoDataBinding$a extends RecyclerView$r	// class@00136c
{
    public final LiveHotSpotDetailBaseInfoDataBinding a;

    public void LiveHotSpotDetailBaseInfoDataBinding$a(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveHotSpotDetailBaseInfoDataBinding$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveHotSpotDetailBaseInfoDataBinding$a.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       ViewParent parent = this.a.d.getParent();
       if (!parent instanceof ViewGroup) {
          parent = null;
       }
       if (parent != null) {
          LiveHotSpotDetailBaseInfoDataBinding$a ta = this.a;
          ta.f.o0().setValue(new c(((float)parent.getTop() / (float)ta.a)));
       }
       return;
    }
}
