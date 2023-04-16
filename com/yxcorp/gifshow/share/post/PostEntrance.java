package com.yxcorp.gifshow.share.post.PostEntrance;
import java.lang.Enum;
import com.yxcorp.gifshow.share.post.PostEntrance$1;
import java.lang.String;
import com.yxcorp.gifshow.share.post.PostEntrance$2;
import com.yxcorp.gifshow.share.post.PostEntrance$3;
import com.yxcorp.gifshow.share.post.PostEntrance$4;
import com.yxcorp.gifshow.share.post.PostEntrance$5;
import com.yxcorp.gifshow.share.post.PostEntrance$6;
import com.yxcorp.gifshow.share.post.PostEntrance$7;
import com.yxcorp.gifshow.share.post.PostEntrance$8;
import com.yxcorp.gifshow.share.post.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.share.post.PostEntrance$9;
import com.yxcorp.gifshow.share.post.PostEntrance$10;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.s6;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import pm6.q;
import tl8.d;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;

public abstract class PostEntrance extends Enum	// class@001c34
{
    public final int mSharePanelItemTextRes;
    public static final PostEntrance[] $VALUES;
    public static final PostEntrance DISABLE_RECREATION;
    public static final PostEntrance FOLLOW_SHOOT;
    public static final PostEntrance KTV_CHORUS;
    public static final PostEntrance KTV_RECORD;
    public static final PostEntrance LIPS_SYNC;
    public static final PostEntrance RECREATION;
    public static final PostEntrance SAME_FRAME;
    public static final PostEntrance USE_MAGIC_FACE;
    public static final PostEntrance USE_MUSIC;
    public static final PostEntrance USE_SOUNDTRACK;

    static {
       PostEntrance$1 u1 = new PostEntrance$1("KTV_CHORUS", 0, 0x7f101b06);
       PostEntrance.KTV_CHORUS = u1;
       PostEntrance$2 u2 = new PostEntrance$2("KTV_RECORD", 1, 0x7f103b64);
       PostEntrance.KTV_RECORD = u2;
       PostEntrance$3 u3 = new PostEntrance$3("SAME_FRAME", 2, 0x7f1036ce);
       PostEntrance.SAME_FRAME = u3;
       PostEntrance$4 u4 = new PostEntrance$4("FOLLOW_SHOOT", 3, 0x7f101001);
       PostEntrance.FOLLOW_SHOOT = u4;
       PostEntrance$5 u5 = new PostEntrance$5("RECREATION", 4, 0x7f10404d);
       PostEntrance.RECREATION = u5;
       PostEntrance$6 u6 = new PostEntrance$6("DISABLE_RECREATION", 5, 0x7f10404d);
       PostEntrance.DISABLE_RECREATION = u6;
       PostEntrance$7 u7 = new PostEntrance$7("LIPS_SYNC", 6, 0x7f10073c);
       PostEntrance.LIPS_SYNC = u7;
       PostEntrance$9 obj = PatchProxy.apply(null, null, h.class, "8");
       int b = (obj != PatchProxyResult.class)? obj.booleanValue(): f.d("magicFaceRename");
       b = (b)? 0x7f104fbd: 0x7f103b65;
       PostEntrance$8 u8 = new PostEntrance$8("USE_MAGIC_FACE", 7, b);
       PostEntrance.USE_MAGIC_FACE = u8;
       obj = new PostEntrance$9("USE_MUSIC", 8, 0x7f103b66);
       PostEntrance.USE_MUSIC = obj;
       PostEntrance$10 u10 = new PostEntrance$10("USE_SOUNDTRACK", 9, 0x7f103b67);
       PostEntrance.USE_SOUNDTRACK = u10;
       PostEntrance[] postEntrance = new PostEntrance[10];
       postEntrance[0] = u1;
       postEntrance[1] = u2;
       postEntrance[2] = u3;
       postEntrance[3] = u4;
       postEntrance[4] = u5;
       postEntrance[5] = u6;
       postEntrance[6] = u7;
       postEntrance[7] = u8;
       postEntrance[8] = obj;
       postEntrance[9] = u10;
       PostEntrance.$VALUES = postEntrance;
    }
    public void PostEntrance(String p0,int p1,int p2){
       super(p0, p1);
       this.mSharePanelItemTextRes = p2;
    }
    public void PostEntrance(String p0,int p1,int p2,PostEntrance$1 p3){
       super(p0, p1, p2);
    }
    public static boolean enableReCreation(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostEntrance.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       boolean b1 = (s6.q() || p0.recreationSetting() == 1)? true: false;
       if (p0 == null || (p0.getPhotoMeta() == null || (p0.isRecreationPhoto() || (p0.getPhotoMeta().mPostWorkInfoId < null && b1)))) {
          b1 = p0.isVideoAndNotKtv();
          int i = (!p0.isAtlasPhotos() && (p0.isLongPhotos() || p0.isSinglePhoto()))? 1: 0;
          boolean b2 = (p0.getMusic() == null && (p0.getSoundTrack() == null && b.b(p0) != null))? true: false;
          if (b1 || (i && (!b2 && q.a()))) {
             b = true;
          }
       }
    label_007b :
       return b;
    }
    public static PhotoMeta getPhotoMeta(QPhoto p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, PostEntrance.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          p0 = p0.mEntity;
          if (p0 != null) {
             obj = p0.a(PhotoMeta.class);
          }
       }
       return obj;
    }
    public static PostEntrance valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostEntrance.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostEntrance.class, p0);
    }
    public static PostEntrance[] values(){
       Object obj = PatchProxy.apply(null, null, PostEntrance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostEntrance.$VALUES.clone();
    }
    public abstract KwaiOp getKwaiOpType();
    public int getSharePanelItemTextRes(){
       return this.mSharePanelItemTextRes;
    }
    public abstract void go(GifshowActivity p0,QPhoto p1,Bundle p2);
    public abstract boolean isAvailable(QPhoto p0);
}
