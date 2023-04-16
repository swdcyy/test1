package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType$2;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType;
import java.lang.String;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType$1;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;

public final class NoticeBoxItemType$2 extends NoticeBoxItemType	// class@00216b
{

    public void NoticeBoxItemType$2(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public NoticeBoxBaseItem createItem(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxItemType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NoticeBoxTextOnlyItem();
    }
}
