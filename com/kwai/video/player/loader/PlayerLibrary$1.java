package com.kwai.video.player.loader.PlayerLibrary$1;
import com.kwai.video.player.PlayerLibraryLoader$DvaListener;
import com.kwai.video.player.loader.PlayerLibrary;
import com.kwai.video.player.PlayerLibraryLoader$DvaLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Error;
import java.lang.Exception;

public class PlayerLibrary$1 implements PlayerLibraryLoader$DvaListener	// class@000b53
{
    public final PlayerLibrary this$0;
    public final PlayerLibraryLoader$DvaLoader val$dvaLoader;

    public void PlayerLibrary$1(PlayerLibrary p0,PlayerLibraryLoader$DvaLoader p1){
       this.this$0 = p0;
       this.val$dvaLoader = p1;
       super();
    }
    public void onLoadFailed(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibrary$1.class, "2")) {
          return;
       }
       PlayerLibrary$1 tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       PlayerLibrary$1 tthis$01 = this.this$0;
       tthis$01.isDvaLoading = false;
       tthis$01.isDvaError = true;
       tthis$01.log(p0+"\("+p1+"\)");
       _monitor_exit(tthis$0);
       return;
    }
    public void onLoadSuccess(String p0,int p1){
       PlayerLibrary$1 u1 = PlayerLibrary$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1, "1")) {
          return;
       }
       u1 = this.this$0;
       _monitor_enter(u1);
       try{
          this.this$0.log(p0+" load begain");
          if (this.val$dvaLoader.shouldLoadSo()) {
             this.this$0.tryLoadLibraryDvaBefore(p0, p1);
             this.this$0.tryLoadLibraryDva(p0, p1);
          }
          this.this$0.log(p0+" load end");
          PlayerLibrary$1 tthis$0 = this.this$0;
          tthis$0.dvaVersion = p1;
          tthis$0.isDvaLoading = false;
          tthis$0.install();
          this.this$0.log(p0+" onLoadSuccess!");
          _monitor_exit(u1);
          return;
       }catch(java.lang.Exception e6){
          this.onLoadFailed(p0, e6.toString());
          _monitor_exit(u1);
          return;
       }catch(java.lang.Error e6){
          this.onLoadFailed(p0, e6.toString());
          _monitor_exit(u1);
          return;
       }
    }
    public void onWillLoad(String p0,int p1){
       PlayerLibrary$1 u1 = PlayerLibrary$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1, "3")) {
          return;
       }
       this.this$0.tryLoadLibraryDvaBefore(p0, p1);
       return;
    }
}
