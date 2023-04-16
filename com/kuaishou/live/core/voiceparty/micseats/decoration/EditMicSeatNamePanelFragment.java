package com.kuaishou.live.core.voiceparty.micseats.decoration.EditMicSeatNamePanelFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.micseats.decoration.EditMicSeatNamePanelFragment$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micseats.decoration.EditMicSeatNamePanelFragment$b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import android.content.Context;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import i2b.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import zf6.k;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.ImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import qrd.l1;
import pt2.b;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xs2.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import android.widget.TextView;
import android.widget.EditText;
import java.lang.Exception;
import java.lang.StringBuilder;
import android.text.Editable;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import xs2.i;
import android.text.TextWatcher;
import com.yxcorp.utility.n;
import xs2.j;
import android.view.View$OnClickListener;
import xs2.k;

public final class EditMicSeatNamePanelFragment extends LiveSafeDialogFragment	// class@001594
{
    public final String A;
    public final EditMicSeatNamePanelFragment$a B;
    public HashMap C;
    public final String s;
    public KwaiImageView t;
    public KwaiImageView u;
    public AppCompatTextView v;
    public AppCompatEditText w;
    public AppCompatImageView x;
    public AppCompatTextView y;
    public final VoicePartyMicSeatData z;

    public void EditMicSeatNamePanelFragment(VoicePartyMicSeatData p0,String p1,EditMicSeatNamePanelFragment$a p2){
       a.p(p0, "micSeatData");
       a.p(p2, "callback");
       super();
       this.z = p0;
       this.A = p1;
       this.B = p2;
       this.s = "EditMicSeatNamePanelFragment";
    }
    public static final AppCompatImageView wh(EditMicSeatNamePanelFragment p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("clearButton");
       }
       return p0;
    }
    public static final AppCompatEditText xh(EditMicSeatNamePanelFragment p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("nameEditText");
       }
       return p0;
    }
    public static final AppCompatTextView yh(EditMicSeatNamePanelFragment p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("previewName");
       }
       return p0;
    }
    public static final AppCompatTextView zh(EditMicSeatNamePanelFragment p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("submitButton");
       }
       return p0;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, EditMicSeatNamePanelFragment.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       EditMicSeatNamePanelFragment$b uob = new EditMicSeatNamePanelFragment$b(this, activity, this.getTheme());
       Window window = uob.getWindow();
       if (window != null) {
          window.setBackgroundDrawableResource(0x106000d);
          window.requestFeature(1);
          window.setDimAmount(0);
          window.setWindowAnimations(R.style.arg_RES_7f1103d9);
          window.setGravity(80);
       }
       return uob;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EditMicSeatNamePanelFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, "onCreateView");
       View view = a.g(p0, R.layout.arg_RES_7f0d0e4b, p1, false);
       a.o(view, "view");
       view.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, EditMicSeatNamePanelFragment.class, "9")) {
       }else {
          EditMicSeatNamePanelFragment tC = this.C;
          if (tC != null) {
             tC.clear();
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditMicSeatNamePanelFragment.class, "5")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, EditMicSeatNamePanelFragment.class, "7")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setLayout(-1, -2);
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       b a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditMicSeatNamePanelFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, EditMicSeatNamePanelFragment.class, "6")) {
          view = p0.findViewById(R.id.live_voice_party_edit_mic_seat_name_preview_background);
          String str = "null cannot be cast to non-null type com.yxcorp.gifshow.image.KwaiImageView";
          Objects.requireNonNull(view, str);
          int i = 0;
          if (k.d()) {
             view.setActualImageResource(i);
             view.setBackgroundResource(R.drawable.arg_RES_7f0814f9);
          }else {
             view.L(c0.a.b("udata/pkg/kwai-client-image/chat_room/live_voice_party_edit_mic_seat_name_preview_container_background_image.webp"));
             view.setBackgroundResource(i);
          }
          this.t = view;
          view = p0.findViewById(R.id.live_voice_party_edit_mic_seat_name_preview_avatar);
          Objects.requireNonNull(view, str);
          VoicePartyMicSeatData mMicUser = this.z.mMicUser;
          if (mMicUser != null) {
             a = mMicUser.a;
             if (a != null) {
                UserInfo mHeadUrls = a.mHeadUrls;
                if (mHeadUrls != null) {
                   view.U(mHeadUrls);
                }
             }
          }
          this.u = view;
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = "";
          mMicUser = this.z.mDecoration;
          if (mMicUser != null && mMicUser.b() == true) {
             mMicUser = this.z.mDecoration;
             a.m(mMicUser);
             if (!TextUtils.isEmpty(mMicUser.a())) {
                mMicUser = this.z.mDecoration;
                a.m(mMicUser);
                str = mMicUser.a();
                a.m(str);
                objectRef.element = str;
             }
          }
          View view1 = p0.findViewById(R.id.live_voice_party_edit_mic_seat_name_preview_name);
          a.o(view1, "rootView.findViewById\(R.¡­c_seat_name_preview_name\)");
          this.v = view1;
          String str1 = "previewName";
          if (view1 == null) {
             a.S(str1);
          }
          String str2 = (TextUtils.isEmpty(objectRef.element))? a1.p(R.string.arg_RES_7f102e3a): objectRef.element;
          view1.setText(str2);
          EditMicSeatNamePanelFragment tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          i = (a.g("M", this.A))? 0x7f081510: 0x7f081511;
          tv.setBackgroundResource(i);
          view1 = p0.findViewById(R.id.live_voice_party_edit_mic_seat_name_input);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText");
          Ref$ObjectRef element = objectRef.element;
          try{
             view1.setText(element);
             view1.setSelection((objectRef.element).length());
          }catch(java.lang.Exception e2){
             StringBuilder str3 = "setSelection ["+objectRef.element+"] ["+(objectRef.element).length()+"] [";
             Editable text = view1.getText();
             Integer integer = (text != null)? Integer.valueOf(text.length()): null;
             ExceptionHandler.handleCaughtException(new Exception(str3+integer+']', e2));
          }
          view1.addTextChangedListener(new i(this, objectRef));
          view1.requestFocus();
          n.a0(view1.getContext(), view1, 100);
          this.w = view1;
          view1 = p0.findViewById(R.id.live_voice_party_edit_mic_seat_name_clear);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
          view1.setOnClickListener(new j(this));
          this.x = view1;
          p0 = p0.findViewById(R.id.live_voice_party_edit_mic_seat_name_submit);
          Objects.requireNonNull(p0, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
          p0.setOnClickListener(new k(this, objectRef));
          p0.setEnabled((TextUtils.isEmpty(objectRef.element) ^ 1));
          this.y = p0;
       }
       return;
    }
}
