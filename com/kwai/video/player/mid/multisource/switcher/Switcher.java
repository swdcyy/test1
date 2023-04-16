package com.kwai.video.player.mid.multisource.switcher.Switcher;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.player.mid.multisource.switcher.Switcher$RefreshCallback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.mid.multisource.switcher.Switcher$UnImplementationError;
import java.lang.Throwable;
import com.kwai.video.wayne.player.multisource.switcher.FetchReason;

public abstract class Switcher	// class@000b83
{

    public void Switcher(){
       super();
    }
    public int getUrlCount(){
       return 1;
    }
    public abstract boolean hasNext();
    public void injectDataSource(WayneBuildData p0){
    }
    public abstract void moveToNextDataSource(int p0);
    public void onRepresentationIdChanged(int p0){
    }
    public void refreshDataSource(Switcher$RefreshCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Switcher.class, "1")) {
          return;
       }
       p0.onFailed(new Switcher$UnImplementationError());
       return;
    }
    public void refreshDataSource(Switcher$RefreshCallback p0,FetchReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Switcher.class, "2")) {
          return;
       }
       p0.onFailed(new Switcher$UnImplementationError());
       return;
    }
}
