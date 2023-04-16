package com.kuaishou.live.core.voiceparty.crossroompk.result.LiveVoicePartyCrossRoomTeamPkResultsDialogFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.util.SparseArray;
import com.kuaishou.live.core.voiceparty.crossroompk.resource.VoicePartyCrossRoomPkSkinResource;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.content.DialogInterface;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import fr2.b;
import com.kuaishou.live.common.core.basic.resource.c;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import hc.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import android.content.Context;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import gr2.a;
import java.lang.Runnable;

public class LiveVoicePartyCrossRoomTeamPkResultsDialogFragment extends LiveSafeDialogFragment implements d	// class@001480
{
    public final SparseArray A;
    public LiveTextView s;
    public LinearLayout t;
    public KwaiImageView u;
    public int v;
    public List w;
    public boolean x;
    public final Handler y;
    public final SparseIntArray z;

    public void LiveVoicePartyCrossRoomTeamPkResultsDialogFragment(){
       super();
       this.y = new Handler(Looper.getMainLooper());
       SparseIntArray sparseIntArr = new SparseIntArray();
       this.z = sparseIntArr;
       SparseArray sparseArray = new SparseArray();
       this.A = sparseArray;
       sparseIntArr.put(0, R.string.arg_RES_7f102036);
       sparseIntArr.put(1, R.string.arg_RES_7f102032);
       sparseIntArr.put(2, R.string.arg_RES_7f102035);
       sparseArray.put(0, VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_WIN_ANIM);
       sparseArray.put(1, VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_LOSE_ANIM);
       sparseArray.put(2, VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_PK_TIE_ANIM);
    }
    public static LiveVoicePartyCrossRoomTeamPkResultsDialogFragment wh(int p0,List p1,boolean p2){
       LiveVoicePartyCrossRoomTeamPkResultsDialogFragment obj;
       if (PatchProxy.isSupport(LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveVoicePartyCrossRoomTeamPkResultsDialogFragment();
       obj.v = p0;
       obj.w = p1;
       obj.x = p2;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "6")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1bdc);
       this.t = m1.f(p0, 0x7f0a1bda);
       this.u = m1.f(p0, 0x7f0a1bdb);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       uDialog.getWindow().setLayout(-1, -1);
       uDialog.setCanceledOnTouchOutside(0);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0e44, p1, false);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "10")) {
          return;
       }
       super.onDismiss(p0);
       this.y.removeCallbacksAndMessages(null);
       LiveVoicePartyCrossRoomTeamPkResultsDialogFragment tu = this.u;
       if (!PatchProxy.applyVoidOneRefs(tu, null, b.class, "3")) {
          c.f(tu);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "4")) {
          this.doBindView(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "7")) {
             this.s.setText(a1.p(this.z.get(this.v)));
             b.b(this.u, this.A.get(this.v), 1, objArray);
          }
          if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "8") && !q.f(this.w)) {
             Iterator iterator = this.w.iterator();
             while (iterator.hasNext()) {
                UserInfo userInfo = iterator.next();
                LiveVoicePartyCrossRoomTeamPkResultsDialogFragment tt = this.t;
                LiveVoicePartyCrossRoomTeamPkResultsDialogFragment tx = this.x;
                if (PatchProxy.isSupport(LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class) && PatchProxy.applyVoidThreeRefs(tt, userInfo, Boolean.valueOf(tx), this, LiveVoicePartyCrossRoomTeamPkResultsDialogFragment.class, "9")) {
                   continue ;
                }else {
                   View view = a.d(tt.getContext(), R.layout.arg_RES_7f0d0e45, tt, false);
                   LiveUserView liveUserView = view.findViewById(R.id.live_voice_party_cross_room_pk_results_guests_avatar_view);
                   KwaiImageView kwaiImageVie = view.findViewById(R.id.live_voice_party_cross_room_pk_results_avatar_team_view);
                   tt.addView(view);
                   g.d(liveUserView, userInfo, HeadImageSize.MIDDLE);
                   VoicePartyCrossRoomPkSkinResource rESULT_DIALO = (tx != null)? VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_YELLOW_TEAM_CONTRIBUTOR_AVATAR_BORDER: VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_BLUE_TEAM_CONTRIBUTOR_AVATAR_BORDER;
                   b.a(kwaiImageVie, rESULT_DIALO);
                }
             }
          }
       }
       this.y.postDelayed(new a(this), 6000);
       return;
    }
}
