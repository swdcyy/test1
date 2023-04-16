package com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.RelativeLayout;
import com.kuaishou.live.audience.course.widget.NoScrollGridView;
import android.widget.Button;
import android.widget.ImageButton;
import s31.u;
import android.view.View$OnClickListener;
import s31.v;
import s31.t;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.util.ArrayList;
import com.kuaishou.live.audience.course.model.CourseRate;
import d61.c0;
import t31.a;
import android.content.Context;
import java.util.List;
import java.util.Collection;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.GridView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import s31.x;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import brd.t;
import s31.w;
import com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment$b;
import erd.g;
import crd.b;

public class LiveCourseClosedDialogFragment extends LiveSafeDialogFragment implements d	// class@000bf6
{
    public NoScrollGridView A;
    public RelativeLayout B;
    public a$c C;
    public int s;
    public long t;
    public boolean u;
    public ArrayList v;
    public LiveCourseClosedDialogFragment$c w;
    public ImageButton x;
    public Button y;
    public Button z;
    public static final int D;

    public void LiveCourseClosedDialogFragment(){
       super();
       this.s = 0;
       this.C = new LiveCourseClosedDialogFragment$a(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCourseClosedDialogFragment.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a0b8b);
       this.A = m1.f(p0, 0x7f0a3beb);
       this.y = m1.f(p0, 0x7f0a2609);
       this.z = m1.f(p0, 0x7f0a1c3f);
       this.x = m1.f(p0, 0x7f0a0b66);
       m1.a(p0, new u(this), R.id.live_submit_button);
       m1.a(p0, new v(this), R.id.live_exit_button);
       m1.a(p0, new t(this), R.id.dialog_cancel_image_button);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCourseClosedDialogFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          String str = this.getArguments().getString("livecourse_lessonid");
          if (!TextUtils.isEmpty(str)) {
             this.t = Long.parseLong(str.trim());
          }
          this.u = this.getArguments().getBoolean("livecourse_frompage");
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCourseClosedDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f11035c);
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveCourseClosedDialogFragment.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0ad2, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, LiveCourseClosedDialogFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, obj, LiveCourseClosedDialogFragment.class, "7")) {
          ArrayList uArrayList = new ArrayList();
          c0 a = c0.a;
          CourseRate uCourseRate = new CourseRate(1, "UNSATISFIED", obj.getString(0x7f100906), a.b("udata/pkg/kwai-client-image/live_common/evalution_icon_discontent_expression_selected.webp"), a.b("udata/pkg/kwai-client-image/live_common/evalution_icon_discontent_expression_normal.webp"));
          uArrayList.add(v9);
          CourseRate uCourseRate1 = new CourseRate(1, "GENERAL", obj.getString(0x7f100905), a.b("udata/pkg/kwai-client-image/live_common/evalution_icon_notbad_expression_selected.webp"), a.b("udata/pkg/kwai-client-image/live_common/evalution_icon_notbad_expression_normal.webp"));
          uArrayList.add(uCourseRate);
          CourseRate uCourseRate2 = new CourseRate(1, "SATISFIED", obj.getString(0x7f100907), a.b("udata/pkg/kwai-client-image/live_common/evalution_icon_excellent_expression_selected.webp"), a.b("udata/pkg/kwai-client-image/live_common/evalution_icon_excellent_expression_normal.webp"));
          uArrayList.add(uCourseRate);
          a uoa = new a(this.getContext(), obj.s);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, uoa, a.class, "5")) {
             uoa.c.clear();
             uoa.c.addAll(uArrayList);
             uoa.notifyDataSetChanged();
          }
          obj.A.setAdapter(uoa);
          uoa.e = obj.C;
       }
       if (obj.u != null && !PatchProxy.applyVoid(objArray, obj, LiveCourseClosedDialogFragment.class, "12")) {
          obj.z.setVisibility(8);
          LinearLayout$LayoutParams layoutParams = obj.B.getLayoutParams();
          layoutParams.height = a1.e(270.00f);
          obj.B.setLayoutParams(layoutParams);
          obj.y.setText(R.string.arg_RES_7f100903);
          obj.y.setOnClickListener(new x(obj));
       }
       return;
    }
    public void wh(boolean p0){
       if (PatchProxy.isSupport(LiveCourseClosedDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCourseClosedDialogFragment.class, "13")) {
          return;
       }
       b.a(0x74d268f).evaluateLesson(this.t, this.v.get(0).mValue).subscribe(new w(this, p0), new LiveCourseClosedDialogFragment$b(this, p0));
       return;
    }
}
