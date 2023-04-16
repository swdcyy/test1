package ced.l0;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.p;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import wm6.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import zdd.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import k2b.e0;
import gbd.t;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import nf6.i;
import com.kuaishou.android.model.music.MusicRankModelV2;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;

public final class l0 implements View$OnClickListener	// class@000565
{
    public final p b;
    public final SpannableStringBuilder c;

    public void l0(p p0,SpannableStringBuilder p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       l0 tb = this.b;
       TagInfo mMusic = tb.p.mMusic;
       String str = this.c.toString();
       if (PatchProxy.applyVoidTwoRefs(mMusic, str, tb, p.class, "5")) {
       }else if(a.b(mMusic)){
          t.l(1, tb.q, a.a(tb.p, "HEAD_HOTLIST_SUBCARD", str), a.d());
          tb.getActivity().startActivity(b.a(0x66dce92a).a(tb.getActivity(), w0.f(mMusic.mMusicRankModelV2.mKwaiUrl)));
       }
       return;
    }
}
