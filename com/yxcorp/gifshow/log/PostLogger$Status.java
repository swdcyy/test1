package com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PostLogger$Status extends Enum	// class@001aec
{
    public String mName;
    public static final PostLogger$Status[] $VALUES;
    public static final PostLogger$Status BEGIN;
    public static final PostLogger$Status CANCEL;
    public static final PostLogger$Status ERROR;
    public static final PostLogger$Status FINISH;
    public static final PostLogger$Status PROCESSING;
    public static final PostLogger$Status WAIT;

    static {
       PostLogger$Status status;
       PostLogger$Status[] statusArray = new PostLogger$Status[]{status,status,status,status,status,status};
       status = new PostLogger$Status("BEGIN", 0, "begin");
       PostLogger$Status.BEGIN = status;
       status = new PostLogger$Status("WAIT", 1, "wait");
       PostLogger$Status.WAIT = status;
       status = new PostLogger$Status("PROCESSING", 2, "processing");
       PostLogger$Status.PROCESSING = status;
       status = new PostLogger$Status("FINISH", 3, "finish");
       PostLogger$Status.FINISH = status;
       status = new PostLogger$Status("CANCEL", 4, "cancel");
       PostLogger$Status.CANCEL = status;
       status = new PostLogger$Status("ERROR", 5, "error");
       PostLogger$Status.ERROR = status;
       PostLogger$Status.$VALUES = statusArray;
    }
    public void PostLogger$Status(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static PostLogger$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostLogger$Status.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostLogger$Status.class, p0);
    }
    public static PostLogger$Status[] values(){
       Object obj = PatchProxy.apply(null, null, PostLogger$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostLogger$Status.$VALUES.clone();
    }
    public final String getMName(){
       return this.mName;
    }
    public final String getValue(){
       return this.mName;
    }
    public final void setMName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostLogger$Status.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mName = p0;
       return;
    }
}
