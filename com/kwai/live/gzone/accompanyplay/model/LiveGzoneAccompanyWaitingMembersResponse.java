package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyWaitingMembersResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveGzoneAccompanyWaitingMembersResponse implements Serializable, b	// class@000c46
{
    public List mWaitingMembers;
    public static final long serialVersionUID = 0x68bcad111e8f6585;

    public void LiveGzoneAccompanyWaitingMembersResponse(){
       super();
    }
    public List getItems(){
       return this.mWaitingMembers;
    }
    public boolean hasMore(){
       return false;
    }
}
