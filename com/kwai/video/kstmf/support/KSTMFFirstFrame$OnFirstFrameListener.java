package com.kwai.video.kstmf.support.KSTMFFirstFrame$OnFirstFrameListener;
import android.graphics.Bitmap;
import java.util.List;
import java.lang.String;

public interface abstract KSTMFFirstFrame$OnFirstFrameListener	// class@00094a
{

    boolean onEnableParseNal(int p0,boolean p1,int p2);
    boolean onEnableSplitNals(int p0);
    void onFirstFrameParseCancel();
    void onFirstFrameParseResult(Bitmap p0,long p1,List p2,String p3,int p4);
    void onFirstFrameParseTimeout();
}
