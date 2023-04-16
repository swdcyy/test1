package com.kwai.video.westeros.models.InputActionElementType$InputActionElementTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.InputActionElementType;

public final class InputActionElementType$InputActionElementTypeVerifier implements Internal$EnumVerifier	// class@000f94
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       InputActionElementType$InputActionElementTypeVerifier.INSTANCE = new InputActionElementType$InputActionElementTypeVerifier();
    }
    public void InputActionElementType$InputActionElementTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (InputActionElementType.forNumber(p0) != null)? true: false;
       return b;
    }
}
