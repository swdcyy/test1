package cl9.u1$a;
import erd.g;
import cl9.u1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import qvb.i;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.QComment;
import al9.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.kwai.robust.PatchProxyResult;
import hl9.s;
import com.kuaishou.android.model.mix.QSubComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.yxcorp.utility.TextUtils;
import yk9.e;

public final class u1$a implements g	// class@00066f
{
    public final u1 b;

    public void u1$a(u1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b1;
       ClientContent$ContentPackage uContentPack;
       i3 obj2;
       int i1;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, u1$a.class, "1")) {
       }else {
          u1$a b = obj.b;
          Objects.requireNonNull(b);
          Object[] objArray = null;
          String str = "mCommentPageList.originItems";
          String str1 = "mCommentPageList";
          if (!PatchProxy.applyVoid(objArray, b, u1.class, "3") && b.t == null) {
             u1 r1 = b.r;
             if (r1 == null) {
                a.S(str1);
             }
             if (!r1.isEmpty()) {
                r1 = b.r;
                if (r1 == null) {
                   a.S(str1);
                }
                if (!r1.hasMore()) {
                   b.t = true;
                   r1 = b.r;
                   if (r1 == null) {
                      a.S(str1);
                   }
                   List list1 = r1.d1();
                   a.o(list1, str);
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator1 = list1.iterator();
                   while (iterator1.hasNext()) {
                      obj2 = iterator1.next();
                      QComment mType = obj2.mType;
                      uContentPack = (mType == 10 || mType == true)? 1: 0;
                      if (uContentPack) {
                         uArrayList.add(obj2);
                      }
                   }
                   iterator1 = uArrayList.iterator();
                   int i = 0;
                   while (iterator1.hasNext()) {
                      i1 = iterator1.next().mServerSubCommentCount + true;
                      i = i + i1;
                   }
                   r1 = b.r;
                   if (r1 == null) {
                      a.S(str1);
                   }
                   list1 = r1.I();
                   a.o(list1, "mCommentPageList.allFoldedComment");
                   iterator1 = list1.iterator();
                   while (iterator1.hasNext()) {
                      i1 = iterator1.next().mServerSubCommentCount + true;
                      i = i + i1;
                   }
                   r1 = b.q;
                   if (r1 == null) {
                      a.S("mFragment");
                   }
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action2 = "FINAL_VIEW_COMMENT_NUM";
                   obj2 = i3.f();
                   obj2.c("view_comment_num", Integer.valueOf(i));
                   u1 p2 = b.p;
                   if (p2 == null) {
                      a.S("mPhoto");
                   }
                   obj2.c("topshow_comment_num", Integer.valueOf(p2.numberOfComments()));
                   uElementPack1.params = obj2.e();
                   uContentPack = new ClientContent$ContentPackage();
                   u1 p3 = b.p;
                   if (p3 == null) {
                      a.S("mPhoto");
                   }
                   uContentPack.photoPackage = w1.f(p3.mEntity);
                   u1.C0("", r1, 3, uElementPack1, uContentPack);
                }
             }
          }
       label_0113 :
          b = obj.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, u1.class, "4")) {
             u1 r = b.r;
             if (r == null) {
                a.S(str1);
             }
             List list = r.d1();
             a.o(list, str);
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                QComment qComment = iterator.next();
                a.o(qComment, "it");
                if (qComment.getEntity().mIsLoggedUnfoldCommentNum == null && qComment.hasSub()) {
                   u1 obj1 = PatchProxy.applyOneRefs(qComment, b, u1.class, "5");
                   if (obj1 != PatchProxyResult.class) {
                      b1 = obj1.booleanValue();
                   }else if(s.b(qComment) || qComment.showExpandOrCollapse()){
                      obj1 = b.p;
                      if (obj1 == null) {
                         a.S("mPhoto");
                      }
                      str = obj1.getPhotoId();
                      a.o(str, "mPhoto.photoId");
                      if (s.a(qComment, str)) {
                         b1 = true;
                      }
                   }
                   b1 = false;
                   if (b1) {
                      continue ;
                   }else {
                      qComment.getEntity().mIsLoggedUnfoldCommentNum = true;
                      obj1 = b.q;
                      if (obj1 == null) {
                         a.S("mFragment");
                      }
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "UNFOLD_COMMENT_NUM";
                      i3 oi3 = i3.f();
                      oi3.c("show_child_comment_num", Integer.valueOf(qComment.mSubComment.mComments.size()));
                      oi3.c("server_child_comment_num", Integer.valueOf(qComment.mServerSubCommentCount));
                      uElementPack.params = oi3.e();
                      uContentPack = new ClientContent$ContentPackage();
                      u1 p = b.p;
                      if (p == null) {
                         a.S("mPhoto");
                      }
                      uContentPack.photoPackage = w1.f(p.mEntity);
                      ClientContent$CommentPackage uCommentPack = new ClientContent$CommentPackage();
                      uCommentPack.identity = TextUtils.k(qComment.getId());
                      u1 p1 = b.p;
                      if (p1 == null) {
                         a.S("mPhoto");
                      }
                      uCommentPack.tagType = TextUtils.k(e.c(p1, qComment));
                      uContentPack.commentPackage = uCommentPack;
                      u1.C0("", obj1, 3, uElementPack, uContentPack);
                   }
                }
             }
          }
       }
       return;
    }
}
