package com.kuaishou.gifshow.kuaishan.ui.preview.e;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import u80.e;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import q87.c;

public final class e implements IMediaPlayer$OnErrorListener	// class@001aee
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       e.D().z("VideoIjkPlayerPreviewItem", "error", new RuntimeException(" onError\(\) called with: iMediaPlayer = ["+p0+"], i = ["+p1+"], i1 = ["+p2+"]"));
       return false;
    }
}
