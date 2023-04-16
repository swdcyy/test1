package com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.graphics.Color;

public class LiveGzonePromotionGame implements Serializable, a	// class@000db4
{
    public String mActivityTabName;
    public String mActivityUrl;
    public boolean mDisplayActivity;
    public String mDownloadUrl;
    public List mExtraDescUrls;
    public List mExtraDescs;
    public String mGameBannerDisplayDirection;
    public String mGameDescription;
    public CDNUrl[] mGameIcons;
    public String mGameId;
    public String mGameName;
    public List mGameTags;
    public String mIdentifier;
    public List mPromotionGameBanners;
    public static final long serialVersionUID = 0x4e21fe626e3d7dcb;

    public void LiveGzonePromotionGame(){
       super();
    }
    public void afterDeserialize(){
       String str = "gameId";
       if (PatchProxy.applyVoid(null, this, LiveGzonePromotionGame.class, "1")) {
          return;
       }
       try{
          if (!TextUtils.x(this.mActivityUrl)) {
             String str1 = (this.mActivityUrl).replace("color=#", "color=");
             this.mActivityUrl = str1;
             Uri uri = x0.f(str1);
             if (x0.a(uri, str) == null) {
                Uri$Builder uBuilder = uri.buildUpon();
                uBuilder.appendQueryParameter(str, this.mGameId);
                this.mActivityUrl = uBuilder.build().toString();
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public int getPageColor(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePromotionGame.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       LiveGzonePromotionGame tmActivityUr = this.mActivityUrl;
       if (tmActivityUr == null) {
          return i;
       }
       try{
          Uri uri = Uri.parse(tmActivityUr);
          if (uri.isHierarchical()) {
             String queryParamet = uri.getQueryParameter("color");
             if (!TextUtils.isEmpty(queryParamet) && !queryParamet.startsWith("#")) {
                queryParamet = "#"+queryParamet;
             }
             i = Color.parseColor(queryParamet);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
