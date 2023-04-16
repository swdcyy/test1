package com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$d;
import a9c.e;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class TemplateSearchFeedListFragment$d extends e	// class@000f67
{

    public void TemplateSearchFeedListFragment$d(){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TemplateSearchFeedListFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null || p1 != null){
          b = (p0 != null)? p0.equals(p1): false;
          if (!b) {
             b = false;
          }
       }
       b = true;
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       KSTemplateDetailInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, TemplateSearchFeedListFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = null;
          p0 = (p0 != null)? p0.mTemplateId: obj;
          if (p1 != null) {
             obj = p1.mTemplateId;
          }
          b = TextUtils.n(p0, obj);
       }
       return b;
    }
}
