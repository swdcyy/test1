package com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicInvalidException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MusicInvalidException extends RuntimeException	// class@001123
{

    public void MusicInvalidException(String p0){
       a.p(p0, "msg");
       super(p0);
    }
}
