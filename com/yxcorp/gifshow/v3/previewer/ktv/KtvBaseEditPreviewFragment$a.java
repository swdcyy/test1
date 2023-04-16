package com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import java.lang.StringBuilder;
import ooc.p0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import android.content.Context;
import androidx.fragment.app.Fragment;

public class KtvBaseEditPreviewFragment$a extends m	// class@0015a7
{
    public final KtvBaseEditPreviewFragment c;

    public void KtvBaseEditPreviewFragment$a(KtvBaseEditPreviewFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvBaseEditPreviewFragment$a.class, "1")) {
          return;
       }
       KaraokeScoreInfo mLevel = this.c.Q1.mKtvScoreInfo.mLevel;
       String str = this.c.Q1.mKtvScoreInfo.mTotalScore+"";
       if (!PatchProxy.applyVoidTwoRefs(mLevel, str, null, p0.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SCORER_CARD";
          i3 oi3 = i3.f();
          oi3.d("level", mLevel);
          oi3.d("grade", str);
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, new ClientContent$ContentPackage());
       }
       KtvBaseEditPreviewFragment$a tc = this.c;
       tc.ui(Boolean.FALSE, tc.getContext());
       return;
    }
}
