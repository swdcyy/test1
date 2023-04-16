package com.yxcorp.gifshow.webview.jsmodel.component.JsSequenceTasksParams$TaskName;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsSequenceTasksParams$TaskName extends Enum	// class@001783
{
    public static final JsSequenceTasksParams$TaskName[] $VALUES;
    public static final JsSequenceTasksParams$TaskName BIND_PHONE;
    public static final JsSequenceTasksParams$TaskName FOLLOW_CONTACTS;
    public static final JsSequenceTasksParams$TaskName UPLOAD_CONTACTS;

    static {
       JsSequenceTasksParams$TaskName taskName = new JsSequenceTasksParams$TaskName("BIND_PHONE", 0);
       JsSequenceTasksParams$TaskName.BIND_PHONE = taskName;
       JsSequenceTasksParams$TaskName taskName1 = new JsSequenceTasksParams$TaskName("UPLOAD_CONTACTS", 1);
       JsSequenceTasksParams$TaskName.UPLOAD_CONTACTS = taskName1;
       JsSequenceTasksParams$TaskName taskName2 = new JsSequenceTasksParams$TaskName("FOLLOW_CONTACTS", 2);
       JsSequenceTasksParams$TaskName.FOLLOW_CONTACTS = taskName2;
       JsSequenceTasksParams$TaskName[] taskNameArra = new JsSequenceTasksParams$TaskName[]{taskName,taskName1,taskName2};
       JsSequenceTasksParams$TaskName.$VALUES = taskNameArra;
    }
    public void JsSequenceTasksParams$TaskName(String p0,int p1){
       super(p0, p1);
    }
    public static JsSequenceTasksParams$TaskName valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsSequenceTasksParams$TaskName.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsSequenceTasksParams$TaskName.class, p0);
    }
    public static JsSequenceTasksParams$TaskName[] values(){
       Object obj = PatchProxy.apply(null, null, JsSequenceTasksParams$TaskName.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsSequenceTasksParams$TaskName.$VALUES.clone();
    }
}
