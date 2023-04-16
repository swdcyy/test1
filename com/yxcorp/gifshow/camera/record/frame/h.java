package com.yxcorp.gifshow.camera.record.frame.h;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.camera.record.frame.f;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.frame.FrameModeInfo;
import android.app.Activity;
import ld9.b;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import java.util.List;
import g9c.a;
import kd9.g0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import o07.n;

public final class h implements PopupInterface$f	// class@000de6
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       h tb = this.b;
       int i = (tb.i2())? 0x7f0d15a0: 0x7f0d159d;
       boolean b = false;
       View view = a.g(p1, i, p2, b);
       RecyclerView recyclerView = view.findViewById(R.id.frame_panel_list);
       float f = 10.00f;
       if (tb.i2()) {
          recyclerView.setLayoutManager(new LinearLayoutManager(tb.e, 1, b));
          recyclerView.addItemDecoration(new b(1, a1.e(f), a1.e(f), a1.e(12.00f)));
       }else {
          recyclerView.setLayoutManager(new LinearLayoutManager(tb.e, b, b));
          recyclerView.addItemDecoration(new b(b, a1.e(f), a1.e(f), b));
       }
       f uof = new f(tb.d.d(l.i).a, tb.i2());
       ArrayList uArrayList = new ArrayList();
       FrameModeInfo[] uFrameModeIn = FrameModeInfo.values();
       int len = uFrameModeIn.length;
       while (b < len) {
          object oobject = uFrameModeIn[b];
          if (b.i(tb.e)) {
             FrameModeInfo mFrameMode = oobject.mFrameMode;
             if (mFrameMode != 4 && mFrameMode != 5) {
             label_0095 :
                if (tb.z.o1()) {
                   mFrameMode = oobject.mFrameMode;
                   if (mFrameMode == 1) {
                      oobject.mFrameLogMode = "9_16_v2";
                   }else if(mFrameMode == 4){
                   }
                }else if(oobject.mFrameMode == 5){
                }
             }
          }else {
             goto label_0095 ;
          }
       label_00b1 :
          b = b + 1;
       }
       uof.W0(uArrayList);
       uof.h = new g0(tb);
       recyclerView.setAdapter(uof);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
