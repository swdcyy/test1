package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$b;
import hw9.b;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import java.util.List;
import qvb.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;

public final class TemplatePreviewPresenter$b implements b	// class@001310
{
    public final TemplatePreviewPresenter a;

    public void TemplatePreviewPresenter$b(TemplatePreviewPresenter p0){
       this.a = p0;
       super();
    }
    public String getPageParams(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, TemplatePreviewPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "show_index=";
       List items = this.a.V8().getItems();
       a.o(items, "pageList.items");
       int i = 0;
       Iterator iterator = items.iterator();
       while (true) {
          if (iterator.hasNext()) {
             String id = iterator.next().getId();
             TemplatePreviewPresenter x = this.a.x;
             String id1 = (x != null)? x.getId(): objArray;
             if (a.g(id, id1)) {
             label_0055 :
                obj = obj+i+"&photo_id=";
                TemplatePreviewPresenter x1 = this.a.x;
                if (x1 != null) {
                   objArray = x1.getId();
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_0055 ;
          }
       }
       return obj+objArray+"&author_id="+this.a.v;
    }
}
