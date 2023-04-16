package com.kuaishou.live.report.LiveReportFragment;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import java.util.ArrayList;
import gy2.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gy2.i;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import com.kwai.component.misc.report.ReportInfo;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lnc.l1;
import androidx.fragment.app.FragmentActivity;
import tkd.b;
import tkd.d;
import ym5.a;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import java.util.List;
import android.content.DialogInterface;
import android.content.Context;
import android.widget.TextView;
import ap3.c;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.report.LiveReportFragment$b;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.report.LiveReportFragment$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;

public class LiveReportFragment extends LiveBottomSheetFragment	// class@000f54
{
    public View B;
    public View C;
    public RecyclerView D;
    public ReportInfo E;
    public LiveStreamFeed F;
    public boolean G;
    public final List H;
    public ArrayList I;
    public String J;
    public String K;
    public String L;
    public static final int M;

    public void LiveReportFragment(){
       super();
       this.G = false;
       this.H = new ArrayList();
       this.I = new ArrayList();
    }
    public e Kh(){
       Object obj = PatchProxy.apply(null, this, LiveReportFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(0);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveReportFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.E = this.getArguments().get("report_info");
          this.F = SerializableHook.getSerializable(this.getArguments(), "key_photo");
          this.L = this.getArguments().getString("key_page2");
          this.J = this.getArguments().getString("live_scene_info");
          this.I = SerializableHook.getSerializable(this.getArguments(), "menu_info_list");
          this.K = this.getArguments().getString("general_Params");
          if (l1.a() && (this.getActivity() != null && (this.G == null && !d.a(0x4c5dd1b8).f2()))) {
             this.getActivity().setRequestedOrientation(1);
          }
       label_0089 :
          if (this.E == null) {
             this.dismiss();
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveReportFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d04ea, p1, false);
       this.B = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveReportFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       this.H.clear();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveReportFragment.class, "10")) {
          return;
       }
       super.onDismiss(p0);
       this.G = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveReportFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0 = a.a(this.getContext(), R.layout.arg_RES_7f0d07fa);
       this.C = p0;
       p0.findViewById(R.id.cancel_action).setOnClickListener(new c(this));
       this.D = this.B.findViewById(0x7f0a35b5);
       if (!PatchProxy.applyVoid(null, this, LiveReportFragment.class, "4") && this.isAdded()) {
          LiveReportFragment$b uob = new LiveReportFragment$b(this);
          uob.W0(this.I);
          this.D.setLayoutManager(new LinearLayoutManager(this.getContext()));
          a uoa = new a(1, false, false);
          uoa.o(a1.f(R.drawable.arg_RES_7f08145a));
          this.D.addItemDecoration(uoa);
          LiveReportFragment$a uoa1 = new LiveReportFragment$a(uob);
          uoa1.L0(this.C);
          this.D.setAdapter(uoa1);
       }
       return;
    }
}
