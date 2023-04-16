package nfd.g;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMusicFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import com.kuaishou.android.model.music.Music;
import java.lang.Boolean;
import nfd.g$a;
import java.lang.Enum;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.entity.ExtInfo;

public final class g	// class@001db1
{

    public void g(){
       super();
    }
    public static TemplateBaseFeed a(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mKBoxItem;
       if (p0 != null && (p0.mType == 6 && !q.f(p0.mKBoxFeeds))) {
          return p0.mKBoxFeeds.get(0);
       }
       return null;
    }
    public static TemplateMusicFeed b(SearchItem p0){
       SearchItem obj = PatchProxy.applyOneRefs(p0, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mKBoxItem;
       if (obj != null && obj.mType == 5) {
          KBoxItem mBaseFeed = obj.mBaseFeed;
          if (mBaseFeed instanceof TemplateMusicFeed) {
             return mBaseFeed;
          }else if(p0.weakStyleKbox() && (!q.f(obj.mKBoxFeeds) && obj.mKBoxFeeds.get(0) instanceof TemplateMusicFeed)){
             return obj.mKBoxFeeds.get(0);
          }
       }
       return null;
    }
    public static TemplateUserFeed c(SearchItem p0){
       p0 = p0.mKBoxItem;
       if (p0 != null && p0.mType == 4) {
          KBoxItem mBaseFeed = p0.mBaseFeed;
          if (mBaseFeed instanceof TemplateUserFeed) {
             return mBaseFeed;
          }
       }
       return null;
    }
    public static TemplateUserFeed d(TemplateBaseFeed p0){
       if (p0 != null && p0 instanceof TemplateUserFeed) {
          return p0;
       }
       return null;
    }
    public static String e(Music p0,boolean p1){
       Object[] obj;
       String str;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1) {
          return p0.mName;
       }else {
          int i = g$a.a[p0.mType.ordinal()];
          int i1 = 3;
          if (i != 1) {
             if (i != 2) {
                if (i != i1) {
                   str = (i != 4)? null: 0x7f10090e;
                }else {
                   str = 0x7f103b3b;
                }
             }else {
                str = 0x7f103717;
             }
          }else {
             str = 0x7f1041d1;
          }
          str = (!str)? "": a1.p(str);
          if (!TextUtils.x(str) && !TextUtils.x(p0.mArtist)) {
             obj = new Object[i1];
             obj[0] = p0.mName;
             obj[1] = p0.mArtist;
             obj[2] = str;
             return String.format("%s - %s - %s", obj);
          }else if(!TextUtils.x(str)){
             obj = new Object[]{p0.mName,str};
             return String.format("%s - %s", obj);
          }else if(!TextUtils.x(p0.mArtist)){
             Object[] objArray = new Object[]{p0.mName,p0.mArtist};
             return String.format("%s - %s", objArray);
          }else {
             return p0.mName;
          }
       }
    }
    public static ExtInfo f(SearchItem p0){
       return p0.mExtInfo;
    }
}
