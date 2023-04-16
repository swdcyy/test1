package com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$d$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm6.b$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import ccc.c;
import erd.g;
import crd.b;

public class MissUUserProfileAndNoticeFragment$d$a extends m	// class@001a01
{
    public final MissUUserProfileAndNoticeFragment$d c;

    public void MissUUserProfileAndNoticeFragment$d$a(MissUUserProfileAndNoticeFragment$d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUUserProfileAndNoticeFragment$d$a.class, "1")) {
          return;
       }
       b$a uoa = new b$a(this.c.getActivity(), 0);
       uoa.c0(true);
       y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).Q(new c(this, uoa));
       return;
    }
}
