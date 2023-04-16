package com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$b;
import android.view.ViewGroup;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import com.kuaishou.live.common.core.component.pk.b;
import rr2.k;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.util.SparseArray;
import ir2.c;
import lnc.c3$a;
import lnc.c3;

public class VoicePartyCrossRoomPkAnchorAndTopContributorView$b	// class@001486
{
    public final View a;
    public final LiveUserView b;
    public final KwaiImageView c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public void VoicePartyCrossRoomPkAnchorAndTopContributorView$b(ViewGroup p0,int p1,boolean p2,boolean p3){
       super();
       this.d = p2;
       this.e = p1;
       this.f = p3;
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d0e49, p0, false);
       this.a = view;
       p0.addView(view);
       this.b = view.findViewById(0x7f0a274f);
       this.c = view.findViewById(0x7f0a274e);
       this.b();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, VoicePartyCrossRoomPkAnchorAndTopContributorView$b.class, "4")) {
          return;
       }
       if (this.d != null) {
          b.e(this.b, LivePkResource$PkSkinResource.LIVE_PK_RANK_SELF_EMPTY);
       }else {
          b.e(this.b, LivePkResource$PkSkinResource.LIVE_PK_RANK_OPPONENT_EMPTY);
       }
       return;
    }
    public void b(){
       LivePkResource$PkSkinResource pkSkinResour;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkAnchorAndTopContributorView$b.class, "2")) {
          return;
       }
       VoicePartyCrossRoomPkAnchorAndTopContributorView$b te = this.e;
       VoicePartyCrossRoomPkAnchorAndTopContributorView$b td = this.d;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(te), Boolean.valueOf(td), objArray, ok, "1");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(td != null){
             pkSkinResour = k.a.get(te);
          }else {
             pkSkinResour = k.b.get(te);
          }
          if (pkSkinResour != null) {
             objArray = pkSkinResour;
          }
       }else {
          goto label_0030 ;
       }
       c3.c(objArray, new c(this));
       this.a();
       return;
    }
}
