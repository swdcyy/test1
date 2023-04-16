package com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeDialog$bindViews$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import wx2.c;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.facemagic.LiveFMEffectRenderView;
import com.yxcorp.download.DownloadManager;

public final class LevelUpNoticeDialog$bindViews$1 extends Lambda implements a	// class@001ab6
{
    public final c this$0;

    public void LevelUpNoticeDialog$bindViews$1(c p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LevelUpNoticeDialog$bindViews$1.class, "1")) {
          return;
       }
       c l = this.this$0.l;
       if (l == null) {
          a.S("effectView");
       }
       l.setEffectPath(this.this$0.m);
       DownloadManager.C("live_mic_seat_level_up", "");
       return;
    }
}
