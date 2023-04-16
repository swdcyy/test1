package com.kuaishou.commercial.tach.component.SearchTKLivePlayer;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.i;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.SearchTKLivePlayer$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Integer;

public class SearchTKLivePlayer extends e	// class@001654
{
    public Object feed;
    public boolean mHasLiveIcon;
    public boolean mute;

    public void SearchTKLivePlayer(f p0){
       super(p0);
       this.getView();
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchTKLivePlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x76333103).b(p0);
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       SearchTKLivePlayer searchTKLive = SearchTKLivePlayer.class;
       if (PatchProxy.isSupport(searchTKLive) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, searchTKLive, "11")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          d.a(0x76333103).i(this.getView());
       }else {
          x.f(new SearchTKLivePlayer$a(this));
       }
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, SearchTKLivePlayer.class, "3")) {
          return;
       }
       d.a(0x76333103).Q(this.getView());
       return;
    }
    public void releasePlayer(){
       if (PatchProxy.applyVoid(null, this, SearchTKLivePlayer.class, "4")) {
          return;
       }
       d.a(0x76333103).O0(this.getView());
       return;
    }
    public void setBorderRadius(int p0){
       SearchTKLivePlayer searchTKLive = SearchTKLivePlayer.class;
       if (PatchProxy.isSupport(searchTKLive) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchTKLive, "8")) {
          return;
       }
       super.setBorderRadius(p0);
       d.a(0x76333103).Zd(this.getView(), p0);
       return;
    }
    public void setBottomLeftRadius(int p0){
       SearchTKLivePlayer searchTKLive = SearchTKLivePlayer.class;
       if (PatchProxy.isSupport(searchTKLive) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchTKLive, "9")) {
          return;
       }
       super.setBottomLeftRadius(p0);
       d.a(0x76333103).YE(this.getView(), p0);
       return;
    }
    public void setFeed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKLivePlayer.class, "2")) {
          return;
       }
       d.a(0x76333103).q2(this.getView(), p0);
       return;
    }
    public void setHasLiveIcon(boolean p0){
       SearchTKLivePlayer searchTKLive = SearchTKLivePlayer.class;
       if (PatchProxy.isSupport(searchTKLive) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, searchTKLive, "6")) {
          return;
       }
       this.mHasLiveIcon = p0;
       d.a(0x76333103).bG(this.getView(), p0);
       return;
    }
    public void setMute(boolean p0){
       SearchTKLivePlayer searchTKLive = SearchTKLivePlayer.class;
       if (PatchProxy.isSupport(searchTKLive) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, searchTKLive, "7")) {
          return;
       }
       this.mute = p0;
       d.a(0x76333103).L2(this.getView(), p0);
       return;
    }
    public void setTopLeftRadius(int p0){
       SearchTKLivePlayer searchTKLive = SearchTKLivePlayer.class;
       if (PatchProxy.isSupport(searchTKLive) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchTKLive, "10")) {
          return;
       }
       super.setTopLeftRadius(p0);
       d.a(0x76333103).cJ(this.getView(), p0);
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, SearchTKLivePlayer.class, "5")) {
          return;
       }
       d.a(0x76333103).e4(this.getView());
       return;
    }
}
