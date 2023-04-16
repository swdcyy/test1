package com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import java.lang.String;

public interface abstract OAuthListener	// class@000e7b
{

    void onAuthFinish(OAuthErrCode p0,String p1);
    void onAuthGotQrcode(String p0,byte[] p1);
    void onQrcodeScanned();
}
