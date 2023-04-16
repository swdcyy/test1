package com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$b$a;
import erd.g;
import java.lang.String;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$b;
import java.lang.Object;
import yw5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.nearby.plugin.locallife.model.CommentDataInfo;
import java.util.Objects;
import qn4.k;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import qp7.x0;
import qp7.b;
import kotlin.jvm.internal.a;
import pp7.b;
import bq7.f;
import bq7.a;
import wkd.b;
import rn4.f;
import brd.t;
import cjd.e;
import erd.o;

public final class PoiCommentElement$b$a implements g	// class@000a16
{
    public final String b;
    public final PoiCommentElement$b c;
    public final int d;

    public void PoiCommentElement$b$a(String p0,PoiCommentElement$b p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       k ok2;
       PoiCommentElement b;
       Object obj = this;
       CommentDataInfo obj1 = p0;
       PoiCommentElement$b$a uob$a = PoiCommentElement$b$a.class;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, uob$a, "1")) {
       }else if(obj1 != null){
          obj1 = obj1.a();
          if (obj1 != null && obj1.b()) {
             PoiCommentElement$b a = obj.c.a;
             CommentDataInfo preTitle = obj1.preTitle;
             CommentDataInfo title = obj1.title;
             CommentDataInfo postTitle = obj1.postTitle;
             String str = obj1.a();
             Objects.requireNonNull(a);
             p0 = uob$a;
             k ok = k.class;
             if (!PatchProxy.applyVoidFourRefs(preTitle, title, postTitle, str, a, PoiCommentElement.class, "4") && (!TextUtils.x(preTitle) && (!TextUtils.x(title) && (!TextUtils.x(postTitle) && !TextUtils.x(str))))) {
                k ok1 = 360;
                if (a.z > ok1) {
                   preTitle = preTitle+0x300c;
                }
                String str1 = "text";
                if (preTitle != null) {
                   ok2 = a.E();
                   Objects.requireNonNull(ok2);
                   if (!PatchProxy.applyVoidOneRefs(preTitle, ok2, ok, "1")) {
                      a.p(preTitle, str1);
                      ok2.d.f(preTitle);
                   }
                }
                if (title != null) {
                   ok2 = a.E();
                   Objects.requireNonNull(ok2);
                   if (!PatchProxy.applyVoidOneRefs(title, ok2, ok, "3")) {
                      a.p(title, str1);
                      ok2.e.f(title);
                   }
                }
                if (a.z > ok1) {
                   postTitle = 0x300d+postTitle;
                }
                if (postTitle != null) {
                   ok1 = a.E();
                   Objects.requireNonNull(ok1);
                   if (!PatchProxy.applyVoidOneRefs(postTitle, ok1, ok, "5")) {
                      a.p(postTitle, str1);
                      ok1.f.f(postTitle);
                   }
                }
                if (str != null) {
                   a.v = str;
                }
                k ok3 = a.E();
                b = a.B;
                Objects.requireNonNull(ok3);
                if (!PatchProxy.applyVoidOneRefs(b, ok3, ok, "7")) {
                   a.p(b, "starPosition");
                   ok3.g.f(b);
                }
                f uof = new f(true, true, true, true, false);
                ok.c(true);
                a.o(ok, "BottomPanelVisibilityEve¡­alse\).setPoiComment\(true\)");
                a.q0(ok);
             }
          label_011c :
             obj1 = obj1.poiId;
             if (obj1 != null) {
                PoiCommentElement$b a1 = obj.c.a;
                Objects.requireNonNull(a1);
                if (!PatchProxy.applyVoidOneRefs(obj1, a1, PoiCommentElement.class, "1")) {
                   a1.y = obj1;
                   b.a(0x6490e672).b(obj1).map(new e());
                }
             }
          }else {
          label_0148 :
             p0 = uob$a;
          }
       }else {
          goto label_0148 ;
       }
       PatchProxy.onMethodExit(p0, "1");
       return;
    }
}
