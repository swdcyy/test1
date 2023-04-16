package com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic$a;
import op2.j;
import com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic;
import java.lang.Object;
import op2.f;
import op2.i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public final class TheaterChatViewGroupLogic$a implements j	// class@001965
{
    public final TheaterChatViewGroupLogic b;

    public void TheaterChatViewGroupLogic$a(TheaterChatViewGroupLogic p0){
       this.b = p0;
       super();
    }
    public void B(int p0,f p1){
       i.b(this, p0, p1);
    }
    public void P(f p0){
       i.d(this, p0);
    }
    public void W(){
       i.i(this);
    }
    public void e0(){
       i.j(this);
    }
    public void k(TheaterDisplayMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterChatViewGroupLogic$a.class, "1")) {
          return;
       }
       a.p(p0, "displayMode");
       this.b.f(p0);
       return;
    }
    public void onPause(){
       i.c(this);
    }
    public void onProgress(long p0,long p1){
       i.f(this, p0, p1);
    }
    public void onResume(){
       i.h(this);
    }
    public void p(){
       i.e(this);
    }
    public void y(LiveQualityItem p0,List p1){
       i.g(this, p0, p1);
    }
}
