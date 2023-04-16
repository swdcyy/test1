package com.kwai.feature.api.social.im.jsbridge.model.JsSearchMessageParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class JsSearchMessageParams implements Serializable	// class@0010ec
{
    public final int count;
    public final String keyword;
    public final String offset;

    public void JsSearchMessageParams(String p0,String p1,int p2){
       super();
       this.keyword = p0;
       this.offset = p1;
       this.count = p2;
    }
}
