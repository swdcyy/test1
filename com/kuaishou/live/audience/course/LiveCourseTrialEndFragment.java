package com.kuaishou.live.audience.course.LiveCourseTrialEndFragment;
import ml8.d;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import s31.g0;
import android.view.View$OnClickListener;
import s31.h0;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kuaishou.live.audience.course.o;
import com.kuaishou.android.live.model.QLivePlayExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveCourseTrialEndFragment extends Fragment implements d	// class@000bf8
{
    public LiveCourseTrialEndFragment$a b;
    public PopupWindow$OnDismissListener c;
    public boolean d;
    public TextView e;
    public KwaiImageView f;
    public QLivePlayExtraInfo g;
    public static final int h;

    public void LiveCourseTrialEndFragment(){
       super();
       this.d = false;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveCourseTrialEndFragment.class, "6")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       try{
          this.getFragmentManager().beginTransaction().u(this).m();
       }catch(java.lang.Exception e0){
       }
       LiveCourseTrialEndFragment tc = this.c;
       if (tc != null) {
          tc.onDismiss();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCourseTrialEndFragment.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a2b4f);
       this.f = m1.f(p0, 0x7f0a1bc5);
       m1.a(p0, new g0(this), R.id.confirm_btn);
       m1.a(p0, new h0(this), R.id.cancel_btn);
       this.f.L(c0.a.b("/udata/pkg/kwai-client-image/live_paid/qa_img_late_normal.webp"));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveCourseTrialEndFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0ad3, p1, false);
       view.setBackgroundColor(Integer.MIN_VALUE);
       view.setOnClickListener(o.b);
       this.doBindView(view);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCourseTrialEndFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       LiveCourseTrialEndFragment tg = this.g;
       if (tg != null && !TextUtils.x(tg.mTrialSubTitle)) {
          this.e.setText(tg.mTrialSubTitle);
       }
       return;
    }
}
