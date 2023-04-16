package com.middleware.security.wrapper.IKSecurityBase;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;

public interface abstract IKSecurityBase	// class@000fb6
{

    byte[] atlasDecrypt(String p0,String p1,int p2,byte[] p3);
    byte[] atlasEncrypt(String p0,String p1,int p2,byte[] p3);
    String atlasSign(String p0,String p1,int p2,String p3);
    String atlasSignLite(String p0,String p1,int p2,String p3);
    String challenge(String p0,String p1,int p2,String p3);
    boolean detectEnvironment(String p0,String p1,int p2,int p3);
    Object dfpCall(int p0,Object[] p1);
    String getSecurityValue(String p0,String p1,int p2,int p3);
    String localChallenge(String p0,String p1,int p2,String p3);
    void parseKConfPolicy(JSONObject p0);
    byte[] uDecrypt(String p0,String p1,int p2,byte[] p3);
    byte[] uEncrypt(String p0,String p1,int p2,byte[] p3);
}
