package com.kuaishou.model.CategoryFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.feed.PhotoType;
import android.graphics.Color;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import hn4.e;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class CategoryFeed extends BaseFeed	// class@000a12
{
    public String mCaption;
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public CDNUrl[] mCoverUrl;
    public CDNUrl[] mIcon;
    public String mIntroduction;
    public String mScheme;
    public static final String SCHEME_ACCESS_ID = "SCHEME";

    public void CategoryFeed(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, CategoryFeed.class, "2")) {
          return;
       }
       CoverMeta uCoverMeta = new CoverMeta();
       this.mCoverMeta = uCoverMeta;
       CategoryFeed tmCoverUrl = this.mCoverUrl;
       uCoverMeta.mCoverUrls = tmCoverUrl;
       uCoverMeta.mOverrideCoverThumbnailUrls = tmCoverUrl;
       CommonMeta uCommonMeta = new CommonMeta();
       this.mCommonMeta = uCommonMeta;
       uCommonMeta.mCaption = this.mCaption;
       uCommonMeta.mType = PhotoType.CATEGORY.toInt();
       super.afterDeserialize();
       this.mCoverMeta.mColor = Color.rgb(234, 234, 234);
       return;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, CategoryFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mCaption+PhotoType.CATEGORY.name();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CategoryFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CategoryFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CategoryFeed.class, new e());
       }else {
          obj.put(CategoryFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CategoryFeed.class, "3")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
