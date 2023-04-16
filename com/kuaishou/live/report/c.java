package com.kuaishou.live.report.c;
import n3d.a;
import android.app.Activity;
import androidx.fragment.app.c;
import com.kwai.component.misc.report.ReportInfo;
import lp3.e;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import com.kuaishou.live.report.e$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import com.kuaishou.live.report.e;
import java.util.Objects;
import ap3.i;
import ap3.h;
import erd.g;
import crd.b;

public final class c implements a	// class@000f5a
{
    public final Activity b;
    public final c c;
    public final ReportInfo d;
    public final e e;
    public final LiveSceneInfoService$LiveSceneInfo f;
    public final LiveStreamFeed g;
    public final String h;
    public final String i;
    public final int j;
    public final e$a k;
    public final int l;
    public final PublishSubject m;

    public void c(Activity p0,c p1,ReportInfo p2,e p3,LiveSceneInfoService$LiveSceneInfo p4,LiveStreamFeed p5,String p6,String p7,int p8,e$a p9,int p10,PublishSubject p11){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
       this.m = p11;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       c tf = this.f;
       c tg = this.g;
       c th = this.h;
       c ti = this.i;
       c tj = this.j;
       c tk = this.k;
       c tl = this.l;
       c tm = this.m;
       if (QCurrentUser.ME.isLogined()) {
          Objects.requireNonNull(tm);
          e.g(tb, tc, td, te, tf, tg, th, ti, tj, tk, tl).subscribe(new i(tm), new h(tm));
       }
       return;
    }
}
