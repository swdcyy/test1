package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;

public final class StentorMMU$RtAsrStatus$b implements Internal$EnumVerifier	// class@000d9d
{
    public static final Internal$EnumVerifier a;

    static {
       StentorMMU$RtAsrStatus$b.a = new StentorMMU$RtAsrStatus$b();
    }
    public void StentorMMU$RtAsrStatus$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (StentorMMU$RtAsrStatus.forNumber(p0) != null)? true: false;
       return b;
    }
}
