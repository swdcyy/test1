package com.yxcorp.gifshow.camera.record.frame.j;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import kd9.e0;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.Objects;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.a1;
import java.lang.Math;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import ld9.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Collection;
import ekd.q;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import kd9.j0;
import java.lang.Runnable;
import ekd.k1;
import o07.o;

public class j implements PopupInterface$h	// class@000de8
{
    public final l b;

    public void j(l p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       int b = true;
       this.b.v = b;
       Object[] objArray = new Object[0];
       a.D().s("FrameSwitchController", "onShow", objArray);
       j tb = this.b;
       tb.t = p0;
       if (tb.f.isResumed()) {
          if (this.b.i2()) {
             this.b.d.m(new e0(b));
          }
          j tb1 = this.b;
          Objects.requireNonNull(tb1);
          l ol = l.class;
          if (!PatchProxy.applyVoid(null, tb1, ol, "16")) {
             l s = tb1.s;
             if (s != null && tb1.t != null) {
                int[] ointArray = new int[2];
                s.getLocationInWindow(ointArray);
                b = ointArray[b];
                if (PatchProxy.isSupport(ol)) {
                   Object obj = PatchProxy.applyOneRefs(Integer.valueOf(b), tb1, ol, "18");
                   if (obj != PatchProxyResult.class) {
                      i = obj.intValue();
                   }else {
                   label_007d :
                      float f = 10.00f;
                      if (tb1.i2()) {
                         int itemCount = tb1.t.z().findViewById(R.id.frame_panel_list).getAdapter().getItemCount();
                         int i1 = a1.e(40.00f) * itemCount;
                         i = Math.min(((int)tb1.e.findViewById(R.id.action_bar_layout).getY() - ((i1 + ((itemCount - 1) * a1.e(12.00f))) + a1.e(20.00f))), (b - a1.e(f)));
                      }else {
                         i = n.c(tb1.e, f) + (b + tb1.s.getMeasuredHeight());
                      }
                   }
                }else {
                   goto label_007d ;
                }
                tb1.t.z().setY((float)i);
             }
          }
          this.b.n2(0);
       }else {
          this.b.h2();
       }
       return;
    }
    public void H(c p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "2")) {
          return;
       }
       p1 = 0;
       Object[] objArray = new Object[p1];
       a.D().s("FrameSwitchController", "onDismiss", objArray);
       if (this.b.i2()) {
          this.b.d.m(new e0(p1));
       }
       ArrayList uArrayList = new ArrayList();
       if (this.b.z.o1()) {
          uArrayList.add("full_frame_v2");
          uArrayList.add("9_16_v2");
       }else if(!b.i(this.b.e)){
          uArrayList.add("full_frame");
       }
       uArrayList.add("9_16");
       uArrayList.add("4_3");
       uArrayList.add("1_1");
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(uArrayList, obj, CameraLogger.class, "9")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_FRAME_PLATFORM";
          if (!q.f(uArrayList)) {
             JsonObject jsonObject = new JsonObject();
             JsonArray jsonArray = new JsonArray();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                jsonArray.a0(iterator.next());
             }
             jsonObject.G("frame_name_array", jsonArray);
             uElementPack.params = jsonObject.toString();
          }
          u1.u0(6, uElementPack, obj);
       }
       uArrayList.t = obj;
       k1.r(new j0(this), 200);
       this.b.n2(true);
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       this.b.n2(true);
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
