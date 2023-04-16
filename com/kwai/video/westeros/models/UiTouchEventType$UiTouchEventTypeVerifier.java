package com.kwai.video.westeros.models.UiTouchEventType$UiTouchEventTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.UiTouchEventType;

public final class UiTouchEventType$UiTouchEventTypeVerifier implements Internal$EnumVerifier	// class@00107a
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       UiTouchEventType$UiTouchEventTypeVerifier.INSTANCE = new UiTouchEventType$UiTouchEventTypeVerifier();
    }
    public void UiTouchEventType$UiTouchEventTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (UiTouchEventType.forNumber(p0) != null)? true: false;
       return b;
    }
}
