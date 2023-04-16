package com.kuaishou.live.gzone.barrage.j;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.barrage.l;
import java.lang.Object;
import android.view.View;
import b53.u0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import pm8.a;
import t02.a0;
import p91.m;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import android.widget.ImageView;
import android.view.ViewGroup;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.ArrayList;
import com.kuaishou.live.gzone.barrage.q;
import java.util.List;
import v37.a;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.TextView;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import b53.b0;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.widget.LinearLayout$LayoutParams;

public final class j implements View$OnClickListener	// class@001c3b
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       LiveFansGroupIntimacyInfo mStatus;
       ClientContent$ContentPackage uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa3;
       ClientEvent$ElementPackage uElementPack2;
       j b = this.b;
       u0 ou0 = u0.class;
       l ol = l.class;
       Object[] objArray = null;
       int i = 8;
       if (!b.z.getVisibility()) {
          b.z.setVisibility(i);
          if (!PatchProxy.applyVoid(objArray, b, ol, "5")) {
             LinkedHashMap linkedHashMa = a.I(l.J);
             if (linkedHashMa == null) {
                linkedHashMa = new LinkedHashMap();
             }
             linkedHashMa.put(b.x.Z2.d(), Integer.valueOf(b.G));
             if (linkedHashMa.size() > 100) {
                linkedHashMa.remove(linkedHashMa.keySet().iterator().next());
             }
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString(b.d("user")+"live_gzone_color_barrage_highest_level_map", b.e(linkedHashMa));
             g.a(uEditor);
          }
       }
       b.A.setVisibility(i);
       int i1 = 0;
       b.y.setVisibility(i1);
       if (b.y.isSelected()) {
          b.R8(true);
       }else if(PatchProxy.applyVoid(objArray, b, ol, "8")){
          if (b.v == null && !PatchProxy.applyVoid(objArray, b, ol, "12")) {
             b.v = a.i(b.u, 0x7f0d0ba1);
             b.u.getLayoutParams().height = b.s.U;
             b.u.addView(b.v);
             RecyclerView recyclerView = b.v.findViewById(R.id.live_gzone_color_barrage_right_container);
             b.D = recyclerView;
             recyclerView.setLayoutManager(new LinearLayoutManager(b.v.getContext(), i1, i1));
             b.D.addItemDecoration(new b(i1, a1.e(7.00f)));
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(b.x);
             uArrayList.add(b.t);
             q oq = new q(uArrayList);
             oq.W0(b.x.X2.a());
             b.D.setAdapter(oq);
             TextView textView = b.v.findViewById(R.id.live_gzone_color_barrage_join_view);
             TextView textView1 = b.v.findViewById(R.id.live_gzone_color_barrage_tip_view);
             if (b.x.r1.Qi().mStatus == true || b.x.r1.Qi().mStatus == null) {
                textView.setVisibility(i);
                textView1.setVisibility(i);
             }else {
                textView.setOnClickListener(new b0(b, textView));
                textView.setVisibility(i1);
                textView1.setVisibility(i1);
                if (b.x.r1.Qi().mStatus == 2) {
                   textView.setText(R.string.arg_RES_7f10422c);
                   textView1.setText(R.string.arg_RES_7f10422d);
                }else if(b.x.r1.Qi().mStatus == 3){
                   textView.setText(R.string.arg_RES_7f104f73);
                   textView1.setText(R.string.arg_RES_7f104f74);
                }
                LiveFansGroupIntimacyInfo mStatus1 = b.x.r1.Qi().mStatus;
                String str = (textView.getText() == null)? "": textView.getText().toString();
                ClientContent$LiveStreamPackage liveStreamPa2 = b.x.Z2.a();
                if (PatchProxy.isSupport(ou0)) {
                   liveStreamPa3 = liveStreamPa2;
                   if (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(mStatus1), str, liveStreamPa2, null, u0.class, "6")) {
                   }
                }else {
                   liveStreamPa3 = liveStreamPa2;
                }
             }
          }
          if (b.s.Th()) {
             b.s.gi();
             if (b.s.Nh() != null) {
                b.s.Nh().setVisibility(i);
             }
          }
          b.y.setSelected(true);
          b.y.setImageResource(R.drawable.arg_RES_7f0804d7);
          b.y.setPadding(i1, i1, i1, i1);
          b.s.Qh();
          b.u.setVisibility(i1);
          ol = b.C;
          if (ol != null && ol.getLayoutParams() instanceof LinearLayout$LayoutParams) {
             b.C.getLayoutParams().weight = 0;
             b.C.getLayoutParams().height = b.H;
          }
          b.s.Xh(i1);
          mStatus = b.x.r1.Qi().mStatus;
          ClientContent$LiveStreamPackage liveStreamPa1 = b.x.Z2.a();
          if (!PatchProxy.isSupport(ou0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mStatus), liveStreamPa1, null, ou0, "3")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "COLORFUL_COMMENT_PANEL";
             uElementPack1.params = u0.a(mStatus);
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa1;
             u1.u0(6, uElementPack1, uContentPack);
          }
       }
       mStatus = b.x.r1.Qi().mStatus;
       ClientContent$LiveStreamPackage liveStreamPa = b.x.Z2.a();
       if (!PatchProxy.isSupport(ou0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mStatus), liveStreamPa, null, ou0, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COLORFUL_COMMENT_ENTRY_BUTTON";
          uElementPack.params = u0.a(mStatus);
          uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(true, uElementPack, uContentPack);
       }
       return;
    }
}
