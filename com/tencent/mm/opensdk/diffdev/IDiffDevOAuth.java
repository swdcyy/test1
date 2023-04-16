package com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.lang.String;

public interface abstract IDiffDevOAuth	// class@000e79
{

    void addListener(OAuthListener p0);
    boolean auth(String p0,String p1,String p2,String p3,String p4,OAuthListener p5);
    void detach();
    void removeAllListeners();
    void removeListener(OAuthListener p0);
    boolean stopAuth();
}
