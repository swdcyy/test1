package k9a.a;
import kya.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kya.b;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import id5.u;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import java.lang.CharSequence;
import k9a.a$a;
import java.lang.Enum;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qd5.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.android.model.mix.TagItem;

public class a implements b$a	// class@002c1c
{

    public void a(){
       super();
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
          return;
       }
       b.a(new a());
       return;
    }
    public boolean a(Activity p0,QPhoto p1,QComment p2,View p3,View p4,String p5,String p6,String p7,String p8,String p9){
       String obj1;
       String str2;
       CommonParams uCommonParam;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p5;
       object oobject3 = p7;
       object oobject4 = p8;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 0;
       Integer integer = Integer.valueOf(i3);
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[10];
          objArray[i3] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[i2] = oobject1;
          objArray[i1] = p4;
          objArray[i] = oobject2;
          objArray[6] = p6;
          objArray[7] = oobject3;
          objArray[8] = oobject4;
          objArray[9] = p9;
          obj1 = PatchProxy.apply(objArray, obj, a.class, "2");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       if (oobject instanceof u) {
          QPhoto currentPhoto = oobject.getCurrentPhoto();
          GifshowActivity$AnchorPoint uAnchorPoint = PatchProxy.applyOneRefs(oobject2, null, a.class, "5");
          obj1 = "name";
          String str = "liker";
          String str1 = "at";
          if (uAnchorPoint != patchProxyRe) {
          }else if(oobject2 != null){
             if (oobject2.startsWith("c")) {
                uAnchorPoint = GifshowActivity$AnchorPoint.AT_USER_IN_COMMENT;
             }else if(oobject2.contains(str1)){
                uAnchorPoint = GifshowActivity$AnchorPoint.AT_USER_IN_PHOTO_DESCRIPTION;
             }else if(oobject2.contains(str)){
                uAnchorPoint = GifshowActivity$AnchorPoint.PHOTO_LIKER;
             }else if(oobject2.startsWith(obj1)){
                uAnchorPoint = GifshowActivity$AnchorPoint.NAME;
             }else {
                uAnchorPoint = GifshowActivity$AnchorPoint.DEFAULT;
             }
          }else {
             uAnchorPoint = GifshowActivity$AnchorPoint.DEFAULT;
          }
          int i4 = a$a.a[uAnchorPoint.ordinal()];
          i3 = 0x7f0a3d3f;
          if (i4 != 1) {
             if (i4 != 2) {
                if (i4 != i2) {
                   if (i4 != 4) {
                      if (i4 != 5) {
                         oobject1.setTag(i3, integer);
                      }else {
                         str2 = d.a(-1188553266).so(oobject4);
                         if (!TextUtils.n(oobject3, "ks://message")) {
                            if (currentPhoto == null) {
                               return false;
                            }else if(!TextUtils.n(str2, currentPhoto.getUserId())){
                               if (TextUtils.n(QCurrentUser.ME.getId(), currentPhoto.getUserId())) {
                                  oobject1.setTag(i3, Integer.valueOf(43));
                               }else {
                                  oobject1.setTag(i3, Integer.valueOf(44));
                               }
                            }else {
                               oobject1.setTag(i3, integer);
                            }
                         }else {
                            oobject1.setTag(i3, Integer.valueOf(34));
                         }
                      }
                   }else {
                      oobject1.setTag(i3, integer);
                   }
                }else {
                   oobject1.setTag(i3, Integer.valueOf(14));
                }
             }else {
                oobject1.setTag(i3, Integer.valueOf(46));
             }
          }else {
             oobject1.setTag(i3, Integer.valueOf(45));
          }
          if (PatchProxy.isSupport(a.class)) {
             Object[] objArray1 = new Object[]{currentPhoto,p2,oobject2,p6,p9};
             if (PatchProxy.applyVoid(objArray1, obj, a.class, "4")) {
             label_0238 :
                if (!PatchProxy.applyVoidOneRefs(currentPhoto, obj, a.class, "3") && currentPhoto != null) {
                   Collection uCollection = (currentPhoto.getPhotoMeta() == null)? null: currentPhoto.getPhotoMeta().mAdminTagsModels;
                   if (!q.f(uCollection)) {
                      ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
                      ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[uCollection.size()];
                      tagShowPacka.tagPackage = tagPackageAr;
                      for (i3 = 0; i3 < uCollection.size(); i3 = i3 + 1) {
                         tagShowPacka.tagPackage[i3] = new ClientContent$TagPackage();
                         tagShowPacka.tagPackage[i3].identity = TextUtils.k(uCollection.get(i3).mId);
                         tagShowPacka.tagPackage[i3].name = TextUtils.k(uCollection.get(i3).mName);
                      }
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(currentPhoto.getEntity());
                      uContentPack.tagShowPackage = tagShowPacka;
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action = 1642;
                      u1.G("", 1642, uElementPack, uContentPack);
                   }
                }
             label_02ba :
                return 1;
             }
          }
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.type = 2;
          str2 = (TextUtils.x(p6))? p9: p6;
          uElementPack1.name = str2;
          str2 = "mutual_liker";
          if (oobject2 != null) {
             if (oobject2.startsWith("likers")) {
                uElementPack1.action = 1047;
             }else {
                i = 884;
                if (oobject2.startsWith(str)) {
                   uElementPack1.action = i;
                }else if(oobject2.equals(obj1)){
                   uElementPack1.action = i;
                   uElementPack1.index = 1;
                   i3 oi3 = i3.f();
                   oi3.d("comment_tips_content", a.a(currentPhoto));
                   oi3.d("location", "COMMENT_AREA");
                   uElementPack1.params = oi3.e();
                }else if(oobject2.startsWith(str2)){
                   uElementPack1.action = 922;
                }else if(oobject2.contains(str1)){
                   uElementPack1.action = 1023;
                }
             }
          }
          ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
          if (currentPhoto != null) {
             uContentPack1.photoPackage = w1.f(currentPhoto.mEntity);
             uCommonParam = a.b(currentPhoto);
          }else {
             uCommonParam = null;
          }
          if (p2 != null) {
             ClientContent$CommentPackage uCommentPack = new ClientContent$CommentPackage();
             uCommentPack.identity = TextUtils.k(p2.getId());
             str1 = (p2.getUser() != null)? TextUtils.k(p2.getUser().getId()): "";
             uCommentPack.authorId = str1;
             uContentPack1.commentPackage = uCommentPack;
          }
          if (oobject2 != null && oobject2.startsWith(str2)) {
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             String[] stringArray = oobject2.split("mutual_liker_");
             if (stringArray.length == 2) {
                userPackage.identity = TextUtils.k(stringArray[1]);
             }
             uContentPack1.userPackage = userPackage;
          }
          ClickMetaData uClickMetaDa = new ClickMetaData().setType(1).setElementPackage(uElementPack1).setContentPackage(uContentPack1).setCommonParams(uCommonParam);
          FeedLogCtx uFeedLogCtx = (currentPhoto == null)? null: currentPhoto.getFeedLogCtx();
          u1.B(uClickMetaDa.setFeedLogCtx(uFeedLogCtx));
          goto label_0238 ;
       }else {
          return false;
       }
    }
}
