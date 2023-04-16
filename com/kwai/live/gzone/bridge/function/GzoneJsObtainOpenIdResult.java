package com.kwai.live.gzone.bridge.function.GzoneJsObtainOpenIdResult;
import com.kwai.yoda.function.FunctionResultParams;

public class GzoneJsObtainOpenIdResult extends FunctionResultParams	// class@000c7e
{
    public String mAccessToken;
    public String mKwaiId;
    public String mOpenId;
    public static final long serialVersionUID = 0x9cf50798c72478e6;

    public void GzoneJsObtainOpenIdResult(){
       super();
       this.mResult = 1;
    }
}
