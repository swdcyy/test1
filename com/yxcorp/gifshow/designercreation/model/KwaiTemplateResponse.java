package com.yxcorp.gifshow.designercreation.model.KwaiTemplateResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Integer;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.lang.Boolean;
import la6.a;

public final class KwaiTemplateResponse implements CursorResponse, Serializable	// class@001302
{
    public final List data;
    public final String pcursor;
    public final Integer result;

    public void KwaiTemplateResponse(Integer p0,List p1,String p2){
       super();
       this.result = p0;
       this.data = p1;
       this.pcursor = p2;
    }
    public String getCursor(){
       KwaiTemplateResponse tpcursor = this.pcursor;
       if (tpcursor != null) {
       }else {
          tpcursor = "no_more";
       }
       return tpcursor;
    }
    public final List getData(){
       return this.data;
    }
    public List getItems(){
       List list;
       KwaiTemplateResponse obj = PatchProxy.apply(null, this, KwaiTemplateResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.data;
       if (obj != null) {
          list = CollectionsKt___CollectionsKt.J5(obj);
          if (list != null) {
          label_0020 :
             return list;
          }
       }
       list = new ArrayList();
       goto label_0020 ;
    }
    public final String getPcursor(){
       return this.pcursor;
    }
    public final Integer getResult(){
       return this.result;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, KwaiTemplateResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.pcursor);
    }
}
