package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType;
import java.lang.Enum;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType$1;
import java.lang.String;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType$2;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType$3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;

public abstract class NoticeBoxItemType extends Enum	// class@00216d
{
    public final int mType;
    public static final NoticeBoxItemType[] $VALUES;
    public static final NoticeBoxItemType TEXT_ONLY;
    public static final NoticeBoxItemType UNKNOWN;
    public static final NoticeBoxItemType VIDEO_CARD;

    static {
       NoticeBoxItemType$1 u1 = new NoticeBoxItemType$1("UNKNOWN", 0, 0);
       NoticeBoxItemType.UNKNOWN = u1;
       NoticeBoxItemType$2 u2 = new NoticeBoxItemType$2("TEXT_ONLY", 1, 1);
       NoticeBoxItemType.TEXT_ONLY = u2;
       NoticeBoxItemType$3 u3 = new NoticeBoxItemType$3("VIDEO_CARD", 2, 2);
       NoticeBoxItemType.VIDEO_CARD = u3;
       NoticeBoxItemType[] noticeBoxIte = new NoticeBoxItemType[]{u1,u2,u3};
       NoticeBoxItemType.$VALUES = noticeBoxIte;
    }
    public void NoticeBoxItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public void NoticeBoxItemType(String p0,int p1,int p2,NoticeBoxItemType$1 p3){
       super(p0, p1, p2);
    }
    public static NoticeBoxItemType fromContentType(int p0){
       NoticeBoxItemType[] obj;
       object oobject;
       NoticeBoxItemType noticeBoxIte = NoticeBoxItemType.class;
       if (PatchProxy.isSupport(noticeBoxIte)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, noticeBoxIte, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = NoticeBoxItemType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return NoticeBoxItemType.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mType == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static NoticeBoxItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NoticeBoxItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NoticeBoxItemType.class, p0);
    }
    public static NoticeBoxItemType[] values(){
       Object obj = PatchProxy.apply(null, null, NoticeBoxItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NoticeBoxItemType.$VALUES.clone();
    }
    public abstract NoticeBoxBaseItem createItem();
}
