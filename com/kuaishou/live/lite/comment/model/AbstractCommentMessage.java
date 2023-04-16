package com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import java.io.Serializable;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import kotlin.jvm.internal.a;

public abstract class AbstractCommentMessage implements Serializable	// class@000806
{
    public final String id;
    public final boolean isAnonymous;
    public LiveAudienceState senderState;
    public final long time;
    public static final AbstractCommentMessage$a Companion;
    public static final long serialVersionUID;

    static {
       AbstractCommentMessage.Companion = new AbstractCommentMessage$a(null);
    }
    public void AbstractCommentMessage(String p0,long p1,boolean p2,LiveAudienceState p3){
       a.p(p0, "id");
       super();
       this.id = p0;
       this.time = p1;
       this.isAnonymous = p2;
       this.senderState = p3;
    }
    public void AbstractCommentMessage(String p0,long p1,boolean p2,LiveAudienceState p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String getId(){
       return this.id;
    }
    public final LiveAudienceState getSenderState(){
       return this.senderState;
    }
    public final long getTime(){
       return this.time;
    }
    public final boolean isAnonymous(){
       return this.isAnonymous;
    }
    public final void setSenderState(LiveAudienceState p0){
       this.senderState = p0;
    }
}
