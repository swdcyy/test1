package com.kwai.video.westeros.models.UIInteractionResponseType$UIInteractionResponseTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.UIInteractionResponseType;

public final class UIInteractionResponseType$UIInteractionResponseTypeVerifier implements Internal$EnumVerifier	// class@001073
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       UIInteractionResponseType$UIInteractionResponseTypeVerifier.INSTANCE = new UIInteractionResponseType$UIInteractionResponseTypeVerifier();
    }
    public void UIInteractionResponseType$UIInteractionResponseTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (UIInteractionResponseType.forNumber(p0) != null)? true: false;
       return b;
    }
}
