package com.kuaishou.live.core.voiceparty.music.util.MusicDownloadException;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class MusicDownloadException extends IOException	// class@0017f3
{

    public void MusicDownloadException(Throwable p0){
       a.p(p0, "cause");
       super(p0);
    }
}
