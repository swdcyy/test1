package com.hpplay.sdk.source.browse.api.AuthListener;
import java.lang.String;

public interface abstract AuthListener	// class@000651
{

    void onAuthFailed(int p0);
    void onAuthSuccess(String p0,String p1);
}
