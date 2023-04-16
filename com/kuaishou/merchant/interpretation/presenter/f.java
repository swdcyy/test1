package com.kuaishou.merchant.interpretation.presenter.f;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import h04.c;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class f implements IMediaPlayer$OnErrorListener	// class@00185c
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       Object[] objArray = new Object[]{p1+"   extra = "+p2};
       c.C().w("MerchantInterpretationPlayerPresenter", "play error", objArray);
       return 0;
    }
}
