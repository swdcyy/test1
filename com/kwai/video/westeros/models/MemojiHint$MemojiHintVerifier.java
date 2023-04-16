package com.kwai.video.westeros.models.MemojiHint$MemojiHintVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.MemojiHint;

public final class MemojiHint$MemojiHintVerifier implements Internal$EnumVerifier	// class@000fb2
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       MemojiHint$MemojiHintVerifier.INSTANCE = new MemojiHint$MemojiHintVerifier();
    }
    public void MemojiHint$MemojiHintVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (MemojiHint.forNumber(p0) != null)? true: false;
       return b;
    }
}
