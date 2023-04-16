package com.kuaishou.live.core.show.vote.fragment.LiveVoteResultFragment;
import ml8.d;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import zl2.o;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import ekd.k1;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import am2.a;

public class LiveVoteResultFragment extends ContainerFragment implements d	// class@001237
{
    public View A;
    public View B;
    public View C;
    public f D;
    public TextView x;
    public TextView y;
    public TextView z;
    public static final int E;

    public void LiveVoteResultFragment(){
       super();
    }
    public final void Ch(boolean p0){
       if (PatchProxy.isSupport(LiveVoteResultFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoteResultFragment.class, "7")) {
          return;
       }
       LiveVoteResultFragment tD = this.D;
       if (tD != null) {
          tD.Q3(LiveSlidePlayService$DisableSlidePlayFunction.LIVE_VOTE, p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoteResultFragment.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a4537);
       this.C = m1.f(p0, 0x7f0a453d);
       this.A = m1.f(p0, 0x7f0a4536);
       this.z = m1.f(p0, 0x7f0a453b);
       this.y = m1.f(p0, 0x7f0a4538);
       this.B = m1.f(p0, 0x7f0a453c);
       m1.a(p0, new o(this), R.id.live_vote_ok_button);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoteResultFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d0e81, p1, b);
       if (!PatchProxy.applyVoidOneRefs(view, this, LiveVoteResultFragment.class, "3")) {
          this.doBindView(view);
          int i = 8;
          if (k1.h()) {
             this.C.setVisibility(b);
             this.B.setVisibility(i);
          }else {
             this.C.setVisibility(i);
             this.B.setVisibility(b);
          }
          if (this.getArguments() != null) {
             String str = this.Zg("vote_result_text");
             if (!TextUtils.isEmpty(str)) {
                this.z.setVisibility(b);
                this.A.setVisibility(i);
                this.z.setText(str);
             }else {
                this.z.setVisibility(i);
                this.A.setVisibility(b);
                LiveVoteOption liveVoteOpti = this.Zg("vote_result");
                if (liveVoteOpti != null) {
                   this.x.setText(liveVoteOpti.mContent);
                   Object[] objArray = new Object[]{String.valueOf(liveVoteOpti.mCount)};
                   this.y.setText(String.format(this.getString(R.string.arg_RES_7f102e8e), objArray));
                }
             }
          }
          this.setCancelable(b);
          this.Ch(b);
       }
       return view;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoteResultFragment.class, "6")) {
          return;
       }
       super.onDismiss(p0);
       this.Ch(true);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoteResultFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, null, a.class, "6")) {
          a.d(0x7878, 4);
       }
       return;
    }
    public boolean th(){
       return true;
    }
}
