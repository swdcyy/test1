package com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo$Decoration;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo$BeforeOpen;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo$AfterOpen;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo$ButtonStyle;

public class SearchPopUpStyleInfo implements Serializable	// class@002335
{
    public SearchPopUpStyleInfo$AfterOpen afterOpen;
    public SearchPopUpStyleInfo$BeforeOpen beforeOpen;
    public SearchPopUpStyleInfo$Decoration mDecoration;

    public void SearchPopUpStyleInfo(){
       super();
    }
    public final void a(ArrayList p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchPopUpStyleInfo.class, "2")) {
          return;
       }
       if (!q.f(p1)) {
          p0.add(p1);
       }
       return;
    }
    public ArrayList getPopupCDNResource(){
       ArrayList obj = PatchProxy.apply(null, this, SearchPopUpStyleInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       SearchPopUpStyleInfo tmDecoration = this.mDecoration;
       if (tmDecoration != null) {
          this.a(obj, tmDecoration.mTopImg);
       }
       tmDecoration = this.beforeOpen;
       if (tmDecoration != null) {
          this.a(obj, tmDecoration.mTopImgUrls);
          this.a(obj, this.beforeOpen.mMainTitleImgUrls);
          this.a(obj, this.beforeOpen.mOpenBtnImg);
       }
       tmDecoration = this.afterOpen;
       if (tmDecoration != null) {
          this.a(obj, tmDecoration.mMainTitleUrls);
          this.a(obj, this.afterOpen.mTopImgUrl);
          this.a(obj, this.afterOpen.mMediumImgUrls);
          this.a(obj, this.afterOpen.mBottomImgUrls);
          SearchPopUpStyleInfo$AfterOpen mButtonStyle = this.afterOpen.mButtonStyle;
          if (mButtonStyle != null && !q.f(mButtonStyle.mButtonImgUrls)) {
             obj.add(this.afterOpen.mButtonStyle.mButtonImgUrls);
          }
       }
       return obj;
    }
}
