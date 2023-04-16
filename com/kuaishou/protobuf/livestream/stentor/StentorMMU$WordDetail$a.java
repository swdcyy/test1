package com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail$a;
import hr4.r;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class StentorMMU$WordDetail$a extends GeneratedMessageLite$Builder implements r	// class@000dc8
{

    public void StentorMMU$WordDetail$a(){
       super(StentorMMU$WordDetail.DEFAULT_INSTANCE);
    }
    public void StentorMMU$WordDetail$a(a p0){
       super(StentorMMU$WordDetail.DEFAULT_INSTANCE);
    }
    public float getConfidence(){
       return this.instance.getConfidence();
    }
    public float getEndTime(){
       return this.instance.getEndTime();
    }
    public String getFixedResult(){
       return this.instance.getFixedResult();
    }
    public ByteString getFixedResultBytes(){
       return this.instance.getFixedResultBytes();
    }
    public float getStartTime(){
       return this.instance.getStartTime();
    }
}
