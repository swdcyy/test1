package com.yxcorp.gifshow.ad.challenge.model.ChallengeRankResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class ChallengeRankResponse implements Serializable, b	// class@001530
{
    public List mItems;
    public String mLlsid;
    public static final long serialVersionUID = 0x637389da9c717199;

    public void ChallengeRankResponse(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       return false;
    }
}
