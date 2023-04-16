package com.yxcorp.gifshow.notice.box.data.NoticeBoxResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collections;
import btb.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import ctb.a;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import java.lang.Boolean;
import la6.a;

public class NoticeBoxResponse implements CursorResponse, Serializable	// class@002162
{
    public String mCursor;
    public List mItems;
    public String mLlsid;
    public ArrayList mPlateSettings;
    public List mTabs;
    public static final long serialVersionUID = 0xd7052433e1ed6d84;

    public void NoticeBoxResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       NoticeBoxResponse obj = PatchProxy.apply(objArray, this, NoticeBoxResponse.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mItems;
       if (obj == null) {
          list = Collections.emptyList();
       }else {
          NoticeBoxBaseItem obj1 = PatchProxy.applyOneRefs(obj, objArray, c.class, str);
          if (obj1 != patchProxyRe) {
             list = obj1;
          }else {
             list = Lists.b();
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                if (obj1 instanceof NoticeBoxTextOnlyItem) {
                   list.add(new a(obj1, 1));
                }else if(obj1 instanceof NoticeBoxVideoCardItem){
                   list.add(new a(obj1, 2));
                }
             }
          }
       }
       return list;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
