package com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType;
import java.lang.Enum;
import com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType$1;
import java.lang.String;
import com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ptb.a;

public abstract class ReminderContentElementType extends Enum	// class@002191
{
    public final String mType;
    public static final ReminderContentElementType[] $VALUES;
    public static final ReminderContentElementType TEXT;
    public static final ReminderContentElementType UNKNOWN;

    static {
       ReminderContentElementType$1 u1 = new ReminderContentElementType$1("UNKNOWN", 0, null);
       ReminderContentElementType.UNKNOWN = u1;
       ReminderContentElementType$2 u2 = new ReminderContentElementType$2("TEXT", 1, "text");
       ReminderContentElementType.TEXT = u2;
       ReminderContentElementType[] reminderCont = new ReminderContentElementType[]{u1,u2};
       ReminderContentElementType.$VALUES = reminderCont;
    }
    public void ReminderContentElementType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public void ReminderContentElementType(String p0,int p1,String p2,ReminderContentElementType$1 p3){
       super(p0, p1, p2);
    }
    public static ReminderContentElementType fromContentType(String p0){
       object oobject;
       ReminderContentElementType[] obj = PatchProxy.applyOneRefs(p0, null, ReminderContentElementType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ReminderContentElementType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return ReminderContentElementType.UNKNOWN;
          }
          oobject = obj[i];
          if (TextUtils.n(p0, oobject.mType)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static ReminderContentElementType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReminderContentElementType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReminderContentElementType.class, p0);
    }
    public static ReminderContentElementType[] values(){
       Object obj = PatchProxy.apply(null, null, ReminderContentElementType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReminderContentElementType.$VALUES.clone();
    }
    public abstract a createItem();
}
