package com.kwai.video.krtc.a$b;
import java.lang.String;
import com.kwai.video.krtc.observers.BgmObserver$BgmErrorType;

public interface abstract a$b	// class@00076f
{

    void onCompleted(String p0);
    void onError(String p0,BgmObserver$BgmErrorType p1);
    void onProgressed(String p0,float p1,float p2);
    void onStart(String p0);
}
