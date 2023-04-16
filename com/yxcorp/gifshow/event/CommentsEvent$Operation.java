package com.yxcorp.gifshow.event.CommentsEvent$Operation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CommentsEvent$Operation extends Enum	// class@000e7f
{
    public static final CommentsEvent$Operation[] $VALUES;
    public static final CommentsEvent$Operation ADD;
    public static final CommentsEvent$Operation ADD_FAIL;
    public static final CommentsEvent$Operation ADD_SUB;
    public static final CommentsEvent$Operation ADD_SUB_FAIL;
    public static final CommentsEvent$Operation DELETE;
    public static final CommentsEvent$Operation LIKE;
    public static final CommentsEvent$Operation SEND;
    public static final CommentsEvent$Operation UNLIKE;
    public static final CommentsEvent$Operation UPDATE;

    static {
       CommentsEvent$Operation operation = new CommentsEvent$Operation("SEND", 0);
       CommentsEvent$Operation.SEND = operation;
       CommentsEvent$Operation operation1 = new CommentsEvent$Operation("ADD", 1);
       CommentsEvent$Operation.ADD = operation1;
       CommentsEvent$Operation operation2 = new CommentsEvent$Operation("ADD_SUB", 2);
       CommentsEvent$Operation.ADD_SUB = operation2;
       CommentsEvent$Operation operation3 = new CommentsEvent$Operation("DELETE", 3);
       CommentsEvent$Operation.DELETE = operation3;
       CommentsEvent$Operation operation4 = new CommentsEvent$Operation("UPDATE", 4);
       CommentsEvent$Operation.UPDATE = operation4;
       CommentsEvent$Operation operation5 = new CommentsEvent$Operation("ADD_FAIL", 5);
       CommentsEvent$Operation.ADD_FAIL = operation5;
       CommentsEvent$Operation operation6 = new CommentsEvent$Operation("ADD_SUB_FAIL", 6);
       CommentsEvent$Operation.ADD_SUB_FAIL = operation6;
       CommentsEvent$Operation operation7 = new CommentsEvent$Operation("LIKE", 7);
       CommentsEvent$Operation.LIKE = operation7;
       CommentsEvent$Operation operation8 = new CommentsEvent$Operation("UNLIKE", 8);
       CommentsEvent$Operation.UNLIKE = operation8;
       CommentsEvent$Operation[] operationArr = new CommentsEvent$Operation[9];
       operationArr[0] = operation;
       operationArr[1] = operation1;
       operationArr[2] = operation2;
       operationArr[3] = operation3;
       operationArr[4] = operation4;
       operationArr[5] = operation5;
       operationArr[6] = operation6;
       operationArr[7] = operation7;
       operationArr[8] = operation8;
       CommentsEvent$Operation.$VALUES = operationArr;
    }
    public void CommentsEvent$Operation(String p0,int p1){
       super(p0, p1);
    }
    public static CommentsEvent$Operation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommentsEvent$Operation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CommentsEvent$Operation.class, p0);
    }
    public static CommentsEvent$Operation[] values(){
       Object obj = PatchProxy.apply(null, null, CommentsEvent$Operation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommentsEvent$Operation.$VALUES.clone();
    }
}
