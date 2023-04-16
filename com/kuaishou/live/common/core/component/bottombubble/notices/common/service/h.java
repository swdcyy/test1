package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.h;
import nc1.k;
import lp3.a;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ne1.k;
import com.kwai.framework.abtest.f;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o56.c;
import java.lang.CharSequence;
import e17.i;
import lp3.e;
import bq5.h;
import lp3.c;
import bq5.f;
import java.lang.System;
import nc1.j;
import android.text.TextUtils;
import java.util.Set;
import bq5.d;
import nc1.l;
import java.lang.Runnable;

public class h extends a implements k	// class@000fa0
{
    public Handler d;
    public final Set e;
    public long f;
    public final boolean g;

    public void h(){
       boolean b;
       super();
       this.d = new Handler(Looper.getMainLooper());
       this.e = new HashSet();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = PatchProxy.apply(null, null, k.class, "14");
          b = (obj != patchProxyRe)? obj.booleanValue(): f.a("enableHideCommentNoticeInSmallScreen");
          if (b && a.b().getResources().getConfiguration().screenHeightDp <= 760) {
             b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "CommonAreaOpt disable strong notification for small screen");
             if (a.a().c()) {
                i.d(R.style.arg_RES_7f110668, "测试：小屏机隐藏强提醒");
             }
             b = true;
          }else {
             b = false;
          }
       }
       this.g = b;
       return;
    }
    public void D6(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       f uof = this.Po().a(h.class).t3();
       if (uof != null) {
          uof.d();
       }
       return;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       this.f = System.currentTimeMillis();
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       b.Z(LiveCommonLogTag.COMMENT_NOTICE, "onDestroy");
       this.d.removeCallbacksAndMessages(null);
       return;
    }
    public void Y9(j p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       j i = p0.i;
       LiveCommonLogTag liveCommonLo = null;
       String str = 1;
       if (!TextUtils.isEmpty(i) && this.e.contains(i)) {
          b.Z(LiveCommonLogTag.COMMENT_NOTICE, "addCommentNoticeItem bizId dup");
          liveCommonLo = 1;
       }
       if (this.g != null) {
          b.Z(LiveCommonLogTag.COMMENT_NOTICE, "addCommentNoticeItem skip for small screen & CommentAreaOpt");
       }else {
          str = liveCommonLo;
       }
       if (str != null) {
          if (p0.b() != null) {
             p0.b().b();
          }
          return;
       }else if(!TextUtils.isEmpty(i)){
          this.e.add(i);
       }
       i = p0.k;
       if ((System.currentTimeMillis() - this.f) - 5000 < 0) {
          l = i + (System.currentTimeMillis() - this.f);
       }
       if (l - null > 0) {
          b.c0(LiveCommonLogTag.COMMENT_NOTICE, "schedule addCommentNoticeItem", "item", p0);
          this.d.postDelayed(new l(this, p0), l);
       }else {
          b.Z(LiveCommonLogTag.COMMENT_NOTICE, "addCommentNoticeItem immediately");
          this.Po().a(h.class).Oh(p0);
       }
       return;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.Po().a(h.class).m0();
       return;
    }
    public f t3(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Po().a(h.class).t3();
    }
}
