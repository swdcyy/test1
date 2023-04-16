package com.kuaishou.live.lite.bottombar.i$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.i;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ha1.b;
import com.kuaishou.live.lite.bottombar.i$a$a;
import com.google.gson.JsonObject;
import i93.j;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.lite.bottombar.g;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;

public class i$a implements LiveLiteBottomBarService$a	// class@001ed4
{
    public View a;
    public final View$OnClickListener b;
    public final i c;

    public void i$a(i p0,View$OnClickListener p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public View a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          View view = b.b(p0, R.layout.lite_bottombar_shrink);
          this.a = view;
          view.setOnClickListener(new i$a$a(this));
       }
       return this.a;
    }
    public JsonObject b(){
       return j.a(this);
    }
    public boolean c(){
       return false;
    }
    public JsonObject d(){
       return j.b(this);
    }
    public void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       j.d(this, p0);
       i$a tc = this.c;
       if (tc.o == null) {
          tc.o = true;
          g.b(this, tc.m.a(), this.c.m.c0());
       }
       return;
    }
    public void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.c(this, p0);
    }
    public LiveLiteBottomBarService$BottomBarType getType(){
       return LiveLiteBottomBarService$BottomBarType.SHRINK;
    }
    public boolean i(){
       return j.f(this);
    }
}
