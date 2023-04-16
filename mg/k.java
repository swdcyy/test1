package mg.k;
import java.lang.Object;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsAddRecommendPhotoBlackListParams;
import f55.g;
import java.lang.String;
import kotlin.jvm.internal.a;
import om6.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import mg.k$a;
import mg.k$b;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.feature.bridge.JsGetEditDraftDataParams;
import mg.k$c;
import erd.o;
import brd.t;
import com.yxcorp.gifshow.activity.GifshowActivity;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import mg.k$d;
import mg.k$e;
import com.kwai.feature.post.api.feature.bridge.JSGetEligibleDraftDataParams;
import mg.k$f;
import mg.k$g;
import mg.k$h;
import com.kwai.feature.post.api.feature.bridge.JsGetPhotoCoverPathParams;
import mg.k$i;
import mg.k$j;
import mg.k$k;
import com.kwai.feature.post.api.feature.bridge.JsGetPublishedDataParams;
import mg.k$l;
import mg.k$m;
import mg.k$n;
import com.kwai.feature.post.api.feature.bridge.JsGetEditSmartAlbumDataParams;
import com.kwai.framework.model.user.QCurrentUser;
import og.l;
import q87.c;
import com.kwai.feature.post.api.feature.bridge.JsGetSmartAlbumDataResult;
import java.util.ArrayList;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import z26.c;
import mg.k$o;
import mg.k$p;
import mg.k$q;

public final class k	// class@00262f
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public static final void a(Activity p0,JsAddRecommendPhotoBlackListParams p1,g p2){
       a.p(p0, "acitvity");
       a.p(p1, "params");
       a.p(p2, "callback");
       y6.s(d.class, LoadPolicy.SILENT_IF_DOWNLOADED).R(new k$a(p1, p2), new k$b(p2));
    }
    public static final void b(Activity p0,JsGetEditDraftDataParams p1,g p2){
       a.p(p0, "acitvity");
       a.p(p1, "params");
       a.p(p2, "callback");
       y6.s(d.class, LoadPolicy.DIALOG).w(new k$c(p1)).compose(p0.ge()).subscribe(new k$d(p2), new k$e(p2));
    }
    public static final void c(Activity p0,JSGetEligibleDraftDataParams p1,g p2){
       a.p(p0, "acitvity");
       a.p(p1, "params");
       a.p(p2, "callback");
       y6.s(d.class, LoadPolicy.SILENT_IF_DOWNLOADED).w(new k$f(p1)).subscribe(new k$g(p1, p2), new k$h(p1, p2));
    }
    public static final void d(Activity p0,JsGetPhotoCoverPathParams p1,g p2){
       a.p(p0, "acitvity");
       a.p(p1, "params");
       a.p(p2, "callback");
       y6.s(d.class, LoadPolicy.SILENT_IF_DOWNLOADED).w(new k$i(p1)).subscribe(new k$j(p1, p2), new k$k(p1, p2));
    }
    public static final void e(Activity p0,JsGetPublishedDataParams p1,g p2){
       a.p(p0, "acitvity");
       a.p(p1, "params");
       a.p(p2, "callback");
       y6.s(d.class, LoadPolicy.SILENT_IF_DOWNLOADED).w(new k$l(p1)).subscribe(new k$m(p1, p2), new k$n(p1, p2));
    }
    public static final void f(Activity p0,JsGetEditSmartAlbumDataParams p1,g p2){
       Object[] objArray;
       JsGetSmartAlbumDataResult jsGetSmartAl;
       a.p(p0, "acitvity");
       a.p(p1, "params");
       a.p(p2, "callback");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       int i = 1;
       if (!qCurrentUser.isEnableLocalIntelligenceAlbum()) {
          objArray = new Object[0];
          l.D().w("JsGetWorkDataFun", "getSmartAlbumData: isEnableLocalIntelligenceAlbum = false", objArray);
          jsGetSmartAl = new JsGetSmartAlbumDataResult(i);
          jsGetSmartAl.mSmartAlbumDataList = new ArrayList();
          p2.onSuccess(jsGetSmartAl);
          return;
       }else if(!PermissionUtils.a(p0, "android.permission.READ_EXTERNAL_STORAGE")){
          objArray = new Object[0];
          l.D().w("JsGetWorkDataFun", "getSmartAlbumData: no READ_EXTERNAL_STORAGE permission", objArray);
          jsGetSmartAl = new JsGetSmartAlbumDataResult(i);
          jsGetSmartAl.mSmartAlbumDataList = new ArrayList();
          p2.onSuccess(jsGetSmartAl);
          return;
       }else {
          y6.s(c.class, LoadPolicy.DIALOG).w(new k$o(p1)).compose(p0.ge()).take(1).subscribe(new k$p(p2), new k$q(p2));
          return;
       }
    }
}
