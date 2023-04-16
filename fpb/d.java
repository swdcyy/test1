package fpb.d;
import java.lang.Object;
import java.lang.String;
import sy5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import k2b.u1;
import com.kuaishou.android.model.music.Music;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import q2b.h$b;
import com.yxcorp.gifshow.music.cloudmusic.search.logger.MusicCardButton;
import fpb.c;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import com.yxcorp.gifshow.music.cloudmusic.search.logger.PhotoButton;
import com.yxcorp.gifshow.music.network.model.response.MusicPhotoCardsData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.music.cloudmusic.search.logger.LogType;

public final class d	// class@0029bb
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final a a(String p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = a.k().e("id", p0).e("type", "MUSIC").a("rank", p1).a("pos", p2);
       a.o(uoa, "JsonParamsHelper.newInst°≠      .append\(\"pos\", pos\)");
       return uoa;
    }
    public final a b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = a.k().e("music_id", p0).e("search_session_id", p1);
       a.o(uoa, "JsonParamsHelper.newInst°≠earch_session_id\", ussid\)");
       return uoa;
    }
    public final ClientEvent$AreaPackage c(int p0){
       ClientEvent$AreaPackage obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$AreaPackage();
       obj.name = "SEARCH_RESULT";
       a uoa = a.k();
       String str = (p0 >= 6)? "NORMAL": "LESS";
       obj.params = uoa.e("resultnum_type", str).i();
       return obj;
    }
    public final a d(int p0,String p1,int p2,String p3,int p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = a.k().a("id", p0).e("type", p1).a("rank", p2).a("pos", 1).e("item_id", p3).e("item_type", "PHOTO").a("item_pos", p4);
       a.o(uoa, "JsonParamsHelper.newInst°≠pend\(\"item_pos\", itemPos\)");
       return uoa;
    }
    public final a e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = a.k().e("search_session_id", p0);
       a.o(uoa, "JsonParamsHelper.newInst°≠earch_session_id\", ussid\)");
       return uoa;
    }
    public final ClientEvent$AreaPackage f(){
       ClientEvent$AreaPackage obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$AreaPackage();
       obj.name = "ALADDIN";
       return obj;
    }
    public final ClientEvent$ElementPackage g(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "SEARCH_BAR_CLOUD_MUSIC";
       obj.params = a.k().e("entry_source", p0).i();
       return obj;
    }
    public final void h(e0 p0,ClientEvent$ElementPackage p1,ClientEvent$AreaPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "24")) {
          return;
       }
       u1.O("", p0, "", 1, 0, p1, p2, null, null, false, null, null);
       return;
    }
    public final void i(boolean p0,e0 p1,Music p2,int p3,String p4,int p5){
       Music mMusicDocId;
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,Integer.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uod, "17")) {
             return;
          }
       }
       a.p(p1, "page");
       a.p(p4, "ussid");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "MUSIC_CARD_COLLECT_BUTTON": "MUSIC_CARD_UNCOLLECT_BUTTON";
       uElementPack.action2 = str;
       str = "";
       if (p2 != null) {
          mMusicDocId = p2.mMusicDocId;
          if (mMusicDocId != null) {
          label_0054 :
             if (p2 != null) {
                i = p2.mMusicSearchRank;
             }
             a uoa = this.a(mMusicDocId, i, p3);
             if (p2 != null) {
                String id = p2.getId();
                if (id != null) {
                   str = id;
                }
             }
             uElementPack.params = uoa.d("params", this.b(str, p4).j()).i();
             this.h(p1, uElementPack, this.c(p5));
             return;
          }
       }
       mMusicDocId = str;
       goto label_0054 ;
    }
    public final void j(boolean p0,e0 p1,int p2,Music p3,int p4,String p5){
       Music mMusicDocId;
       String id;
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uod, "18")) {
             return;
          }
       }
       a.p(p1, "page");
       a.p(p5, "ussid");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = "MUSIC_COLLECT_RESULT";
       String str1 = (p0)? str: "MUSIC_CANCEL_COLLECT_RESULT";
       uElementPack.action2 = str1;
       if (p3 != null) {
          mMusicDocId = p3.mMusicDocId;
          if (mMusicDocId != null) {
          label_0056 :
             if (p3 != null) {
                i = p3.mMusicSearchRank;
             }
             a uoa = this.a(mMusicDocId, i, p4);
             if (p3 != null) {
                id = p3.getId();
                if (id != null) {
                label_0068 :
                   uElementPack.params = uoa.d("params", this.b(id, p5).j()).i();
                   if (!p0) {
                      str = "MUSIC_CANCEL_COLLECT_RESULT";
                   }
                   h$b uob = h$b.e(p2, str);
                   uob.k(uElementPack);
                   u1.p0("", p1, uob);
                   return;
                }
             }
             id = "";
             goto label_0068 ;
          }
       }
       mMusicDocId = "";
       goto label_0056 ;
    }
    public final void k(boolean p0,e0 p1,Music p2,int p3,String p4,int p5){
       Music mMusicDocId;
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,Integer.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uod, "14")) {
             return;
          }
       }
       a.p(p1, "page");
       a.p(p4, "ussid");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "MUSIC_PLAY_SUBCARD": "MUSIC_PLAYPAUSE_SUBCARD";
       uElementPack.action2 = str;
       str = "";
       if (p2 != null) {
          mMusicDocId = p2.mMusicDocId;
          if (mMusicDocId != null) {
          label_0054 :
             if (p2 != null) {
                i = p2.mMusicSearchRank;
             }
             a uoa = this.a(mMusicDocId, i, p3);
             if (p2 != null) {
                String id = p2.getId();
                if (id != null) {
                   str = id;
                }
             }
             uElementPack.params = uoa.d("params", this.b(str, p4).j()).i();
             this.h(p1, uElementPack, this.c(p5));
             return;
          }
       }
       mMusicDocId = str;
       goto label_0054 ;
    }
    public final void l(MusicCardButton p0,e0 p1,Music p2,int p3,String p4,int p5){
       Music mMusicDocId;
       String str1;
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uod, "15")) {
             return;
          }
       }
       a.p(p0, "button");
       a.p(p1, "page");
       a.p(p4, "ussid");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MUSIC_SCREEN_SUBCARD";
       String str = "";
       if (p2 != null) {
          mMusicDocId = p2.mMusicDocId;
          if (mMusicDocId != null) {
          label_0050 :
             if (p2 != null) {
                i = p2.mMusicSearchRank;
             }
             a uoa = this.a(mMusicDocId, i, p3);
             if (p2 != null) {
                String id = p2.getId();
                if (id != null) {
                   str = id;
                }
             }
             a uoa1 = uoa.d("params", this.b(str, p4).j());
             int i1 = c.d[p0.ordinal()];
             if (i1 != 1) {
                if (i1 == 2) {
                   str1 = " π”√";
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                str1 = "≤√ºÙ“Ù¿÷";
             }
             uElementPack.params = uoa1.e("button_name", str1).i();
             this.h(p1, uElementPack, this.c(p5));
             return;
          }
       }
       mMusicDocId = str;
       goto label_0050 ;
    }
    public final void m(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       a.p(p0, "page");
       a.p(p1, "entrySource");
       u1.C0("", p0, 6, this.g(p1), null);
       return;
    }
    public final void n(PhotoButton p0,e0 p1,MusicPhotoCardsData p2,QPhoto p3,int p4,String p5){
       String str;
       String photoId;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,Integer.valueOf(p4),oobject3};
          if (PatchProxy.applyVoid(objArray, this, uod, "8")) {
             return;
          }
       }
       a.p(p0, "button");
       a.p(oobject1, "page");
       a.p(oobject2, "photoCardsData");
       a.p(oobject3, "ussid");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       int i = c.b[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                str = "SEARCH_BUTTON_SUBCARD";
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             str = "SEARCH_PLAYPAUSE_BUTTON_SUBCARD";
          }
       }else {
          str = "SEARCH_PLAY_BUTTON_SUBCARD";
       }
       uElementPack.action2 = str;
       MusicPhotoCardsData mTemplateId = oobject2.mTemplateId;
       MusicPhotoCardsData mTemplateTyp = oobject2.mTemplateType;
       a.o(mTemplateTyp, "photoCardsData.mTemplateType");
       MusicPhotoCardsData mPhotoRank = oobject2.mPhotoRank;
       if (p3 != null) {
          photoId = p3.getPhotoId();
          if (photoId != null) {
          label_007f :
             a uoa = this.d(mTemplateId, mTemplateTyp, mPhotoRank, photoId, p4).d("params", this.e(oobject3).j());
             i = c.c[p0.ordinal()];
             if (i != 1) {
                if (i != 2) {
                   if (i == 3) {
                      str = "≈ƒÕ¨øÓ";
                   }else {
                      throw new NoWhenBranchMatchedException();
                   }
                }else {
                   str = "‘›Õ£";
                }
             }else {
                str = "≤•∑≈";
             }
             uElementPack.params = uoa.e("button_name", str).i();
             this.h(oobject1, uElementPack, this.f());
             return;
          }
       }
       photoId = "";
       goto label_007f ;
    }
    public final void o(LogType p0,e0 p1,MusicPhotoCardsData p2,QPhoto p3,int p4,String p5){
       String str1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,Integer.valueOf(p4),oobject3};
          if (PatchProxy.applyVoid(objArray, this, uod, "7")) {
             return;
          }
       }
       a.p(oobject, "logType");
       a.p(oobject1, "page");
       a.p(oobject2, "photoCardsData");
       a.p(oobject3, "ussid");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTOPLAY_SUBCARD";
       MusicPhotoCardsData mTemplateId = oobject2.mTemplateId;
       MusicPhotoCardsData mTemplateTyp = oobject2.mTemplateType;
       a.o(mTemplateTyp, "photoCardsData.mTemplateType");
       MusicPhotoCardsData mPhotoRank = oobject2.mPhotoRank;
       String str = "";
       if (p3 != null) {
          String photoId = p3.getPhotoId();
          if (photoId != null) {
             str1 = photoId;
          label_0068 :
             a uoa = this.d(mTemplateId, mTemplateTyp, mPhotoRank, str1, p4).d("params", this.e(oobject3).j());
             if (p3 != null) {
                String userId = p3.getUserId();
                if (userId != null) {
                   str = userId;
                }
             }
             uElementPack.params = uoa.e("item_author_id", str).i();
             ClientEvent$AreaPackage uoa1 = this.f();
             int i = c.a[p0.ordinal()];
             if (i != 1) {
                if (i == 2) {
                   this.p(oobject1, 3, uElementPack, uoa1);
                }
             }else {
                this.h(oobject1, uElementPack, uoa1);
             }
             return;
          }
       }
       str1 = str;
       goto label_0068 ;
    }
    public final void p(e0 p0,int p1,ClientEvent$ElementPackage p2,ClientEvent$AreaPackage p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, d.class, "23")) {
          return;
       }
       u1.E0("", p0, p1, p2, p3, null, null, null, false, null);
       return;
    }
}
