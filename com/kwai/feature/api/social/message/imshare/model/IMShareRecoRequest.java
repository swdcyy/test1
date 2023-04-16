package com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class IMShareRecoRequest implements Serializable	// class@001158
{
    public final String authorId;
    public final int bizType;
    public final String id;
    public final int idType;
    public final String transactionId;

    public void IMShareRecoRequest(String p0,int p1,String p2,String p3,int p4){
       a.p(p2, "id");
       super();
       this.transactionId = p0;
       this.idType = p1;
       this.id = p2;
       this.authorId = p3;
       this.bizType = p4;
    }
    public final String getAuthorId(){
       return this.authorId;
    }
    public final int getBizType(){
       return this.bizType;
    }
    public final String getId(){
       return this.id;
    }
    public final int getIdType(){
       return this.idType;
    }
    public final String getTransactionId(){
       return this.transactionId;
    }
}
