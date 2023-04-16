package com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import android.widget.TextView;
import d61.h;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import d61.c0;
import java.lang.CharSequence;
import com.kuaishou.live.core.voiceparty.teampk.stage.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.teampk.stage.c;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.teampk.stage.d;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView$a;

public class VoicePartyTeamPkPrepareContainerView extends RelativeLayout	// class@00193a
{
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public View g;
    public View h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public KwaiImageView n;
    public View o;
    public VoicePartyTeamPkPrepareContainerView$a p;

    public void VoicePartyTeamPkPrepareContainerView(Context p0){
       super(p0, null);
    }
    public void VoicePartyTeamPkPrepareContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTeamPkPrepareContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.e6, p2, 0);
       this.b = typedArray.getBoolean(2, 0);
       this.c = typedArray.getString(3);
       this.d = typedArray.getString(0);
       this.e = typedArray.getString(4);
       this.f = typedArray.getString(1);
       typedArray.recycle();
       this.setClipChildren(0);
       a.c(p0, R.layout.arg_RES_7f0d16dd, this);
    }
    public final String a(int p0,int p1){
       if (PatchProxy.isSupport(VoicePartyTeamPkPrepareContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VoicePartyTeamPkPrepareContainerView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       return String.format(Locale.US, "%d/%d ", objArray);
    }
    public void b(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VoicePartyTeamPkPrepareContainerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VoicePartyTeamPkPrepareContainerView.class, "1")) {
          return;
       }
       boolean b = false;
       int i = (p0 >= p1)? 1: 0;
       h.k(this.j, this.a(p0, p1));
       VoicePartyTeamPkPrepareContainerView ti = this.i;
       VoicePartyTeamPkPrepareContainerView te = (i)? this.e: this.c;
       h.k(ti, TextUtils.k(te));
       this.g.setEnabled((i ^ 1));
       ti = (p2 >= p3)? 1: 0;
       h.k(this.l, this.a(p2, p3));
       VoicePartyTeamPkPrepareContainerView tk = this.k;
       VoicePartyTeamPkPrepareContainerView tf = (ti)? this.f: this.d;
       h.k(tk, TextUtils.k(tf));
       this.h.setEnabled((ti ^ 1));
       if (this.b != null) {
          ti = this.m;
          if (p0 > 0 && p2 > 0) {
             b = true;
          }
          ti.setEnabled(b);
       }
       return;
    }
    public boolean getCanShowStartButton(){
       return this.b;
    }
    public View getPrepareButtonLayout(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTeamPkPrepareContainerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.findViewById(0x7f0a44f5);
    }
    public View getStartButton(){
       return this.m;
    }
    public View getTeamPkTipView(){
       return this.o;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkPrepareContainerView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkPrepareContainerView.class, "4")) {
          this.g = this.findViewById(0x7f0a4502);
          this.h = this.findViewById(0x7f0a44e8);
          this.i = this.findViewById(0x7f0a4501);
          this.k = this.findViewById(0x7f0a44e7);
          this.j = this.findViewById(0x7f0a4507);
          this.l = this.findViewById(0x7f0a44ed);
          KwaiImageView kwaiImageVie = this.findViewById(R.id.voice_party_team_pk_start_button_bg_view);
          this.n = kwaiImageVie;
          kwaiImageVie.setPlaceHolderImage(R.drawable.arg_RES_7f081522);
          this.n.L(c0.a.b("udata/pkg/kwai-client-image/chat_room/live_live_startgame.webp"));
          this.m = this.findViewById(0x7f0a44f9);
          this.o = this.findViewById(0x7f0a44fb);
          this.i.setText(TextUtils.k(this.c));
          this.k.setText(TextUtils.k(this.d));
          this.g.setOnClickListener(new b(this));
          this.h.setOnClickListener(new c(this));
          int i = 0;
          if (this.b != null) {
             this.m.setVisibility(i);
             this.n.setVisibility(i);
             this.o.setVisibility(8);
             this.m.setOnClickListener(new d(this));
          }else {
             this.m.setVisibility(8);
             this.n.setVisibility(8);
             this.o.setVisibility(i);
          }
       }
       return;
    }
    public void setOnViewClickListener(VoicePartyTeamPkPrepareContainerView$a p0){
       this.p = p0;
    }
}
