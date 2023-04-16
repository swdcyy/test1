package com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import android.app.Activity;
import android.view.View;
import java.lang.Object;
import android.net.Uri;
import java.util.List;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class PreviewPlayer	// class@001399
{
    public Activity a;
    public View b;

    public void PreviewPlayer(Activity p0,View p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public abstract void a(Uri p0,int p1,int p2);
    public View b(){
       return this.b;
    }
    public void c(){
    }
    public void d(){
    }
    public void e(boolean p0){
    }
    public t f(List p0,List p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PreviewPlayer.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return t.just(Boolean.TRUE);
    }
    public void g(int p0){
    }
    public boolean h(){
       return false;
    }
    public abstract boolean i();
}
