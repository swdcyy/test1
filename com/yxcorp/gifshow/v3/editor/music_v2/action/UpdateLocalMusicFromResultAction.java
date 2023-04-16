package com.yxcorp.gifshow.v3.editor.music_v2.action.UpdateLocalMusicFromResultAction;
import xvc.b;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class UpdateLocalMusicFromResultAction extends b	// class@00108d
{
    public final Intent intent;
    public final int requestCode;

    public void UpdateLocalMusicFromResultAction(Intent p0,int p1){
       a.p(p0, "intent");
       super();
       this.intent = p0;
       this.requestCode = p1;
    }
    public final Intent getIntent(){
       return this.intent;
    }
    public final int getRequestCode(){
       return this.requestCode;
    }
}
