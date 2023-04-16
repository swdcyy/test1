package com.kwai.video.westeros.models.EditAudioType$EditAudioTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EditAudioType;

public final class EditAudioType$EditAudioTypeVerifier implements Internal$EnumVerifier	// class@000ef8
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EditAudioType$EditAudioTypeVerifier.INSTANCE = new EditAudioType$EditAudioTypeVerifier();
    }
    public void EditAudioType$EditAudioTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EditAudioType.forNumber(p0) != null)? true: false;
       return b;
    }
}
