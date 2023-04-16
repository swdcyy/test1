package cx9.b;
import s85.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch;
import com.kwai.component.commenttopbar.model.BaseElementModel$Style;
import com.kwai.component.commenttopbar.model.BaseElementModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.kwai.component.commenttopbar.model.b;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.a;
import android.view.View;
import wkd.b;
import nf6.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.x0;
import android.content.Intent;
import java.util.HashMap;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import y1a.a;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;

public class b extends b	// class@001e2d
{
    public final QPhoto c;

    public void b(QPhoto p0){
       super();
       this.c = p0;
    }
    public boolean a(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       b = (obj != null && (obj.getPhotoMeta() != null && this.o() != null))? true: false;
       return b;
    }
    public BaseElementModel$Style c(){
       return BaseElementModel$Style.SINGLE;
    }
    public boolean e(){
       return false;
    }
    public void f(BaseElementModel p0,GifshowActivity p1,Context p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, b.class, "8")) {
       }else {
          p0.f(this.o().mQueryName);
          p0.h(this.o().mDisplayPrefix);
          Drawable drawable = ContextCompat.getDrawable(p2, R.drawable.arg_RES_7f0805a5);
          a.n(drawable, ContextCompat.getColor(p2, R.color.arg_RES_7f0607c1));
          p0.g(drawable);
          PatchProxy.onMethodExit(b.class, "8");
       }
       return;
    }
    public void g(View p0,GifshowActivity p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "5")) {
          return;
       }
       if (p1 != null) {
          i oi = b.a(0x66dce92a);
          CommentGuessSearch uCommentGues = this.o();
          CommentGuessSearch uCommentGues1 = PatchProxy.applyOneRefs(uCommentGues, this, uob, "6");
          if (uCommentGues1 != PatchProxyResult.class) {
          }else if(!TextUtils.x(uCommentGues.mSearchWordUrl)){
             uCommentGues1 = uCommentGues.mSearchWordUrl;
          }else {
             uCommentGues1 = "kwai://search?keyword="+uCommentGues.mQueryName+"&source=search_entrance_comment_trending";
          }
          Intent intent = oi.a(p1, x0.f(uCommentGues1));
          if (intent != null) {
             p1.startActivity(intent);
          }
       }
       String str = "SEARCH_KEYWORD_COMMENT";
       HashMap hashMap = this.l(this.c);
       if (!PatchProxy.applyVoidThreeRefs(p1, str, hashMap, this, b.class, "9") && this.c != null) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = this.n(this.c);
          u1.B(new ClickMetaData().setLogPage(p1).setType(1).setElementPackage(this.m(str, hashMap)).setContentPackage(uContentPack).setFeedLogCtx(this.c.getFeedLogCtx()));
       }
       return;
    }
    public void j(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       String str = "SEARCH_KEYWORD_COMMENT";
       HashMap hashMap = this.l(this.c);
       if (!PatchProxy.applyVoidThreeRefs(p0, str, hashMap, this, b.class, "10") && this.c != null) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = this.n(this.c);
          u1.B0(new ShowMetaData().setLogPage(p0).setType(6).setElementPackage(this.m(str, hashMap)).setContentPackage(uContentPack).setFeedLogCtx(this.c.getFeedLogCtx()));
       }
       return;
    }
    public final HashMap l(QPhoto p0){
       String str;
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("entry_source", "search_entrance_comment_trending");
       obj.put("id", p0.getPhotoId());
       if (p0.isImageType()) {
          str = "IMAGE";
       }else if(p0.isLiveStream()){
          str = "LIVE";
       }else {
          str = "PHOTO";
       }
       if (!TextUtils.x(str)) {
          obj.put("type", str);
       }
       obj.put("bar_property", "comment");
       obj.put("query_name", this.o().mQueryName);
       obj.put("query_id", this.o().mQueryId);
       obj.put("query_list_id", this.o().mQueryListId);
       return obj;
    }
    public final ClientEvent$ElementPackage m(String p0,Map p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       obj.type = 1;
       i3 oi3 = i3.f();
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             oi3.d(key, uEntry.getValue());
          }
       }
       obj.params = oi3.e();
       return obj;
    }
    public final ClientContent$PhotoPackage n(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return w1.f(p0.mEntity);
    }
    public final CommentGuessSearch o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoMeta obj = PatchProxy.apply(objArray, this, b.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c.getPhotoMeta();
       Object[] objArray1 = PatchProxy.applyOneRefs(obj, objArray, a.class, "1");
       if (objArray1 != patchProxyRe) {
       }else {
          a.p(obj, "$this$commentGuessSearch");
          Object partData = obj.getPartData("commentGuessSearch");
          if (partData instanceof CommentGuessSearch) {
             objArray = partData;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
